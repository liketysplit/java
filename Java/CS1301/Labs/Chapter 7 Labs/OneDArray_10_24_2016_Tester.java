//****************************************
//Purpose:  Practice with one dimensioal array
//
//
//*****************************************
public class OneDArray_10_24_2016_Tester{
   public static void main (String [] args){
      //1.  Declarations
      int [] list1 = {10, 5, 7, 20};
      int [] list2 = new int [10];
      int [] scores = {95, 88, 23, 70, 60, 100, 42};
      char[] grades  = {'A''B''F''C''D''A''F'};
      //2.  Create an object of OneDArray_10_24_2016 class
      OneDArray_10_24_2016 one = new OneDArray_10_24_2016();

      //3.  populate list2 with random values 1 to 15
      one.populate(list2, 15);

      //4.  display list2
      one.printOnALine(list2);

      //5.  display list1
      one.printOnALine(list1);

      //6.  display list2 4 items per line
      one.printNPerline (list2, 4);

      //7.  display the sum of list1
      System.out.println ("The sum of list1 is:\t" + one.sum(list1));

       //8.  display the sum of list2
      System.out.println ("The sum of list2 is:\t" + one.sum(list2));

      //9.  display the max of list2
      System.out.println ("The max of list2 is:\t" + one.max(list2));

      //10.  display the min of list2
      System.out.println ("The min of list2 is:\t" + one.min(list2));

      //11.  display the average of list2
      System.out.println ("The average of list2 is:\t" + one.average(list2));

      //12.  Check for 17 in List2
      System.out.println ("17 is in list2:\t" + one.found(list2,17));

      //13.  Check for 17 in List2
      System.out.println ("1 is in list2:\t" + one.found(list2,1));

      //14.  Display Scores & Grades
      one.printScoresAndGrades(scores,grades);



   }//end of main method
}//end of class