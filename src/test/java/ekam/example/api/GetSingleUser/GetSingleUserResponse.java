package ekam.example.api.GetSingleUser;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class GetSingleUserResponse{
	private Data data;
	private Support support;
}