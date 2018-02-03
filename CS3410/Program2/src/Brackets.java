//Rick Boles
//CS 3410 - Data Structures
//Semester (Fall 2017)
//Program 2

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Brackets {

	private static Scanner scan;
	private static String fileText = null;

	public static void main(String[] args) throws FileNotFoundException{


		try {
			scan = new Scanner(new File(args[0]));

			while (scan.hasNext()) {
				fileText += scan.nextLine();
			}

			if ( checkBrackets(fileText) == true)
				System.out.printf("\n%s","Balanced");
			else
				System.out.printf("\n%s","Not Balanced");
		} catch(FileNotFoundException nfe){
			System.out.printf("\n%s","File Not Found");
			System.out.printf("\n%s","See Below:\n");
			nfe.printStackTrace();
		}


	}

	public static boolean checkBrackets(String str){
		Stack<Character> stack = new Stack<Character>(1000);


		char c;
		for (int i = 0; i < str.length(); i++){
			c = str.charAt(i);
			if ( c == '(' || c == '{' || c == '['){
				stack.push(c);
			}
			else if (c == ')'){
				if (stack.isEmpty() || stack.pop() != '(')
					return false;
			}
			else if (c == ']'){
				if (stack.isEmpty() || stack.pop() != '[')
					return false;
			}
			else if (c == '}'){
				if (stack.isEmpty() || stack.pop() != '{')
					return false;
			}


		}

		return true;
	}


}
