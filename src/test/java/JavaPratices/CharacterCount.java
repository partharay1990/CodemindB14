package JavaPratices;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class CharacterCount {

	public static void main(String[] args) {

		String str = "Welcome to codemind technology";

		TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {

			if (!(map.containsKey(str.charAt(i)))) {

				map.put(str.charAt(i), 1);
			}

			else {

				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			}
		}

		Set<Entry<Character, Integer>> set = map.entrySet();

		for (Entry<Character, Integer> ee : set) {

			System.out.println(ee.getKey() + " : " + ee.getValue());
		}

	}

}
