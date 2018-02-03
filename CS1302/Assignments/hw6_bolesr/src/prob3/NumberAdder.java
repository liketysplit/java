package prob3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class NumberAdder {

	public static void main(String[] args) {
		System.out.println("Sum: " + readValues());
	}
	
	public static int readValues(){
		File inFile = new File ("src\\prob3\\values.txt");
		int sum = 0;
		try{
			Scanner scan = new Scanner (inFile);
			while(scan.hasNext()){
				if (scan.hasNextInt())
					sum += scan.nextInt();
				else{
					String skip = scan.next();
					int skipLines = Integer.parseInt(skip.substring(1));
					for (int i = 0; i <= skipLines;i++)
						scan.nextLine();
				}
			}
			scan.close();
		}catch( IOException e ){
			System.out.println(e);
		}
		return sum;
	}
}