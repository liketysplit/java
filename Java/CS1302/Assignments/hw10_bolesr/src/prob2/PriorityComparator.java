package prob2;

import java.util.Comparator;
import prob2.Job;

public class PriorityComparator  implements Comparator<Job>{

	@Override
	public int compare(Job o1, Job o2) {
		// TODO Auto-generated method stub
		return (o1.getPriority() - o2.getPriority());
	}


}
