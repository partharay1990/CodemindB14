package JavaPratices;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetImpl {

	public static void main(String[] args) {

		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();

		linkedHashSet.add("Partha");
		linkedHashSet.add("Happy");
		linkedHashSet.add("Lucky");
		linkedHashSet.add("Pinky");
		linkedHashSet.add("Partha");
		linkedHashSet.add(null);

		LinkedHashSet<String> lhs = new LinkedHashSet<String>();

		lhs.addAll(linkedHashSet);

		lhs.add("Suchi");
		lhs.add("Lisa");

	   lhs.remove("Partha");
	  //lhs.removeAll(linkedHashSet);

		// lhs.clear();

		for (String str : lhs) {

			System.out.println(str);

		}

		System.out.println("***********************************************");

		System.out.println("Linkedhashset is Empty = " + lhs.isEmpty());

		System.out.println("***********************************************");

		System.out.println("Size of Linkedhashset = " + lhs.size());

		System.out.println("***********************************************");

		System.out.println("LinkedhashSet contains Suchi = " + lhs.contains("Suchi"));

		System.out.println("***********************************************");

		Iterator<String> it = lhs.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());
		}

	}

}
