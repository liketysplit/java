//*************************************************
//Purpose:  Practice with loops
//
//Author:
//Course:   CS1301
//Date:     9/20/2016
//
//*************************************************
import java.util.Date;
public class LoopExamples{
   //Declarations
   private String name = "Unknown";
   private String course = "TBA";
   private Date dateCreated;
   
   //*********************************************
   //1.  no-argument constructor: Gets date from 
   //                system and assigns to dateCreated
   //*********************************************
   public LoopExamples(){
      dateCreated = new Date();
   }//end of constructor
      
   //*********************************************
   //2.  overloaded constructor: gets name and course
   //               assigns to name and course and
   //               gets date from system and assigns
   //               to dateCreated
   //*********************************************
   public LoopExamples (String newName, String newCourse){
      name = newName;
      course = newCourse;      
      dateCreated = new Date();
   }//end of constructor
   
   //*********************************************
   //3.  toString:   it returns a string with
   //                name, course, and dateCreated
   //                appropriate labels.
   //*********************************************
   public String toString(){
      String result;
      result = "\n\tName:         \t" + name +
               "\n\tCourse:       \t" + course +
               "\n\tDate:         \t" + dateCreated;
      return result;
   }//end of toString
   
   //*********************************************
   //4.  loop1ToN:   it receives an integer n and prints
   //             all values from 1 to n on same line
   //             with spacing. For example, if we pass 5,
   //             method prints: 1  2  3  4  5.
   //*********************************************
   public void loop1ToN (int n){
      int i = 1;
      while (i<=n){
      System.out.print(i + "\t");
      i++;
      }
      
      //System.out.println ("\n\t4. loop1ToN to be implemented ");
      System.out.println();
   }//end of loop1ToN
   
   //*********************************************
   //5.  loopMToN:   it receives two integers m and n and prints
   //             all values from m to n on same line
   //             with spacing. For example, if we pass 5 and 8,
   //             method prints: 5, 6, 7, 8.
   //*********************************************
   public void loopMToN (int m, int n){
      int i = m;
      while (i<=n){
      System.out.print(i + "\t");
      i++;
      }
      //System.out.println ("\n\t5. loopMToN to be implemented ");
      System.out.println();
   }//end of loopMToN
   
   //*********************************************
   //6.  sumFromMToN:   it receives two integers m and n.
   //             computes and returns the sum of all 
   //             values from m to n.
   //*********************************************
   public int sumFromMToN (int m, int n){
      
      int i = m;
      int sum = 0;
      while (i<=n){
      sum+=i;
      i++;
      }  
    //System.out.println ("\n\t6. sumFromMToN to be implemented ");
      return sum;  //update this statement
   }//end of sumFromMToN
 
   //*********************************************
   //7.  print1CharPerLine:   it receives a string s
   //             and prints one char per line.
   //*********************************************
   public void print1CharPerLine (String s){
      
      int i = 0;
      
      while (i<s.length()){
      System.out.println(s.charAt(i));
      i++;
      }      
      //System.out.println ("\n\t7. print1CharPerLine to be implemented ");
      System.out.println();
   }//end of print1CharPerLine

   //*********************************************
   //8.  printLastToFirst:   it receives a string s
   //             and prints one char per line, 
   //             last to first.
   //*********************************************
   public void printLastToFirst (String s){
      
      int i = s.length()-1;   
      while (i>=0){
      System.out.println(s.charAt(i));
      i--;
      }        
      //System.out.println ("\n\t8.  printLastToFirst to be implemented ");
      System.out.println();
   }//end of printLastToFirst

}//end of class