//**************************************
//Purpose:	Practice with one-dimensional Array
//
//
//**************************************
import java.util.*;
public class OneDArray_10_24_2016 {
	public OneDArray_10_24_2016 (){
	}

	//***********************************
	//1. populate:	receives a one-dimensional array
	//				of type int and a second argument
	//				of type int indicating the upper
	//				range of the random values to insert
	//				in the array. The method populates the
   //          array with values from 1 to n (inclusive)
	//***********************************
	public void populate (int [] list, int n) {
      int value;
      for (int i = 0; i < list.length; i++){
         value = (int) (Math.random() * n + 1);
         list[i] = value;
      }//end of for loop
   }

	//***********************************
	//2.printOnALine:	receives a one-dimensional array
	//				of type int and prints its values
	//				on a single line
	//***********************************
	public void printOnALine (int [] list){
      System.out.println ();
      for (int i = 0; i < list.length; i++){
         System.out.print (list[i] + "\t");
      }//end of for loop
   }//end of printOnALine method

   //***********************************
	//3.printNPerLine:	receives a one-dimensional array
	//				of type int and n as the number of
   //          values to be printed per line.
	//				on a single line
	//***********************************
	public void printNPerline(int [] list, int n){
      for (int i = 0; i < list.length; i++){
         if (i%n == 0)
            System.out.println();
         System.out.print(list[i]+ "\t");
      }//end of for loop
      System.out.println();
   }

   //***********************************
	//4.sum:	receives a one-dimensional array
	//			of type int and returns the sum of its values
	//
	//***********************************
	public int sum (int [] list){
      int sum = 0;
      for (int i = 0; i < list.length; i++){
         sum += list[i];
      }
	   return sum;
	}
	//***********************************
	//5.max:	receives a one-dimensional array
	//			of type int and returns the max of its values
	//
	//***********************************
	public int max (int [] list){

	  int max = 0;
	  for (int i=0;i<list.length){
		  max = Math.max(list[], max)
	  }
      return max;
	}

	//***********************************
	//6. min:	receives a one-dimensional array
	//			of type int and returns the min of its values
	//
	//***********************************
	public int min (int [] list){
		  int min = 0;
		  for (int i=0;i<list.length){
			  max = Math.min(list[], min)
		  }
	      return min;
	}

	//***********************************
	//7.average:	receives a one-dimensional array
	//			of type int and returns the average of its values.
   //       You may use the sum method
	//
	//***********************************
	public double average (int [] list){
		return (double)sum(list/list.length);  //Update
	}

	//***********************************
	//8. found:	receives a one-dimensional array
	//			of type int and a key. returns true
	//			if key is the array, otherwise, returns false
	//
	//***********************************
	public boolean found (int [] list, int key){

		boolean result = false;
		for (i=0; i<list.length; i++){
			if (list[i] == key){
				result = true;
				break;
			}
		}

		return result;
	}


	//***********************************
	//9. computeGrade:	Receives an int array that holds the scores
	//						and another array to hold the letter grades
	//***********************************
	public void computeGrade (int [] score, char [] grade){

   }

	//***************************************
	//10. printScoresAndGrades:	Receives a score array and grade array.
	//								prints scores and grades in a table format
	//
	//***************************************
	public void printScoresAndGrades (int [] score, char [] grade){
		System.out.println();
		System.out.printf("\n\t%10s%10s","Score","Grade");
		for (i=0;i<list.length;i++){
			System.out.printf("\n\t%10d%10c",score[i],grade[i]);
		}


   }

	//***************************************************
	//11. readNamesAndScores:	receives input file, name and score arrays,
	//								Reads names and scores and stores them in name and score arrays
	//***************************************************
	public void readNamesAndScores (Scanner in, String [] name, int [] score){
      int i = 0;
      while (in.hasNext()){
        name[i] = in.next();
        score[i] = in.nextInt();
        i++;
      }
	}
	//***************************************************
	//12. displayNamesAndScores:	receives name and score arrays,
	//								Displays names and scores with appropriate
	//								labels and record numbers
	//***************************************************
	public void displayNamesAndScores (String [] name, int [] score){
      System.out.printf ("\n%-10s%-10s%10s","Number","Name","Score");
      for (int i = 0; i < name.length; i++){
         System.out.printf ("\n%-10d%-10s%10d",(i+1),name[i],score[i]);
      }


	}
	//***************************************************
	//13. displayNames_Scores_Grades:	receives name,score, and grade arrays,
	//								Displays names, scores, and grades with appropriate
	//								labels and record numbers
	//***************************************************
	public void displayNames_Scores_Grades (String [] name, int [] score, char [] grade){
		System.out.println ("13. displayNames_Scores_Grades to be implemented"); //remove when done
	}

}