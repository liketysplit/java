//Author: Rick Boles

package Program1;

import java.util.Scanner;

public class Boles {

	//Variables
	private static boolean win;
	private boolean hasStarted;
	private static int coins;
	private static int selectionCount;
	static Scanner scan = new Scanner(System.in);
	static boolean winnable =true;
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
		int sc,tc,ec,ms;
		while(exit==1){
			System.out.println("");
			System.out.println("Welcome to Captain Fictitious and Treasure Box, Do you want to play?");
			System.out.printf("\n%s","Enter 1 to play or any other number to quit.");
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

			else
				System.out.println("You decided to quit :(");
		}

	}





}
