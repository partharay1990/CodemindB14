package JavaPratices;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapUse {

	public static void main(String[] args) {

		HashMap<String, String> data = new HashMap<String, String>();

		data.put("OD04F9366", "Partha");
		data.put("OD04F9367", "Lucky");
		data.put("OD04F9368", "Pinky");
		data.put(null, null);
		data.put("OD04F9366", "Partha");

		HashMap<String, String> data1 = new HashMap<String, String>();

		data1.put("OD18G4966", "Himanshu");
		data1.put("OD18G4967", "Partha");

		data1.putAll(data);

		Set<Entry<String, String>> set = data1.entrySet();

		for (Entry<String, String> ee : set) {

			System.out.println(ee.getKey() + " : " + ee.getValue());

		}

		System.out.println("#################################################");

		Set<Entry<String, String>> et = data1.entrySet();

		Iterator<Entry<String, String>> it = et.iterator();

		while (it.hasNext()) {

			Entry<String, String> ee = it.next();

			System.out.println(ee.getKey() + " : " + ee.getValue());
		}

		System.out.println("#################################################");

		System.out.println("Data is empty = " + data1.isEmpty());

		System.out.println("#################################################");

		System.out.println("Size is = " + data1.size());

		System.out.println("#################################################");

		System.out.println("Contanis key  OD04F9366 = " + data1.containsKey("OD04F9366"));
		System.out.println("Contanis key OD04F8139 = " + data1.containsKey("OD04F8139"));

		System.out.println("#################################################");

		System.out.println("Contanis value Himanshu = " + data1.containsValue("Himanshu"));
		System.out.println("Contanis value Chandan = " + data1.containsValue("Chandan"));

		System.out.println("#################################################");

		System.out.println(data1.get("OD04F9367"));

		System.out.println("#################################################");

		Set<String> keyset = data1.keySet();

		for (String kk : keyset) {

			System.out.println(kk);
		}

		System.out.println("#################################################");

		data1.remove("OD04F9366");

		data1.replace(null, null, "Happy");

		et = data1.entrySet();

		it = et.iterator();

		while (it.hasNext()) {

			Entry<String, String> ee = it.next();

			System.out.println(ee.getKey() + " : " + ee.getValue());
		}

		System.out.println("#################################################");

		Collection<String> cc = data.values();

		for (String ss : cc) {
			System.out.println(ss);
		}

	}

}
