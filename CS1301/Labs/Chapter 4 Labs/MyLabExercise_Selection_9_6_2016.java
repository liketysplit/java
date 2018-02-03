//************************************************
//Purpose:  Implement a number of methods that
//          uses selection
//Input:    None
//Output:   
//Author:   
//Course:   CS1301
//Date:     9/6/2016
//
//Program:  
//************************************************
import java.util.*;
public class MyLabExercise_Selection_9_6_2016{
   
   //Declarations
   private String name = "Unknown";
   private String course = "TBA";
   private Date dateCreated;
   
   //*********************************************
   //no-argument constructor. it gets and 
   //          assigns System's date to dateCreated 
   //*********************************************
	public MyLabExercise_Selection_9_6_2016(){
      dateCreated = new Date();
	}//end of constructor
		
   //*********************************************
   //overloaded constructor. it receives name and 
   //          course. It assigns name and course
   //          to name and course and  System's date
   //*********************************************
	public MyLabExercise_Selection_9_6_2016(String newName, String newCourse){
      name = newName;
      course = newCourse;
      dateCreated = new Date();
	}//end of constructor

   //*********************************************
   //max. it receives two intgers and returns the largest 
   //*********************************************
   public int max (int m, int n){
   
      System.out.println ("\n\tmax method to be implemented"); //remove when implemented
      
      return -1;  //update this
   
   }//end of max   

   //*********************************************
   //min. it receives two intgers and returns the smallest 
   //*********************************************
   public int min (int m, int n){
       System.out.println ("\n\tmin method to be implemented"); //remove when implemented
      
      return -1;  //update this

   }//end of min   

	//*********************************************
   //isEven. it receives a number and returns true
   //        if value is even, otherwise, it returns false 
   //*********************************************
   public boolean isEven (int value){
       System.out.println ("\n\tisEven method to be implemented"); //remove when implemented
      
      return false;  //update this
   }//end of isEven   

   //*********************************************
   //isLetter. it receives a character and returns true
   //          the charcters is a letter, otherwise, 
   //          it returns false 
   //*********************************************
   public boolean isLetter (char symbol){
       System.out.println ("\n\tisLetter method to be implemented"); //remove when implemented
      
      return false;  //update this
   }//end of isLetter
   
   //*********************************************
   //getMonthName. it receives a month number 
   //          (1, 2, ..., or 12) and returns January,
   //          February, ..., or December.
   //          if number <1 or > 12, it returns invalid 
   //*********************************************
   public String getMonthName (int m){
      System.out.println ("\n\tgetMonthName method to be implemented"); //remove when implemented
      
      return "TBI";  //update this
   }//end of getMonthName
   
   //*********************************************
   //getStatus. it receives a status name 
   //          ("Freshmen", "Sophomore", "Junior", or 
   //          "Senior") and returns 1, 2, 3, or 4.
   //          if number <1 or > 4, it returns -1 
   //*********************************************
   public int getStatus (String status){
       System.out.println ("\n\tgetStatus method to be implemented"); //remove when implemented
      
      return -1;  //update this
   }//end of getStatus
   
   //*********************************************
   //toString. it receives nothing and returns 
   //          a string of all values of the
   //          data fields name, course, and dateCreated 
   //*********************************************
   public String toString(){
      String result;
      result = "\n\tName:     \t" + name +
               "\n\tCourse:   \t" + course +
               "\n\tDate:     \t" + dateCreated;
      return result;
   }//end of toString
   
}