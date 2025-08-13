package JavaPratices;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionClassesImpl {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<Integer>();

		arr.add(10);
		arr.add(40);
		arr.add(100);
		arr.add(20);
		arr.add(60);
		arr.add(50);

		for (Integer i : arr) {

			System.out.println(i);
		}

		System.out.println("################################");

		Collections.sort(arr);

		for (Integer i : arr) {

			System.out.println(i);
		}

		System.out.println("################################");

		Collections.reverse(arr);

		for (Integer i : arr) {

			System.out.println(i);
		}

		System.out.println("################################");

		System.out.println("Maximum number from list = " + Collections.max(arr));

		System.out.println("################################");

		System.out.println("Minimum number from list = " + Collections.min(arr));

	}

}
