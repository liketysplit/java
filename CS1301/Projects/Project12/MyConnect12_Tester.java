//notes
import java.util.Scanner;

public class MyConnect12_Tester{

   public static void main(String [] args){
   
   //grid class new object
   MyConnect12 g = new MyConnect12();
   Scanner scan = new Scanner(System.in);
   int selection;
   //populate method of grid
   g.populateGrid();
   //display method of grid
   for(int i = 1; i > 0; i++){
   
   System.out.println("Enter 1 to generate or 2 to quit");
   selection = scan.nextInt();
   
   if (selection == 1){ 
   g.displayGrid1();
   g.horizontal();
   g.vertical();
   g.checkWin();
   }
   else
      i=-1;
      
   }
   
   }

}
