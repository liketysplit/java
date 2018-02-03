//********************************
//Purpose:	Using static methods, Date, and Scanner classes
//Input:		N/A
//Output:	Displays rectangle information. See sample output at the bottom
//Author:	Fares
//Class:		CS1301
//Date:		8/22/2016
//Program:	Rectangle_Lab_8_23_2016.java
//********************************
import java.util.*;
public class Rectangle_Lab_8_23_2016 {
	//1.  Declarations
   //    Declare static variables that can be used in all the methods of the class
   //    Declare width, height, area, and perimeter of type double
   //    Declare color of type String
	
	
	//**********************************
	//main:	invokes other methods.
   //       main methods just invokes readData, calculations, and printOutput methods
	//**********************************
	public static void main (String [] args) {
	
   }
	
	//**********************************
	//readData:	Read rectangle width, height, and color
	//				
	//**********************************
	public static void readData(){
      //Create a Scanner object to help in reading height, width, and color from keyboard
	
   }
	
	//**********************************
	//calculations:	computes area and perimeter 
	//						
	//**********************************
	public static void calculations (){
	
   }
	
	//**********************************
	//printOutput:	invokes header and footer
	//					and displays rectangle  
	//					information
	//**********************************
	public static void printOutput(){
		//invoke the printHeader method
      printHeader();
      
      //print width, height, area, perimeter, and color as shown in sample output
		
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
		System.out.println ("\tName:\t<Enter your name here");
		System.out.println ("\tClass:\tCS1301");
     	System.out.println ("\tDate:\t" +dateCreated);
		System.out.println ("\t***********************************");
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
		
		
	

	