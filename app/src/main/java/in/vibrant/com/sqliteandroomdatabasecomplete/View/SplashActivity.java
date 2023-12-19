package in.vibrant.com.sqliteandroomdatabasecomplete.View;

import static android.os.Build.VERSION.SDK_INT;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.provider.Settings;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import java.io.File;

import in.vibrant.com.sqliteandroomdatabasecomplete.R;
import in.vibrant.com.sqliteandroomdatabasecomplete.SqLite.DbHelper;
import in.vibrant.com.sqliteandroomdatabasecomplete.Util.PermissionManager;

public class SplashActivity extends AppCompatActivity {
    public static final int REQUEST_PERMISSION_FILE_ACCESS = 10;
    private static final int REQUEST_PERMISSION_SETTING = 101;
    File dir;
    Context context;
    String[] permissions = new String[]{
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE,
            Manifest.permission.MANAGE_EXTERNAL_STORAGE,};

    DbHelper dbh;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        context=SplashActivity.this;

        PermissionManager.requestPermissions(this, permissions, PermissionManager.REQUEST_CODE);
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        PermissionManager.onRequestPermissionsResult(this, requestCode, permissions, grantResults);
        if (requestCode == PermissionManager.REQUEST_CODE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                proceedAfterPermission();
            }
        }
    }

    public void handler() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
            }
        }, 300);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        PermissionManager.requestPermissions(this, permissions, PermissionManager.REQUEST_CODE);
    }

    private void proceedAfterPermission() {
        CheckValidation:
        {
            if (SDK_INT >= Build.VERSION_CODES.R) {
                if (Environment.isExternalStorageManager()) {
                     createDB();
                } else {
                    //request for the permission
                    Intent intent = new Intent(Settings.ACTION_MANAGE_APP_ALL_FILES_ACCESS_PERMISSION);
                    Uri uri = Uri.fromParts("package", getPackageName(), null);
                    intent.setData(uri);
                    startActivityForResult(intent, REQUEST_PERMISSION_FILE_ACCESS);

                    break CheckValidation;
                }
            } else {
                 createDB();
            }
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_PERMISSION_SETTING) {
            if (ActivityCompat.checkSelfPermission(SplashActivity.this, permissions[0]) == PackageManager.PERMISSION_GRANTED) {
                proceedAfterPermission();
            }
        }

    }

    private void createDB() {
        File sdCard = Environment.getExternalStorageDirectory();
        dir = new File(sdCard.getAbsolutePath() + "/SQLite_Database");
        if (!dir.exists()) {
            dir.mkdir();
        }
        File dir1 = new File(sdCard.getAbsolutePath() + "/SQLite");
        if (!dir1.exists()) {
            dir1.mkdir();
        }
        dbh = new DbHelper(context);
        db = dbh.getWritableDatabase();
        dbh.onCreate(db);
        handler();


    }
}