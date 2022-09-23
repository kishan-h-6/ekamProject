package ekam.example.api.CreateUser;

import com.testvagrant.ekam.testBases.testng.APITest;

import static com.testvagrant.ekam.commons.LayoutInitiator.*;

import lombok.Builder;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class UserTests extends APITest {
    @Builder
    @Test(groups = "SmokeTest")
    public void shouldCreateUser() {
        CreateUserRequest request = CreateUserRequest.builder().name("Bob").job("Builder").build();

        CreateUserResponse response = Client(UserClient.class)
                .createUser(request);
        assertEquals(response.getName(), "Bob");
    }
}