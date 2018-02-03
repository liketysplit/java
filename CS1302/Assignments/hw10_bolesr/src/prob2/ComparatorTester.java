package prob2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class ComparatorTester {
	public static void main(String[] args) {

		//Tyler's Test Code
		ArrayList<Job> job1 = new ArrayList<>(Arrays.asList(new Job(1,1), new Job(1,2), new Job(1,3), new Job(1,4)));
		ArrayList<Job> job2 = new ArrayList<>(Arrays.asList(new Job(2,1), new Job(2,2), new Job(2,3), new Job(2,4)));
		ArrayList<Job> job3 = new ArrayList<>(Arrays.asList(new Job(3,1), new Job(3,2), new Job(3,3), new Job(3,4)));

		Comparator<Job> pC = new PriorityComparator();
		Comparator<Job> sC = new SecurityComparator();

		Queue<Job> queue1 = new PriorityQueue<>(12, pC);
		Queue<Job> queue2 = new PriorityQueue<>(12, sC);
e
		for (Job j : job1)
			queue1.offer(j);
		//Print Jobs based on Priority
		System.out.print("\n*********************************************************************************\n");
		System.out.println("\njobListOne PriorityQueue");
		while(queue1.size() > 0)
			System.out.println(queue1.poll());

		//Add Jobs to Queue
		for (Job j : job1)
			queue2.offer(j);

		//Print Jobs based on Priority
		System.out.print("\n*********************************************************************************\n");
		System.out.println("\njobListOne Security Queue");
		while(queue2.size() > 0)
			System.out.println(queue2.poll());

		//Add Jobs to Queue
		for (Job j : job2)
			queue1.offer(j);

		//Print Jobs based on Priority
		System.out.print("\n*********************************************************************************\n");
		System.out.println("\njobListTwo Priority Queue");
		while(queue1.size() > 0)
			System.out.println(queue1.poll());

		//Add Jobs to Queue
		for (Job j : job2)
			queue2.offer(j);

		//Print Jobs based on Priority
		System.out.print("\n*********************************************************************************\n");
		System.out.println("\njobListTwo Security Queue");
		while(queue2.size() > 0)
			System.out.println(queue2.poll());

		//Sort Test Code

		System.out.print("\n*********************************************************************************\n");

		//jobListOne Test
		System.out.print("\nOriginal jobListOne: \n");
		for (Job x : job1)
			System.out.printf("%s; ", x);
		System.out.println();

		System.out.print("\nPriority Modified jobListOne: \n");
		Collections.sort(job1, pC);
		for (Job x : job1)
			System.out.printf("%s; ", x);
		System.out.println();

		System.out.print("\nSecurity Modified jobListOne: \n");
		Collections.sort(job1, sC);
		for (Job x : job1)
			System.out.printf("%s; ", x);
		System.out.println();
		//End of jobListOne Test

		System.out.print("\n*********************************************************************************\n");

		//jobListTwo Test
		System.out.print("\nOriginal jobListTwo: \n");
		for (Job x : job2)
			System.out.printf("%s; ", x);
		System.out.println();

		System.out.print("\nPriority Modified jobListTwo: \n");
		Collections.sort(job2, pC);
		for (Job x : job2)
			System.out.printf("%s; ", x);
		System.out.println();

		System.out.print("\nSecurity Modified jobListTwo: \n");
		Collections.sort(job2, sC);
		for (Job x : job2)
			System.out.printf("%s; ", x);
		System.out.println();
		//End of jobListTwo Test

		System.out.print("\n*********************************************************************************\n");

		//jobListThree Test
		System.out.print("\nOriginal jobListThree: \n");
		for (Job x : job3)
			System.out.printf("%s; ", x);
		System.out.println();

		System.out.print("\nPriority Modified jobListThree: \n");
		Collections.sort(job3, pC);
		for (Job x : job3)
			System.out.printf("%s; ", x);
		System.out.println();

		System.out.print("\nSecurity Modified jobListThree: \n");
		Collections.sort(job3, sC);
		for (Job x : job3)
			System.out.printf("%s; ", x);
		System.out.println();
		//End of jobListThree Test

		System.out.print("\n*********************************************************************************\n");
		}
	}


