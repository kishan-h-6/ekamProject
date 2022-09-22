package ekam.example.api;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.testvagrant.ekam.api.retrofit.RetrofitBaseClient;
import com.testvagrant.ekam.reports.annotations.APIStep;
import retrofit2.Call;

import java.util.List;

public class PostClient extends RetrofitBaseClient {
    private final PostsService service;

    @Inject
    public PostClient(@Named("baseUrl") String baseUrl) {
        super(baseUrl);
        service = httpClient.getService(PostsService.class);
    }

    @APIStep(description = "Get Posts")
    public List<Posts> getPosts() {
        Call<List<Posts>> call = service.getPosts();
        return httpClient.execute(call);
    }
}
