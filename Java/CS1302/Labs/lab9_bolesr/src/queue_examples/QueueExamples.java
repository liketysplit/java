package queue_examples;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExamples {
	public static void main(String[] args) {
		System.out.println("Queue example, offered to queue in this order: 7, 2, 4");
		// Create queue to hold Integers
		Queue<Integer>  queue = new LinkedList<>();
		queue.offer(7);
		queue.offer(2);
		queue.offer(4);

		System.out.print("Polled from queue: ");
		System.out.print(queue.poll() + ", ");
		System.out.print(queue.poll() + ", ");
		System.out.print(queue.poll() + ", ");
		
		System.out.println("\n\nPriority Queue example, offered to queue in this order: 7, 2, 4");
		// Create priority queue to hold Integers
		Queue<Integer>  pQueue = new PriorityQueue<>();
		pQueue.offer(7);
		pQueue.offer(2);
		pQueue.offer(4);

		System.out.print("Polled from queue: ");
		System.out.print(pQueue.poll() + ", ");
		System.out.print(pQueue.poll() + ", ");
		System.out.print(pQueue.poll() + ", ");


	}
}