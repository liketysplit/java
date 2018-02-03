package read_examples;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class EmployeeReader {
	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<>();

		File inFile = new File( "src\\read_examples\\employees3.txt" );
		
		try {
			Scanner input = new Scanner( inFile );
			while( input.hasNext() ) {
				String name = input.next();
				double salary = input.nextDouble();
				int age = input.nextInt();
				employees.add(new Employee( name, salary, age ));
			}
			input.close();
		}
		catch( IOException e ) {
			System.out.println(e);
		}

		for( Employee e : employees )
			System.out.println(e);
	}
}