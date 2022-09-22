package ekam.example.api;

import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface PostsService {
    @GET("/posts")
    Call<List<Posts>> getPosts();
}
