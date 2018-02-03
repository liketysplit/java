//*************************************
//Purpose:  Computing BMI
//
//*************************************
import java.util.Scanner;
public class ComputeBMI{
   //**********************************
   //main method
   //**********************************
   public static void main (String [] args){
      //Declarations
      final double KG_POUND = 0.45359237;
      final double M_INCH   = 0.0254;
      double height; //in inches
      double weight; //in pounds
      double BMI;
      Scanner scan = new Scanner (System.in);
      String message;
      
      //Reading height and weight
      System.out.print ("\tEnter weight in pounds:   \t");
      weight = scan.nextDouble();
      System.out.print ("\tEnter height in inches:   \t");
      height = scan.nextDouble();
         
      //calculate BMI
      BMI =  ((weight * KG_POUND)/ ((height * M_INCH) * (height * M_INCH))); 
      
      //Display BMI recommendation
      if (BMI < 18.5)
         message = "Underweight";
      else if (BMI < 25)
         message = "Normal";
      else if (BMI < 30)
         message = "Overweight";
      else
         message = "Obese";
         
      System.out.printf ("\n\t%-30s%10.2f","Weight:",weight);
      System.out.printf ("\n\t%-30s%10.2f","Height:",height);
      System.out.printf ("\n\t%-30s%10.2f","BMI:",BMI);
      System.out.printf ("\n\n\t%-30s%-10s","status:",message);
   }//end of main method
}//end of class