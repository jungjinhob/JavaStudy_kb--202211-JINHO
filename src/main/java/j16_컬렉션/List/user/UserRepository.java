package j16_컬렉션.List.user;

import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class UserRepository {
	
	@Getter
	private List<Map<String, Object>> userList;

	public void register(Map<String, Object> userMap) {
		System.out.println("[사용자 등록]");
		userList.add(userMap);

	}

	// Read
	public Map<String, Object> findUserByUsername(String username) { // username에 입력한 정보를 UserMap에 넣기
		Map<String, Object> userMap = null;
		for (Map<String, Object> user : userList) { // user과 userlist 자료형 같게함.
			String _username = (String) user.get("username"); // username(object형) 키값에서 value받고 _username에 대입
			if (_username.equals(username)) { // 그 값이 매개변수값이랑 같다면
				userMap = user; // userMap에 넣어라.
				break;
			}
		}
		return userMap; // 그리고 리턴하라

	}

	public void modifyPassword(String username, String newPassword) { // 해당 username의 패스워드를 바꿔라.
		Map<String, Object> userMap = findUserByUsername(username);
		if (userMap == null) {
			System.out.println("해당 username으로 사용자를 찾을 수 없습니다.");
			return;// 메소드 강제로 나가기.
		}

		userMap.replace("password", newPassword);
	}
	
	public void deleteUserbyUsername(String username) {
		Map<String, Object> userMap = findUserByUsername(username);
		if (userMap == null) {
			System.out.println("해당 username으로 사용자를 찾을 수 없습니다.");
			return;// 메소드 강제로 나가기.
		}
		int userIndex = userList.indexOf(userMap);//해당 정보 찾아서 인덱스뽑고
		userList.remove(userIndex); //그 인덱스에 해당하는 값 삭제.
	}
	
}
