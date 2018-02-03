//Rick Boles
//CS 3410: Data Structures
//Programming 3 (Fall 2017)
//Due date: Friday, 27 October 2017, 9:00 p.m


import java.util.Scanner;
public class driver{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in); 
        
        customQueue cQueue = new customQueue();            
        
        int sel = 0;

        while (sel != -1){
        	System.out.println("");
        	System.out.println("");
            System.out.println("Queue: Main Menu");
            System.out.println("1: Insert");
            System.out.println("2: Delete");
            System.out.println("3: Display Front");
            System.out.println("4: Display Rear");
            System.out.println("5: Display Total Number of Items");
            System.out.println("6: Display all items in the queue");
            System.out.println("7: Quit");

            try{sel = scan.nextInt();}
			catch (Exception e){ System.out.println("Invalid Input--> " + e.getMessage());}

            switch (sel){

            case 1 :

                System.out.println("Enter an Integer to insert int the Queue: ");
                try{cQueue.add( scan.nextInt() );}
                catch (Exception e){ System.out.println("Error: " + e.getMessage()); sel=-1;}

                break;                         
            case 2 :

                try{cQueue.remove();}
                catch (Exception e){ System.out.println("Error: " + e.getMessage());}

                break;                         
            case 3 : 

                try{cQueue.printFront();}
                catch (Exception e){ System.out.println("Error: " + e.getMessage());}

                break;                         
            case 4 : 

                try{cQueue.printRear();}
                catch (Exception e){ System.out.println("Error: " + e.getMessage());}

                break;
 
            case 5 : 
                try{System.out.println("Total In-Queue: " + cQueue.getSize());}
                catch (Exception e){ System.out.println("Error: " + e.getMessage());}
                break;

            case 6 : 
                try{cQueue.printAll();}
                catch (Exception e){ System.out.println("Error: " + e.getMessage());}
                break;

            case 7 :
            	sel = -1;
                System.out.println("Good Bye!");
                break;   
 
            default : 
                System.out.println("Invalid Entry");
                sel = -1;
                break;
            }                
           
 

          
        } ;                                                            
    } 
}