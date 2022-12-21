package Zadaca1;
import java.util.HashMap;
import java.util.Map;
public class Main {
public static void main(String[] args) {
		
		Map<String,String> rechnik = new HashMap<String,String>();
		rechnik.put("one", "eden");
		rechnik.put("two", "dva");
		rechnik.put("three", "tri");
		rechnik.put("four", "cetiri");
		rechnik.put("hi", "zdravo");

		System.out.println("Kluchevi: "+rechnik.keySet());
		System.out.println("Vrednosti: "+rechnik.values());

		for(Map.Entry<String,String> entry : rechnik.entrySet()){
			System.out.println(entry.getKey()+" | "+entry.getValue());	
		}

		if(rechnik.containsKey("hi"))
			System.out.println("Prevodot za 'hi' e :" + rechnik.get("hi"));
		else
			System.out.println("Ne postoi zbor hi.");
	}
}
