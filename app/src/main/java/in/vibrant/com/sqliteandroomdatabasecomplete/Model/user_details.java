package in.vibrant.com.sqliteandroomdatabasecomplete.Model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class user_details {

    @SerializedName("DATA")
    List<UserDetailsModel> data = new ArrayList<>();
    @SerializedName("GPSACCURACY")
    private String gpsaccuracy;
    @SerializedName("GPSWTTIME")
    private String gpswttime;
    @SerializedName("API_STATUS")
    private String apiStatus;
    @SerializedName("MSG")
    private String msg;
    @SerializedName("URL")
    private String url;
    @SerializedName("APPVersion")
    private String aPPVersion;

    @SerializedName("APPStatus")
    private String aPPStatus;

    public String getGpsaccuracy() {
        return gpsaccuracy;
    }

    public void setGpsaccuracy(String gpsaccuracy) {
        this.gpsaccuracy = gpsaccuracy;
    }

    public String getGpswttime() {
        return gpswttime;
    }

    public void setGpswttime(String gpswttime) {
        this.gpswttime = gpswttime;
    }

    public String getApiStatus() {
        return apiStatus;
    }

    public void setApiStatus(String apiStatus) {
        this.apiStatus = apiStatus;
    }

    public List<UserDetailsModel> getData() {
        return data;
    }

    public void setData(List<UserDetailsModel> data) {
        this.data = data;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAPPVersion() {
        return aPPVersion;
    }

    public void setAPPVersion(String aPPVersion) {
        this.aPPVersion = aPPVersion;
    }

    public String getAPPStatus() {
        return aPPStatus;
    }

    public void setAPPStatus(String aPPStatus) {
        this.aPPStatus = aPPStatus;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getaPPVersion() {
        return aPPVersion;
    }

    public void setaPPVersion(String aPPVersion) {
        this.aPPVersion = aPPVersion;
    }

    public String getaPPStatus() {
        return aPPStatus;
    }

    public void setaPPStatus(String aPPStatus) {
        this.aPPStatus = aPPStatus;
    }
}
