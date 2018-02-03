//************************************************************
//Purpose:  Computing Circle area and perimeter
//
//Input:    Reading radius from console (keyboard)
//
//Output:   Display your name, class, and date
//          Display Circle radius, area, and perimeter
//
//Author:   <Enter your name>
//
//Date:     8/16/2016
//
//Course:   CS1301 A
//
//Program:  MyCircle.java
//************************************************************

//1.  Import java package that has the Scanner class. To help you
//    reading from keyboard. Use the statement below:

//    import java.util.Scanner
import java.util.Scanner;
public class MyCircle_sol {
   //********************************************************
   //main method
   //********************************************************
   
   public static void main (String [] args){
      //Declaration Section
      int radius;
      double area;
      double perimeter;
      Scanner input = new Scanner (System.in);     
                    
      //Reading data      
      System.out.print ("\n\tEnter radius of circle as an integer:\t");
      radius = input.nextInt();
      
      //Calculations
      area = Math.PI * radius * radius;
      perimeter = 2 * radius * Math.PI;
      
      //Display output
      System.out.println ("\n\t**************** Circle Report ****************");
      System.out.println ("\tName:                   <Enter your name here>");
      System.out.println ("\tCourse:                 CS 1301 A");
      System.out.println ("\tDate:                   8/16/2016");
      System.out.println ("\t***********************************************");
      
      /*
      System.out.println ("\n\tRadius:         \t" + radius);
      System.out.println ("\tArea:           \t" + area);
      System.out.println ("\tPerimeter:      \t" + perimeter);
      */
      
      System.out.printf ("\n\t%-20s%7d","Radius",radius);
      System.out.printf ("\n\t%-20s%10.2f","Area",area);
      System.out.printf ("\n\t%-20s%10.2f","Perimeter",perimeter);
      System.out.println ("\n\t**************** Have a good day **************");
   }//end of main
}//end of MyCircle       
     
