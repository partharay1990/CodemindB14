package JavaPratices;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapImpl {

	public static void main(String[] args) {

		HashMap<String, String> data = new HashMap<String, String>();

		data.put("MH12NH6207", "Chandan");
		data.put("MH12US8139", "Partha");
		data.put("MH12QV2366", "Happy");
		data.put("OD04F9366", "Himnshu");
		data.put(null, null);

		HashMap<String, String> data1 = new HashMap<String, String>();
		data.put("OD03F5966", "Biswajit");
		data.putAll(data1);

		Set<Entry<String, String>> set = data.entrySet();

		for (Entry<String, String> e : set) {

			System.out.println(e.getKey() + " : " + e.getValue());

		}
		// print data trough Iterator
		
		System.out.println("*****************");

		Set<Entry<String, String>> et = data.entrySet();
		
		Iterator<Entry<String, String>> it = et.iterator();

		while (it.hasNext()) {

			Entry<String, String> ee = it.next();

			System.out.println(ee.getKey() + " :" + ee.getValue());
		}

	}

}
