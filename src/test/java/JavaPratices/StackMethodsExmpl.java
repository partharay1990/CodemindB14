package JavaPratices;

import java.util.Iterator;
import java.util.Stack;

public class StackMethodsExmpl {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<Integer>();

		stack.add(900);
		stack.add(800);
		stack.add(700);
		stack.add(600);
		stack.add(500);
		stack.add(400);

		Stack<Integer> vc = new Stack<Integer>();

		vc.add(300);
		vc.add(200);
		vc.add(0, 1000);
		vc.addAll(stack);

		vc.remove(0);
		vc.removeAll(stack);
		vc.add(1000);
		vc.add(2000);
		vc.add(3000);
		vc.add(4000);
		vc.add(5000);
		vc.add(8000);

		// vc.clear();

		System.out.println("1000 contains in list = " + vc.contains(1000));

		System.out.println("******************");

		System.out.println("5th Index in List = " + vc.get(5));

		System.out.println("******************");

		System.out.println("size of the list = " + vc.size());

		System.out.println("******************");

		System.out.println("Last element in list = " + vc.getLast());

		System.out.println("******************");

		System.out.println("First element in list = " + vc.firstElement());

		System.out.println("******************");

		System.out.println("Capacity of  list = " + vc.capacity());

		System.out.println("******************");

		System.out.println("Hash code of list" + vc.hashCode());
		


		for (Integer i : vc) {
			System.out.println(i);
		}

		System.out.println("*****Using Iterator*******");

		Iterator<Integer> it = vc.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());
		}

		System.out.println("*****Using For loop*******");

		for (int i = 0; i < vc.size(); i++) {

			System.out.println(vc.get(i));
		}
	}

}
