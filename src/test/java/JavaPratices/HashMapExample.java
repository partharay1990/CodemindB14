package JavaPratices;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		hm.put("Ajit", 30);
		hm.put("Sujit", 32);
		hm.put("Anil", 26);
		hm.put("Nikhil", 29);

		// Access single value of given key

	//	System.out.println("Age of Anil :" + hm.get("Anil"));

		// print only keys

	/*	for (String str : hm.keySet()) {

			System.out.println(str);

		}

		// How to print values

		for (Integer i : hm.values()) {

			System.out.println(i);
		} */

		// How to access node
		
		System.out.println("********Before Remove *********");

		for (Map.Entry<String, Integer> me : hm.entrySet()) {

			System.out.println("keys :" + me.getKey() + " Value : " + me.getValue());

		}

		hm.remove("Nikhil");
		
		System.out.println("*********After Remove *******");

		for (Map.Entry<String, Integer> me : hm.entrySet()) {

			System.out.println("keys :" + me.getKey() + " Value : " + me.getValue());

		}

	}

}
