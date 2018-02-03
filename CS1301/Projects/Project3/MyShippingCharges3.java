//************************************************************
//Purpose:  Compute Shipping Charges based on table provided
//
//Input:    Read Weight(Kg), Distance(Mi), Name, and Course 
//
//Output:   Name, Course, Date, Weight(Kg), Distance(Mi),
//          Cost of Shipping, and Shipping Rate Chart.
//
//Author:   Rick Boles
//
//Date:     8/31/2016
//
//Course:   CS1301 A
//
//Program:  MyTriangle2.java
//************************************************************

import java.util.Scanner;
import java.util.Date;

public class MyShippingCharges3 {


   private static double distance, weight, cost, rate;
   public static String name;
   public static String course;
   
   //************************************************************
   //Method main - Calls in readData calculations printOutput displayTable methods
   //************************************************************
   
   public static void main (String [] args){
   
      readData();
      calculations();
      printOutput();
      displayTable();
      
   } //End main

   //************************************************************
   //Method readData - Gets  name, course, weight of package, and distance
   //************************************************************
   
   public static void readData() {
   
      Scanner input = new Scanner(System.in);
   
      System.out.print ("\tName:");
      name = input.nextLine();
      System.out.print ("\tCourse:");
      course = input.nextLine();
      System.out.print ("\tWeight(Kg):");
      weight = input.nextDouble();
      System.out.print ("\tDistance(Mi):");
      distance = input.nextDouble();
   
   } //End readData

   //************************************************************
   //Method calculations - Calculates  weight, distance, and cost
   //************************************************************
   
    public static void calculations() {
    
      if (weight <= 2)
         rate = 1.10;
      else if (weight <= 6)
         rate = 2.20;
      else if(weight < 10)
         rate = 3.70;              
      else
         rate = 4.80;
         
      if (distance > 500)
         cost = 2 * (rate * distance);  
      else
         cost = rate * distance;
   
   } //End calculations

   //************************************************************
   //Method printOutput - Calls the printHeader & printFooter Outputs weight, distance, and cost
   //************************************************************
   
    public static void printOutput() {
   
      printHeader();
      
      System.out.printf("\n\t%-20s%35.2f","Weight:",weight);
      System.out.printf("\n\t%-20s%35.2f","Distance:",distance);
      System.out.printf("\n\t%-20s%35.2f","Cost:",cost);
      
      printFooter();
      
   } //End printOutput

   //************************************************************
   //Method displayTable - Outputs the default table data for shipping
   //************************************************************
   
    public static void displayTable() {
    
      System.out.printf("\n\n\n\t%-20s","****************Shipping Expense Chart*****************");
      System.out.printf("\n\t%-20s%35s","Package Weight(Kg)","Cost Per Mile");
      System.out.printf("\n\t%-20s","*******************************************************");
      System.out.printf("\n\t%-20s%35s","0-2Kg","$1.10");
      System.out.printf("\n\t%-20s%35s","Over 2Kg-6Kg","$2.20");
      System.out.printf("\n\t%-20s%35s","Over 6Kg-10Kg","$3.70");
      System.out.printf("\n\t%-20s%35s","Over 10Kb","$4.80");
      System.out.printf("\n\t%-20s","*******************************************************");
      System.out.printf("\n\t%-20s","Cost is double if distance is greater than 500 miles");
      System.out.printf("\n\t%-20s","************************End Chart**********************");  
   
   } //End displayTable

   //************************************************************
   //Method printHeader - Outputs the name, course, and date
   //************************************************************
   
    public static void printHeader() {
   
      Date dateCreated = new Date();
   
      System.out.printf("\n\t%-20s","****************Shipping Expense Report****************");
      System.out.printf("\n\t%-10s%-15s","Name:",name);
      System.out.printf("\n\t%-10s%-15s","Course:",course);
      System.out.printf("\n\t%-10s%-15s","Date",dateCreated);
      System.out.printf("\n\t%-20s","*******************************************************");
      
   } //End printHeader
   
   //************************************************************
   //Method printFooter - Outputs the footer
   //************************************************************

    public static void printFooter() {
   
      System.out.printf("\n\t%-20s","************************End Report*********************");
   
   } //End printFooter
}