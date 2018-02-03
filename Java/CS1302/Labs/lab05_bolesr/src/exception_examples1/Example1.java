package exception_examples1;

public class Example1 {

	public static void main(String[] args) {
		
		System.out.println("Answers:");
		System.out.println("a. String. ");
		System.out.println("b. help does not have an index value of 8(Out of Bounds). ");
		System.out.println("c. Shows the lines that are causing the errors 6 and 11. ");
		System.out.println("d. No because the program gets terminated at line 6 by the Out of Bounds, line 7 is never reached. ");
		
		char c = getCharAt("help", 8);
		System.out.println( c );
	}
	
	public static char getCharAt(String msg, int pos) {
		return msg.charAt(pos);
	}
}
