import java.util.Scanner;

public class MyPassword7_Tester{
	public static void main (String[] args) {
	  
      String pw; 
      String nm; 
      String cs;
	   Scanner scan = new Scanner(System.in);
      System.out.print("\tEnter your name:   ");
		nm = scan.nextLine();
      System.out.print("\tEnter your course:   ");
		cs = scan.nextLine();
      System.out.print("\tEnter your password:   ");
		pw = scan.nextLine();            
		MyPassword7 mp7 = new MyPassword7();	

      mp7.printHeader(nm , cs);
      mp7.verifyPassword7(pw);
      

	}
}