package cloneable_examples;

import java.util.ArrayList;
import java.util.Arrays;

public class CloneExamples {

	public static void main(String[] args) throws CloneNotSupportedException {
		arrayListExample();
		personDogExample();
	}

	public static void arrayListExample() {
		// Copy a reference
		ArrayList<Integer> x,y;
		x = new ArrayList<>(Arrays.asList(5,2,7));

		System.out.println("Copying the reference to an ArrayList<Int>:");
		ArrayList<Integer> ints = new ArrayList<>(Arrays.asList(5,2,7));
		ArrayList<Integer> ints2 = ints;

		System.out.println("  Before change:");
		System.out.println("    ints :" + ints);
		System.out.println("    ints2:" + ints2);
		System.out.println("    int & int2 the same? " + (ints==ints2));

		ints2.set(1, 99);

		System.out.println("\n  After ints2.set(1,99):");
		System.out.println("    ints :" + ints);
		System.out.println("    ints2:" + ints2);
	
		ints2.set(1, 2);

		// Clone ArrayList
		System.out.println("\nCloning an ArrayList<Int>:");
		ints2 = (ArrayList<Integer>)ints.clone();

		System.out.println("  Before change:");
		System.out.println("    ints         :" + ints);
		System.out.println("    ints2 (clone):" + ints2);
		System.out.println("    int & int2 the same? " + (ints==ints2));

		ints2.set(1, 99);

		System.out.println("\n  After ints2.set(1,99):");
		System.out.println("    ints :" + ints);
		System.out.println("    ints2:" + ints2);
	}
	
	public static void personDogExample() throws CloneNotSupportedException {
		// Clone a Dog
		System.out.println("\nClone a Dog");
		Dog d = new Dog();
		d.setName("Fido");

		Dog d_clone = (Dog)d.clone();
		System.out.println("  dog      :" + d + "\n  dog_clone:" + d_clone);

		System.out.println("\n  After d_clone.setName('Waldo'):\n");
		d_clone.setName("Waldo");
		System.out.println("  dog      :" + d + "\n  dog_clone:" + d_clone);

		System.out.println("\n  dog & dog_clone the same? " + (d==d_clone));
	
		// Clone a Person who has a Dog, incorrectly
		System.out.println("\nClone a Person who has a Dog, incorrectly");

		d = new Dog();
		d.setName("Fido");
		Person p = new Person(19,d);
		Person p_notClone = (Person)p.clone();

		System.out.println("  p         :" + p + "\n  p_notClone:" + p_notClone);

		System.out.println("\n  After p_clone.getDog().setName('Gypsy'):\n");

		d = p_notClone.getDog();
		d.setName("Gypsy");

		System.out.println("  p         :" + p + "\n  p_notClone:" + p_notClone);

		
		// Clone a Person who has a Dog, correctly
		System.out.println("\nClone a Person who has a Dog, correctly");

		d = new Dog();
		d.setName("Fido");
		Person2 p2 = new Person2(19,d);
		Person2 p2_Clone = (Person2)p2.clone();

		System.out.println("  p2      : " + p2 + "\n  p2_Clone: " + p2_Clone);

		System.out.println("\n  After p2_clone.getDog().setName('Gypsy'):\n");

		d = p2_Clone.getDog();
		d.setName("Gypsy");

		System.out.println("  p2      : " + p + "\n  p2_Clone: " + p2_Clone);

	}

}

