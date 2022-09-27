package ekam.example.api.GetSingleUser;


import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.testvagrant.ekam.api.retrofit.RetrofitBaseClient;
import com.testvagrant.ekam.reports.annotations.APIStep;
import ekam.example.TimeTracker.timeTracker;
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
        timeTracker time = new timeTracker();
        Call<GetSingleUserResponse> call = service.getSingleUser();
        time.stop();
        System.out.println(time.stop());

        return httpClient.execute(call);

    }


}



