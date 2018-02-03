import java.io.*;
import java.util.Scanner;
import java.util.*;

public class MyGrades11 {
   public static void main (String [] args)throws IOException{
   //input text file
   
      File infile1 = new File ("data11A.txt"); //text lines
		Scanner scan1 = new Scanner (infile1);
      ProcessGrades11 mg1 = new ProcessGrades11("CS1302", "Fares", "Fall", 2015, "VSU", scan1, 27, 3);


		File infile2 = new File ("data11B.txt"); //text lines
		Scanner scan2 = new Scanner (infile2);
      
      ProcessGrades11 mg = new ProcessGrades11("CS1301", "Fares", "Fall", 2015, "VSU", scan2, 18, 2);

   
   }

}