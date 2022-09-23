package ekam.example.api.CreateUser;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.testvagrant.ekam.api.retrofit.RetrofitBaseClient;
import ekam.example.api.GetSingleUser.GetSingleUserResponse;
import retrofit2.Call;
import retrofit2.http.*;
import com.testvagrant.ekam.reports.annotations.APIStep;

public class UserClient extends RetrofitBaseClient {

    private interface UserService {

        @Headers({"Content-Type: application/json"})
        @POST("/api/users")
        Call<CreateUserResponse> createUser(@Body CreateUserRequest request);


        Call<GetSingleUserResponse> getSingleUser(int userId);
    }

    private final UserService service;

    @Inject
    public UserClient(@Named("baseUrl") String baseUrl) {
        super(baseUrl);
        service = httpClient.getService(UserService.class);
    }

    @APIStep(keyword = "When", description = "I invoke getSingleUser API")
    public GetSingleUserResponse getSingleUser(int userId) {
        Call<GetSingleUserResponse> call = service.getSingleUser(userId);
        return httpClient.execute(call);

    }

    @APIStep(keyword = "When", description = "I invoke createUser API")
    public CreateUserResponse createUser(CreateUserRequest request) {
        Call<CreateUserResponse> call = service.createUser(request);
        return httpClient.execute(call);
    }


}