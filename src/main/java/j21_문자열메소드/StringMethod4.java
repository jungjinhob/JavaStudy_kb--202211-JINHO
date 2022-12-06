package j21_문자열메소드;

import java.util.Arrays;
import java.util.List;

public class StringMethod4 {
	public static void main(String[] args) {
		String roles = "ROLE_USER, ROLE_MANAGER, ROLE_ADMIN , GUEST";
		roles = roles.replaceAll(" ", ""); //빈칸 없애기
		String[] roleArray = roles.split(","); //, 기준으로 잘라서 배열에 넣기
		for (String a : roleArray) { //확인
			System.out.print(a);
		};
		
		List<String> roleList = Arrays.asList(roleArray); //배열을 list로 변환 
		
		System.out.println(roleList);
		
		roleList.forEach(role ->{
			//prefix(접두어)라고함. (startswith)
			//suffix(접미어) (endWith)
			if(role.startsWith("ROLE_") && role.equalsIgnoreCase("role_user")) //role 있는것만 취급 && role_user가 대소문자 상관없이 같은것
				System.out.println("권한 : " + role);
			
		});
	}
}
