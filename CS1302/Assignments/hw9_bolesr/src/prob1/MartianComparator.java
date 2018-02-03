package prob1;

import java.util.Comparator;

public class MartianComparator<E> implements Comparator<Martian>{
	public int compare (Martian m1, Martian m2){
		if (m1.getId() == m2.getId())
			return 0;
		else if (m1.getId()>m2.getId())
			return 1;
		else 
			return -1;
	}
}