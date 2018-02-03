import java.util.Scanner;
public class Loop_Questions_9_27_2016
{
   //default constructor
   public Loop_Questions_9_27_2016(){
   
   }
   
   public void q1 (int n)
   {
      System.out.println ("\n\tq1 Method Output\n\t"); 
      //Display on a single line
      for (int i=1; i<=n; i++)
      System.out.print(i);
      
      System.out.println();
      
      //Display on seperate lines
      for (int i=1; i<=n; i++)
      System.out.println(i);
      
      
      //1.  Write a while loop to display all integer values from 1 to 5, inclusive.
      //    a. on a single line
      //    b. on seperate lines.
      
      System.out.println ("\n\tq1 Method Output End\n\t");  //remove this line when implemented
   }//end of q1
   
   public void q2(int n)
   {
      //2.  Write a while loop to display all integer values from 5 to 1, inclusive.
      System.out.println ("\n\tq2 Method Output\n"); 
      int i =  n;
      while (i >= 1){
      System.out.print (i + "\t");
      i--;
      }
      System.out.println();
      i = n;
      while (i >= 1){
      System.out.println(i);
      i--;
      }
      System.out.println ("\n\tq2 Method Output End\n");
   }//end of q2
   
   public void q3(int n)
   {
      System.out.println ("\n\tq3 Method Output\n"); 
      int i = 1;
      int sum = 0;
      while (i <= n){
      sum += i;
      i++;
      }
      System.out.println (sum);   
      System.out.println ("\n\tq3 Method Output End\n");   
      //3.  Write a while loop to compute the sum of all integer values from to 1 to 5, inclusive.
      //    Display the sum


   }//end of q3
   
   public void q4()
   {
      //4.  Use a for loop to implement 1, 2, and 3
       System.out.println ("\tq4 method should be implemented");  //remove this line when implemented

   }//end of q4
   public void q5(int n)
   {
       System.out.println ("\n\tq5 Method Output\n");   

      for (int i = 0; i <= n; i++){
         if (i%2 == 0)
            System.out.print (i + "\t");
      
      }
      System.out.println();
      System.out.println ("\n\tq5 Method Output End\n");      

   }//end of q5
   
   
   public int q6(int m, int n)
   {      
      int sum = 0;  
      for (int i = m; i<=n; i++)
         
         if (i%2!=0)
            sum += i;
         
      return sum;   
   
      

   }//end of q6
   
   public void q7(int n)
   {
      System.out.println ("\n\tq7 Method Output");      
      //7.  Write the code that uses looping to print the following table of values
      //    
      //    Hints:
      //    Use the following line of code to print out the heading of the table:
      //    System.out.println( "N\t10*N\t100*N\t1000*N\n" );
      //	   You should use one more print statement inside a while loop to print the rest of the table.


      //    N     N * 10   N * 100  N * 1000
      //    
      //    1     10       100      1000
      //    2     20       200      2000
      //    .     .        .        .
      //    5     50       500      5000
      System.out.printf ("\n\t%10s%10s%10s%10s","N","N * 10","N * 100","N * 1000");
      for (int i=1; i <= n; i++)
      System.out.printf ("\n\t%10d%10d%10d%10d",i,i * 10,i * 100,i * 1000);      

      System.out.println ("\n\n\tq7 Method Output End\n");      

   }//end of q7
   
   public void q8 ()
   {
      //8.  Write an application that uses a loop with only the output statements

      //    System.out.print( "* " ); 
      //    System.out.print( " " ); 
      //    System.out.println();

      //    to display in the command window the checkerboard pattern that follows:
      //
      //    * * * * * *
      //     * * * * * *
      //    * * * * * *
      //     * * * * * *
      //    * * * * * *

      System.out.println ("\tq8 method should be implemented");  //remove this line when implemented

   }//end of q8
   
   public void q9()
   {
      //9.  Write a Java application that uses a loop to read in 10 numbers and calculates and prints their sum.

      System.out.println ("\tq9 method should be implemented");  //remove this line when implemented

   }//end of q9
   
   public void q10 ()
   {
      //10. Write a Java application that inputs an integer and uses an if statement to determine whether 
      //    the integer is even and, if it is, prints that number.

      System.out.println ("\tq10 method should be implemented");  //remove this line when implemented

   }//end of q10
   

   public void q11()
   {
      //11. Write a Java application that inputs an integer and uses an if…else statement to determine 
      //    whether the integer is odd or even. If it is odd, print the number followed by "is odd"; 
      //    if it is even, print the number followed by "is even".

      System.out.println ("\tq11 method should be implemented");  //remove this line when implemented

   }//end of q11
   
   public void q12()
   {
      //12. Write a Java application that uses a counter-controlled loop to sum the integers in the range 1–10, 
      //    then compute the average of those numbers (as an integer value). Display the sum and the average.
      System.out.println ("\tq12 method should be implemented");  //remove this line when implemented

   }//end of q12
   
   public void q13()
   {
   
      //13. Modify your solution to Coding Exercise 12 so that a user can specify the range of numbers to average.
      
      System.out.println ("\tq13 method should be implemented");  //remove this line when implemented

   }//end of q13
}//end of class Loop_Questions_9_27_2016
