package hashmap_examples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapExamples {
	public static void main(String[] args) {
		hmExample1();
		hmExample2();
	}

	public static void hmExample1() {
		System.out.println("HashMap Example 1\n-----------------");

		Map<String,Integer> hmScores = new HashMap<>();

		hmScores.put("Felix", 42);
		hmScores.put("Bill", 28);
		hmScores.put("Dee", 42);
		hmScores.put("Sue", 33);
		hmScores.put("Bill", 99);
		
		System.out.println("hmScores.get(\"Dee\")=" + hmScores.get("Dee"));
		System.out.println("hmScores.get(\"Bill\")=" + hmScores.get("Bill"));

		Set<String> names = hmScores.keySet();
		System.out.print("hmScores.keySet()=");
		for(String name : names) { System.out.print(name + ", "); }
		System.out.println();

		Collection<Integer> scores = hmScores.values();
		System.out.print("hmScores.values()=");
		for(int score : scores) { System.out.print(score + ", "); }
		System.out.println();

		System.out.println("Iterate over all key-value pairs:");
		for(String key : names) {
			System.out.printf("   key=%s, value=%d \n", key, hmScores.get(key));
		}

		System.out.println("hmScores.containsKey(\"Dee\")=" + hmScores.containsKey("Dee"));
		hmScores.remove("Dee");
		System.out.println("hmScores.containsKey(\"Dee\")=" + hmScores.containsKey("Dee"));
	}
	
	
	public static void hmExample2() {
		System.out.println("\nHashMap Example 2\n-----------------");

		Map<Integer,Employee> hmEmps = new HashMap<>();

		Employee e1 = new Employee("Orville", 553572246, 22.32);
		Employee e2 = new Employee("Boggs", 716533892, 12.57);
		Employee e3 = new Employee("Lyton", 476227851, 77.88);
		Employee e4 = new Employee("Dern", 243558673, 23.44);

		hmEmps.put(e1.getSSNum(), e1);
		hmEmps.put(e2.getSSNum(), e2);
		hmEmps.put(e3.getSSNum(), e3);
		hmEmps.put(e4.getSSNum(), e4);

		System.out.println("Iterate over all key-value pairs:");
		for(Integer key : hmEmps.keySet()) {
			System.out.printf("   key=%s, value=%s \n", key, hmEmps.get(key));
		}
	}


}
