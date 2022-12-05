package j21_문자열메소드;

import java.util.Arrays;
import java.util.List;

public class StringMethod4 {
	public static void main(String[] args) {
		String roles = "ROLE_USER, ROLE_MANAGER, ROLE_ADMIN , GUEST";
		roles = roles.replaceAll(" ", "");
		String[] roleArray = roles.split(",");
		
		List<String> roleList = Arrays.asList(roleArray);
		
		System.out.println(roleList);
		
		roleList.forEach(role ->{
			//prefix(접두어)라고함. (startswith)
			//suffix(접미어) (endWith)
			if(role.startsWith("ROLE_") && role.equalsIgnoreCase("role_user")) //role 있는것만 취급
				System.out.println("권한 : " + role);
			
		});
	}
}
