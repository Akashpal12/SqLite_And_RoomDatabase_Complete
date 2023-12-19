package in.vibrant.com.sqliteandroomdatabasecomplete.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import in.vibrant.com.sqliteandroomdatabasecomplete.Model.UserDetailsModel;
import in.vibrant.com.sqliteandroomdatabasecomplete.R;
import in.vibrant.com.sqliteandroomdatabasecomplete.SqLite.DbHelper;

public class HomeActivity extends AppCompatActivity {
    SQLiteDatabase db;
    DbHelper dbh;
    List<UserDetailsModel> userlist=new ArrayList<>();
    Context ctx;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ctx=HomeActivity.this;
        dbh = new DbHelper(ctx);
        userlist=dbh.getUserDetailsModel();
        Toast.makeText(ctx, ""+userlist.get(0).getU_NAME(), Toast.LENGTH_SHORT).show();

    }
}