package JavaPratices;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetMethods {

	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<Integer>();

		hs.add(20);
		hs.add(200);
		hs.add(100);
		hs.add(60);
		hs.add(30);
		hs.add(20);
		hs.add(null);

		for (Integer i : hs) {

			System.out.println(i);
		}

		HashSet<Integer> hashSet = new HashSet<Integer>();

		hashSet.add(2000);

		hashSet.addAll(hs);

		hashSet.remove(20);

		hashSet.removeAll(hs);

		hashSet.add(55);
		hashSet.add(45);
		hashSet.add(75);
		hashSet.add(35);
		hashSet.add(65);

		// hashSet.clear();

		System.out.println("Hashset contain 35 = " + hashSet.contains(35));

		System.out.println("************************************************");

		System.out.println("Hashset is Empty = " + hashSet.isEmpty());

		System.out.println("************************************************");

		System.out.println("Size of Hashset  = " + hashSet.size());

		System.out.println("************************************************");

		Iterator<Integer> iterator = hashSet.iterator();

		while (iterator.hasNext()) {

			System.out.println(iterator.next());
		}

		System.out.println("************************************************");

		for (Integer i : hashSet) {

			System.out.println(i);
		}

	}

}
