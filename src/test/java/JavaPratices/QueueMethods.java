package JavaPratices;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueMethods {

	public static void main(String[] args) {

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		pq.add(111);
		pq.add(222);
		pq.add(333);
		pq.add(444);
		pq.add(555);
		pq.add(666);

		pq.remove(111);

		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();

		priorityQueue.add(777);
		priorityQueue.addAll(pq);

		priorityQueue.removeAll(pq);

		priorityQueue.add(125);
		priorityQueue.add(225);
		priorityQueue.add(325);
		priorityQueue.add(425);
		priorityQueue.add(525);
		priorityQueue.add(625);

		// priorityQueue.clear();

		System.out.println("*********************************");

		System.out.println("Queue contains 325 = " + priorityQueue.contains(325));

		System.out.println("*********************************");

		System.out.println("Queue size is  = " + priorityQueue.size());

		System.out.println("*********************************");

		System.out.println("Queue is Empty = " + priorityQueue.isEmpty());

		System.out.println("*********************************");

		System.out.println("Peek of Queue is = " + priorityQueue.peek());

		System.out.println("*********************************");

		System.out.println("Poll of Queue is = " + priorityQueue.poll());

		System.out.println("*********************************");

		Iterator<Integer> it = priorityQueue.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());
		}

		System.out.println("*********************************");

		for (Integer i : priorityQueue) {

			System.out.println(i);
		}

	}

}
