//notes
import java.util.*;
public class MyConnect12{

   private int [][] grid = new int [6][7];
   //private int grid[][]={{1,2,3,4,4,4,4},{1,2,3,4,5,6,7},{7,6,5,8,2,1,3},{1,2,3,4,5,6,7},{7,6,5,4,2,1,3},{1,2,3,4,5,6,7}};
   
   public void grid(){
   }
   boolean vwin = false;
   boolean hwin = false;
   //populate the grid
   
   
   public void populateGrid(){
   
   Random rng = new Random();
   int value;
   
   for (int i = 0; i < grid.length; i++)
      for (int j = 0; j < grid[i].length; j++){
         value = rng.nextInt(10);
         grid[i][j] = value;
      } // end of outside loop
   } // end populateGrid
   
   //display grid
   public void displayGrid(){
   System.out.println();   
   for (int i = 0; i < grid.length; i++){
      System.out.println();   
      for (int j = 0; j < grid[i].length; j++)
         System.out.print (grid[i][j] + " ");
   }   
   } // end displayGrid   
   
   //display grid
   public void displayGrid1(){
   System.out.println();
   int count = 6;   
   for (int i = 0; i < grid.length; i++){
      System.out.println();
      System.out.print(count + " ");   
      for (int j = 0; j < grid[i].length; j++)
         System.out.print ("|" + grid[i][j]);
          System.out.print ("|");
          System.out.print("\n  ---------------");
          count--;
   }   
   
         System.out.println ("\n   1 2 3 4 5 6 7");
   } // end displayGrid      
   
   //Check for win Horizontal
   public void horizontal(){   
   int lastHValue = grid [0][0];
   int hCount;
   for (int i = 0; i < grid.length; i++){
      hCount = 0;
      for (int j = 0; j < grid[i].length; j++){
         if (grid[i][j] == lastHValue){
            hCount++;
         }
         if (hCount >= 4)
            hwin = true;
         lastHValue = grid[i][j];
      }// end inner for
   }  // end outer for 
   
   
   } // end horizontal
   
   
   //Check for win Vertical
   public void vertical(){
   int lastVValue = grid[0][0];
   int vCount;
   for (int j = 0; j < grid[0].length; j++){
      vCount = 0;
      for (int i = 0; i < grid.length; i++){
         if (grid[i][j] == lastVValue){
            vCount++;
         }

         if (vCount >= 4)
            vwin = true;
         lastVValue = grid[i][j];
      }// end inner for
   }  // end outer for 
   } // end vertical
   
   
   //Check for win Diagonal
   public void diagonal(){
   System.out.println();
   int count = 6;   
   for (int i = 0; i < grid.length; i++){
      System.out.println();
      System.out.print(count + " ");   
      for (int j = 0; j < grid[i].length; j++)
         System.out.print ("|" +grid[i][j]);
          System.out.print ("|");
          System.out.print("\n  ---------------");
          count--;
   }   
   
         System.out.println ("\n   1 2 3 4 5 6 7");
         
   } // end diagonal  
   
    public void checkWin(){
    
 
      
      if (vwin == false)
      System.out.println("Try again!");
      else if (vwin == true)
      System.out.println("Good Job! V");
      
      if (hwin == false)
      System.out.println("Try again!");
      else if (hwin == true)
      System.out.println("Good Job! H");
   
    }// end check win
   
} // end Grid