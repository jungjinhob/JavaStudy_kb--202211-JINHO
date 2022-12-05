package j20_함수형인터페이스;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Consumer;
//consumer 퉁쳐놓고 나중에 ->() ()해당하는거 쓰기 (리턴 X)

public class Main3 {
	
	public static void forEachTest(Consumer<String> consumer, List<String> list) {
		for(String s : list) {
			consumer.accept(s);
		}
	}
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("임지현");
		names.add("임지2");
		names.add("임지3");
		names.add("임지4");
		names.add("임지5");
		
		
		names.forEach(n ->{  //람다에 (Override) public void accept 포함 
			System.out.println(n);  //accept의 구현체
		});
		
		for (String n : names) {
			System.out.println(n);
		}
		//objects.requirenonnull -> null exception추가
		System.out.println();
		forEachTest(n->{System.out.println(n);}, names); //names에서 하나씩(n)갖고와서 출력 (이걸 반복)
		
		Map<String, String> subject = new HashMap<>();
		subject.put("java", "자바");
		subject.put("python", "파이썬");
		subject.put("javascript", "자바스크리브");
		subject.put("C", "씨언어");
		subject.put("Node.js", "노드제이에스");
		
		Set<String> keySet = subject.keySet();
		keySet.forEach(key -> {
			System.out.println(subject.get(key)); //value
		});
		
		Set<Entry<String, String>> entrySet = subject.entrySet();
		entrySet.forEach(entry -> {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		});
		System.out.println("-----------"); //Map의 foreach (매개변수가 키 ,값 으로 세팅되있음)
		subject.forEach((key , value) -> {
			System.out.println(key + " : " + value);
		});
	}
}
