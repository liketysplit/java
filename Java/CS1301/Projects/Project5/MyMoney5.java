/************************************************************
Purpose: Calculate the Tender of cash based on the amount entered. 
      
Input:    name, course, originalAmount 

Output:   originalAmount and the number of the following: cents, hundred, fifty, twenty, ten, five, one, quarter, dime, nickel, penny

Author:   Rick Boles

Date:     8/31/2016

Course:   CS1301 A

Program:  MyMoney5.java
************************************************************/

import java.util.Scanner;
import java.util.Date;

public class MyMoney5 {

   public static String originalAmount, amountCents, amountDollars, amountDollarsAndCents, name, course; //Declare the input value string
   public static int cents, remainder, hundred, fifty, twenty, ten, five, one, quarter, dime, nickel, penny = 0; //Declare and define integers

   
   
   /************************************************************
   Method main - Calls:
                        readData 
                        calculateDollarsAndCents 
                        calculateTender 
                        printOutput
   ************************************************************/   
   public static void main (String [] args){ 
   
  
   
      readData();
      calculateDollarsAndCents();
      calculateTender();
      printOutput();
   
   } //End main
   
   /************************************************************
   Method readData - Reads
                           name
                           course
                           originalAmount
   ************************************************************/   
   public static void readData(){
   
      Scanner input = new Scanner(System.in); // Create Scanner 'input' to get the data
      
      System.out.print ("\tName:");
      name = input.nextLine();
      System.out.print ("\tCourse:");
      course = input.nextLine();
      System.out.print ("\tEnter the dollar amount in the form of 10, 10.5, 10.56, 10.567:");
      originalAmount = input.nextLine();
      
   
   } //End readData
   
   /************************************************************
   Method calculateDollarsAndCents - Calculates (Compares indexOf to lenth - 1)
                                                amountCents
                                                amountDollars
                                                amountDollarsAndCents
                                                cents
   ************************************************************/   
   public static void calculateDollarsAndCents(){                  
                       
      String d = ".";
      int iValue = originalAmount.indexOf(d);
      int length = originalAmount.length()-1;
      
      
      if (!originalAmount.contains(d)){
         amountCents = "00";
         amountDollars = originalAmount;
         amountDollarsAndCents = amountDollars + amountCents;
         cents = Integer.parseInt(amountDollarsAndCents);
      }
       
      
      else if (length - iValue == 1){
         amountCents = originalAmount.substring(iValue+1) + "0";
         amountDollars = originalAmount.substring(0,iValue);
         amountDollarsAndCents = amountDollars + amountCents;
         cents = Integer.parseInt(amountDollarsAndCents);
      }
      
      else if (length - iValue >= 2){
         amountCents = originalAmount.substring(iValue+1,iValue+3);
         amountDollars = originalAmount.substring(0,iValue);
         amountDollarsAndCents = amountDollars + amountCents;
         cents = Integer.parseInt(amountDollarsAndCents);
      }
   
   } //End calculateDollarsAndCents
   
   /************************************************************
   Method calculateTender - Calculates the amount of each tender that makes up the data entered
   ************************************************************/   
   public static void calculateTender(){
   
      hundred = cents / 10000;
      remainder = cents%10000; 
      fifty = remainder / 5000;
      remainder = cents%5000; 
      twenty = remainder / 2000;
      remainder = cents%2000; 
      ten = remainder / 1000; 
      remainder = cents%1000; 
      five = remainder / 500;
      remainder = cents%500; 
      one = remainder / 100;
      remainder = cents%100; 
      quarter = remainder / 25;
      remainder = cents%25; 
      dime = remainder / 10;
      remainder = remainder%10; 
      nickel = remainder / 5;
      remainder = cents%5; 
      penny = remainder / 1; 
      

   
   
  
   } //End calculateTender
   
   /************************************************************
   Method printOutput - Calls:
                              printHeader
                              printBody
                              PrintFooter 
   ************************************************************/   
   public static void printOutput(){
   
      printHeader();
      printBody();
      printFooter();
   
   }//End printOutput
   
   /************************************************************
   Method printHeader - Outputs:
                                 name
                                 course
                                 date
   ************************************************************/   
   public static void printHeader(){
   
      Date dateCreated = new Date();
   
      System.out.printf("\n\t%-20s","*********************MyMoney Report********************");
      System.out.printf("\n\t%-10s%-15s","Name:",name);
      System.out.printf("\n\t%-10s%-15s","Course:",course);
      System.out.printf("\n\t%-10s%-15s","Date",dateCreated);
      System.out.printf("\n\t%-20s","*******************************************************");
   
   } //End printHeader
   
   /************************************************************
   Method printBody - Prints out:
                                 Original Amount
                                 Cents
                                 Tender Type and Amount of Each
   ************************************************************/  
   public static void printBody(){
   
      System.out.printf ("\n\n\t%-30s%-1s","Original Amount:", originalAmount);
      System.out.printf ("\n\t%-30s%-1d","Original Amount in Cents:", cents);
      System.out.printf ("\n\n\t%-1s","Consists of:");
      System.out.printf ("\n\t%14d%-1s",hundred," Hundred Dollar Bills");
      System.out.printf ("\n\t%14d%-1s",fifty," Fifty Dollar Bills");
      System.out.printf ("\n\t%14d%-1s",twenty," Twenty Dollar Bills");
      System.out.printf ("\n\t%14d%-1s",ten," Ten Dollar Bills");
      System.out.printf ("\n\t%14d%-1s",five," Five Dollar Bills");
      System.out.printf ("\n\t%14d%-1s",one," One Dollar Bills");
      System.out.printf ("\n\t%14d%-1s",quarter," Quarters");
      System.out.printf ("\n\t%14d%-1s",dime," Dimes");
      System.out.printf ("\n\t%14d%-1s",nickel," Nickels");
      System.out.printf ("\n\t%14d%-1s",penny," Pennies");
   
   } //End printBody
   
   /************************************************************
   Method printFooter - Outputs the footer
   ************************************************************/   
   public static void printFooter(){
   
       System.out.printf("\n\t%-20s","************************End Report*********************");
   
   } //End printFooter
   
} //End MyMoney5