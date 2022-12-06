package j16_컬렉션.List.user;

import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class UserRepository {
	
	@Getter
	private List<Map<String, Object>> userList; //Map자료형을 갖는 List 선언.

	public void register(Map<String, Object> userMap) { //매개 Map을 List에 삽입.
		System.out.println("[사용자 등록]");
		userList.add(userMap);

	}

	// Read
	public Map<String, Object> findUserByUsername(String username) { // username에 입력한 정보를 UserMap에 넣기
		Map<String, Object> userMap = null; //Map하나 선언.
		for (Map<String, Object> user : userList) { // UserList에 있는 Map을 하나씩 스캔.
			String _username = (String) user.get("username"); // user.get()(object형) 키값에서 value !!!(username 본값) 받고 _username에 대입
			if (_username.equals(username)) { // 그 값이 매개변수값이랑 같다면
				userMap = user; // 그 userList객체(해당조건만족하는것만)를 userMap에 넣어라.
				break;
			}
		}
		return userMap; // 그리고 리턴하라

	}

	public void modifyPassword(String username, String newPassword) { // 해당 username의 패스워드를 바꿔라.
		Map<String, Object> userMap = findUserByUsername(username);
		if (userMap == null) { //만약 찾은 게 없다면 
			System.out.println("해당 username으로 사용자를 찾을 수 없습니다.");
			return;// 메소드 강제로 나가기.
		}

		userMap.replace("password", newPassword); // 찾은게 있다면 password에 접근해서 , 뒤에 값을 교체한다.
	}
	
	public void deleteUserbyUsername(String username) {
		Map<String, Object> userMap = findUserByUsername(username); // 해당 값 갖고와서
		if (userMap == null) { // Map에 없는거면
			System.out.println("해당 username으로 사용자를 찾을 수 없습니다.");
			return;// 메소드 강제로 나가기.
		}
		int userIndex = userList.indexOf(userMap);//해당 정보 찾아서 인덱스뽑고
		userList.remove(userIndex); //그 인덱스에 해당하는 값 삭제.
	}
	
}
