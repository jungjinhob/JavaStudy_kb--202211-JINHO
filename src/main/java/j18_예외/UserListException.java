package j18_예외;

import java.util.ArrayList;
import java.util.List;
import javax.crypto.NullCipher;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
class User{ //별도 클래스 (내부는 X , 서브클래스)
	private String username;
	private String password;
}

public class UserListException {
	
	public static void main(String[] args) {
		List<User> userList =new ArrayList<>();
		
		userList.add(new User("aaa","1111"));	
		userList.add(new User("bbb","2222"));	
		userList.add(new User("ccc","3333"));	
		userList.add(new User("ddd","4444"));
		userList.add(null);
		int length = userList.size();
		try { // catch (index 안에 null ) 그리고 밖에 null -> index오류안뜨면 바로 밖의 null 예외실행.
			for(int i = 0 ; i <length ; i++) {
				System.out.println(userList.get(i));
			}
			for(int i = 0 ; i <length ; i++) { 
				System.out.println("username : " + userList.get(i).getUsername());
				System.out.println("password : " + userList.get(i).getPassword());
			}
		} catch(IndexOutOfBoundsException e) {
			length -= 1;
			try {
				for(int i = 0 ; i <length ; i++) {
					System.out.println("username : " + userList.get(i).getUsername());
					System.out.println("password : " + userList.get(i).getPassword());
				}
			} catch (NullPointerException np) {
				System.out.println("dd");
			}
			
		}
		catch(NullPointerException e) { //밖 null예외
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			e.printStackTrace();
		}finally {//예외처리 다 못해도 무조건실행 (마지막에붙임) ex. 자동저장(백업)할때 사용 
			System.out.println("ㅇㅇㅇㅇㅇㅇㅇ");
		}
		System.out.println("ddddddd"); //예외 처리못하면 실행안됨 finally와 다르게 .
		
		
		System.out.println("프로그램 종료 ");
	}
	
		
}
