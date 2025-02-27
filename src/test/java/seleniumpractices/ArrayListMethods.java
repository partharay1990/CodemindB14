package seleniumpractices;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMethods {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();

		// add method used to adding element to list

		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		al.add(600);

		// add element at specified index
		al.add(1, 600);

		// Removes the element at the specified index position in list

		al.remove(4);

		// Removes all elements from this list

		//al.removeAll(al);

		ArrayList<Integer> alArrayList = new ArrayList<Integer>();

		alArrayList.addAll(al);

		alArrayList.add(450);
		alArrayList.add(550);

		for (Integer i : alArrayList) {

			System.out.println(i);
		}

		System.out.println("***************************");

		System.out.println("alArrayList is Empty = " + alArrayList.isEmpty());

		System.out.println("***************************");

		System.out.println("Size of alArrayList = " + alArrayList.size());

		System.out.println("***************************");

		System.out.println("alArrayList contains 300 = " + alArrayList.contains(300));

		System.out.println("***************************");

		System.out.println("alArrayList contains 1000 = " + alArrayList.contains(1000));

		System.out.println("***************************");

		System.out.println("2nd index element = " + alArrayList.get(2));
		
		System.out.println("***************************");
		
		Iterator<Integer> it = alArrayList.iterator();
		
		while (it.hasNext()) {
			
			System.out.println(it.next());
		}


	}

}
