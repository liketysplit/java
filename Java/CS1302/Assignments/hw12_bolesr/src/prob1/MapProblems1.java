package prob1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class MapProblems1 {
	
	public static void main(String[] args){
		
		ArrayList<Character> list1 = new ArrayList<Character>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		TreeMap<Character, Integer> value = new TreeMap<Character, Integer>();
		
		list1.add('A'); 
		list1.add('B'); 
		list1.add('C'); 
		list1.add('G');
		list1.add('L'); 
		list1.add('P'); 
		list1.add('R');
		list1.add('V');

		list2.add(8); 
		list2.add(2); 
		list2.add(4); 
		list2.add(2);
		list2.add(8); 
		list2.add(2); 
		list2.add(1); 
		list2.add(3);
		
		
		for (int i = 0; i < list1.size(); i++){
			value.put(list1.get(i), list2.get(i));
		}
		
		System.out.print("\nOriginal TreeMap: \n" + value);
		System.out.print("\nModified TreeMap: \n" + swapKeyValue(value));
	}	
	
	
	public static TreeMap<Integer, String > swapKeyValue (TreeMap<Character, Integer> a){
		
		TreeMap<Integer, String > swappedValues = new TreeMap<Integer, String >();
		
		Set<Character> valueChars = a.keySet();
		Set<Integer> keyInts = new HashSet<Integer>();
		
		//Adding All the integers from TreeMap a to keyInts
		for (Character c : valueChars)
			keyInts.add(a.get(c));
		
		//Creating the String set from characters
		
		ArrayList<String> createdStrings = new ArrayList<String>();
		String x;
		for (Integer i : keyInts){
			//StringBuilder sb = new StringBuilder();
			x = "";
			
			for (Character c : valueChars){
				if (i == a.get(c)){
					//sb.append(c);
					x = x + c;
				}
			}
			createdStrings.add(x);
		}
		
		Iterator<Integer> iIntegers = keyInts.iterator();
		Iterator<String> iStrings = createdStrings.iterator();
		
		while (iIntegers.hasNext())
			swappedValues.put(iIntegers.next(), iStrings.next());
		
		return swappedValues;
	}

}
