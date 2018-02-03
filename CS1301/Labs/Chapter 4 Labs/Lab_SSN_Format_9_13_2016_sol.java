//******************************************************************
//Purpose:  Prompts user to enter a Social Security number in the 
//          form DDD-DD-DDDD, where is a digit. Program should 
//          check whether the input is valid.
//
//Input:    A SSN
//Output:   SSN and a message stating valid or invalid
//
//
//******************************************************************

//1. Import the package that has the Scanner class
import java.util.Scanner;
public class Lab_SSN_Format_9_13_2016_sol{
   //***************************************************************
   //main method: 
   //***************************************************************
    public static void main(String[] args) {
       //Declarations
       //2. Create a Scanner object 
       Scanner scan = new Scanner (System.in);     
       //3. Declare a variable to hold the Social Security number. name it ssn
       String SSN_String;
       
       //4. Declare a variable isValid of type boolean to hold the result of verifications below
       boolean isValid;
       //5. Read Social Security number as a string and save it in ssn 
       System.out.println ("Enter a Social Security number in the form of");
       System.out.print ("DDD-DD-DDDD  where D is a digit:\t");
       SSN_String = scan.nextLine();
     
       //6. Verify that Social Security number is in the format DDD-DD-DDDD, where D is a digit
       //   a. You may verify the length of string entered (11)
       //   b. Verify that the first three characters are digits. You may use Character.isDigit method
       //   c. Verify that the fourth character is '-', 
       //   d. apply step (c) and (d) for the rest.
       int size = SSN_String.length();
       isValid = ((size == 11)&&
                 (Character.isDigit(SSN_String.charAt(0)))&&
                 (Character.isDigit(SSN_String.charAt(1)))&&
                 (Character.isDigit(SSN_String.charAt(2)))&&
                 (SSN_String.charAt(3)== '-')&&
                 (Character.isDigit(SSN_String.charAt(4)))&&
                 (Character.isDigit(SSN_String.charAt(5)))&&
                 (SSN_String.charAt(6)== '-')&&
                 (Character.isDigit(SSN_String.charAt(7)))&&
                 (Character.isDigit(SSN_String.charAt(8)))&&
                 (Character.isDigit(SSN_String.charAt(9)))&&
                 (Character.isDigit(SSN_String.charAt(10))));

      //7.  if isValid is true display the ssn and a valid message, otherwise,
      //    display the ssn and invalid message
      if (isValid)
         System.out.printf ("\n\t%-20s%-30s",SSN_String, "Is valid");
      else
         System.out.printf ("\n\t%-20s%-30s",SSN_String, "IS NOT VALID");
         
      //8.  Use the substring method
      String str1 = SSN_String.substring(0,3);
      String str2 = SSN_String.substring(4,6);
      String str3 = SSN_String.substring(7);
     
      System.out.printf ("\n\t%-20s%-30s","Scale","0123456789012345");
      System.out.printf ("\n\t%-20s%-30s","Original String",SSN_String);
      System.out.printf ("\n\t%-20s%-30s","str1",str1);
      System.out.printf ("\n\t%-20s%-30s","str2",str2);
      System.out.printf ("\n\t%-20s%-30s","str3",str3);


   }
}