package j16_컬렉션.List.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.sound.midi.Soundbank;

import java.util.Set;
import java.util.TreeMap;

public class MapMethod {

	public static void main(String[] args) {

		Map<String, Object> map = new HashMap<>();

		map.put("username", "junil");
		map.put("password", "1234");
		map.put("name", "김준일");
		map.put("email", "junil@gmail.com");
		map.put("age", "29");
		map.put("gender", true);

		Map<String, String> address = new HashMap<>();
		address.put("address1", "부산광역시");
		address.put("address2", "동래구");
		address.put("address3", "중앙대로");
		map.put("address", address);

		Map<Integer, String> subject = new TreeMap<>();
		subject.put(100, "java");
		subject.put(200, "c#");
		subject.put(300, "python");
		map.put("subject", subject);
		
		System.out.println(((Map<Integer, String>) map.get("subject")).get(200));

		List<String> hobby = new ArrayList<>();
		hobby.add("축구");
		hobby.add("농구");
		hobby.add("야구");
		hobby.add("족구");

		map.put("hobby", hobby);
		System.out.println(map);
		// map.get("hobby)는 object List<String>은 list로 다운캐스팅 그 후 .get(인덱스)
		System.out.println(((List<String>) map.get("hobby")).get(1));
		
		System.err.println();
		// Set안에 Entry객체만 들어갈수 있음. //. entryset -> map -> entryset형태로
		//entry는 set인데 Map처럼 키값이 한묶음. ( Map + set)
		Set<Entry<String, Object>> userEntry = map.entrySet();
		
		List<Map<String, Object>> listMap = new ArrayList<>();
		
		//Map과 같이 Entry도 키 값 , 한 인덱스당 줄띄움해서 나옴.
		for(Entry<String,Object> entry : userEntry) { //userEntry(Entryset)에서 entry에게 값을 하나씩 넘겨준다.
			System.out.println(entry.getKey() +  " : " + entry.getValue());
			
		}
		System.out.println("------------------");
		/*===============*/
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(key);
			System.out.println(map.get(key));
		}
		System.out.println();
		
		for(Object obj : map.values()) { //map의 value들이 object형이기 때문에 Object로 뱉는다.
			System.out.println(obj);
		}
		
		
		
//		System.out.println(map);// 중괄호
//		System.out.println(userEntry); // 대괄호

	}

}
