package JavaPratices;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceAssignment {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(10);
		list.add(null);
	//	list.addAll(0, list);

		for (Integer i : list) {

			System.out.println(i);
		}

		System.out.println("*******************************************");

		ArrayList<String> arrayList = new ArrayList<String>();

		arrayList.add("Sachin");
		arrayList.add("Rohit");
		arrayList.add("Virat");
		arrayList.add("Dravid");
		arrayList.add("Hardik");
		arrayList.add("Sourav");
		arrayList.add("Hardik");
		arrayList.add(null);

		for (String s : arrayList) {

			System.out.println(s);
		}
	}

}
