package example;

import java.util.Scanner;

class User{
	final static String EMAIL = "qwer@qwer";
	final static String PASSWORD = "qwer";
}
public class Example01 {

	public static void main(String[] args) {
//		로그인 프로세스
//		1. 사용자로부터 이메일 주소와 비밀번호를 받음
		Scanner sc = new Scanner(System.in);
		System.out.println("email : ");
		String email = sc.nextLine();
		System.out.println("password : ");
		String password = sc.nextLine();
		
		System.out.println("email - " + email +  " / password : " + password);
		
//		
		if(email.length() < 1 || password.length() < 1) {
			System.out.println("모두 입력 ㄱ");
			return;
		}
//			
		if(!email.equals(User.EMAIL) || !password.equals(User.PASSWORD)) {
			System.out.println("로그인 정보가 일치하지 않습니다.");
			return;	
		}
			
		System.out.println("로그인에 성공했습니다.");
		
//			
		}
//		
		
		
		
		
	}


