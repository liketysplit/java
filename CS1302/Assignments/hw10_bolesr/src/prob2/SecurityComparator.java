package prob2;

import java.util.Comparator;

public class SecurityComparator implements Comparator<Job> {

	@Override
	public int compare(Job arg0, Job arg1) {
		// TODO Auto-generated method stub
		return arg0.getSecurityLevel()-arg1.getSecurityLevel();
	}

}
