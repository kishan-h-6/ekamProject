package ekam.example.api.GetSingleUser;

import com.testvagrant.ekam.testBases.testng.APITest;

import static com.testvagrant.ekam.commons.LayoutInitiator.*;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SingleUserTest extends APITest {

    @Test(groups = "api")
    public void apiExampleTest() {
        int userId=2;
        GetSingleUserResponse user = Client(UserClient.class)
                .getSingleUser(userId);
        assertNotNull(user.getData().getEmail());
    }
}