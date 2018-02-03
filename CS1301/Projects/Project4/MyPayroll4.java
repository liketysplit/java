/************************************************************
Purpose:  Compute Gross and Net income
          Compute State and Federal Taxes
          Compute Overtime and Regulartime Wages
          
Input:    Name, Course, Hourly Rate, Hours Worked, Federal Tax Rate, and State Tax Rate

Output:   Name, Course, Date, Hourly Rate, Hours Worked, Federal Tax Rate, State Tax Rate,
          Gross Income, Net Income, State Taxes, and Federal Taxes

Author:   Rick Boles

Date:     8/31/2016

Course:   CS1301 A

Program:  MyPayroll4.java
************************************************************/

import java.util.Scanner;
import java.util.Date;

public class MyPayroll4 { // Start MyPayroll4 - Declare staic vairables


   private static double overtimeWages, overtimeHours, hourlyRate, hoursWorked, federalTaxRate, stateTaxRate, grossWages, netWages, regularHours, regularWages, stateTaxAmount, federalTaxAmount;
   final static double OVERTIME_RATE = 1.5;
   public static String name;
   public static String course;
   
   /************************************************************
   Method main - Calls in readData calculations printOutput
   ************************************************************/
   
   public static void main (String [] args){
   
      readData();
      calculations();
      printOutput();
      
   } //End main

   /************************************************************
   Method readData - Gets  name, course, hours worked, hourly rate, 
                     federal tax rate, and state tax rate
   *************************************************************/
   
   public static void readData() {
   
      Scanner input = new Scanner(System.in);
   
      System.out.print ("\tName:");
      name = input.nextLine();
      System.out.print ("\tCourse:");
      course = input.nextLine();
      System.out.print ("\tHours Worked:");
      hoursWorked = input.nextDouble();
      System.out.print ("\tHourly Rate:");
      hourlyRate = input.nextDouble();
      System.out.print ("\tFederal Tax Rate:");
      federalTaxRate = input.nextDouble();
      System.out.print ("\tState Tax Rate:");
      stateTaxRate = input.nextDouble();
      

   
   } //End readData

   /************************************************************
   Method calculations - Calculates:
                                    Overtime wages and hours
                                    Regular wages and hours
                                    Gross and Net Wages
                                    State and Federal Tax Amounts
   *************************************************************/
   
   public static void calculations() {
    
      overtimeHours = (hoursWorked>40?(hoursWorked-40):0);
      overtimeWages = OVERTIME_RATE * overtimeHours * hourlyRate;
      regularHours = (hoursWorked>=40?40:hoursWorked);
      regularWages = hourlyRate * regularHours;
      grossWages = regularWages + overtimeWages;      
      stateTaxAmount = (grossWages * stateTaxRate)/100;
      federalTaxAmount = (grossWages * federalTaxRate)/100;
      netWages = grossWages - federalTaxAmount - stateTaxAmount;
      
   } // End calculations
   
   /************************************************************
   Method printOutput - Calls the printHeader, printFooter
                        Outputs data from readData and calculations 
   *************************************************************/
   
    public static void printOutput() {
   
      printHeader();
      
      System.out.printf("\n\t%-20s%35s","Line Item","Amount");
      System.out.printf("\n\t%-20s","*******************************************************");
      System.out.printf("\n\t%-20s%35.2f","Hours Worked:",hoursWorked);
      System.out.printf("\n\t%-20s%35.2f","Hourly Wages Rate:",hourlyRate);
      System.out.printf("\n\t%-20s%34.2f%1s","Federal Tax Rate:",federalTaxRate,"%");
      System.out.printf("\n\t%-20s%34.2f%1s","State Tax Rate:",stateTaxRate,"%");
      System.out.printf("\n\t%-20s%35.2f","Regular Wages:",regularWages);
      System.out.printf("\n\t%-20s%35.2f","Overtime Wages: ",overtimeWages);
      System.out.printf("\n\t%-20s%35.2f","Gross Wages:",grossWages);
      System.out.printf("\n\t%-20s%35.2f","Federal Taxes:",federalTaxAmount);
      System.out.printf("\n\t%-20s%35.2f","State Taxes:",stateTaxAmount);
      System.out.printf("\n\t%-20s%35.2f","Net Wages:",netWages);               
	          	
      printFooter();
      
   } //End printOutput

   
   /************************************************************
   Method printHeader - Outputs the name, course, and date
   *************************************************************/
   
    public static void printHeader() {
   
      Date dateCreated = new Date();
   
      System.out.printf("\n\t%-20s","*********************Payroll Report********************");
      System.out.printf("\n\t%-10s%-15s","Name:",name);
      System.out.printf("\n\t%-10s%-15s","Course:",course);
      System.out.printf("\n\t%-10s%-15s","Date",dateCreated);
      System.out.printf("\n\t%-20s","*******************************************************");
      
   } //End printHeader
   
   /************************************************************
   Method printFooter - Outputs the footer
   *************************************************************/

    public static void printFooter() {
   
      System.out.printf("\n\t%-20s","************************End Report*********************");
   
   } //End printFooter
}