package array_list2;

import java.util.ArrayList;

public class Driver {
	public static void main(String[] args) {
		ArrayList<Dog> dogs = new ArrayList<>();
		dogs.add(new Dog("Fido"));
		dogs.add(new Dog("Snoopy"));
		dogs.add(new Dog("Barley"));
		System.out.println(dogs);

		dogs.add(new WolfDog("Juno"));
		
		System.out.println("\nMake the dogs bark:");
		for(Dog d : dogs) {
			System.out.println(d.bark());
			if(d instanceof WolfDog) {
				WolfDog wd = (WolfDog)d;
				System.out.println(wd.howl());
			}
		}
		
		System.out.println("Change a Dog");
		System.out.println("Original: " + dogs);
		Dog d = dogs.get(2);
		d.setName("Moses"); // Change "Barley" to "Moses"
		System.out.println("Changed : " + dogs);

	}
}
