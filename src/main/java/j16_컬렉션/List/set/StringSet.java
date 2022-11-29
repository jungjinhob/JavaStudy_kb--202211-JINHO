package j16_컬렉션.List.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringSet {
	
	public static void main(String[] args) {
		Set<String> names = new HashSet<String>();
		
		names.add("정진호");
		names.add("김수현");
		names.add("문경원");
		names.add("권용범");
		names.add("이영인");
		
		System.out.println(names); // 순서가 없음~
		for(String s : names) {
			if(s.equals("김수현")) {
				System.out.println(s);
				break;
			}
		}
		
		List<String> nameList = Arrays.asList(new String[] {"김준일","권용범"}); //asList 괄호안에서 배열객체 생성.-> List로 변환
		System.out.println(nameList);
		
		Set<String> listToSet = new HashSet<String>(); //그냥 set
		listToSet.addAll(nameList); //addAll -> List값을 set으로 다 옮김.
		//Map은 컬렉션이 아니라서 addAll 사용불가
		System.out.println(listToSet);
		
		names.remove("정진호");
		System.out.println(names); //set은 따로 update없음
		
		
		
	
	
	}
	
	
}
