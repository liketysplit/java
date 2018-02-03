package Program1;

//Authors: Rick Boles && Tyler Angelier

import java.util.Scanner;
import java.util.ArrayList;

public class Program1 {

	//Variables
	private static boolean win;
	private static boolean broken = false;
	private static int coins, sc,tc,ec,ms;
	private static int selectionCount;
	static Scanner scan = new Scanner(System.in);
	private static ArrayList<Integer> steps = new ArrayList<Integer>();
	private static ArrayList<Integer> stepsW = new ArrayList<Integer>();
	static boolean winnable =true;
	//public static int winningCombo = 0;
	// Postcondition: A true return value means that it is possible to win the game.
	// A false return value means that it is not possible to win the coin game within
	// the specified number of steps.

	public static void main(String[] args) {
		gameMenu();

	}

	static boolean treasure_game(int startcoins, int targetcoins, int extracoins, int maxsteps){
	 win = false;
	 coins = startcoins;
	 selectionCount = 0;

	 //Check Winnable On Start
	 System.out.println();
	 if(coins%2!=0 && extracoins%2==0){
		 System.out.printf("%s\n","You cannot win this game :( Please try again.");
		 winnable = false;
		 return false;
	 }
	 //Print Starting Coins
	 System.out.println();
	 System.out.printf("%s%d Coins\n","You have started the game with: ", coins);
	 System.out.println();

	 //Main Game Loop
		 while(!win){

			 //Check if game is still winnable
			 if(coins%2!=0 && extracoins%2==0){
				 System.out.printf("%s\n","You can no longer win this game :( \nPlease try again.\n\n");
				 winnable = false;
				 return false;

			 }

			 //Check for an odd and notify for the add of coins
			 if(coins%2!=0){
				 coins += extracoins;
				 System.out.printf("%s%d\n","You have an odd amount of coins and must take more! Making your coins: ",coins);
				 selectionCount++;
			 }

			 //Main Selection Code
			 else{
				 System.out.printf("%s\n","Enter 1 for more coins or 2 to turn in coins\n");
				 switch(scan.nextInt()){
				 	case 1: coins += extracoins;
				 		break;
				 	case 2: coins/=2;

				 }
				 System.out.printf("%s%d Coins\n","You Now have: ", coins);
				 selectionCount++;
			 }

			 //Check for win
			 if(coins == targetcoins && selectionCount<=maxsteps)
				 return true;
			 else if(selectionCount > maxsteps)
				 return win;

		 }

	return win;
	}

	public static void gameMenu(){
		int exit = 1;

		while(exit!=3){
			System.out.println("");
			System.out.println("Welcome to Captain Fictitious and Treasure Box, Do you want to play?");
			System.out.printf("\n%s","Enter 1 to play, 2 to solve, 3 to quit!");
			exit = scan.nextInt();
			if (exit == 1){
				System.out.printf("\n%s","Enter starting coins\n");
				sc = scan.nextInt();
				System.out.printf("\n%s","Enter the target amount of coins to get:\n");
				tc = scan.nextInt();
				System.out.printf("\n%s","Enter the extra coins that can be attained:\n");
				ec = scan.nextInt();
				System.out.printf("\n%s","Enter the Max times a person can choose what to do:\n");
				ms = scan.nextInt();

				if(treasure_game(sc, tc, ec, ms))
					System.out.println("You Won!");
				else if (winnable)
					System.out.println("You Lost!");
			}
			if(exit == 2){
				System.out.printf("\n%s","Enter starting coins\n");
				sc = scan.nextInt();
				System.out.printf("\n%s","Enter the target amount of coins to get:\n");
				tc = scan.nextInt();
				System.out.printf("\n%s","Enter the extra coins that can be attained:\n");
				ec = scan.nextInt();
				System.out.printf("\n%s","Enter the Max times a person can choose what to do:\n");
				ms = scan.nextInt();


				//arraySetup();
				int moves = treasure_gameAutomated(sc, tc, ec, ms, 0);
				if(moves !=-1 && sc!=tc){
					System.out.print(moves);
					System.out.println("Game is Winnable!");
					printWins(sc, tc, ec, ms, moves);
				}
				else if (sc==tc){
					System.out.println("Game is Winnable!");
					System.out.println("Starting Coins: "+ sc + " and " + tc + "are the same. You won teh game with 0 moves!" );
				}
					
				else
					System.out.println("Game is Not Winnable!");

			}

			else
				System.out.println("You decided to quit :(");
		}

	}

	static int treasure_gameAutomated(int startcoins, int targetcoins, int extracoins, int maxsteps, int winningCombo){
		 if(startcoins == targetcoins)
			 return winningCombo;
		 else if(maxsteps == -1)
			 return -1;
		 else if((startcoins%2 ==1 && extracoins %2==0))
			 return -1;
		 else if(startcoins%2==0){
			 int temp1 = (winningCombo*10) +1;
			 int temp2 = (winningCombo*10) +2;
			 if (treasure_gameAutomated(startcoins/2, targetcoins, extracoins,maxsteps-1,temp1)==-1)
				 return treasure_gameAutomated(startcoins+extracoins, targetcoins, extracoins, maxsteps-1,temp2);
			 else 
				 return treasure_gameAutomated(startcoins/2, targetcoins, extracoins,maxsteps-1,temp1);
		 }
		 else{
			 return treasure_gameAutomated(startcoins+extracoins, targetcoins, extracoins, maxsteps-1,((winningCombo*10)+2));
		 }
		 //return -1;
		}

		public static void printWins(int startcoins, int targetcoins, int extracoins, int maxsteps, int moves){
			System.out.println("You Started the Games below with " + sc +" coins.");
				 coins = startcoins;

				 selectionCount =0;


				 System.out.println("");
				 while(moves!=0){

				 switch(moves%10){
				 	case 1: coins += extracoins;
				 			System.out.println("Ask for additional coins. You get " + extracoins + " making coin total to be " + coins);
				 			break;
				 	case 2: coins/=2;
				 			System.out.println("Return half of your coins (" + (coins*2) + "/2 = "+ coins + ") to the Captain, leaving " + coins + " coins in your hand.");
				 			break;
					 }
				 	 moves /= 10;
					 selectionCount++;
				 }

		}



}

