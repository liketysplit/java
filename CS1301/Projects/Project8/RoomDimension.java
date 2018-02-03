
/************************************************************
Purpose: Stores information about the dimesions of a room 
      
Input:    

Output:   

Author:   Rick Boles

Date:     10/13/2016

Course:   CS1301 A

Program:  RoomDimension.java
************************************************************/
public class RoomDimension{
   private double length = 0;      // Room length
   private double width  = 0;      // Room width
   
   //****************************************************************************
   //Constructor:    Receives length and width and assigns to instance variables
   //****************************************************************************
   public RoomDimension(double len, double w){
      length = len;
      width = w;
            
   }
   
   //****************************************************************************
   //getLength Accessor: returns the room length
   //****************************************************************************
   public double getLength(){   

      return length;
   }

   //****************************************************************************
   //getWidth Accessor: returns the room width
   //****************************************************************************
   public double getWidth(){
      return width;
   }

   //****************************************************************************
   //getArea: computes and returns th earea of the room
   //****************************************************************************
   public double getArea(){
      
   
      return length * width;
   }

   //****************************************************************************
   //toString: returns the room information
   //****************************************************************************
   public String toString(){
      String roomStats = "\n\n" +
      "\n\tLength:          " + length +
      "\n\n\tWidth:           " + width +
      "\n\n\tArea:           " + ""+ length * width;

      return roomStats;
   }
}
