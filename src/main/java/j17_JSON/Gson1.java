package j17_JSON;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Gson1 {
	public static void main(String[] args) {
		Gson gson = new Gson();
		
		GsonBuilder gsonBuilder = new GsonBuilder();
		Gson gson2 = gsonBuilder.setPrettyPrinting().create();
		
		
		Map<String, Object> map = new HashMap<>();
		map.put("name", "김준일");
		map.put("email", "junil@gmail.com");
		map.put("address", "부산 동래구");
		map.put("phone", "01011112222");
		
		List<String> hobby = new ArrayList<>();
		hobby.add("축구");                                             
		hobby.add("농구");
		hobby.add("야구");
		
		map.put("hobby", hobby); 
		
		System.out.println(map);
		
		String json = gson2.toJson(map);
		
		System.out.println(json);
		
		Map<String , Object> jsonMap = gson2.fromJson(json, Map.class); //json을 map으로 바꿔라.
		System.out.println(jsonMap);
		
	}
}
