//********************************
//Purpose:	Using static methods, Date, and Scanner classes
//Input:		N/A
//Output:	Displays rectangle information. See sample output at the bottom
//Author:	Fares
//Class:		CS1301
//Date:		8/22/2016
//Program:	Rectangle_Lab_8_23_2016.java
//********************************
import java.util.Date;
import java.util.Scanner;
public class Rectangle_Lab_8_23_2016_sol {
	//1.  Declarations
   //    Declare static variables that can be used in all the methods of the class
   //    Declare width, height, area, and perimeter of type double
   //    Declare color, name, and course of type String
	private static String name;
   private static String course;
   private static String color;
   
   private static double width, height, area, perimeter;
   
   private static Date dateCreated;
  	
	//**********************************
	//main:	invokes other methods.
   //       main methods just invokes readData, calculations, and printOutput methods
	//**********************************
	public static void main (String [] args) {
	   readData();
      calculations();
      printOutput();
   }//end of main
	
	//**********************************
	//readData:	Read rectangle width, height, and color
	//				
	//**********************************
	public static void readData(){
      //Create a Scanner object to help in reading height, width, and color from keyboard
      Scanner scan = new Scanner (System.in);
      
      //reading data
      System.out.print ("\tEnter your name:         \t");
      name = scan.nextLine();
	   System.out.print ("\tEnter your course:       \t");
      course = scan.nextLine();
      System.out.print ("\tEnter color:             \t");
      color = scan.nextLine();
      
      System.out.print ("\tEnter height:            \t");
      height = scan.nextDouble();
      System.out.print ("\tEnter width:             \t");
      width = scan.nextDouble();
   }//end of readData method
	
	//**********************************
	//calculations:	computes area and perimeter 
	//						
	//**********************************
	public static void calculations (){
      perimeter = 2 * ( width + height);
      area = width * height;
      dateCreated = new Date();
	} //end of calculations method
	
	//**********************************
	//printOutput:	invokes header and footer
	//					and displays rectangle  
	//					information
	//**********************************
	public static void printOutput(){
		//invoke the printHeader method
      printHeader();
      
      //print width, height, area, perimeter, and color as shown in sample output
		System.out.printf ("\n\t%-20s%5.2f","Width:", width);
      System.out.printf ("\n\t%-20s%5.2f","Height:", height);
      System.out.printf ("\n\t%-20s%5.2f","Area:", area);
      System.out.printf ("\n\t%-20s%5.2f","Perimeter:", perimeter);
      System.out.printf ("\n\t%-20s%-10s","Color:", color);
      //invoke printFooter method
		printFooter();
	}
	
	//***********************************
	//printHeader:	Prints name, clas, and date.
   //             Use the Date class to get the date and time from the system
	//***********************************
	public static void printHeader(){
		Date dateCreated = new Date();
		System.out.println ("\n\t******* Rectangle Report *************");
		System.out.printf ("\n\t%-20s%-20s", "Name:", name);
      System.out.printf ("\n\t%-20s%-20s", "Course:", course);
      System.out.printf ("\n\t%-20s%-20s", "Date:", dateCreated);
     	System.out.println ("\n\t***********************************");
	}
	
	//************************************
	//printFooter:	prints a footer line
	//************************************
	public static void printFooter(){
		System.out.println ("\n\n\t******* Have a nice day ************");
	}
   
   /*
   

   ******* Rectangle Report *************
	   Name:	John Smith
   	Class:	CS1301
      Date:	Mon Aug 22 09:37:41 EDT 2016
   ***********************************
      
      Width                     3.00
      Height                    4.00
      Area                     12.00
      Perimeter                14.00
      Color                    Green
      
   ******* Have a nice day ************
*/
}
		
		
	

	