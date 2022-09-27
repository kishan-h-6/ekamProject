package ekam.example.api;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.testvagrant.ekam.api.retrofit.RetrofitBaseClient;
import com.testvagrant.ekam.reports.annotations.APIStep;
import ekam.example.api.GetSingleUser.GetSingleUserResponse;
import retrofit2.Call;
import retrofit2.http.GET;

public class UserClient extends RetrofitBaseClient {

    private interface UserService {
        @GET("/api/users/2")
        Call<GetSingleUserResponse> getSingleUser();
    }

    private final UserService service;

    @Inject
    public UserClient(@Named("baseUrl") String baseUrl) {
        super(baseUrl);
        service = httpClient.getService(UserService.class);
    }

    @APIStep(keyword = "When", description = "I invoke getSingleUser API")
    public GetSingleUserResponse getSingleUser(int userId) {
        Call<GetSingleUserResponse> call = service.getSingleUser();
        return httpClient.execute(call);
    }
}