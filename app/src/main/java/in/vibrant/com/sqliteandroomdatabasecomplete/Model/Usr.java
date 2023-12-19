package in.vibrant.com.sqliteandroomdatabasecomplete.Model;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity(tableName = "User_details_model")
public class Usr {

        @PrimaryKey
        @NonNull
        private String id;

        @SerializedName("U_CODE")
        private long uCode;
        @SerializedName("U_NAME")
        private String uName;
        @SerializedName("U_PHONE")
        private String uPhone;
        @SerializedName("UT_CODE")
        private long utCode;
        @SerializedName("UT_NAME")
        private String utName;
        @SerializedName("DS_CODE")

        private double dsCode;
        @SerializedName("D_NAME")

        private String dName;
        @SerializedName("DIVN")

        private String divn;
        @SerializedName("NM")

        private String nm;
        @SerializedName("ISACTIVATE")

        private double isactivate;
        @SerializedName("U_LEVEL")

        private double uLevel;
        @SerializedName("SEAS")

        private String seas;
        @SerializedName("U_UPDMAST")

        private long uUpdmast;
        @SerializedName("ZONE_CODE")

        private String zoneCode;
        @SerializedName("Z_NAME")

        private String zName;
        @SerializedName("ApproveStatus")

        private long approveStatus;
        @SerializedName("TIMEFROM")

        private long timefrom;
        @SerializedName("TIMETO")

        private long timeto;
        @SerializedName("LEAVEFLG")

        private long leaveflg;

        @NonNull
        public String getId() {
            return id;
        }

        public long getuCode() {
            return uCode;
        }

        public String getuName() {
            return uName;
        }

        public String getuPhone() {
            return uPhone;
        }

        public long getUtCode() {
            return utCode;
        }

        public String getUtName() {
            return utName;
        }

        public double getDsCode() {
            return dsCode;
        }

        public String getdName() {
            return dName;
        }

        public String getDivn() {
            return divn;
        }

        public String getNm() {
            return nm;
        }

        public double getIsactivate() {
            return isactivate;
        }

        public double getuLevel() {
            return uLevel;
        }

        public String getSeas() {
            return seas;
        }

        public long getuUpdmast() {
            return uUpdmast;
        }

        public String getZoneCode() {
            return zoneCode;
        }

        public String getzName() {
            return zName;
        }

        public long getApproveStatus() {
            return approveStatus;
        }

        public long getTimefrom() {
            return timefrom;
        }

        public long getTimeto() {
            return timeto;
        }

        public long getLeaveflg() {
            return leaveflg;
        }

        public void setId(@NonNull String id) {
            this.id = id;
        }

        public void setuCode(long uCode) {
            this.uCode = uCode;
        }
        public void setuName(String uName) {
            this.uName = uName;
        }

        public void setuPhone(String uPhone) {
            this.uPhone = uPhone;
        }

        public void setUtCode(long utCode) {
            this.utCode = utCode;
        }

        public void setUtName(String utName) {
            this.utName = utName;
        }

        public void setDsCode(double dsCode) {
            this.dsCode = dsCode;
        }

        public void setdName(String dName) {
            this.dName = dName;
        }

        public void setDivn(String divn) {
            this.divn = divn;
        }

        public void setNm(String nm) {
            this.nm = nm;
        }

        public void setIsactivate(double isactivate) {
            this.isactivate = isactivate;
        }

        public void setuLevel(double uLevel) {
            this.uLevel = uLevel;
        }

        public void setSeas(String seas) {
            this.seas = seas;
        }

        public void setuUpdmast(long uUpdmast) {
            this.uUpdmast = uUpdmast;
        }

        public void setZoneCode(String zoneCode) {
            this.zoneCode = zoneCode;
        }

        public void setzName(String zName) {
            this.zName = zName;
        }

        public void setApproveStatus(long approveStatus) {
            this.approveStatus = approveStatus;
        }

        public void setTimefrom(long timefrom) {
            this.timefrom = timefrom;
        }

        public void setTimeto(long timeto) {
            this.timeto = timeto;
        }

        public void setLeaveflg(long leaveflg) {
            this.leaveflg = leaveflg;
        }

        // Creating table Variables For SQLite
        public static final String TABLE_NAME = "user_details";
        public static final String COLUMN_ID = "id";
        public static final String U_CODE = "U_CODE";
        public static final String U_NAME = "U_NAME";
        public static final String U_PHONE = "U_PHONE";
        public static final String UT_CODE = "UT_CODE";
        public static final String UT_NAME = "UT_NAME";
        public static final String DS_CODE = "DS_CODE";
        public static final String D_NAME = "D_NAME";
        public static final String DIVN = "DIVN";
        public static final String NM = "NM";
        public static final String ISACTIVATE = "ISACTIVATE";
        public static final String U_LEVEL = "U_LEVEL";
        public static final String SEAS = "SEAS";
        public static final String U_UPDMAST = "U_UPDMAST";
        public static final String ZONE_CODE = "ZONE_CODE";
        public static final String Z_NAME = "Z_NAME";
        public static final String ApproveStatus = "ApproveStatus";
        public static final String TIMEFROM = "TIMEFROM";
        public static final String TIMETO = "TIMETO";
        public static final String LEAVEFLG = "LEAVEFLG";

        // Creating table Query For SQLite
        public static final String CREATE_TABLE =
                "CREATE TABLE IF NOT EXISTS " + TABLE_NAME + "("
                        + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT ,"
                        + U_CODE + " TEXT ,"
                        + U_NAME + " TEXT ,"
                        + U_PHONE + " TEXT ,"
                        + UT_CODE + " TEXT ,"
                        + UT_NAME + " TEXT ,"
                        + DS_CODE + " TEXT ,"
                        + D_NAME + " TEXT ,"
                        + DIVN + " TEXT ,"
                        + NM + " TEXT ,"
                        + ISACTIVATE + " TEXT ,"
                        + U_LEVEL + " TEXT ,"
                        + SEAS + " TEXT ,"
                        + U_UPDMAST + " TEXT ,"
                        + ZONE_CODE + " TEXT ,"
                        + Z_NAME + " TEXT ,"
                        + ApproveStatus + " TEXT ,"
                        + TIMEFROM + " TEXT ,"
                        + TIMETO + " TEXT ,"
                        + LEAVEFLG + " TEXT "
                        + ")";


    }