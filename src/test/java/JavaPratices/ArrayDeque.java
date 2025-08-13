package JavaPratices;

import java.util.Deque;
import java.util.Iterator;

public class ArrayDeque {

	public static void main(String[] args) {

		Deque<String> deque = new java.util.ArrayDeque<>();

		deque.add("Gautam");
		deque.add("Karan");
		deque.add("Ajay");

		Deque<String> dq = new java.util.ArrayDeque<>();

		dq.add("Rohit");
		dq.add("Virat");

		dq.addAll(deque);

		dq.remove("Gautam");

		Iterator<String> it = dq.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());

		}

		System.out.println("*************************");

		System.out.println("Rohit contains on deque = " + dq.contains("Rohit"));

		System.out.println("*************************");

		System.out.println("size of deque = " + dq.size());

		System.out.println("*************************");

		System.out.println("First element of deque = " + dq.getFirst());

		System.out.println("*************************");

		System.out.println("Peek element of deque = " + dq.peek());

		System.out.println("*************************");

		System.out.println("Poll element of deque = " + dq.poll());

		System.out.println("*************************");

		for (String str : dq) {

			System.out.println(str);
		}

	}

}
