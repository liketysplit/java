//Authors: Rick Boles && Tyler Angelier

import java.util.Scanner;
import java.util.ArrayList;

public class Angelier_Boles {

	//Variables
	private static boolean win;
	@SuppressWarnings("unused")
	private static boolean broken = false;
	private static int coins, sc,tc,ec,ms;
	private static int selectionCount;
	static Scanner scan = new Scanner(System.in);
	private static ArrayList<Integer> steps = new ArrayList<Integer>();
	private static ArrayList<Integer> stepsW = new ArrayList<Integer>();
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

	//Game selection Menu
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


				arraySetup();
				if(treasure_gameAutomated(sc, tc, ec, ms)){
					System.out.println("Game is Winnable!");
					printWins(sc, tc, ec, ms);
				}
				else
					System.out.println("Game is Not Winnable!");

			}
			if(exit == 3)
				System.out.println("You decided to quit :(");
		}
	}

	//Setup the array with all possible moves using counting principle
	static void arraySetup(){
		steps.clear();
		stepsW.clear();
		int count = 0;
		int calc = (int)Math.pow(10, ms);
		for(int i = 0; i < calc; i++){
			count = 0;
			for(int j = i; j > 0; j/=10)
				if(j%10 == 1 || j%10 ==2)
					count ++;
			if (count == ms)
				steps.add(i);
		}

	}


	private static boolean treasure_gameAutomated(int startcoins, int targetcoins, int extracoins, int maxsteps){
		 win = false;
		 coins = startcoins;
		 selectionCount = 0;
		 System.out.println();
		 int countSteps = 0;

			 while(countSteps < steps.size()){
				 broken =false;
				 coins = startcoins;
				 int temp = steps.get(countSteps);
				 selectionCount =0;
				 broken = true;
				 while(temp!=0){
					 switch(temp%10){
					 	case 1: coins += extracoins;
					 		break;
					 	case 2: if(coins%2 !=0){
					 				temp= 0;
					 				selectionCount=ms+1;
					 			}//End If
					 			else
					 				coins/=2;
						 }//End Switch
				 	temp /= 10;
				 	selectionCount++;

					//Check for win
					 if(coins == targetcoins && selectionCount<=maxsteps){
						 win = true;
						 calcWinStep(selectionCount,steps.get(countSteps));
					 }//End If
				 }//End Inner While
				 countSteps++;
			 }
		return win;
		}

		//Prints out the wins by number with steps
		public static void printWins(int startcoins, int targetcoins, int extracoins, int maxsteps){
			 int countSteps = 0;
			 System.out.println("You Started the Games below with " + sc +" coins.");
			 while(countSteps < stepsW.size()){
				 coins = startcoins;
				 int temp = stepsW.get(countSteps);
				 selectionCount =0;
				 //First Run

				 System.out.println("");
				 System.out.println("Game Win #"+ (countSteps+1));
				 while(temp!=0){

					 switch(temp%10){
					 	case 1: coins += extracoins;
					 			System.out.println("Ask for additional coins. You get " + extracoins + " making coin total to be " + coins);
					 			break;
					 	case 2: coins/=2;
					 			System.out.println("Return half of your coins (" + (coins*2) + "/2 = "+ coins + ") to the Captain, leaving " + coins + " coins in your hand.");
					 			break;
						 }//End Switch
				 	 temp /= 10;
					 selectionCount++;
				 }//End Inner While



				 countSteps++;
			 }//End While
		} //End printwins

		//Calcuates the # of steps to a win && insures no duplicates are made
		public static void calcWinStep(int n, int x){
			int temp = 0;
			@SuppressWarnings("unused")
			int temp2;
			boolean unique = true;
			for(int i = 0; i < n;i++){
				temp= ((x%10)*(int)Math.pow(10, i)) + temp;
				x/=10;
			}

			if(stepsW.size() >= 1){
				temp2= stepsW.get(0);
				for(int i = 0; i < stepsW.size();i++){
					if(stepsW.get(i) == temp)
						unique = false;
				}
				if(unique)
					stepsW.add(temp);
			}
			else
				stepsW.add(temp);
		}



}

