package in.vibrant.com.sqliteandroomdatabasecomplete.View;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import in.vibrant.com.sqliteandroomdatabasecomplete.Model.Courses;
import in.vibrant.com.sqliteandroomdatabasecomplete.Model.UserDetailsModel;
import in.vibrant.com.sqliteandroomdatabasecomplete.Model.user_details;
import in.vibrant.com.sqliteandroomdatabasecomplete.R;
import in.vibrant.com.sqliteandroomdatabasecomplete.Retrofit.ApiService;
import in.vibrant.com.sqliteandroomdatabasecomplete.Retrofit.BaseUrl;
import in.vibrant.com.sqliteandroomdatabasecomplete.RoomDatabase.UserDatabase;
import in.vibrant.com.sqliteandroomdatabasecomplete.SqLite.DbHelper;
import in.vibrant.com.sqliteandroomdatabasecomplete.Util.intent;
import in.vibrant.com.sqliteandroomdatabasecomplete.Util.progress;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    ApiService apiService;
    List<UserDetailsModel> userData = new ArrayList<>();
    private EditText userIdEditText, passwordEditText;
    private Button loginButton;
    SQLiteDatabase db;
    DbHelper dbh;
    private String message="Please Wait";
    Context ctx;
    UserDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ctx=MainActivity.this;
        dbh = new DbHelper(ctx);
        db = dbh.getWritableDatabase();
        dbh.onCreate(db);
        database=UserDatabase.getInstance(ctx);
        userIdEditText = findViewById(R.id.editTextUserId);
        passwordEditText = findViewById(R.id.editTextPassword);
        loginButton = findViewById(R.id.buttonLogin);
        apiService = BaseUrl.getCaneDevService();
       /* Courses model= new Courses();
        model.setAddExtra("Hi");
        model.setBoard("CBSE");
        database.courseDao().insertCourse(model);
        UserDetailsModel model1 = new UserDetailsModel();
        model1.setApproveStatus(627);
        model1.setDIVN("573");
        database.userDetailsDao().insertCourse(model1);*/


        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progress.show(ctx,message);
                String userId = userIdEditText.getText().toString();
                String password = passwordEditText.getText().toString();
                if (userId.length() > 0 && password.length() > 0) {
                    apiService.ValidateUser("" + userId, "" + password, "").enqueue(new Callback<user_details>() {
                        @Override
                        public void onResponse(Call<user_details> call, Response<user_details> response) {
                            progress.dismiss();
                            if (response.body().getMsg() == null) {
                                dbh.deleteUserDetailsModel();
                                userData = response.body().getData();
                                for (UserDetailsModel model : userData) {
                                    dbh.insertUserDetailsModel(model);
                                }
                                intent.startActivityFinish(ctx, HomeActivity.class);
                            } else {
                                showToast("" + response.body().getMsg());
                            }

                        }
                        @Override
                        public void onFailure(Call<user_details> call, Throwable t) {
                            progress.dismiss();
                        }
                    });

                } else {
                    showToast("Login failed Please check your credentials");
                    progress.dismiss();
                }
            }
        });
    }


    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
