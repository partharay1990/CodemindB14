package JavaPratices;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(30);
		list.add(20);
		list.add(40);
		list.add(60);
		list.add(null);
		list.add(30);

		for (Integer i : list) {

			System.out.println(i);
		}
		
		System.out.println("***************************************");
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("sachin");
		arrayList.add("hardik");
		arrayList.add("rohit");
		arrayList.add("virat");
		arrayList.add("ravindra");
		arrayList.add("sourav");
		arrayList.add("virat");
		arrayList.add(null);
		
		for (String s: arrayList) {
			
			System.out.println(s);
		}

	}

}
