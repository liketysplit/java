package prob1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GenericMartianManager<T extends Martian> {

	  ArrayList<T> martians = new ArrayList<T>(0);


	public boolean addMartian(T m ) {
		// TODO Auto-generated method stub

		boolean temp = true;

		if(martians.isEmpty()){
			martians.add(m);
			return temp;
		}

		else if (!martians.isEmpty()){
			for(int i = 0 ; i < martians.size()-1; i++)
				if(martians.get(i).equals(m)){
					temp = false;
					return false;
				}

				martians.add(m);


		}
		return temp;
	}

	public int getNumMartians(){
		return martians.size();
	}

	public boolean removeMartian(T m ) {
		// TODO Auto-generated method stub

		boolean temp = false;

		for(int i = 0 ; i < martians.size()-1; i++)
			if(martians.get(i).equals(m)){
				martians.remove(m);
				temp = true;
			}

		return temp;


	}

	@SuppressWarnings("unchecked")
	public <T> T getMartian(T m) {
		// TODO Auto-generated method stub
		if(martians.indexOf(m) >=0)
			return (T) martians.get(martians.indexOf(m));
		else
			return null;
	}

	public void mergeMartians(ArrayList<? extends T> marts) {
		// TODO Auto-generated method stub

		for(T i:marts){
			addMartian(i);
		}

	}

	public static <T extends Martian> ArrayList<T> getSmallest(ArrayList<T> m, int num){
		ArrayList<T> martsClone = m;
		Collections.sort(martsClone, new MartianComparator<T>());

		for (int i = num-1; i < m.size(); i++)
			martsClone.remove(i);
		return martsClone;
	}


}
