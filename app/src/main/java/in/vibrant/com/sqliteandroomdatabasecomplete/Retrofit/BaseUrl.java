package in.vibrant.com.sqliteandroomdatabasecomplete.Retrofit;

public class BaseUrl {
    public static final String BASE_URL = "http://wavedev.vibsugar.com/canedevelopmentservice.asmx/";
    private BaseUrl() {
    }
    public static ApiService getCaneDevService() {
        return RetrofitClient.getClient(BASE_URL).create(ApiService.class);
    }


}
