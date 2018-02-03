//*************************************************************
//Purpose:  Practice with two-dimensional arrays
//
//Author:   Fares
//Course:   CS1301
//Date:     11/8/2016
//Program:  TwoDArray_11_8_2016_Test.java
//*************************************************************

import java.util.*;
public class TwoDArray_11_8_2016{
	public TwoDArray_11_8_2016(){
	}
	
   //*****************************
	//1. Write a method that accepts 
	//	  an input file, a one-dimensional array
   //   of type string.
   //   The method reads from input file records
   //   of names and two scores. It stores names into the names
   //   array, scores into the scores array. Method checks for
   //   end of file and full array. 
	//******************************
      
	public void readNamesAndScores (Scanner input, String [] names,
	                          int [][] s) {
         int r = 0;
         while (input.hasNext() && r < names.length){
				names[r] = input.next();
				for (int c = 0; c < s[r].length;c++)
					s[r][c] = input.nextInt();
            r++;
			}
	} 

   
	//*****************************
	//2. Write a method that accepts 
	//	  a one-dimensional array of type 
	//	  String. to display names one per line
	//******************************
	public void displayNames (String [] names){
      
      System.out.println();
      System.out.printf("\n\t%-10s%-20s" , "Number" , "Names");
      for(int i =0; i < names.length; i++)
         System.out.printf("\n\t%-10d%-20s", (i+1) , names[i]);
   
   }

   
   //*****************************
	//3. Write a method that accepts 
	//	  a two dimensional array of type 
	//	  integer. to display scores one row per line
	//******************************
	public void displayScores (int [][] scores){
      
      System.out.println();
      System.out.printf("\n%10s%10s%10s" , "Test 1" , "Test 2","Test 3");
      for(int i =0; i < scores.length; i++){
         System.out.println();
         for (int j =0; j < scores[i].length; j++)
            System.out.printf("%10d", scores[i][j]);
	   }
   }
   
   //*****************************
	//4. Write a method that accepts 
	//	  a two dimensional array of type 
	//	  integer. Compute and return the 
   //   sum of all values in the array.
	//******************************
	public int sum (int [][] a){
   
      int sum = 0;
      System.out.println();
      for(int i =0; i < a.length; i++){
         for (int j =0; j < a[i].length; j++)
            sum+=a[i][j];
	   } 
      
      return sum;  
	}

   //*****************************
  //	 5. Write a method that accepts 
  //	  a two dimensional array of type 
  //	  integer. Find and return the 
  //   largest value in the array.
  //******************************
	public int max (int [][] a){
     
      int max = a[0][0];
      System.out.println();
      for(int i =0; i < a.length; i++){
         for (int j =0; j < a[i].length; j++)
            if(a[i][j] > max)
               max = a[i][j];
	   } 
      
      return max; 
   }

   //*****************************
	//6. Write a method that accepts 
	//	  a two-dimensional array of type integer, 
   //   computes and returns the sum of all even values
	//******************************
	public int sumOfEvenValues (int [][] list){
   
      int sumOfEven = 0;
      System.out.println();
      for(int i =0; i < list.length; i++){
         for (int j =0; j < list[i].length; j++)
            if(list[i][j] % 2 == 0)
               sumOfEven += list[i][j];
	   } 
      
      return sumOfEven;
   }

}