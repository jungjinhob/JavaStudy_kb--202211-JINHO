package j16_컬렉션.List.Map;

import java.util.HashMap;
import java.util.Iterator;
i
import java.util.Map.Entry;
import java.util.Map;


public class StringMap {

	public static void main(String[] args) {

		Map<String, String> language = new HashMap<String, String>();

		language.put("java", "자바2");
		language.put("html", "에이치티엠엘");
		language.put("css", "씨에스에스");
		language.put("js", "자바스크립트");
		language.put("python", "파이썬");
		language.put("python2", "파이썬");
		language.put("python", "파이썬?");
		
		String s = language.get("python");
		System.err.println(s);
		
		language.replace("java", "자바2","자바3");
		System.out.println(language);
		
		language.remove("python2");
		System.out.println(language);
		
		language.forEach((k,v) ->{
			System.out.print(k);
			System.out.println(v);
		});
		System.out.println("------------");
		for(Entry<String, String> entry : language.entrySet()) {
			System.out.print(entry.getKey());
			System.out.println(entry.getValue());
		}
		System.out.println("------------");
		Iterator<String> ir  = language.keySet().iterator();
		while(ir.hasNext()) {
			String key = ir.next();
			System.out.print(key);
			System.out.println(language.get(key));
		}
		
	}

}
