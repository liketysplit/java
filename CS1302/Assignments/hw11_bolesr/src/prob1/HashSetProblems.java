package prob1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetProblems {
	
	
	public static void main(String [] args){
		
		List<String> list2= new ArrayList<>(Arrays.asList("Jordan","Kris", "Kris", "Boston", "Boston", "Derrick"));
		Set<String> set6= new HashSet<>(Arrays.asList("Ujwal", "Jordan", "Boston","Tyler", "Kris", "Derrick", "Jamar", "Jamar"));
		Set<String> set7= new HashSet<>(Arrays.asList("Ujwal", "Jordan", "Boston","Tyler", "Kris", "Derrick", "Chris", "Jamar"));
		
		//removeLongNames
		System.out.print("\nOriginal List: \n" + set7);
		removeLongNames(set7, 4);
		System.out.print("\nModified List: \n" + set7);
		System.out.println();
		
		//getUniqueNames
		System.out.print("\nOriginal List: \n" + list2);
		System.out.print("\nModified List: \n" + getUniqueNames(list2));
		System.out.println();
		
		//namesInCommon
		System.out.print("\nOriginal Lists: \n" + set6 + "\t" + set7);
		System.out.print("\nModified List: \n" + namesInCommon(set6, set7));
		System.out.println();
		
		
		//justInFirst( [a,b,c,d], [a,z,c,f] ) -> [b,d]
		Set<String> set1 = new HashSet<>(Arrays.asList("a", "b", "c","d"));
		Set<String> set2 = new HashSet<>(Arrays.asList("a", "z", "c","f"));
		
		System.out.print("\nOriginal Lists: \n" + set1 + "\t" + set2);
		System.out.print("\nModified List: \n" + justInFirst(set1, set2));
		System.out.println();
		
		//getIndicesForMatches( list=[a,b,c,d,e,f], set=[z,r,b,p,t,e] ) -> [1,4]
		List<String> list1 = new ArrayList<>(Arrays.asList("a", "b", "c","d", "e", "f"));
		Set<String> set3 = new HashSet<>(Arrays.asList("z", "r", "b","p", "t", "e"));
		
		System.out.print("\nOriginal List & Set: \n" + list1 + "\t" + set3);
		System.out.print("\nModified List & Set: \n" + getIndiciesForMatches(list1, set3));
		System.out.println();
		
		
		
		//removeDuplicates( set1=[a,b,c,d,e], set2=[z,a,p,d] )
		Set<String> set4 = new HashSet<>(Arrays.asList("a", "b", "c","d", "e"));
		Set<String> set5 = new HashSet<>(Arrays.asList("z", "a", "p","d"));
		
		
		System.out.print("\nOriginal Lists: \n" + set4 + "\t" + set5);
		removeDuplicates(set4,set5);
		System.out.print("\nModified List: \n" + set4 + "\t" +  set5);
		
	}
	
	public static void removeLongNames(Set<String> a, int b){
		Iterator<String> i = a.iterator();
		while (i.hasNext()){
			if (i.next().length() > b)
				i.remove();
		}
	}
	
	public static Set<String> getUniqueNames(List<String> a){
		Set<String> sClone = new HashSet<>();
		sClone.addAll(a);
		return sClone;	
	}
	

	public static Set<String> namesInCommon(Set<String> a, Set<String> b){
		a.retainAll(b);
		return a;
	}
	

	public static Set<String> justInFirst(Set<String> a, Set<String> b){
		Set<String> temp = new HashSet<>();
		temp.addAll(a);
		temp.retainAll(b);
		a.removeAll(temp);
		return a;
	}
	

	public static Set<Integer> getIndiciesForMatches(List<String> a, Set<String> b){
		Set<Integer> temp = new HashSet<>();
		b.retainAll(a);
		for (int i = 0; i < a.size(); i++)
			for (String y : b)
				if (a.get(i).equals(y))
					temp.add(i);	
		
		return temp;
	}
	

	public static void removeDuplicates(Set<String> s1, Set<String> s2){
		Set<String> temp = new HashSet<>();
		temp.addAll(s1);
		temp.retainAll(s2);
		s1.removeAll(temp);
		s2.removeAll(temp);
	}
	
}
