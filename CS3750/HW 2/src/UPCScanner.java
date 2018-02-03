//Rick Boles
//CS3750) 
//Fall 2017
//Assignment 2 – Program 1 

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class UPCScanner{
	//Variables
	private static Scanner scan;
    private static ArrayList<Double> checkSum = new ArrayList<Double>();
    private static ArrayList<Integer> storedUPC = new ArrayList<Integer>();
    private static boolean run = true;
    private static String tempS;
    private static int checkV =0;
    
   public static void main (String [] args)throws FileNotFoundException{	   
	scan = new Scanner(new File(args[0]));
    scan.useDelimiter("\n"); 
	determineValid();
   }
   
	private static void determineValid() {
		
		while(run){
			stringScanner();
			if( (10-((calcEven()+(calcOdd()*3))%10))%10 == checkV){
				System.out.printf("\nValid");
			}
			else{
				System.out.printf("\n%s%d","Invalid check sum it should be: ",
									((10-(calcEven()+(calcOdd()*3))%10))%10);
			}
		      if(!scan.hasNext())
		    	  run = false;
		}
	
    }
	
	//Do Even Calculations
    private static int calcEven() {
    		return storedUPC.get(1)+ storedUPC.get(3)+ storedUPC.get(5)+ storedUPC.get(7)+ storedUPC.get(9); 
    }
    
    //Do Odd Calculations
	private static int calcOdd() {
		
		return 	   storedUPC.get(0)+ storedUPC.get(2)+ storedUPC.get(4)+ storedUPC.get(6)+ storedUPC.get(8)+ storedUPC.get(10);
	}	
	//Scan each line
	private static void stringScanner(){
			  storedUPC.clear();	
			  tempS = scan.nextLine();
			  for(int i = 0; i < 12; i++){
				  storedUPC.add(Integer.parseInt((tempS.substring(i,i+1))));
				  //System.out.println(storedUPC.get(i));
			  }                 
    		  checkV=storedUPC.get(11);
	}


}
