package Zadaca2;

import java.util.HashMap;
import java.util.Map;

public class Recnik {
	Map<String, String> recnik = new HashMap<String, String>();

	public void zborovi() {
		recnik.put("Red", "Crvena");
		recnik.put("Yellow", "Zholta");
		recnik.put("Green", "Zelena");
		recnik.put("Pink", "Rozeva");
		recnik.put("Purple", "Violetova");
		recnik.put("Blue", "Sina");
	}

	public void prebaruvanje (String s) {
		if (recnik.containsKey(s)) 
		{
			System.out.println(recnik.get(s));
		} 
		else
			System.out.println("Zborot ne postoi vo rechnikot.");
	}
}
