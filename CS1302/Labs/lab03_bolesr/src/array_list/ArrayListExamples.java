package array_list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExamples {
	public static void main(String[] args) {
		
		ArrayList<Integer> ints = new ArrayList<>();
		ints.add(47);
		ints.add(91);
		ints.add(16);
		System.out.println( ints.get(1));
		System.out.println( ints.size());
		
		for(int i : ints) {
			System.out.print(i + ", ");
		}
		System.out.println();
		
		for(int i=0; i<ints.size(); i++) {
			System.out.print(ints.get(i) + ", ");
		}
		System.out.println();
		
		System.out.println(ints.contains(91));
		System.out.println(ints.contains(33));
		
		ints.add(8); 
		ints.add(11);
		Collections.sort(ints);
		System.out.print("Sorted: ");
		System.out.println(ints.toString());
		System.out.println("min=" + Collections.min(ints));
		System.out.println("max=" + Collections.max(ints));

		ints.clear();
		System.out.println("size=" + ints.size() + ", list:" + ints.toString());



	}
}
