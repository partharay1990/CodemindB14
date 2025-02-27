package JavaPratices;

import java.util.Iterator;
import java.util.TreeSet;

public class TressSetImpl {

	public static void main(String[] args) {

		TreeSet<Integer> ts = new TreeSet<Integer>();

		ts.add(55);
		ts.add(65);
		ts.add(75);
		ts.add(85);
		ts.add(95);
		ts.add(75);
		ts.add(35);

		TreeSet<Integer> treeSet = new TreeSet<Integer>();

		treeSet.addAll(ts);

		treeSet.add(250);
		treeSet.add(350);

		treeSet.remove(35);

		treeSet.removeAll(ts);

		for (Integer a : treeSet) {

			System.out.println(a);
		}

		System.out.println("***************************************");

		System.out.println("Treeset is Empty = " + treeSet.isEmpty());

		System.out.println("***************************************");

		System.out.println("Size of Treeset = " + treeSet.size());

		System.out.println("***************************************");

		System.out.println("Treeset contains 350 = " + treeSet.contains(350));

		System.out.println("***************************************");

		System.out.println("Treeset contains 6000 = " + treeSet.contains(6000));
		
		 Iterator<Integer> it = treeSet.iterator();
		 
		 while(it.hasNext()) {
			 
			 System.out.println(it.hasNext());
		 }
		 
		 

	}

}
