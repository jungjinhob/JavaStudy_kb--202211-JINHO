package j16_컬렉션.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListMethod {
	public static void printList(String listName, List<String> list) {
		System.out.println(" [ " + listName + " ] ");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(i + "->\t");
			System.out.println(list.get(i));
		}
		System.out.println();
	}

	public static void main(String[] args) {

		List<String> nameList = new ArrayList<String>();
		List<String> nameList2 = new ArrayList<String>();

		// add() -> 리스트에 값을 추가함.
		nameList.add("임지현");
		nameList.add("신경수");
		nameList.add("고희주");
		nameList.add("문승주");
		nameList.add("장건녕");
		nameList.add("박수현");
		printList("nameList", nameList);

		// addAll() -> 다른 collection의 값을 추가
		nameList2.addAll(nameList);
		printList("nameList2", nameList2);
		nameList2.addAll(3, nameList); // 인덱스 3부터 namelist 삽입.(중간에)
		printList("nameList2", nameList2);

//		boolean isContains = nameList.contains("장건녕"); // contains는 boolean으로 쓰고  List 안에 요소가 있는지 확인.
//		System.out.println("이름목록에 장건녕이 있나? " + (isContains ? "있다" : "없다"));
//		
//	
//		int index = nameList.indexOf("고희주"); // indexOf -> List에서 해당요소의 인덱스 위치 확인.
//		System.out.println("고희주의 인덱스 위치 : " + index);
//		
//		//lastIndexOf -> 리스트에서 해당 값의 인덱스 위치를 반환.(뒤에서부터 탐색)
//		int lastIndex = nameList2.lastIndexOf("임지현");
//		System.out.println("임지현 뒤 위치 " + lastIndex);
//		
//		
//		
//		boolean isEmpty = nameList.isEmpty();
//		System.out.println("해당리스트가 비어 있는가? " + isEmpty);
//	
//	
//	for(String name : nameList) {
//		System.out.println(name);
//	}

		// iterator 란
		Iterator<String> ir = nameList.iterator();
		
		while (ir.hasNext()) {// 다음값이 있는가?
			System.out.println(ir.next());// 다음값을 꺼내라 `
		}

		System.out.println();

		nameList.forEach(name -> {
			System.out.println(name);
		});

	}
}
