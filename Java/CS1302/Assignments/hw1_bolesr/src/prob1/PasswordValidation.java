package prob1;
import java.util.Scanner;
public class PasswordValidation {
	
	private static String password;
	private static int pos;
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		while (true) {
			System.out.println ("Enter a password: \t");
			password = scan.nextLine();
			if( password==null || password.isEmpty()) {
				System.out.println("bye");
				break;
			}
			System.out.println ("Proposed password is: \t" + password);
			isLevelOne(password);
			isLevelTwo(password);
		
		} //end of while
	}
		
		public static boolean passwordLength (String password){
			if ( password.length() < 6){
				return false;
			}
			else 
				return true;
		}
		public static boolean noSpaces(String password){
			pos = password.indexOf(" ");
			if (pos != -1)
				return false;
			else 
				return true;
		}
		public static boolean lowerCase(String password){
			boolean count = false;
			int i = 0;
			while (!count && i < password.length()){
				if ( password.charAt(i) <= 'z' && password.charAt(i) >= 'a')
					count = true;
				else
					i++;
			}
			return count;
		}
		public static boolean upperCase(String password){
			boolean count = false;
			int i = 0;
			while (!count && i < password.length()){
				if ( password.charAt(i) <= 'Z' && password.charAt(i) >= 'A')
					count = true;
				else
					i++;
			}
			return count;
		}
		public static boolean oneDigit(String password){
			boolean count = false;
			int i = 0;
			while (!count && i < password.length()){
				if ( password.charAt(i) <= '9' && password.charAt(i) >= '0')
					count = true;
				else
					i++;
			}
			return count;
		}
		public static boolean isLevelOne (String password){
			boolean pl = passwordLength(password);
			boolean ns = noSpaces(password);
			boolean lc = lowerCase(password);
			boolean uc = upperCase(password);
			boolean od = oneDigit(password);
			
			if ( pl && ns){
				if( lc && uc || od && uc || lc && od)
					System.out.println("Level one is: True" );
					return true;
			}
					System.out.println( "Level one is: False");
					return false;
				}
		
		public static boolean isLevelTwo (String password){
			boolean pl = passwordLength(password);
			boolean ns = noSpaces(password);
			boolean lc = lowerCase(password);
			boolean uc = upperCase(password);
			boolean od = oneDigit(password);
			
			if ( pl && ns){
				if( lc && uc && od){
					System.out.println("Level two is: True" );
					return true;
				}
			}
			System.out.println( "Level two is: False");
			return
				false;
		}
}
