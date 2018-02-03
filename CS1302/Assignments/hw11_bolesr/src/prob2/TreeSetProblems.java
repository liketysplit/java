package prob2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetProblems {

	public static void main(String[] args){
		Set<Integer> testSet = new TreeSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		
		System.out.print("Original List: \n" + testSet);
		System.out.println();
		System.out.print("\nModified List: \n" + getBig(testSet, 7));

		List<Integer> locations = new LinkedList<>(Arrays.asList(0,2,4));
		System.out.println();
		List<String> words = new LinkedList<>(Arrays.asList("kite", "bat", "ant", "dog", "apple", "rat"));

	
		System.out.print("\nOriginal Locations and Words: \n" + locations + "\n" + words);
		System.out.println();
		System.out.print("\nReturned List: \n" + getWords2(locations,words));
		System.out.println();
		System.out.print("\nModified Locations and Words: \n" + locations + "\n" + words);
		
	}

	
	public static TreeSet<Integer> getBig(Set<Integer> a, int b ){
		TreeSet<Integer> temp = new TreeSet<>();
		for (Integer i : a){
			if (i > b)
				temp.add(i);
		}
		return temp;
	}
	

	public static List<String> getWords2(List<Integer> a, List<String> b){
		List<String> temp = new LinkedList<>();
		for (Integer l : a){
			temp.add(b.get(l));
		}
		b.removeAll(temp);
		return temp;
	}
}