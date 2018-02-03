package exception_examples1;

public class Example2 {
	
	public static void main(String[] args) {
		
		System.out.println("Answers:");
		System.out.println("i. Because char c is local to try and cannot be seen by catch");
		System.out.println("ii. True ");
		System.out.println("iii. Outside ");
		
		char c;
		try {
			c = getCharAt("help", 8);
			System.out.println("Got the answer!");
		}
		catch(RuntimeException e) {
			System.out.println("Exception:\n  " + e);
			c = '*';
		}
		System.out.println( "Character is: " + c );
	}
	
	public static char getCharAt(String msg, int pos) {
		return msg.charAt(pos);
	}
}