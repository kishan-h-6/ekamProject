package ekam.example.api.CreateUser;


import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CreateUserResponse{
	private String createdAt;
	private String name;
	private String id;
	private String job;
}