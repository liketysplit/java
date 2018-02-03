

import java.util.*;
import java.io.*;
public class TwoDArray_11_8_2016_Test {
	public static void main (String [] args ) throws IOException {
		String [] names = new String [26];
		int [][] scores = new int [26][3];
      int [][] list = {{2, 4},
                       {7, 10, 15},
                       {11},
                       {20, 12, 6, 8, 9}};
				
		Scanner input = new Scanner (new File ("data11.txt"));
		PrintWriter output = new PrintWriter ("out.txt");
		TwoDArray_11_8_2016 tdo = new TwoDArray_11_8_2016();
		tdo.readNamesAndScores(input, names,scores);
      tdo.displayNames(names);
      tdo.displayScores(scores);
      System.out.printf ("%n%n\tThe sum of all values is:\t         %10d",tdo.sum(list));
      System.out.printf ("%n%n\tThe largest value in the array is:\t%10d%n",tdo.max(list));
      System.out.printf ("%n%n\tThe sum of even values in arrays is:\t%10d%n",tdo.sumOfEvenValues(list));

   }//end of main method
}//end of class 	
		