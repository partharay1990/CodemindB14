package JavaPratices;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceExampla {

	public static void main(String[] args) {
		

		List <Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(null);
		list.add(100);
		list.add(20);
		list.add(200);

		for (Object i : list) {

			System.out.println(i);

		}
		
		System.out.println("******ArrayList Interface*******");
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Partha");
		arrayList.add("Abhijeet");
		arrayList.add("Shweta");
		arrayList.add("Codemind");
		
		for(String str:arrayList) {
			
			System.out.println(str);
		}

	}

}
