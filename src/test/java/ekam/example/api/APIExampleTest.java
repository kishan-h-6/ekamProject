package ekam.example.api;

import com.testvagrant.ekam.commons.LayoutInitiator;
import com.testvagrant.ekam.testBases.testng.APITest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

@Test(groups = "api")
public class APIExampleTest extends APITest {
    public void getPostsShouldReturnAValue() {
        PostClient postClient = LayoutInitiator.Client(PostClient.class);
        List<Posts> posts = postClient.getPosts();
        Assert.assertTrue(posts.size() > 1);
    }
}
