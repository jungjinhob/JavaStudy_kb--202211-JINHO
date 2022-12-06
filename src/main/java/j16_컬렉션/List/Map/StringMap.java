package j16_컬렉션.List.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class StringMap {
	public static void main(String[] args) {
		Map<String, String> language = new HashMap<String, String>();

		language.put("java", "자바2");// put == add
		language.put("html", "에이치티엠엘");
		language.put("css", "씨에스에스");
		language.put("js", "자바스크립트");
		language.put("python", "파이썬");
		language.put("python2", "파이썬");
		language.put("python", "파이썬?");

		String s = language.get("python");
		System.err.println(s);

		language.replace("java", "자바2", "자바3"); // replace == update
		System.out.println(language);

		language.remove("python2"); // remove는 동일
		System.out.println(language);
		
		System.out.println("----------------여기서부터 전체출력");
		
		language.forEach((k, v) -> { // 바로 foreach에 k,v넣어주면됨 public void accept가 오버라이드 된것은 ->로 생략.
			System.out.print(k+"/t");
			System.out.println(v);
		});
		
		System.out.println("------------");
		
		for (Entry<String, String> entry : language.entrySet()) { // Entry<자료형> entry 객체 : language(Map객체).entryset
			System.out.print(entry.getKey());								// set으로바꿔서 get키 벨류 한거임.
			System.out.println(entry.getValue());
		}
		
		System.out.println("------------");
		
		Iterator<String> ir = language.keySet().iterator();
		while (ir.hasNext()) { // hasNext가 true일경우 (false는 없을때인듯)
			String key = ir.next();
			System.out.print(key);
			System.out.println(language.get(key));// value값인듯
		}
	}
}
