package in.vibrant.com.sqliteandroomdatabasecomplete.Model;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity(tableName = "User_details_model")
public class UserDetailsModel {

    @PrimaryKey
    @NonNull
    private String id;

    private long U_CODE;

    private String U_NAME;

    private String U_PHONE;

    private long UT_CODE;

    private String UT_NAME;


    private double DS_CODE;


    private String D_NAME;


    private String DIVN;


    private String NM;

    private double ISACTIVATE;


    private double U_LEVEL;


    private String SEAS;

    private long U_UPDMAST;


    private String ZONE_CODE;


    private String Z_NAME;


    private long ApproveStatus;


    private long TIMEFROM;


    private long TIMETO;


    private long LEAVEFLG;


    @NonNull
    public String getId() {
        return id;
    }

    public void setId(@NonNull String id) {
        this.id = id;
    }

    public long getU_CODE() {
        return U_CODE;
    }

    public void setU_CODE(long u_CODE) {
        U_CODE = u_CODE;
    }

    public String getU_NAME() {
        return U_NAME;
    }

    public void setU_NAME(String u_NAME) {
        U_NAME = u_NAME;
    }

    public String getU_PHONE() {
        return U_PHONE;
    }

    public void setU_PHONE(String u_PHONE) {
        U_PHONE = u_PHONE;
    }

    public long getUT_CODE() {
        return UT_CODE;
    }

    public void setUT_CODE(long UT_CODE) {
        this.UT_CODE = UT_CODE;
    }

    public String getUT_NAME() {
        return UT_NAME;
    }

    public void setUT_NAME(String UT_NAME) {
        this.UT_NAME = UT_NAME;
    }

    public double getDS_CODE() {
        return DS_CODE;
    }

    public void setDS_CODE(double DS_CODE) {
        this.DS_CODE = DS_CODE;
    }

    public String getD_NAME() {
        return D_NAME;
    }

    public void setD_NAME(String d_NAME) {
        D_NAME = d_NAME;
    }

    public String getDIVN() {
        return DIVN;
    }

    public void setDIVN(String DIVN) {
        this.DIVN = DIVN;
    }

    public String getNM() {
        return NM;
    }

    public void setNM(String NM) {
        this.NM = NM;
    }

    public double getISACTIVATE() {
        return ISACTIVATE;
    }

    public void setISACTIVATE(double ISACTIVATE) {
        this.ISACTIVATE = ISACTIVATE;
    }

    public double getU_LEVEL() {
        return U_LEVEL;
    }

    public void setU_LEVEL(double u_LEVEL) {
        U_LEVEL = u_LEVEL;
    }

    public String getSEAS() {
        return SEAS;
    }

    public void setSEAS(String SEAS) {
        this.SEAS = SEAS;
    }

    public long getU_UPDMAST() {
        return U_UPDMAST;
    }

    public void setU_UPDMAST(long u_UPDMAST) {
        U_UPDMAST = u_UPDMAST;
    }

    public String getZONE_CODE() {
        return ZONE_CODE;
    }

    public void setZONE_CODE(String ZONE_CODE) {
        this.ZONE_CODE = ZONE_CODE;
    }

    public String getZ_NAME() {
        return Z_NAME;
    }

    public void setZ_NAME(String z_NAME) {
        Z_NAME = z_NAME;
    }

    public long getApproveStatus() {
        return ApproveStatus;
    }

    public void setApproveStatus(long approveStatus) {
        ApproveStatus = approveStatus;
    }

    public long getTIMEFROM() {
        return TIMEFROM;
    }

    public void setTIMEFROM(long TIMEFROM) {
        this.TIMEFROM = TIMEFROM;
    }

    public long getTIMETO() {
        return TIMETO;
    }

    public void setTIMETO(long TIMETO) {
        this.TIMETO = TIMETO;
    }

    public long getLEAVEFLG() {
        return LEAVEFLG;
    }

    public void setLEAVEFLG(long LEAVEFLG) {
        this.LEAVEFLG = LEAVEFLG;
    }

    // Creating table Variables For SQLite
    public static final String TABLE_NAME = "user_details";
    public static final String col_COLUMN_ID = "id";
    public static final String col_U_CODE = "U_CODE";
    public static final String col_U_NAME = "U_NAME";
    public static final String col_U_PHONE = "U_PHONE";
    public static final String col_UT_CODE = "UT_CODE";
    public static final String col_UT_NAME = "UT_NAME";
    public static final String col_DS_CODE = "DS_CODE";
    public static final String col_D_NAME = "D_NAME";
    public static final String col_DIVN = "DIVN";
    public static final String col_NM = "NM";
    public static final String col_ISACTIVATE = "ISACTIVATE";
    public static final String col_U_LEVEL = "U_LEVEL";
    public static final String col_SEAS = "SEAS";
    public static final String col_U_UPDMAST = "U_UPDMAST";
    public static final String col_ZONE_CODE = "ZONE_CODE";
    public static final String col_Z_NAME = "Z_NAME";
    public static final String col_ApproveStatus = "ApproveStatus";
    public static final String col_TIMEFROM = "TIMEFROM";
    public static final String col_TIMETO = "TIMETO";
    public static final String col_LEAVEFLG = "LEAVEFLG";

    // Creating table Query For SQLite
    public static final String CREATE_TABLE =
            "CREATE TABLE IF NOT EXISTS " + TABLE_NAME + "("
                    + col_COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT ,"
                    + col_U_CODE + " TEXT ,"
                    + col_U_NAME + " TEXT ,"
                    + col_U_PHONE + " TEXT ,"
                    + col_UT_CODE + " TEXT ,"
                    + col_UT_NAME + " TEXT ,"
                    + col_DS_CODE + " TEXT ,"
                    + col_D_NAME + " TEXT ,"
                    + col_DIVN + " TEXT ,"
                    + col_NM + " TEXT ,"
                    + col_ISACTIVATE + " TEXT ,"
                    + col_U_LEVEL + " TEXT ,"
                    + col_SEAS + " TEXT ,"
                    + col_U_UPDMAST + " TEXT ,"
                    + col_ZONE_CODE + " TEXT ,"
                    + col_Z_NAME + " TEXT ,"
                    + col_ApproveStatus + " TEXT ,"
                    + col_TIMEFROM + " TEXT ,"
                    + col_TIMETO + " TEXT ,"
                    + col_LEAVEFLG + " TEXT "
                    + ")";


}