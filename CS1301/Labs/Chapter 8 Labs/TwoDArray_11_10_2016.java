//*************************************************************
//Purpose:  Practice with two-dimensional arrays
//
//Author:   Fares
//Course:   CS1301
//Date:     11/8/2016
//Program:  TwoDArray_11_8_2016_Test.java
//*************************************************************

import java.util.*;
public class TwoDArray_11_10_2016{
	public TwoDArray_11_10_2016(){
	}
      
	public void printList (int [] a){
         System.out.println();
			for (int i = 0; i < a.length ;i++)
            System.out.print( a[i] + "\t");

			
	} 

   

	public void printTable (int [][] a){
      
      System.out.println();
      for(int i =0; i < a.length; i++)
            for(int j =0; j < a[i].length; j++)
               System.out.print(a[i][j] + "\t");
   
   }
   
	public void poplateList (int[] a, int m, int n){
   
   Random test = new Random();
   System.out.println();
   
   int range = n - m + 1;
   
   
      for(int i =0; i < a.length; i++){
         
            int value = test.nextInt(range) + m;
            a[i] = value;
         
      }//End for
   }

   
   }