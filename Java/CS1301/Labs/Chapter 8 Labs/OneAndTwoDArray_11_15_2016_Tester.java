//******************************************************************************
//Purpose:  Practice with one and two dimensional arrays
//
//******************************************************************************

import java.util.*;
import java.io.*;
public class OneAndTwoDArray_11_15_2016_Tester {
	public static void main (String [] args ) throws IOException {
   
      //1.  Define a one-d array list1 of type integer
         int [] list1 = new int[10];
      //2.  Define two_ array table1 of type integer
         int [][] table1 = new int [5][8];
      //3.  define and populate oneD array list2 of type integer
         int [] list2 = {3, 10, 5, 20, 7, 11};
      //4.  Define and populate TwoD array table2 of type integer
         int [][] table2 = {{10, 5},
                            {4, 7, 11},
                            {3, 6, 11, 2},
                            {17}};
      //4.1
         int [] score = {95, 23, 66, 70, 80, 90}; 
         char [] grade = new char [score.length];
      //5.  Create an object of OneAndTwoArray_11_15_2016
         OneAndTwoDArray_11_15_2016 ot = new OneAndTwoDArray_11_15_2016();
   
      //6.  Invoke the populate method to populate list1
         ot.populate(list1, 2, 50);
      //7   Display list1
         ot.printOnALine(list1);
      //8.  Display list2 one values per line
         ot.printNPerline(list2, 1);
      //9.  Display the sum of list1
         System.out.println(" The sum of list1 is:\t" + ot.sum(list1));
      //10.  Display the sum of list1
         System.out.println(" The sum of list2 is:\t" + ot.sum(list2));
  
      //11.  invoke other methods in OneAndTwoDArray_11_15_2016 class
      
      
         System.out.println(" The max of list2 is:\t" + ot.max(list2));
         System.out.println(" The min of list2 is:\t" + ot.min(list2));
         System.out.printf("%-20s%-4.2f"," The average of list2 is:\t" , ot.average(list2));
         
         ot.computeGrade(score, grade);
         ot.printScoresAndGrades(score, grade);
         
   }//end of main method
}//end of class 	
		