/************************************************************
Purpose:  Test Methods
         
Author:   Rick Boles

Date:     10/18/2016

Course:   CS1301 A

Program:  MathOperations.java
************************************************************/
public class MathOperations{

   //***********************
   //No Argument Constructor
   //***********************
   public MathOperations(){
   
   }//End MathOperations

   //***********************
   //min: Recieves three double vaules and returns the smallest of them
   //***********************
   
   public double min (double a, double b, double c){
   
   return Math.min(Math.min(a,b),c);
   
   }//End min
   
   //***********************
   //max: Recieves three double vaules and returns the largest of them
   //***********************
   
   public double max (double a, double b, double c){
   
   return Math.max(Math.max(a,b),c);
   
   }//End max
   
   //***********************
   //average: Recieves three double vaules and returns the average
   //***********************
   
   public double average (double a, double b, double c){
   double average = (a+b+c)/3;
   return average;
   
   }//End average
   
   //***********************
   //min4: Recieves three double vaules and returns the smallest of them
   //***********************
   
   public double min (double a, double b, double c, double d){
   
   return Math.min(Math.min(Math.min(a,b),c), d);
   
   }//End min
   
   //***********************
   //max: Recieves three double vaules and returns the largest of them
   //***********************
   
   public double max (double a, double b, double c, double d){
   
   return Math.max(Math.max(Math.max(a,b),c), d);
   
   }//End max
   
   //***********************
   //average: Recieves three double vaules and returns the average
   //***********************
   
   public double average (double a, double b, double c, double d){
   double average = (a+b+c+d)/4;
   return average;
   
   }//End average
} //End of MathOperations