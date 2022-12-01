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
						.serializeNulls() //builder에서 그값이 누락되어도 key : null 로 출력해준다. 원래는 줄자체가 삭제됨.
						.excludeFieldsWithoutExposeAnnotation()
						.create();
				
				String userJson = gson.toJson(user);
				System.out.println(userJson); // json형태
				
				User userObj = null;
				
				
				userObj = gson.fromJson(userJson, User.class);
				System.out.println(userObj); //user형태				
			
	}
	
}
