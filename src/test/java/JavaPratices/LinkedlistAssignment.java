package JavaPratices;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedlistAssignment {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();

		ll.add("Partha");
		ll.add("Lucky");
		ll.add("Pinky");
		ll.add("Happy");

		ll.add(0, "Gulia");

		LinkedList<String> ll1 = new LinkedList<String>();

		ll1.add("Suchi");

		ll1.addAll(ll);

		ll1.remove(2);
		ll1.removeAll(ll);

		for (String s : ll1) {

			System.out.println(s);
		}

		System.out.println("*******************************");

		ll1.add("Japur");
		ll1.add("Cuttack");
		ll1.add("Bhubaneswar");
		ll1.add("Bhadrak");
		ll1.add("Balasore");

		// ll1.clear();

		System.out.println("list contain Cuttack = " + ll1.contains("Cuttack"));

		System.out.println("list contain Puri = " + ll1.contains("Puri"));

		System.out.println("*******************************");

		System.out.println("3rd Index of List = " + ll1.get(3));

		System.out.println("*******************************");

		System.out.println("Size of List = " + ll1.size());

		System.out.println("*******************************");

		System.out.println("List is Empty = " + ll1.isEmpty());

		System.out.println("*******************************");

		Iterator<String> it1 = ll1.iterator();

		while (it1.hasNext()) {

			System.out.println("Using Iterator = " + it1.next());
		}

		System.out.println("*******************************");

		for (String s : ll1) {

			System.out.println(s);
		}

		System.out.println("*******************************");

		for (int i = 0; i < ll1.size(); i++) {

			System.out.println("Using For loop :" + ll1.get(i));
		}

		System.out.println("*******************************");

		ListIterator<String> li = ll1.listIterator();

		while (li.hasNext()) {

			System.out.println("Using List Iterator = " + li.next());
		}

	}

}
