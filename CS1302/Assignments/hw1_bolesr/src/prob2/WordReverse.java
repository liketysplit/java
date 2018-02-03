package prob2;
import java.util.Scanner;
public class WordReverse {
	
	private static String original;
		
	public static void main(String[] args) {
		readData();
		
		
	} // End main
		
	public static void readData(){
		Scanner scan = new Scanner (System.in);
		while (true) {
			System.out.println ("\nEnter a line of text: \t");
			original = scan.nextLine();
			if( original==null || original.isEmpty()) {
				System.out.println("Sorry!");
				break;
			
			} //End For Loop
			System.out.println ("Proposed text is: \t" + original);
			reverseWords();
		}// End While Loop 		
	} //end of readData
	
	public static void reverseWords (){
		//Variables
		int pos = original.lastIndexOf(" ", original.length());
		int right = original.length();
		String reverse = " ";
		
		for (int i = original.length()-1; i >= 0; i--)
			if ( pos != -1){
				reverse +=  original.substring(pos, right);
				right = pos;
				pos = original.lastIndexOf(" ", right-1);
			if ( pos == -1) //used to grab the last word
				reverse += " " + original.substring(0, original.indexOf(" "));
			} // End If
		if (reverse == " ")
		System.out.println ("Reverse words is: \t" + original);
		else
		System.out.println ("Reverse words is: \t" + reverse);
		} // End Reverse Words
} // End WordReverse