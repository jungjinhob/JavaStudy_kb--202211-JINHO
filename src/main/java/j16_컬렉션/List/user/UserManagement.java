package j16_컬렉션.List.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserManagement {

	public static void main(String[] args) {
		
		List<Map<String, Object>> userList = new ArrayList<>();
		//저장소의 변수와 자료형이 같아야한다.
		UserRepository userRepository = new UserRepository(userList); //저장소 객체 불러옴
		//Map객체 4개 생성 
		Map<String, Object> user1 = new HashMap<>();
		user1.put("username", "a1");
		user1.put("password", "1111");
		Map<String, Object> user2 = new HashMap<>();
		user2.put("username", "b1");
		user2.put("password", "2222");
		Map<String, Object> user3 = new HashMap<>();
		user3.put("username", "c1");
		user3.put("password", "3333");
		Map<String, Object> user4 = new HashMap<>();
		user4.put("username", "d1");
		user4.put("password", "4444");
		//user1 에는 {username = a1 , password = 1111}
		
		//저장소에 Map객체 4개 저장\
		userRepository.register(user1);
		userRepository.register(user2);
		userRepository.register(user3);
		userRepository.register(user4);
		
		System.out.println(userRepository.getUserList()); // userlist 정보 다출력
		
		System.out.println(userRepository.findUserByUsername("b1")); //b1정보(특정) 출력
		
		userRepository.modifyPassword("b1", "1234"); //b1 비번 1234로 바꿔라
		System.out.println(userRepository.findUserByUsername("b1"));
		
		userRepository.deleteUserbyUsername("b1"); // b1정보 삭제
		System.out.println(userRepository.getUserList());
		
	}

}
