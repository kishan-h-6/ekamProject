package ekam.example.api.getSingleUser;

import com.testvagrant.ekam.testBases.testng.APITest;

import static com.testvagrant.ekam.commons.LayoutInitiator.*;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class UserTests extends APITest {

    @Test(groups = "api")
    public void shouldReturnSingleUserTest() {

        GetSingleUserResponse user = Client(UserClient.class)
                .getSingleUser();
        assertNotNull(user.getData().getEmail());

    }
}