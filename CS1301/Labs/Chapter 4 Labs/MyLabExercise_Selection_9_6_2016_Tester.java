//************************************************
//Purpose:  creates objects of MyLabExercise_Selection_9_6_2016 class
//          and invokes some of its methods.
//Input:    None
//Output:   
//Author:   
//Course:   CS1301
//Date:     9/6/2016
//
//Program:  
//************************************************

public class MyLabExercise_Selection_9_6_2016_Tester {
	public static void main (String [] args) {
		//1. Create an object of MyLabExercise_Selection_9_6_2016 no-argument constructor
      MyLabExercise_Selection_9_6_2016 m1 = new MyLabExercise_Selection_9_6_2016();
		//Print what the toString method returns for m1 object
      System.out.println ("\n\t1.\tm1 object" + m1.toString());
      
      //2. Create a second object of MyLabExercise_Selection_9_6_2016 
      //with "John Smith" and "CS1301"
      MyLabExercise_Selection_9_6_2016 m2 = new MyLabExercise_Selection_9_6_2016("John Smith","CS 1301");
		//Print what the toString method returns for m2 object
      System.out.println ("\n\t2.\tm2 object" + m2.toString());
      
      //3. Invoke the max method and prints numbers and max
      System.out.println ("\n\t3.\tLargest of 3 and 7 is:\t" + m2.max(3,7));
      
      //4. Invoke the min method and prints numbers and min
      System.out.println ("\n\t4.\tSmallest of 3 and 7 is:\t" + m2.min(3,7));
      
      //5-6. Invoke the isEven method and prints number and result
      System.out.println ("\n\t5.\tIs 3 even?             \t" + m2.isEven(3));
      System.out.println ("\n\t6.\tIs 6 even?             \t" + m2.isEven(6));

      //7-9. Invoke the isLetter method and prints symbol and result
      System.out.println ("\n\t7.\tIs 'B' letter?         \t" + m2.isLetter('B'));
      System.out.println ("\n\t8.\tIs 'a' letter?         \t" + m2.isLetter('a'));
      System.out.println ("\n\t9.\tIs '3' letter?         \t" + m2.isLetter('3'));

      //10-12. Invoke the getMonthName method and prints number and result
      System.out.println ("\n\t10.\tMonth 3 name is:       \t" + m2.getMonthName(3));
      System.out.println ("\n\t11.\tMonth 12 name is:      \t" + m2.getMonthName(12));
      System.out.println ("\n\t12.\tMonth 15 name is:      \t" + m2.getMonthName(15));

      //13-15. Invoke the getStatus method and prints status name and result
      System.out.println ("\n\t13.\tFreshman Status is:    \t" + m2.getStatus ("Freshman"));
      System.out.println ("\n\t14.\tSenior Status is:      \t" + m2.getStatus ("Senior"));
      System.out.println ("\n\t15.\tNot Yet Status is:     \t" + m2.getStatus ("Not Yet"));
    }
}