package JavaPratices;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMap {

	public static void main(String[] args) {

		java.util.LinkedHashMap<String, String> data = new java.util.LinkedHashMap<String, String>();

		data.put("MH12US8139", "Partha");
		data.put("OD04F9366", "Happy");
		data.put("MH12NH6207", "Chandan");
		data.put("OD04H5116", "Bapi");
		data.put(null, null);

		Set<Entry<String, String>> set = data.entrySet();

		for (Entry<String, String> ee : set) {

			System.out.println(ee.getKey() + " : " + ee.getValue());
		}

		System.out.println("################### Using Iterator ###########################");

		Set<Entry<String, String>> it = data.entrySet();

		Iterator<Entry<String, String>> ee = it.iterator();

		while (ee.hasNext()) {

			Entry<String, String> next = ee.next();

			System.out.println(next.getKey() + " : " + next.getValue());
		}

		System.out.println("##############################################");

		System.out.println("Size is = " + data.size());

		System.out.println("##############################################");

		System.out.println("Data is Empty = " + data.isEmpty());

		System.out.println("##############################################");

		System.out.println("Data contains OD04H5116 = " + data.containsKey("OD04H5116"));
		System.out.println("Data contains OD03F5116 = " + data.containsKey("OD03F5116"));

		System.out.println("##############################################");

		System.out.println("Data contains Happy = " + data.containsValue("Happy"));
		System.out.println("Data contains Neta = " + data.containsValue("Neta"));

		System.out.println("##############################################");

		Entry<String, String> first = data.firstEntry();

		System.out.println(first.getKey() + " : " + first.getValue());

		System.out.println("##############################################");

		System.out.println(data.get("MH12NH6207"));

		System.out.println("##############################################");

		Set<String> keyset = data.keySet();

		for (String key : keyset) {

			System.out.println(key);
		}

		System.out.println("##############################################");

		Collection<String> cc = data.values();

		for (String c : cc) {

			System.out.println(c);
		}

		System.out.println("##############################################");

		Entry<String, String> lastentry = data.lastEntry();

		System.out.println(lastentry.getKey() + " : " + lastentry.getValue());

		System.out.println("##############################################");

		data.remove(null, null);

		data.replace("MH12US8139", "Partha", "Lucky");

		ee = it.iterator();

		while (ee.hasNext()) {

			Entry<String, String> next = ee.next();

			System.out.println(next.getKey() + " : " + next.getValue());
		}

	}

}
