//********************************************************************************
//Purpose:
//
//Author:
//                Document class and methods
//Course:
//
//Date:
//
//Program:
//********************************************************************************

import java.util.Scanner;
public class MyCourse9 {
   //Declarations
   private String courseName;
   private String instructorName;
   private int numberOfStudents;
   private String school;
   private String semester;
   private int year;
   private String [] names;
   private int [] scores;
   private char [] grades;
   private double testAverage;
   private int lowestScoreIndex;
   private int highestScoreIndex;
   
   //Constructor MyCourse9
   public MyCourse9 (Scanner scan){
       
      //read in information from txt file
      courseName = scan.nextLine();
      instructorName = scan.nextLine();
      this.numberOfStudents = scan.nextInt();
      this.school = scan.next();
      this.semester = scan.next();
      this.year = scan.nextInt();
                 
      //declaring needed arrays
      names = new String [numberOfStudents];
      scores = new int [numberOfStudents];
      grades = new char [numberOfStudents];
      
      
      //reading students records
      for (int i = 0; i < numberOfStudents; i++){
         names [i] = scan.next();
         scores[i] = scan.nextInt();
         
      }//end of for
      
      //Invoke the following methods 
      
      
      computeGrades();
      computeTestAverage ();
      findStudentWithHighestTotal();
      findStudentWithLowestTotal();
      
      //Prints output
      displayOutput();
      
   } // End MyCourse9
   
   //Method to create a letter grade based on scores and store them in the grades array
   public void computeGrades (){
      for (int i = 0; i < scores.length; i++)
         
         if (scores[i] >= 90)
            grades[i] = 'A';
         else if (scores[i] >= 80 && scores[i] < 90)  
            grades[i] = 'B';
         else if (scores[i] >= 70 && scores[i] < 80)
            grades[i] = 'C';
         else if (scores[i] >= 60 && scores[i] < 70)
            grades[i] = 'D';
         else 
            grades[i] = 'F';           
   } //End computeGrades

   //Method to get the test average
    public void computeTestAverage(){
    
      int sum = 0;
      
      for (int i = 0; i < scores.length; i++)
         sum += scores[i];
         
      testAverage = (double)sum / scores.length;
    }// End computeTestAverage
    
   //Method to find the higheest total
   public void findStudentWithHighestTotal(){
      int max = 0;
      for (int i = 0; i < scores.length; i++)
      if(scores[i] > max){
         max = scores[i];
         highestScoreIndex = i;
      }//End for loop
    
    
   } //End findStudentWithHighestTotal
   
   // Calculates lowest total
   public void findStudentWithLowestTotal(){
      int min = 101;
      for (int i = 0; i < scores.length; i++)
      if(scores[i] < min){
         min = scores[i];
         lowestScoreIndex = i;
      } //End for loop
          
   } //End findStudentWithLowestTotal
   
   //Method that combines displayHeader, displayFooter, and displayStudentRecords
   public void displayOutput(){
   
      displayHeader();
      displayStudentsRecords ();
      displayFooter ();
   } //End displayOutput
   
   //Display Header
   public void displayHeader(){
      System.out.printf("\n\t%-20s","**********************MyCourse9 Report***********************************************");
      System.out.printf("\n\t %-20s %-15s","Course Name:",courseName);    
		System.out.printf("\n\t %-20s %-15s","Instructor's Name:",instructorName);     
		System.out.printf("\n\t %-20s %-15s","Semester:",semester);      
		System.out.printf("\n\t %-20s %-15d","Year:",year);      
		System.out.printf("\n\t %-20s %-15s","School:",school);       
      System.out.printf("\n\t%-20s","*************************************************************************************\n");  
   } //End Display Header

   // Start displayStudentsRecords
   public void displayStudentsRecords(){
      
      //display labels
      System.out.printf  ("\n%10s %-15s %-15s %-15s","Number","  Name", " Score", "Grade");
        
      //display students records
      for (int i = 0; i < scores.length; i++){
         System.out.printf ("\n\t%-10s%-15s%-15d%-15c"," "+(i+1),names[i],scores[i],grades[i]); 
      } 
      
      
   }// End displayStudentsRecords
   
   
   //Start displayFooter
   public void displayFooter (){
      System.out.println();
      System.out.printf ("\n\t%-15s %-15.2f", "Average Score:", testAverage);
      System.out.println();
      System.out.printf ("\n\t%10s","Student with the Highest Grade");
      System.out.printf ("\n\t%-15s %-15d %-15c",names[highestScoreIndex],scores[highestScoreIndex],grades[highestScoreIndex]);      
      System.out.println();
      System.out.printf ("\n\t%10s","Student with the Lowest Grade");
      System.out.printf ("\n\t%-15s %-15d %-15c",names[lowestScoreIndex],scores[lowestScoreIndex],grades[lowestScoreIndex]);
      System.out.println();
      System.out.printf("\n\t%-20s","*************************************************************************************\n");  
   }// end of displayFooter
 
   
}//end of class