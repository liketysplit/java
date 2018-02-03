
/************************************************************
Purpose: Computing the cost of carpeting a room 
      
Input:    

Output:   

Author:   Rick Boles

Date:     10/13/2016

Course:   CS1301 A

Program:  MyCarpet8.java
************************************************************/
import java.util.*;
public class MyCarpet8{
   public static void main(String[] args) {
      double carpetFootPrice;          // Price per square foot
      double length;                   // To input room length
      double width;                    // To input room width
      RoomDimension dimensions;        // To hold room dimensions
      RoomCarpet room;                 // To determine cost

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Display intro.
      System.out.println("\n\tThis program will display price to " +
                         "\n\tcarpet a room. You must input the " +
                         "\n\troom's dimensions in feet.");
      
      // Get the length of the room.
      System.out.print("\n\n\tEnter the length first:                   \t");
      length = keyboard.nextDouble();
      
      // Get the width of the room.
      System.out.print("\tNow enter the width:                      \t");
      width = keyboard.nextDouble();
      
      // Get the price per square foot.
      System.out.print("\tenter the price of carpet per square foot:\t");
      carpetFootPrice = keyboard.nextDouble();

      
      // Create RoomDimension and RoomCarpet objects.
      dimensions = new RoomDimension(length, width);
      room = new RoomCarpet(dimensions, carpetFootPrice);
      
      // Display the dimensions and cost.
      System.out.println(room);
   }
}
