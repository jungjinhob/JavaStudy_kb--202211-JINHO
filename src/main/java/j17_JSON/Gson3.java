package j17_JSON;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class Gson3 {
	public static void main(String[] args) {
		JsonObject jsonObject = new JsonObject(); // Map을 거칠필요 없는 Json형태(Map유사)
		jsonObject.addProperty("username", "junil");
		jsonObject.addProperty("password", "1234");
		
		System.out.println(jsonObject);
		
		JsonArray jsonArray = new JsonArray(); //Json배열
		jsonArray.add("java");
		jsonArray.add("python");
		jsonArray.add("javascript");
		jsonArray.add("c#");
		
		System.out.println(jsonArray);
		
		jsonObject.add("subject", jsonArray); //subject란 인덱스만들고 거기에 jsonArray value로
		System.out.println(jsonObject);
	}
	
	
}
