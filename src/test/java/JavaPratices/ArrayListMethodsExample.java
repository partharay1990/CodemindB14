package JavaPratices;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMethodsExample {

	public static void main(String[] args) {

		ArrayList<Integer> l = new ArrayList<Integer>();

		// add method to use add element at last

		l.add(15);
		l.add(35);
		l.add(50);

		// this is used to add elements at specific index

		l.add(1, 200);

		ArrayList<Integer> l2 = new ArrayList<Integer>();

		l2.addAll(l);
		l2.add(90);
		l2.add(70);

		// Removes the element at the specified position in this list.

		l2.remove(2);

		// Removes from this list all of its elements that are contained in the
		// specified collection

		l2.removeAll(l);

		for (Integer i : l2) {

			System.out.println(i);
		}

		System.out.println("################################");

		l2.add(100);
		l2.add(300);
		l2.add(500);
		l2.add(600);

		// l2.clear();

		System.out.println("l2 is Empty = " + l2.isEmpty());

		System.out.println("################################");

		System.out.println("l2 size is : " + l2.size());

		System.out.println("################################");

		System.out.println("l2 contains 600 = " + l2.contains(600));

		System.out.println("################################");

		System.out.println("0th index element = " + l2.get(0));

		System.out.println("################################");

		for (Integer i : l2) {

			System.out.println(i);
		}

		System.out.println("###############################*#");

		for (int i = 0; i < l2.size(); i++) {

			System.out.println(l2.get(i));
		}

		System.out.println("################################");

		Iterator<Integer> it = l2.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());
		}

		System.out.println("################################");

	}

}
