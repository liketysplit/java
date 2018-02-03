
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Replicate{
	//Variables
	private static Scanner scan;
    private static ArrayList<String> programStrings = new ArrayList<String>();
 	private static String temp;
 	private static Scanner scan2;
 	private static FileWriter fw;
	
			
    
   public static void main (String [] args)throws FileNotFoundException{
	   
	scan = new Scanner(new File("Replicate.java"));
    scan.useDelimiter("\n");
    
	
	
	buildReplicate();
	
    scan = new Scanner(new File("Replicate.java"));
    scan.useDelimiter("\n");
    writeFile();
    addToFile(); 
   }
   
   
    public static void writeFile() {
    	try{
    	fw = new FileWriter("Replicate2.java");
    	}catch(IOException ioe){}

    	
    }
    //Print out code

	private static void buildReplicate() {
		System.out.println("This ran");
		while(scan.hasNext()){
			System.out.println(scan.nextLine());
		}
	
    }

	//Add items to file
	private static void addToFile(){
		try{
		BufferedWriter bw = new BufferedWriter(fw);
		while (scan.hasNext()){
			  temp = scan.nextLine();
			  bw.write(temp);
			  bw.newLine();
		   }
		bw.close();
		fw.close();
		}catch(IOException ioe2){}
	}

}