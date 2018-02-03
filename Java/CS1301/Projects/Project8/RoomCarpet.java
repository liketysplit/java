/************************************************************
Purpose: The RoomCarpet class stores information about the carpeting of a room
      
Input:    

Output:   

Author:   Rick Boles

Date:     10/13/2016

Course:   CS1301 A

Program:  RoomCarpet.java
************************************************************/
import java.text.DecimalFormat;
public class RoomCarpet{
   private RoomDimension size;   // The size of the room
   private double carpetCost;    // Carpet cost per square foot
   
   //****************************************************************************
   //constructor: Receives a RoomDimension object and cost
   //****************************************************************************
   public RoomCarpet(RoomDimension dim, double cost){
      // Make size reference a copy of the object referenced
      // by the dim argument.
      size = new RoomDimension(dim.getLength(), dim.getWidth());
      
      // Assign the carpet cost per foot.
      carpetCost = cost;
   }
   
   //****************************************************************************
   //getTotalCost: computes the total carpet cost. It is area times foot cost
   //****************************************************************************
   public double getTotalCost(){
      // Return the total cost.
      return carpetCost * size.getArea();
   }

   //****************************************************************************
   //toString: returns the room dimesions and total cost
   //****************************************************************************
   public String toString(){
      // Create a DecimalFormat object to format output.
      DecimalFormat dollar = new DecimalFormat("#,##0.00");
      
      // Create a String with the object state.
      String str = "\n\tRoom dimensions:\n" +
                   size + 
                   "\n\n\tCarpet cost: $" + dollar.format(getTotalCost());
      
      // Return the String
      return str;
   }
}
