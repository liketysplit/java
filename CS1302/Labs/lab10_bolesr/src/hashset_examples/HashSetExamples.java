package hashset_examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class HashSetExamples {

	public static void main(String[] args) throws FileNotFoundException {
 		hsExamples1();
 		hsExamples2();
 		hsExamples3();
 		hsExamples4();
	}
		
	public static void hsExamples1() {
		System.out.println("HashSet Example 1\n-----------------");

		Set<String> hsCities = new HashSet<String>();
		hsCities.add("Atlanta");
		hsCities.add("New York");
		hsCities.add("Durango");
		hsCities.add("New York");
		System.out.println("         Order cities added: Atlanta, New York, Durango");
		
		System.out.print("Access cities with for loop: ");
		for(String city : hsCities) {
			System.out.print(city + ", ");
		}
		System.out.println();
	}
	
	public static void hsExamples2() {
		System.out.println("\nHashSet Example 2\n-----------------");
		
		List<String> words = new ArrayList<>(Arrays.asList("not", "go", "at", "see", "go", "be", "not"));
				
		Set<String> uniqueWords = new HashSet<String>(words);
		System.out.println("Unique words: " + uniqueWords);
	}
	
	private static void hsExamples3() throws FileNotFoundException {
		System.out.println("\nHashSet Example 3\n-----------------");
		
		String path = "src\\hashset_examples\\words.txt";
	   Scanner input = new Scanner(new File(path));

		HashSet<String> uniqueWords = new HashSet<>();
		HashSet<String> duplicateWords = new HashSet<>();
		
	    // Reads file and creates a HashSet of unique words in the text and
	    // a HashSet of words that are duplicates.
	    while( input.hasNext() ) {
			String word = input.next();
			if(!uniqueWords.add(word)) {
				duplicateWords.add(word);
			}
	    }
	    
	    input.close();
	    System.out.println("   Unique words: " + uniqueWords);
	    System.out.println("Duplicate words: " + duplicateWords);
	}
	
	private static void hsExamples4() {
		System.out.println("\nHashSet Example 4\n-----------------");
		
		// Employees who have completed training module 1
		Set<Integer> hsEmps1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7));
		// Employees who have completed training module 2
		Set<Integer> hsEmps2 = new HashSet<>(Arrays.asList(1,3,5,6,7,8,9));

		// Employees that have completed both training modules.
		Set<Integer> hsTeamsInCommon = new HashSet<>(hsEmps1);
		hsTeamsInCommon.retainAll(hsEmps2);
		
		System.out.println("Employees who had:\n   " + "module 1: " + hsEmps1 + "\n   " + "module 2: " + hsEmps2);
		System.out.println("Employees who had both:\n   " + hsTeamsInCommon);

		// Employees who had either training module:
		Set<Integer> hsEmpsEither = new HashSet<>(hsEmps1);
		hsEmpsEither.addAll(hsEmps2);
		System.out.println("Employees who had either module:\n   " + hsEmpsEither);
		
		// Employees who have had only module 1
		Set<Integer> hsOnlyMod1 = new HashSet<>(hsEmps1);
		hsOnlyMod1.removeAll(hsEmps2);
		System.out.println("Employees who have had only module 1:\n   " + hsOnlyMod1);		
		// Employees who have had only module 2
		Set<Integer> hsOnlyMod2 = new HashSet<>(hsEmps2);
		hsOnlyMod2.removeAll(hsEmps1);
		System.out.println("Employees who have had only module 2:\n   " + hsOnlyMod2);		
		// Employees who have had exactly one module
		Set<Integer> hsExactly1Mod = new HashSet<>(hsOnlyMod1);
		hsExactly1Mod.addAll(hsOnlyMod2);		
		System.out.println("Employees who had exactly 1 module:\n   " + hsExactly1Mod);		
	}



}

