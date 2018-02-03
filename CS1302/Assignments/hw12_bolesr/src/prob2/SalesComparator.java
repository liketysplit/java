package prob2;

import java.util.Comparator;

public class SalesComparator implements Comparator<Sales> {

	@Override
	public int compare(Sales s1, Sales s2) {


		if((s1.getSales() - s2.getSales()) != 0)
			return (int) (s1.getSales() - s2.getSales());

		else{
			if((s1.getId() - s2.getId()) != 0)
				return (s1.getId() - s2.getId());

			else{
				if((s1.getWeek() - s2.getWeek()) != 0)
					return (s1.getWeek() - s2.getWeek());
			}


		}
		return 0;
	}
}
