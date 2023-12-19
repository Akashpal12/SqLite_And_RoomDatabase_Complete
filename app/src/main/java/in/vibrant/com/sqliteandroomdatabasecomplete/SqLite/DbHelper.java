package in.vibrant.com.sqliteandroomdatabasecomplete.SqLite;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Environment;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import in.vibrant.com.sqliteandroomdatabasecomplete.Model.UserDetailsModel;

public class DbHelper extends SQLiteOpenHelper {
    private static final int VERSION = 1;
    private static final File sdCard = Environment.getExternalStorageDirectory();
    private static final File dir = new File(sdCard.getAbsolutePath() + "/SQLite");
    private static final String NAME = "sqLiteDatabase";
    private Context context;

    public DbHelper(Context context) {
        super(context, dir.getAbsolutePath() + "/" + NAME, null, VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(UserDetailsModel.CREATE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + UserDetailsModel.TABLE_NAME);
        onCreate(db);

    }

    public long insertUserDetailsModel(UserDetailsModel model) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(UserDetailsModel.col_U_CODE, model.getU_CODE());
        values.put(UserDetailsModel.col_U_NAME, model.getU_NAME());
        values.put(UserDetailsModel.col_U_PHONE, model.getU_PHONE());
        values.put(UserDetailsModel.col_UT_CODE, model.getUT_CODE());
        values.put(UserDetailsModel.col_UT_NAME, model.getUT_NAME());
        values.put(UserDetailsModel.col_DS_CODE, model.getDS_CODE());
        values.put(UserDetailsModel.col_D_NAME, model.getD_NAME());
        values.put(UserDetailsModel.col_DIVN, model.getDIVN());
        values.put(UserDetailsModel.col_NM, model.getNM());
        values.put(UserDetailsModel.col_ISACTIVATE, model.getISACTIVATE());
        values.put(UserDetailsModel.col_ApproveStatus, model.getApproveStatus());
        values.put(UserDetailsModel.col_U_LEVEL, model.getU_LEVEL());
        values.put(UserDetailsModel.col_SEAS, model.getSEAS());
        values.put(UserDetailsModel.col_U_UPDMAST, model.getU_UPDMAST());
        values.put(UserDetailsModel.col_ZONE_CODE, model.getZONE_CODE());
        values.put(UserDetailsModel.col_Z_NAME, model.getZ_NAME());
        values.put(UserDetailsModel.col_TIMEFROM, model.getTIMEFROM());
        values.put(UserDetailsModel.col_TIMETO, model.getTIMETO());
        values.put(UserDetailsModel.col_LEAVEFLG, model.getLEAVEFLG());
        // insert row
        long id = db.insert(UserDetailsModel.TABLE_NAME, null, values);
        // close db connection
        db.close();
        // return newly inserted row id
        return id;
    }

    public void deleteUserDetailsModel() {
        SQLiteDatabase db = this.getReadableDatabase();
        db.execSQL("DROP TABLE IF EXISTS " + UserDetailsModel.TABLE_NAME);
        db.execSQL(UserDetailsModel.CREATE_TABLE);
        db.execSQL("VACUUM");
        db.close();
    }

    @SuppressLint("Range")
    public List<UserDetailsModel> getUserDetailsModel() {
        List<UserDetailsModel> allData = new ArrayList<>();
        String selectQuery = "SELECT  * FROM " + UserDetailsModel.TABLE_NAME;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        if (cursor.moveToFirst()) {
            do {
                UserDetailsModel singleData = new UserDetailsModel();
                singleData.setId(cursor.getString(cursor.getColumnIndex(UserDetailsModel.col_COLUMN_ID)));
                singleData.setU_CODE(cursor.getLong(cursor.getColumnIndex(UserDetailsModel.col_U_CODE)));
                singleData.setU_NAME(cursor.getString(cursor.getColumnIndex(UserDetailsModel.col_U_NAME)));
                singleData.setU_PHONE(cursor.getString(cursor.getColumnIndex(UserDetailsModel.col_U_PHONE)));
                singleData.setUT_CODE(cursor.getLong(cursor.getColumnIndex(UserDetailsModel.col_UT_CODE)));
                singleData.setUT_NAME(cursor.getString(cursor.getColumnIndex(UserDetailsModel.col_UT_NAME)));
                singleData.setDS_CODE(cursor.getDouble(cursor.getColumnIndex(UserDetailsModel.col_DS_CODE)));
                singleData.setD_NAME(cursor.getString(cursor.getColumnIndex(UserDetailsModel.col_D_NAME)));
                singleData.setDIVN(cursor.getString(cursor.getColumnIndex(UserDetailsModel.col_DIVN)));
                singleData.setNM(cursor.getString(cursor.getColumnIndex(UserDetailsModel.col_NM)));
                singleData.setISACTIVATE(cursor.getDouble(cursor.getColumnIndex(UserDetailsModel.col_ISACTIVATE)));
                singleData.setU_LEVEL(cursor.getDouble(cursor.getColumnIndex(UserDetailsModel.col_U_LEVEL)));
                singleData.setU_UPDMAST(cursor.getInt(cursor.getColumnIndex(UserDetailsModel.col_U_UPDMAST)));
                singleData.setLEAVEFLG(cursor.getInt(cursor.getColumnIndex(UserDetailsModel.col_LEAVEFLG)));
                singleData.setZONE_CODE(cursor.getString(cursor.getColumnIndex(UserDetailsModel.col_ZONE_CODE)));
                singleData.setTIMEFROM(cursor.getInt(cursor.getColumnIndex(UserDetailsModel.col_TIMEFROM)));
                singleData.setTIMETO(cursor.getInt(cursor.getColumnIndex(UserDetailsModel.col_TIMETO)));
                allData.add(singleData);
            } while (cursor.moveToNext());
        }
        db.close();
        return allData;
    }
}
