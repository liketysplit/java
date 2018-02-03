package treeset_examples;

import java.io.FileNotFoundException;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExamples {
	public static void main(String[] args) throws FileNotFoundException {
 		tsExamples1();
 		tsExamples2();
	}

	public static void tsExamples1() {
		System.out.println("TreeSet Example 1\n-----------------");

		Set<String> tsCities = new TreeSet<String>();
		tsCities.add("New York");
		tsCities.add("Atlanta");
		tsCities.add("Durango");
		tsCities.add("Moab");
		System.out.println("                   Order cities added: New York, Atlanta, Durango, Moab");

		System.out.print("Access cities (ordered) with for loop: ");
		for(String city : tsCities) {
			System.out.print(city + ", ");
		}
		System.out.println();
	}
	
	public static void tsExamples2() {
		System.out.println("\nTreeSet Example 2\n-----------------");
	
		TreeSet<String> tsCities = new TreeSet<String>();
		tsCities.add("New York");
		tsCities.add("Atlanta");
		tsCities.add("Durango");
		tsCities.add("Moab");
		tsCities.add("Chicago");
	
		System.out.print("Access cities (ordered) with for loop: ");
		for(String city : tsCities) {
			System.out.print(city + ", ");
		}
		System.out.println();
	
		System.out.println("\nfirst(): " + tsCities.first());
		System.out.println("last(): " + tsCities.last());
		System.out.println();
	
		SortedSet<String> ssHead = tsCities.headSet("Denver");
		System.out.println("headSet(\"Denver\"): " + ssHead);
		ssHead = tsCities.headSet("Durango");
		System.out.println("headSet(\"Durango\"): " + ssHead);
		ssHead = tsCities.headSet("Fort Worth");
		System.out.println("headSet(\"FortWorth\"): " + ssHead);
		System.out.println();
	
		SortedSet<String> ssTail = tsCities.tailSet("Denver");
		System.out.println("tailSet(\"Denver\"): " + ssTail);
		ssTail = tsCities.tailSet("Durango");
		System.out.println("tailSet(\"Durango\"): " + ssTail);
		ssTail = tsCities.tailSet("Fort Worth");
		System.out.println("tailSet(\"Fort Worth\"): " + ssTail);
		ssTail = tsCities.tailSet("Raleigh");
		System.out.println("tailSet(\"Raleigh\"): " + ssTail);
		System.out.println();
	
		SortedSet<String> ssSub = tsCities.subSet("Chicago", "New York");
		System.out.println("subSet(\"Chicago\", \"New York\"): " + ssSub);
		ssSub = tsCities.subSet("A", "H");
		System.out.println("subSet(\"A\", \"H\"): " + ssSub);
	}

}
