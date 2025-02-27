package JavaPratices;

import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

public class StackMethods {

	public static void main(String[] args) {

		Stack<Integer> ss = new Stack<Integer>();

		ss.add(120);
		ss.add(220);
		ss.add(320);
		ss.add(420);
		ss.add(520);

		ss.add(1, 100);

		Stack<Integer> stack = new Stack<Integer>();

		stack.addAll(ss);

		stack.add(50);
		stack.add(70);

		stack.remove(2);

		stack.removeAll(ss);

		stack.add(30);
		stack.add(40);
		stack.add(60);

		// stack.clear();

		for (Integer i : stack) {

			System.out.println(i);
		}

		System.out.println("################################");

		System.out.println("stack is Empty = " + stack.isEmpty());

		System.out.println("################################");

		System.out.println("stack size is = " + stack.size());

		System.out.println("################################");

		System.out.println("stack contains 70 = " + stack.contains(70));

		System.out.println("################################");

		System.out.println("stack contains 700 = " + stack.contains(700));

		System.out.println("################################");

		System.out.println("2nd index element = " + stack.get(2));

		System.out.println("################################");
		
		//print stack element using Iterator

		Iterator<Integer> ii = stack.iterator();

		while (ii.hasNext()) {

			System.out.println(ii.next());
		}

		System.out.println("################################");

		Collections.reverse(stack);

		for (Integer i : stack) {

			System.out.println(i);
		}
		
		System.out.println("################################");
		
		//print stack element using for loop
		
		for(int i=0;i<stack.size();i++) {
			
			System.out.println(stack.get(i));
		}
		
		System.out.println("################################");
	}

}
