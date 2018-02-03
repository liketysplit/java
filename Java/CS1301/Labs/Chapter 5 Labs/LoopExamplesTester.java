//**********************************************
//Purpose:  Practice with loops and classes
//
//Author:   Fares
//Course:   CS1301
//Date:     9/20/2016
//
//**********************************************
public class LoopExamplesTester{
   public static void main (String[] args){
      //1.  Create an object out of LoopExamples class
      //    to use its methods
      LoopExamples le = new LoopExamples(); //no-argument constructor
      
      //2.  Invoke the toString method
      System.out.println ("\n\t2. le toString");
      System.out.println (le.toString());
      
      //3.  Create a second object with your name and course
      //    to use its methods
      LoopExamples le2 = new LoopExamples("Rick Boles","CS1301A"); 
      
      //4.  Invoke the toString method
      System.out.println ("\n\t4. le2 toString");
      System.out.println (le2.toString());
      
      //5.  Invoke loop1ToN method. Use le2 object
      System.out.println ("\n\t5. Values from 1 to 7");
      le2.loop1ToN(7);
      
      //6.  Invoke loopMToN method.
      System.out.println ("\n\t6. Values from 3 to 8");
      le2.loopMToN (3, 8);
      System.out.println ("\n\t6. Values from -2 to 8");
      le2.loopMToN (-2, 8);
      System.out.println ("\n\t6. Values from 20 to 8");
      le2.loopMToN (20, 8);
      
      //7.  invoke sumFromMToN method. 
      System.out.println ("\n\t7. Sum of all values from 5 to 8");
      System.out.print ("\t" + le2.sumFromMToN (5, 8));
      
      //8.  Invoke print1CharPerLine method.
      System.out.println ("\n\t8. VSU characters first to last");
      le2.print1CharPerLine ("VSU");
      
      //9.  Invoke printLastToFirst method
      System.out.println ("\n\t9. Valdosta characters last to first");
      le2.printLastToFirst ("Valdosta");
   }//end of main
}//end of class