package prob3;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetProblems2 {
	
	public static void main(String[] args){
		Player player1 = new Player("A", 11);
		Player player2 = new Player("B", 22);
		Player player3 = new Player("C", 33);
		Player player4 = new Player("D", 44);
		Player player5 = new Player("E", 55);
		Player player6 = new Player("F", 66);
		Player player7 = new Player("G", 77);
		Player player8 = new Player("H", 88);
		Player player9 = new Player("I", 99);
		Player player10 = new Player("J", 100);
		Player player11 = new Player("K", 10);
		Player player12 = new Player("L", 21);
		Player player13 = new Player("M", 32);
		Player player14 = new Player("N", 43);
		Player player15 = new Player("O", 54);
		Player player16 = new Player("P", 65);
		Player player17 = new Player("Q", 76);
		Player player18 = new Player("R", 87);
		Player player19 = new Player("S", 98);
		Player player20 = new Player("T", 90);
		
		List<Player> players = new ArrayList<Player>();
		
		players.add(player1); 
		players.add(player2);
		players.add(player3);
		players.add(player4);
		players.add(player5);
		players.add(player6);
		players.add(player7);
		players.add(player8);
		players.add(player9);
		players.add(player10);
		players.add(player11);
		players.add(player12);
		players.add(player13);
		players.add(player14);
		players.add(player15);
		players.add(player16);
		players.add(player17);
		players.add(player18);
		players.add(player19);
		players.add(player20);
		
		System.out.print("\nOriginal List: \n");
		for (Player p : players){
			System.out.print("\n" + p);
		}
		
		TreeSet<Player> testTreeSet = sortByScoresThenNames(players, 50, true);
		
		System.out.print("\nModified List Test 1: \n");
		for (Player p : testTreeSet){
			System.out.print("\n" + p);
		}
		
		TreeSet<Player> testTreeSet2 = sortByScoresThenNames(players, 75, false);
		
		System.out.print("\nModified List Test 2: \n");
		for (Player p : testTreeSet2){
			System.out.print("\n" + p);
		}
		
		
		// Divide Players Test
		
		TreeSet<Player> players2 = new TreeSet<Player>(new scoreComparator());
		players2.addAll(players);
		
		TreeSet<Player> dividePlayersTreeSetLessThan = dividePlayers(players2, 5);
		System.out.print("\ndividePlayersTreeSetLessThan List \n" + dividePlayersTreeSetLessThan);
		System.out.print("\nplayers2 List \n" + players2);
	}
	

	//No Method name given in problem statement used sortByScoresThenNames
	public static TreeSet<Player> sortByScoresThenNames (List<Player> p, int s, boolean b){
		
		TreeSet<Player> temp = new TreeSet<Player>(new scoreComparator());
		temp.addAll(p);
		SortedSet<Player> temp2 = temp.tailSet(new Player("aummy", s));
		
		if (b)
			temp.retainAll(temp2);
		
		if (!b){
		
			TreeSet<Player> temp3 = new TreeSet<Player>(new nameComparator());
			temp3.addAll(temp2);
			return temp3;
		} 
		
		return temp;
	}
	
	
	
	public static TreeSet<Player> dividePlayers(TreeSet<Player> players, int threshold){

		TreeSet<Player> temp = new TreeSet<Player>(new scoreComparator());

		for (Player p : players){
			if (p.getScore() < threshold)
				temp.add(p);
		}

		players.removeAll(temp);
		return temp;
	}
}