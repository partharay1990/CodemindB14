package JavaPratices;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {

		Vector<Integer> vt = new Vector<Integer>();
		vt.add(100);
		vt.add(200);
		vt.add(250);
		vt.add(550);
		vt.add(150);
        vt.add(null);
		vt.add(0, 90);

		Vector<Integer> vt1 = new Vector<Integer>();

		vt1.addAll(vt);
		vt1.add(50);
		vt1.add(500);

		vt1.remove(0);
		vt1.removeAll(vt);

		for (Integer i : vt1) {

			System.out.println(i);

		}

		System.out.println("################################");

		vt1.add(1000);
		vt1.add(900);
		vt1.add(550);

		// vt1.clear();

		for (Integer i : vt1) {

			System.out.println(i);

		}

		System.out.println("################################");

		System.out.println("Vt1 is Empty =" + vt1.isEmpty());

		System.out.println("################################");

		System.out.println("Vt1 size is = " + vt1.size());

		System.out.println("################################");

		System.out.println("vt1 contains 550 = " + vt1.contains(550));

		System.out.println("################################");

		System.out.println("2nd Element Index is =" + vt1.get(2));
		
		System.out.println("################################");

		Iterator<Integer> it = vt1.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());
		}

		System.out.println("################################");
		
		for (int i=0;i<vt1.size(); i++) {
			
			System.out.println(vt1.get(i));
		}
		
		System.out.println("################################"); 	

	}

}
