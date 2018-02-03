//****************************************************
//Purpose:  A Driver to use the Television class
//          Practice with classes and Objects
//
//Author:   Fares
//Class:    CS1301
//Date:     10/16/2014
//****************************************************
import java.util.Scanner;
public class TelevisionTest{
   public static void main(String[] args){
      //create a Scanner object to read from the keyboard
      Scanner keyboard = new Scanner (System.in);
      
      //declare variables
      int station;	//the user's channel choice
      
      //declare and intiate a television object
      Television bigScreen = new Television("Toshiba", 55);
      //turn the power on 
      bigScreen.power();
      //display the state of the television
      System.out.println("A " + bigScreen.getScreenSize() + " " + 
      bigScreen.getManufacturer()	+ " has been turned on.");
      //prompt the user for input and store into station 
      System.out.print("What channel do you want?  "); 
      station = keyboard.nextInt();
      
      //change the channel on the television 
      bigScreen.setChannel(station);
      //increase the volume of the television 
      bigScreen.increaseVolume();
      //display the the current channel and volume of the television
      System.out.println("Channel: " + bigScreen.getChannel() + "	Volume:  " + bigScreen.getVolume());
      System.out.println("Too loud!! I am lowering the volume.");
      //decrease the volume of the television 
      bigScreen.decreaseVolume(); 
      bigScreen.decreaseVolume(); 
      bigScreen.decreaseVolume(); 
      bigScreen.decreaseVolume(); 
      bigScreen.decreaseVolume(); 
      bigScreen.decreaseVolume();
      //display the current channel and volume of the television
      System.out.println("Channel: " + bigScreen.getChannel() + "	Volume:  " + bigScreen.getVolume());
      System.out.println(); //for a blank line
      System.out.print(bigScreen.toString());
      //HERE IS WHERE YOU DO TASK #5

     
      //Make use of the toString method 
      
      
      Television portable = new Television ("Sharp",60);
      portable.power();
      System.out.println ("Power is:\t" + portable.getPower());
      portable.setChannel(5);
      portable.increaseVolume();
      portable.increaseVolume();
      System.out.println (portable.toString());
 
      
      Television mini = new Television ("Sharp",19);
      mini.power();
      System.out.println ("Power is:\t" + portable.getPower());
      mini.setChannel(7);
      mini.decreaseVolume();
      mini.decreaseVolume();
      System.out.print(mini.toString());
   }
}
