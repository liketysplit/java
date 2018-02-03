//*********************************************************************************
//Purpose:  Handles scores with varible number of students and number of tests
//
//Author:
//
//...         Document class and methods
//
//**********************************************************************************
import java.util.Scanner;
public class ProcessGrades11 {
   //Declarations
   private String courseName;       //course name
   private String instructorName;   //instructor's name
   private int numberOfStudents;    //number of students in class
   private int numberOfTests;       //number of tests
   private String school;           //school name
   private String semester;         //semester
   private int year;                //year
   private String [] names;         //names of students
   private int [][] scores;         //scores of students
   private int [] studentTotals;    //student total score
   private char [] grades;          //student grades
   private double [] testsAverages; //test averages
   private int lowestScoreIndex;    //index of student with lowest total
   private int highestScoreIndex;   //index of student with highest total

   //*********************************************************************************
   //Constructor: Accepts course information and assigns them to instance variable above 
   public ProcessGrades11 (String course, String instructor,
                      String semester, int year,
                      String school, Scanner scan,
                      int numberOfStudents, int numberOfTests){
       
      //*******************************************************************************
      //declaring needed arrays based on data in file 
      names = new String [numberOfStudents];
      scores = new int [numberOfStudents][numberOfTests];
      studentTotals = new int [numberOfStudents];
      grades = new char [numberOfStudents];
      testsAverages = new double [numberOfTests];
      
      
      //Assign Values to Vairables
      this.semester = semester;
      this.school = school;
      this.year = year;
      instructorName = instructor;
      courseName = course;
      
       
      //computing students totals, grades, tests averages,
      //highest total index, and lowest total index
      computeStudentsTotals ();
      computeGrades();
      computeTestsAverages();
      findStudentWithHighestTotal();
      findStudentWithLowestTotal();
      
      //Printing output.
      displayHeader();
      displayStudentsRecords();
      displayFooter();
   }
   
   //*********************************************************
   //Computes student totals and stores them in studentTotals array
   public void computeStudentsTotals (){
     
      for (int i = 0; i < scores.length; i++){
         for (int j = 0; i < scores[i].length; i++){
            studentTotals[i] += scores[i][j];
         }
      }
     
   }
   
   //*********************************************************
   //Computes student grades and stores them in grades array
   public void computeGrades (){
      
      for (int i = 0; i < studentTotals.length; i++){
         if (studentTotals[i]/3 < 60)
            grades[i] = 'F';
         else if (studentTotals[i]/3 < 70  && studentTotals[i]/3 >= 60)
            grades[i] = 'D';
         else if (studentTotals[i]/3 < 80 && studentTotals[i]/3 >= 70)
            grades[i] = 'C';
         else if (studentTotals[i]/3 < 90 && studentTotals[i]/3 >= 80)
            grades[i] = 'B';
         else if (studentTotals[i]/3 >= 90)
            grades[i] = 'A';
      }
   }
   
   //*********************************************************
   //Computes test averages and stores them in testsAverages array
    public void computeTestsAverages (){
    
      double sum;
      for (int j = 0; j < scores[0].length; j++){
         sum = 0;
         for (int i = 0; i < scores.length; i++){
            sum = (sum + scores[i][j]);
         }
         testsAverages[j] = (sum / scores.length);
      }
    
    } 

   //*********************************************************
   //Finds the index of student with the highest total and stores it in highestScoreIndex
   public void findStudentWithHighestTotal(){
   
     highestScoreIndex = 0;
     int max = studentTotals[0];
     int count = 0;
     for (int i = 0; i < studentTotals.length; i++){
        if (studentTotals[i] > highestScoreIndex){
          highestScoreIndex = count; 
          max = studentTotals[i];
        }
        count ++;
     }
   }

   //*********************************************************
   //Finds the index of student with the lowest total and stores it in lowestScoreIndex
   public void findStudentWithLowestTotal(){
          
     lowestScoreIndex = 0;
     int max = studentTotals[0];
     int count = 0;
     for (int i = 0; i < studentTotals.length; i++){
        if (studentTotals[i] < max){
          lowestScoreIndex = count; 
          max = studentTotals[i];
        }
        count ++;
     }
   }
      
   //*********************************************************
   //Displays Header as shown in handout
   public void displayHeader(){
   
      System.out.printf("\n\t%-20s","******************Student Data Report******************");
      System.out.printf("\n\t%-10s%-15s","Course Name:",courseName);
      System.out.printf("\n\t%-10s%-15s","Instructor's Name:",instructorName);
      System.out.printf("\n\t%-10s%-15s","Semester:",semester);
      System.out.printf("\n\t%-10s%-15s","Year:",year);
      System.out.printf("\n\t%-10s%-15s","School:",school);
      System.out.printf("\n\t%-20s","*******************************************************");
   }

   
   //*********************************************************
   //Displays records of students
   public void displayStudentsRecords(){
      
      //All Students Records Display
      System.out.println ("\n\tNUMBER" + "\tNAME" + "\tTEST1" + "\tTEST2" + "\tTEST3" + "\tTotal" + "\tGrade");
        for (int i = 0; i < names.length; i++){
          System.out.println();
          System.out.print("\t" + (i+1)+ ("\t") + names[i]);
            for (int j = 0; j < scores[0].length; j++){
              System.out.print("\t" + scores[i]);
            }
          System.out.print("\t" + studentTotals[i] + ("\t") + grades[i]);
        }     
   }

   
   //*********************************************************
   //Displays Footer as shown in handout
    public void displayFooter (){
            //Averages Display
      System.out.println();
      System.out.print("\n\tAverages");
      for (int i = 0; i < testsAverages.length; i++){
      System.out.print("\t" + testsAverages[i]);
      }
    
      //Lowest Score Display
      System.out.println();
      System.out.println("\n\tStudent with lowest Average");
      System.out.print("\t\t" + names[lowestScoreIndex]);
      for (int i = 0; i < scores[0].length; i ++){
         System.out.print("\t" + scores[lowestScoreIndex][i]);
      }
      System.out.print("\t" + studentTotals[lowestScoreIndex] + ("\t") + grades[lowestScoreIndex]); 
      
      //Highest Score Display
      System.out.println();
      System.out.print("\n\tStudent with Highest Average");
      System.out.print("\n\t\t" + names[highestScoreIndex]);
      for (int i = 0; i < scores[0].length; i ++){
         System.out.print("\t" + scores[highestScoreIndex][i]);
      }
      System.out.print("\t" + studentTotals[highestScoreIndex] + ("\t") + grades[highestScoreIndex]); 
      System.out.println();
      System.out.printf("\n\t%-20s","*******************************************************");
      System.out.println();
      System.out.println(); 
      System.out.println(); 
      
   }// end of displayFooter
 
   
}//end of class