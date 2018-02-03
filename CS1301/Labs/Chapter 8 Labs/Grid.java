//notes
import java.util.*;
public class Grid{

   private int [][] grid = new int [6][7];
   public void grid(){
   }

   //populate the grid
   
   
   public void populateGrid(){
   
   Random rng = new Random();
   int value;
   
   for (int i = 1; i < grid.length; i++)
      for (int j = 1; j < grid[i].length; j++){
         value = rng.nextInt(10);
         grid[i][j] = value;
      } // end of outside loop
   } // end populateGrid
   
   //display grid
   public void displayGrid(){
   System.out.println();   
   for (int i = 1; i < grid.length; i++){
      System.out.println();   
      for (int j = 1; j < grid[i].length; j++)
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
         System.out.print ("|" +grid[i][j]);
          System.out.print ("|");
          //System.out.println("---------------");
          count--;
   }   
   System.out.println("\n---------------");
         System.out.println ("\n   1 2 3 4 5 6 7");
   } // end displayGrid      
   
   
} // end Grid