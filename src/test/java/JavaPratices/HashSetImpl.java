package JavaPratices;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetImpl {

	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<Integer>();

		hs.add(123456);
		hs.add(123457);
		hs.add(123458);
		hs.add(123459);
		hs.add(123410);
		hs.add(123456);
		hs.add(null);

		HashSet<Integer> l = new HashSet<Integer>();

		l.addAll(hs);
		l.add(400);
		l.add(500);
		l.remove(123456);
		l.removeAll(hs);
		
		//l.clear();

		for (Integer i : l) {

			System.out.println(i);
		}
		
		System.out.println("Hashset is Empty = " +l.isEmpty());
		
		System.out.println("#######################################");
		
		System.out.println("Size of l" + l.size());
		
		System.out.println("#######################################");
		
		System.out.println("Hashset contains 400 = " + l.contains(400));
		
		System.out.println("#######################################");
		
		System.out.println("Hashset hashcode is = " + l.hashCode());
		
		System.out.println("#######################################");
		
		Iterator<Integer> it = l.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
		System.out.println("################################");

	}

}
