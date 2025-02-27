package JavaPratices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListExample {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Pune");
		al.add("Mumbai");
		al.add("Nagpur");
		al.add("Kolhapur");
		al.add("Solapur");
		al.add("Mumbai");
		al.add(null);

		// 1st - By using loop

		for (String str : al) {

			System.out.println(str);
		}

		System.out.println("******************************");

		// 2nd - By using for loop

		for (int i = 0; i < al.size(); i++) {

			System.out.println(al.get(i));
		}

		System.out.println("******************************");

		// 3rd - By using Iterator

		Iterator<String> it = al.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());
		}

		System.out.println("******************************");

		// 4th - By using ListIterator

		ListIterator<String> ls = al.listIterator();

		while (ls.hasNext()) {

			System.out.println(ls.next());
		}

		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);

		System.out.println("********Before Reverse********");

		for (Integer i : ll) {

			System.out.println(i);
		}

		Collections.reverse(ll);

		System.out.println("********After Reverse********");

		for (Integer i : ll) {

			System.out.println(i);
		}

	}

}
