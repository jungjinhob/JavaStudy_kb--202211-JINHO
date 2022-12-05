package j20_함수형인터페이스;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main4 {
	
	public static void main(String[] args) {
		Function<Integer, String> fx1 = age -> age + "살";
		
		System.out.println(fx1.apply(20));
		
		Function<Function<Integer, String>,String> fx2 = fx -> fx.apply(200) + "입니다.";
		System.out.println(fx2.apply(age -> age + "살"));
		
		BiFunction<Integer, String, Map<Integer,String>> createMap = (number, name) -> { // integer string 값을 받고 map으로 리턴.
			Map<Integer, String> map = new HashMap<>();
			map.put(number, name);
			return map;
		};
		
		List<Map<Integer, String>> list = new ArrayList<>();
		list.add(createMap.apply(100, "김준일"));
		list.add(createMap.apply(200, "김준2"));
		list.add(createMap.apply(300, "김준3"));
		list.add(createMap.apply(400, "김준4"));
		list.add(createMap.apply(500, "김준5"));
		
		System.out.println(list);
		
	}
}
