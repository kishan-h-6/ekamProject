package ekam.example.api.CreateUser;


import lombok.Builder;
import lombok.Getter;

import java.lang.module.ModuleDescriptor;

@Getter
@Builder
public class CreateUserRequest{
	private String name;
	private String job;


}