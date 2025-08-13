package JavaPratices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArraylistMethodAssignment {

	public static void main(String[] args) {

		ArrayList<Integer> l = new ArrayList<Integer>();

		l.add(10);
		l.add(100);

		l.add(0, 200);

		ArrayList<Integer> al = new ArrayList<Integer>();

		al.addAll(l);

		al.add(40);
		al.add(50);
		al.add(60);
		al.add(90);

		al.remove(6);

		al.removeAll(l);

		al.add(400);
		al.add(600);
		al.add(700);
		al.add(300);

		System.out.println("******************************");
		// al.clear();
		
	//	Collections.reverse(al);

		System.out.println("******************************");

		System.out.println("list is empty = " + al.isEmpty());

		System.out.println("******************************");

		System.out.println("list contains 60 = " + al.contains(60));
		System.out.println("list contains 600 = " + al.contains(600));

		System.out.println("******************************");

		System.out.println("Size of list = " + al.size());

		System.out.println("******************************");

		System.out.println("0th Index of list = " + al.get(0));

		System.out.println("******************************");

		for (Integer i : al) {

			System.out.println(i);
		}

		System.out.println("******************************");

		for (int i = 0; i < al.size(); i++) {

			System.out.println(al.get(i));
		}

		System.out.println("******************************");

		Iterator<Integer> it = al.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());
		}

		System.out.println("******************************");

		ListIterator<Integer> li = al.listIterator();
		
		while (li.hasNext()) {

			System.out.println(li.next());
		}
		
		System.out.println("******************************");

	}

}
