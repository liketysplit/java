import java.util.*;
import java.io.*;
public class TwoDArray_11_10_2016_Test {
	public static void main (String [] args ) throws IOException {
		String [] names = new String [26];
		int [][] scores = new int [26][3];
      int [] list1 = {10, 20, 5, 7, 4};
      int [] list2 = new int [10];
      int [][] table2 = new int [3][4];
      int [][] table1 = {{2, 4, 7},
                       {10, 8},
                       {10, 8},
                       {3, 5, 12, 15, 14}};
				
		TwoDArray_11_10_2016 ae = new TwoDArray_11_10_2016();
      
		
      ae.printList(list1);
      ae.printTable(table1);
      ae.poplateList(list2, 2, 25);

   }//end of main method
}//end of class 	
		