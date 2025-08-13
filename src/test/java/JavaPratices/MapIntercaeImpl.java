package JavaPratices;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapIntercaeImpl {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "India");
		map.put(5, "USA");
		map.put(3, "Russia");
		map.put(4, "China");

		map.put(8, "USA");
		map.put(null, "null");

		Set<Entry<Integer, String>> set = map.entrySet();

		for (Entry<Integer, String> ee : set) {

			System.out.println(ee.getKey() + " : " + ee.getValue());
		}

	}

}
