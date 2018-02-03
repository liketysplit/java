package prob3;

import java.util.Comparator;

public class nameComparator implements Comparator<Player>{

		@Override
		public int compare(Player a, Player b) {

			if (a.getName().equals(b.getName())){
				if(a.getScore() > b.getScore())
					return 1;
				if(a.getScore() < b.getScore())
					return -1;
				else
					return 0;
			}

			else
				return a.getName().compareTo(b.getName());


		}
}