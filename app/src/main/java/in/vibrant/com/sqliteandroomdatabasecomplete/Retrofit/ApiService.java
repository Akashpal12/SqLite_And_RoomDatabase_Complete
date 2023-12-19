package in.vibrant.com.sqliteandroomdatabasecomplete.Retrofit;

import in.vibrant.com.sqliteandroomdatabasecomplete.Model.user_details;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("ValidateUser")
    Call<user_details> ValidateUser(
            @Query("UID") String UID,
            @Query("PWD") String PWD,
            @Query("FirbaseRegistrationId") String FirbaseRegistrationId);


}
