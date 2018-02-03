/************************************************************
Purpose:  Test Methods
         
Input:    

Output:   

Author:   Rick Boles

Date:     10/18/2016

Course:   CS1301 A

Program:  MathOperations_Tester.java
************************************************************/
import java.util.*;

public class MathOperations_Tester{


   //***********************
   //main Method
   //***********************
   public static void main (String [] args){
   
      Scanner input = new Scanner (System.in);
      double one,two,three, four;
   
      //Create an object of MathOperations
      MathOperations mo = new MathOperations();
   
       
      System.out.printf("%s\n", "To quit press <Ctrl> + Z then press Enter");
      System.out.printf("\n%s", "Or enter first number:");
         
      while (input.hasNext()){
   
         one = input.nextDouble();
         System.out.print("Enter second number: ");
         two = input.nextDouble();
         System.out.print("Enter third number: ");
         three = input.nextDouble();
   
         System.out.printf("Minimum is %f\n",mo.min(one,two,three));
         System.out.printf("Maximum is %f\n",mo.max(one,two,three));
         System.out.printf("Average is %f\n",mo.average(one,two,three));
         System.out.println();    
         System.out.printf("%s\n", "To quit press <Ctrl> + Z then press Enter");
         System.out.printf("%s\n", "Or enter first number:"); 
      }
      
     while (input.hasNext()){
   
         one = input.nextDouble();
         System.out.print("Enter second number: ");
         two = input.nextDouble();
         System.out.print("Enter third number: ");
         three = input.nextDouble();
         System.out.print("Enter fourth number: ");
         four = input.nextDouble();
         
   
         System.out.printf("Minimum is %f\n",mo.min(one,two,three,four));
         System.out.printf("Maximum is %f\n",mo.max(one,two,three,four));
         System.out.printf("Average is %f\n",mo.average(one,two,three,four));
         System.out.println();    
         System.out.printf("%s\n", "To quit press <Ctrl> + Z then press Enter");
         System.out.printf("%s\n", "Or enter first number:"); 
      }

      
   
   }//End main Method


}//End of MathOperations_Tester