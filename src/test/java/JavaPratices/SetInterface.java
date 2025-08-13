package JavaPratices;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetInterface {

	public static void main(String[] args) {

		Set<Integer> ss = new HashSet<Integer>();
		ss.add(11);
		ss.add(21);
		ss.add(31);
		ss.add(41);
		ss.add(11);
		ss.add(null);

		for (Integer i : ss) {

			System.out.println(i);
		}

		System.out.println("***************************************8");

		Iterator<Integer> iterator = ss.iterator();

		while (iterator.hasNext()) {

			System.out.println(iterator.next());
		}

	}

}
