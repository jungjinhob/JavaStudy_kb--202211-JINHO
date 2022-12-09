package j17_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
	public static void main(String[] args) {
		Gson2 g = new Gson2(100,"Apple","Apple Computer Inc. 1 infinite Loop","Cupertino","CA","95014");
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String userJson = gson.toJson(g);
		System.out.println(userJson);
		
	} 
	

}
