package JavaPratices;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapMethods {

	public static void main(String[] args) {

		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();

		tmap.put(4, "India");
		tmap.put(1, "USA");
		tmap.put(3, "Russia");
		tmap.put(5, "Israel ");
		tmap.put(2, "China");
		tmap.put(9, null);
		tmap.put(10, null);

		Set<Entry<Integer, String>> set = tmap.entrySet();

		for (Entry<Integer, String> es : set) {

			System.out.println(es.getKey() + " : " + es.getValue());
		}

		System.out.println("***********************************************");

		Iterator<Entry<Integer, String>> it = set.iterator();

		while (it.hasNext()) {

			Entry<Integer, String> ee = it.next();

			System.out.println(ee.getKey() + " : " + ee.getValue());
		}

		System.out.println("***********************************************");

		System.out.println("map is empty = " + tmap.isEmpty());

		System.out.println("***********************************************");

		System.out.println("size is = " + tmap.size());

		System.out.println("***********************************************");

		System.out.println("map contains value 4 = " + tmap.containsKey(4));

		System.out.println("***********************************************");

		System.out.println("map contains key Russia = " + tmap.containsValue("Russia"));

		System.out.println("***********************************************");

		System.out.println(tmap.get(2));

		System.out.println("***********************************************");

		Set<Integer> keyset = tmap.keySet();

		for (Integer keys : keyset) {

			System.out.println(keys);

		}
		System.out.println("***********************************************");

		Collection<String> value = tmap.values();

		for (String vv : value) {

			System.out.println(vv);
		}

		System.out.println("***********************************************");

		tmap.remove(9, null);

		tmap.replace(10, null, "Bangladesh");

		Set<Entry<Integer, String>> rr = tmap.entrySet();

		Iterator<Entry<Integer, String>> rem = rr.iterator();

		while (rem.hasNext()) {

			Entry<Integer, String> mm = rem.next();

			System.out.println(mm.getKey() + " : " + mm.getValue());
		}

		System.out.println("***********************************************");

	}

}
