package prob3;

import java.util.Comparator;

public class scoreComparator implements Comparator<Player>{

	public int compare(Player a, Player b) {
		if(a.getScore() > b.getScore())
			return 1;
		if(a.getScore() < b.getScore())
			return -1;
		else{
			if (a.getName().length() > b.getName().length())
				return 1;
			
			if (a.getName().length() < b.getName().length())
				return -1;
			else
				return 0;
		}
	}

}