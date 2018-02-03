//************************************************************
//Purpose:  Compute Area of a Triangle
//
//Input:    Reading data from user about triangle
//
//Output:   Display Area and Perimeter
//          
//
//Author:   Rick Boles
//
//Date:     8/23/2016
//
//Course:   CS1301 A
//
//Program:  MyTriangle2.java
//************************************************************


import java.util.Scanner; //Import Scanner class
import java.util.Date;    //Import Date Class

public class MyTriangle2 { //Begin

   private static double side1;
   private static double side2;
   private static double side3;
   private static double area;
   private static double perimeter;
   private static Date dateCurrent;

   //************************************************************
   //Method main - Calls in all other methods in program
   //************************************************************

   public static void main(String[] args) {
   
      readSides();
      calculations();
      printOutput();
      
   } //End main
   
   //************************************************************
   //Method readSides - Gets input from the user
   //************************************************************
   
   public static void readSides() {
   
      Scanner input = new Scanner(System.in);
 
      System.out.println ("\tEnter the 1st side of the triangle:\t");
      side1 = input.nextDouble();
      System.out.println("\tEnter the 2nd side of the traingle:\t");
      side2 = input.nextDouble();
      System.out.println("\tEnter the 3rd side of the triangle:\t");
      side3 = input.nextDouble();
   
   } // End readSides
   
   //************************************************************
   //Method calculations - Gets area and perimeter of a triangle
   //************************************************************
   
   public static void calculations() {
   
      perimeter = side1 + side2 + side3;
      double s = 0.5 * perimeter;
      area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
   
   } //End calculations
   
   //************************************************************
   //Method printOutput - Calls other print methods
   //************************************************************
   
   public static void printOutput() {
   
      printHeader();
      printFooter();
      
   } // End printOutput
   
   //************************************************************
   //Method printHeader - Prints the Header Information
   //************************************************************
   
   public static void printHeader() {
   
      Date dateCurrent = new Date();
      
      System.out.println ("\t******************Area of a Trianlgle***********************"); 
      System.out.println ("\tName: Rick Boles");
      System.out.println ("\tCourse: CS 1301 A");
      System.out.println ("\tDate: " + dateCurrent);
      System.out.println ("\tProgram: MyTriangle2.java");
      System.out.println ("\t************************************************************");
            
      System.out.println ("\n\tTriangle Data:");
      System.out.printf ("\n\t%-20s%-5.2f","Side 1:",side1);
      System.out.printf ("\n\t%-20s%-5.2f","Side 2:",side2);
      System.out.printf ("\n\t%-20s%-5.2f","Side 3:",side3);
      System.out.printf ("\n\n\t%-20s%-5.2f","Perimeter:",perimeter);
      System.out.printf ("\n\t%-20s%-5.2f","Area:",area);
   
   } //End printHeader
   
   //************************************************************
   //Method printFooter - Prints the Footer Information
   //************************************************************

   public static void printFooter() {

      System.out.println ("\n\n\t**************************End*******************************");


   
   } //End printFooter

} //End Mytriangle2