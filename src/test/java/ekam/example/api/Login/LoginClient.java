package ekam.example.api.Login;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.testvagrant.ekam.api.retrofit.RetrofitBaseClient;
import ekam.example.TimeTracker.timeTracker;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public class LoginClient extends RetrofitBaseClient {

    public LoginResponse login(LoginRequest loginRequest) {
        return null;
    }

    private interface LoginService {

        @Headers({"Content-Type: application/json"})
        @POST("/api/login")

        Call<LoginResponse> login (@Body LoginRequest request);
    }

    private final LoginService service;

    @Inject
    public LoginClient(@Named("baseUrl") String baseUrl) {
        super(baseUrl);
        service = httpClient.getService(LoginService.class);
    }
}