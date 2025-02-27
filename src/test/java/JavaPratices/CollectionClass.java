package JavaPratices;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionClass {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(10);
		list.add(15);
		list.add(30);
		list.add(50);
		list.add(20);
		list.add(40);

		System.out.println("*********Before Sorting***********");
		
		for (Integer i : list) {

			System.out.println(i);
		}

		Collections.sort(list);
		
		System.out.println("*********After Sorting***********");

		for (Integer i : list) {

			System.out.println(i);
		}
		
		System.out.println("********************");
		
		Collections.reverse(list);
		
				
		for (Integer i : list) {

			System.out.println(i);
		}
		
		System.out.println("*********Maxium number***********");
		
		System.out.println("Maxium number from list : " + Collections.max(list));
		System.out.println("Minimun number from list : " + Collections.min(list));

	}

}
