package in.vibrant.com.sqliteandroomdatabasecomplete.SqLite;

public class demo {
    /*package in.vibrant.com.sqliteandroomdatabasecomplete.SqLite;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

import in.vibrant.com.sqliteandroomdatabasecomplete.Model.UserDetailsModel;

public class DbHelper extends SQLiteOpenHelper {
    private static final String NAME = "sq_lite_database";
    private static final int VERSION = 1;
    private Context context;

    public DbHelper(Context context) {
        super(context, NAME, null, VERSION);
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

            // get writable database as we want to write data
            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues values = new ContentValues();
            // `id` and `timestamp` will be inserted automatically.
            // no need to add them
            values.put(UserDetailsModel.U_CODE, model.getuCode());
            values.put(UserDetailsModel.U_NAME, model.getuName());
            values.put(UserDetailsModel.U_PHONE, model.getuPhone());
            values.put(UserDetailsModel.UT_CODE, model.getUtCode());
            values.put(UserDetailsModel.UT_NAME, model.getUtName());
            values.put(UserDetailsModel.DS_CODE, model.getDsCode());
            values.put(UserDetailsModel.D_NAME, model.getdName());
            values.put(UserDetailsModel.DIVN, model.getDivn());
            values.put(UserDetailsModel.NM, model.getNm());
            values.put(UserDetailsModel.ISACTIVATE, model.getIsactivate());
            values.put(UserDetailsModel.ApproveStatus, model.getApproveStatus());
            values.put(UserDetailsModel.U_LEVEL, model.getuLevel());
            values.put(UserDetailsModel.SEAS, model.getSeas());
            values.put(UserDetailsModel.U_UPDMAST, model.getuUpdmast());
            values.put(UserDetailsModel.ZONE_CODE, model.getZoneCode());
            values.put(UserDetailsModel.Z_NAME, model.getzName());
            values.put(UserDetailsModel.TIMEFROM, model.getTimefrom());
            values.put(UserDetailsModel.TIMETO, model.getTimeto());
            values.put(UserDetailsModel.LEAVEFLG, model.getLeaveflg());
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
                singleData.setId(cursor.getString(cursor.getColumnIndex(UserDetailsModel.COLUMN_ID)));
                singleData.setuCode(cursor.getLong(cursor.getColumnIndex(UserDetailsModel.U_CODE)));
                singleData.setuName(cursor.getString(cursor.getColumnIndex(UserDetailsModel.U_NAME)));
                singleData.setuPhone(cursor.getString(cursor.getColumnIndex(UserDetailsModel.U_PHONE)));
                singleData.setUtCode(cursor.getLong(cursor.getColumnIndex(UserDetailsModel.UT_CODE)));
                singleData.setUtName(cursor.getString(cursor.getColumnIndex(UserDetailsModel.UT_NAME)));
                singleData.setDsCode(cursor.getDouble(cursor.getColumnIndex(UserDetailsModel.DS_CODE)));
                singleData.setdName(cursor.getString(cursor.getColumnIndex(UserDetailsModel.D_NAME)));
                singleData.setDivn(cursor.getString(cursor.getColumnIndex(UserDetailsModel.DIVN)));
                singleData.setNm(cursor.getString(cursor.getColumnIndex(UserDetailsModel.NM)));
                singleData.setIsactivate(cursor.getDouble(cursor.getColumnIndex(UserDetailsModel.ISACTIVATE)));
                singleData.setuLevel(cursor.getDouble(cursor.getColumnIndex(UserDetailsModel.U_LEVEL)));
                singleData.setuUpdmast(cursor.getInt(cursor.getColumnIndex(UserDetailsModel.U_UPDMAST)));
                singleData.setLeaveflg(cursor.getInt(cursor.getColumnIndex(UserDetailsModel.LEAVEFLG)));
                singleData.setZoneCode(cursor.getString(cursor.getColumnIndex(UserDetailsModel.ZONE_CODE)));
                singleData.setTimefrom(cursor.getInt(cursor.getColumnIndex(UserDetailsModel.TIMEFROM)));
                singleData.setTimeto(cursor.getInt(cursor.getColumnIndex(UserDetailsModel.TIMETO)));
                allData.add(singleData);
            } while (cursor.moveToNext());
        }
        db.close();
        return allData;
    }
}
*/
}
