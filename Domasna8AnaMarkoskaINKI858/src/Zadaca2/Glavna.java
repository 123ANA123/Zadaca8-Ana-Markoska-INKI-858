package Zadaca2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Glavna {

	public static void main(String[] args) {
		try 
		{
			BufferedReader object = new BufferedReader(new InputStreamReader(System.in));
			String s = object.readLine();

			Recnik object1 = new Recnik();
			object1.zborovi();
			object1.prebaruvanje(s);
		} 

		catch (IOException e) {
			System.out.println(e.toString());
		}
	}
	
}

