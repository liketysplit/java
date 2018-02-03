//********************************************************************
//Purpose:  Computes bank account information and charges
//
//Input:    Reading name, course, initial balance, and number of checks written
//
//Output:   Account infomation. See sample output below
//
//Author:   
//
//Course:   CS1301
//
//Date:     8/30/2016
//
//Program:  BankCharges.java
//*******************************************************************

/* Problem description

A bank charges $10 per month plus the following check fees for a commercial checking account:

   $0.10 for each check if less than 20 checks were written
   $0.08 for each check if 20 through 39 checks were written
   $0.06 for each check if 40 through 59 checks were written
   $0.04 for each check if 60 or more checks were written

   The bank also charges an extra $15 if the account balance falls below $400 (before any
   check fees are applied). Design a class that reads name, course, initial balance, and number of 
   checks written. Also, it gets the date froom the system's clock.
   
   Compute fees and current balance and display output as show in the sample run below.
*/

import java.util.Scanner;
import java.util.Date;
public class BankCharges{
   //declaring static variables to be shared by different methods
   private static String name;
   private static String course;
   private static Date dateCreated;
   private static double balance;
   private static double currentBalance;
   private static int numberOfChecks;
   private static final int BASIC_FEE = 10;
   private static final int LOW_BALANCE_FEE = 15;
   private static double fees;
   
   //****************************************************************
   //main:  invokes readData, calculations, and displayOutput methods
   //****************************************************************
   public static void main (String [] args){
      readData();
      calculations();
      displayOutput();
   }
   
   //***************************************************************
   //1.  readData:   Creates a Scanner object, reads name, course, initial balance
   //                and number of checks written. Also, it gets the system's date.
   //***************************************************************
   public static void readData(){
   
      System.out.println ("\t1.   readData to be implementd");
   
   }//end of readData method
   
   
   //***************************************************************
   //calculations:   Computes fees and current balance.
   //***************************************************************
   public static void calculations (){
      
      System.out.println ("\t2.  calculations to be implementd");
      
   }//end of calculations method
   
   //***************************************************************
   //displayOutput:  invokes printHeader, display input and computed results
   //                invokes displayFooter.
   //***************************************************************
   public static void displayOutput (){
      printHeader();
          
      System.out.println ("\t3.  displayOutput to be implementd");
      
      printFooter();
   }//end of displayOutput

   //***************************************************************
   //printHeader:  displays name, course, and date
   //***************************************************************
   public static void printHeader(){
      System.out.printf ("\n\t%-60s","**************  Bank Report  ************************");
      System.out.printf ("\n\t%-30s%-13s","Name:", name);
      System.out.printf ("\n\t%-30s%-13s","Course:", course);
      System.out.printf ("\n\t%-30s%-13s","Date:", dateCreated);
      System.out.printf ("\n\t%-60s\n","*****************************************************");
   }//end of printHeader method
   
   //***************************************************************
   //printFooter:  displays end of report
   //***************************************************************
   public static void printFooter(){
      System.out.printf ("\n\t%-60s","*****************************************************");
      System.out.printf ("\n\t%1s%-54s%1s","*","","*");
       System.out.printf ("\n\t%-60s","************  Have a good day ***********************");
   }//end of printHeader method
   
   /*  
   
   **************  Bank Report  ************************       
	Name:                         John Smith   
	Course:                       CS1301       
	Date:                         Mon Aug 29 13:25:24 EDT 2016
	*****************************************************       
	Initial balance:                     350.00
	Number of checks:                     75
	Basic fees:                           10
	Additinal fees:                       18.00
	Current balance:                     322.00
	*****************************************************       
	*                                                   *
	************  Have a good day ***********************      
     
   */
}//end of class