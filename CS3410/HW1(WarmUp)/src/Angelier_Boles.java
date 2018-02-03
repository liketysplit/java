//Tyler Angelier and Rick Boles

import java.util.Arrays;
import java.util.Scanner;

public class Angelier_Boles {
	public static void main(String[] args){
		warmUp();
	}
	public static void warmUp(){

		Scanner scan = new Scanner(System.in); //open input

		System.out.print("Enter the size of your array: "); //ask user
		int size = scan.nextInt(); //grab input
		scan.close(); //close scanner :)
		int[] array1 = new int[size]; //create array size of input
		int[] array2 = new int[size]; //create array2 size of input

		for (int i = 0; i < size; i++){
			array1[i] = (int) Math.floor((Math.random() * 100) + 1); //loop through size and assign value 1-100
			array2[i] = array1[i]; //populate the comparison array to save the clone loop;
		}

		int count = 0; //create counter
		//int[] array2 = array1.clone(); //clone array1 (removed for efficiency)
		Arrays.sort(array1); //sort array1
		for (int i = 0; i < size; i++){
			if (array1[i] == array2[i])
				count++;
		} //loop through, if numbers are the same after sort increment count

		//toString
		System.out.println("Original: " + Arrays.toString(array2) ) ;
		System.out.println("Sorted: " + Arrays.toString(array1) );
		System.out.println("Count: " + count);
	}
}
