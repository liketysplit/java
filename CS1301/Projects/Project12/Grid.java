//notes
import java.util.*;
public class Grid{

   private int [][] grid = new int [6][7];
   public void grid(){
   }
   boolean win = false;
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
   
   //horizontal
   public void horizontal(){   
   
   for (int i = 0; i < grid.length; i++){
      for (int j = 0; j < 5; j++)
         if ((grid[i][j] == grid[i][(j+1)]) && (grid[i][j] == grid[i][(j+2)]) && (grid[i][j] == grid[i][(j+3)]) && (grid[i][j] == grid[i][(j+4)])){
            System.out.println("Win by horizontal!");
            win = true;
         }
   }  // end outer for 
   
   
   } // end horizontal
   
   
   //display vertical
   public void vertical(){
   for (int i = 0; i < 4; i++){
      for (int j = 0; j < grid[i].length; j++)
         if ((grid[i][j] == grid[(i+1)][j]) && (grid[i][j] == grid[(i+2)][j]) && (grid[i][j] == grid[(i+3)][j]) && (grid[i][j] == grid[(i+4)][j])){
            System.out.println("Win by Vertical!");
            win = true;
         }
   }  // end outer for 
   } // end vertical
   
   
   //display diagonal
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
    
      if (win == false)
      System.out.println("Try again!");
      else if (win == true)
      System.out.println("Good Job!");
    
    }// end check win
   
} // end Grid