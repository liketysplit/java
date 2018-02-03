package prob3;

import java.util.ArrayList;
import java.util.Arrays;

public class MartianSortTester {

	public static void main(String[] args){
		Martian r1 = new RedMartian(1);
		Martian r2 = new RedMartian(2);
		Martian r3 = new RedMartian(3);
		Martian r4 = new RedMartian(4);
		Martian r5 = new RedMartian(5);
		Martian r6 = new RedMartian(6);
		Martian r7 = new RedMartian(7);
		Martian g1 = new GreenMartian(1);
		Martian g2 = new GreenMartian(2);
		Martian g3 = new GreenMartian(3);
		Martian g4 = new GreenMartian(4);
		Martian g5 = new GreenMartian(5);
		Martian g6 = new GreenMartian(6);
		Martian g7 = new GreenMartian(7);

		ArrayList<Martian> martians = new ArrayList<>(Arrays.asList(
				r2, r3, r4, r5, r6, r7, r1 ));

		System.out.println("Original Order:");
		printMartianList(martians);
		selectionSortRecursive(martians);
		System.out.println("Sorted:");
		printMartianList(martians);


		martians = new ArrayList<>(Arrays.asList(
				r2, r3, r4, r5, r6, r7, r1, g1, g2, g3, g4, g5, g6, g7 ));

		System.out.println("Original Order:");
		printMartianList(martians);
		selectionSortRecursive(martians);
		System.out.println("Sorted:");
		printMartianList(martians);



		martians = new ArrayList<>(Arrays.asList(
				r2, g3, g5, g2, r3, g7, r5, r1, r7, g1, g4, g6, r6, r4 ));

		System.out.println("Original Order:");
		printMartianList(martians);
		selectionSortRecursive(martians);
		System.out.println("Sorted:");
		printMartianList(martians);

		martians = new ArrayList<>(Arrays.asList(
				r5, r1, r4, r3, r7, r2, g7, g1, g2, g3, g4, g5, g6, r6 ));

		System.out.println("Original Order:");
		printMartianList(martians);
		selectionSortRecursive(martians);
		System.out.println("Sorted:");
		printMartianList(martians);

	}

	public static void selectionSortRecursive(ArrayList<Martian> martians){
		// ---> WRITE THIS METHOD <---

		selectionSortRecursive(martians, martians.size()-1);
	}

	private static void selectionSortRecursive(ArrayList<Martian> martians, int endPos){
		// ---> WRITE THIS METHOD <---

		int n = 1;
		int tempPos = endPos;

		if (endPos == 0)
			return;

		if ( martians.get(endPos) instanceof GreenMartian)
			selectionSortRecursive(martians, endPos-1);

		while ( martians.get(tempPos-1) instanceof GreenMartian){
			n++;
			tempPos--;
		}
		if (martians.get(endPos).compareTo(martians.get(endPos-n)) > 0 && martians.get(endPos) instanceof RedMartian && martians.get(endPos-n) instanceof RedMartian)
			selectionSortRecursive(martians, endPos-1);

		if (martians.get(endPos).compareTo(martians.get(endPos-n)) < 0 && martians.get(endPos) instanceof RedMartian && martians.get(endPos-n) instanceof RedMartian){
			Martian temp = martians.get(endPos-n);
			martians.set(endPos-n, martians.get(endPos));
			martians.set(endPos, temp);
			//martians.remove(endPos);
			endPos = martians.size()-1;
			selectionSortRecursive(martians, endPos);
		}

		if (martians.get(martians.size()-1).compareTo(martians.get(0)) < 0  && martians.get(0) instanceof RedMartian && martians.get(martians.size()-1) instanceof RedMartian){
			Martian temp = martians.get(0);
			martians.set(0, martians.get(martians.size()-1));
			martians.set(martians.size()-1, temp);
			//martians.remove(endPos);
			endPos = martians.size()-1;
			selectionSortRecursive(martians, endPos);
		}
	}



	// Used for testing
	private static void printMartianList(ArrayList<Martian> martians) {
		StringBuilder sb = new StringBuilder();
		for(Martian m : martians) {
			if(m instanceof RedMartian)
				sb.append("R=");
			else
				sb.append("G=");
			sb.append(m.getId() + ", ");
		}
		sb.delete(sb.length()-2, sb.length());
		System.out.println(sb.toString());
	}
}
