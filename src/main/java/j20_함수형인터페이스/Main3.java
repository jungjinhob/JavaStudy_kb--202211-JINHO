package j20_함수형인터페이스;

import java.util.ArrayList;
import java.util.List;
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
		
		names.forEach(n ->{  //안에 consumer객체 consumer는 인터페이스 즉 람다 사용해서 객체생성.
			System.out.println(n); 
		});
		
		for (String n : names) {
			System.out.println(n);
		}
		//objects.requirenonnull -> null exception추가
		System.out.println();
		forEachTest(n->{System.out.println(n);}, names); //names에서 하나씩(n)갖고와서 출력 (이걸 반복)
		
	}
}
