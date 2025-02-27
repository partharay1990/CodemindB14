package JavaPratices;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();

		ll.add("Partha");
		ll.add("Happy");
		ll.add("Suchi");
		ll.add("Lucky");
		ll.add("Happy");
		ll.add(null);

		LinkedList<String> l1 = new LinkedList<String>();

		l1.addAll(ll);
		l1.add("Pinky");
		l1.add("Chandan");

		l1.remove(3);
		l1.removeAll(ll);

		for (String str : l1) {

			System.out.println(str);
		}

		l1.add("XYZ");
		l1.add("MNO");
		l1.add("ABC");
		l1.add("EFG");
		l1.add(0, "Rani");

		for (String str : l1) {

			System.out.println(str);
		}

		System.out.println("################################");

		// l1.clear();

		System.out.println("l1 is empty = " + l1.isEmpty());

		System.out.println("################################");

		System.out.println("0th index Element =" + l1.get(0));

		System.out.println("################################");

		System.out.println("Size of l1 = " + l1.size());

		System.out.println("################################");

		System.out.println("l1 contains Pinky = " + l1.contains("Pinky"));

		System.out.println("################################");

		System.out.println("l1 contains Rani = " + l1.contains("Rani"));

		System.out.println("################################");
		
		 Iterator<String> it = l1.iterator();
		 
		 while(it.hasNext()) {
			 
			 System.out.println(it.next());
		 }
	}

}
