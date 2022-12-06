package j21_문자열메소드;

import java.util.Scanner;

public class StringMethod {
	public static void main(String[] args) {
		
		String name = "김준일김수현";
		
		System.out.println(name.length());
		
		System.out.println(name.indexOf("김")); //위치 찾기 
		
		System.out.println(name.lastIndexOf("김")); // 위치 뒤에서부터 찾기 
		
		char name1 = name.charAt(0);//인덱스의 값 찾기 
		System.out.println(name1);
		
		char name2 = name.charAt(name.indexOf("준"));
		System.out.println(name2);
		Scanner sc = new Scanner(System.in);
		
		String name11 = sc.nextLine();
		String name21 = sc.nextLine();
		String subName1 = name.substring(name.indexOf("김수현"),name.indexOf("김수현") + name11.length());
		String subName2 = name.substring(name.indexOf("김준일"),name.indexOf("김준일") + name21.length());
		System.out.println(subName1);
		System.out.println(subName2);
		
		String file = "C:/String.java";
		String fileName = null;
		String extension = null;
		
		fileName = file.substring("C:/".length() , file.lastIndexOf("."));
		System.out.println(fileName);
		extension = file.substring(file.lastIndexOf("."));
		System.out.println(extension);
		
		
		
		
	}
	
}
