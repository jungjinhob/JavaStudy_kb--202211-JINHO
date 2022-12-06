package j17_JSON;

import com.google.gson.annotations.Expose;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class User { 
	@Expose(serialize = true ,  deserialize = false) //serialize 는기본값 true가 아님. 그래서 이거 안해주면 gson2에 exclude걸면 출력안됨이것도.(json일때)
	private String username;
	@Expose(serialize = true , deserialize = true) //deserialize 하면 값이 null 로나옴 (object일때)
	private String password;
	@Expose(serialize = false , deserialize = true)
	private String name;
	@Expose(serialize = true, deserialize = true)
	private String email;
	
	
}
