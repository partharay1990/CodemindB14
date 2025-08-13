package JavaPratices;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapMethods {

	public static void main(String[] args) {

		HashMap<Integer, String> hs = new HashMap<Integer, String>();

		hs.put(2122, "Happy");
		hs.put(6477, "Himanshu");
		hs.put(7001, "Neta");
		hs.put(6001, "Bapi");

		Set<Entry<Integer, String>> es = hs.entrySet();

		for (Entry<Integer, String> ee : es) {

			System.out.println(ee.getKey() + " : " + ee.getValue());
		}

		HashMap<Integer, String> data = new HashMap<Integer, String>();

		data.put(null, null);
		data.put(2980, "Janki");
		hs.putAll(data);

		System.out.println("################################################");

		Iterator<Entry<Integer, String>> ie = es.iterator();

		while (ie.hasNext()) {

			Entry<Integer, String> nee = ie.next();

			System.out.println(nee.getKey() + " : " + nee.getValue());
		}

		System.out.println("################################################");

		System.out.println("Data is Empty = " + hs.isEmpty());

		System.out.println("################################################");

		System.out.println("Size is = " + hs.size());

		System.out.println("################################################");

		System.out.println("Key contains 2122 = " + hs.containsKey(2122));
		System.out.println("Key contains 5856 = " + hs.containsKey(5856));

		System.out.println("################################################");

		System.out.println("Value contains Neta = " + hs.containsValue("Neta"));
		System.out.println("Value contains Raja = " + hs.containsValue("Raja"));

		System.out.println("################################################");

		System.out.println(hs.get(2122));

		System.out.println("################################################");

		hs.remove(6001);

		hs.replace(null, null, "Bapi");

		es = hs.entrySet();

		for (Entry<Integer, String> ee : es) {

			System.out.println(ee.getKey() + " : " + ee.getValue());
		}

		System.out.println("################################################");

		Collection<String> cc = hs.values();

		for (String s : cc) {

			System.out.println(s);
		}
		System.out.println("################################################");

		Set<Integer> keyset = hs.keySet();

		for (Integer key : keyset) {

			System.out.println(key);
		}

	}

}
