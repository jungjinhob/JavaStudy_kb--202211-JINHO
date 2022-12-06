package j17_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Gson2 { //빌더형태도 json이랑 왓다갓다 할수잇다.
	
	public static void main(String[] args) {
		
		User user = User.builder()
				.username("junil")
				.password("1234")
				.name("김준일")
				.email("junil1111@gmail.com")
				.build();
		
				System.out.println(user);
				
				Gson gson = new GsonBuilder()
						.setPrettyPrinting()
						.serializeNulls() //serialize false로 인해 password 줄 삭제. json형태의 tostring에서
						.excludeFieldsWithoutExposeAnnotation() //deserialize false이면 값을 null 로 바꿈. 만약 serialize 가 false이면 deserialize 상관없이 null
						.create();
				
				String userJson = gson.toJson(user);
				System.out.println(userJson); // json형태
				
				User userObj = null;
				
				
				userObj = gson.fromJson(userJson, User.class);
				System.out.println(userObj); //user형태				
			
	}
	
}
