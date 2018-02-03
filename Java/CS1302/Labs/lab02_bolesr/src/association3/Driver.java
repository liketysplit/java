package association3;

public class Driver {

	public static void main(String[] args) {
		Person p = new Person("Xavier");
		Dog d = new Dog("Juno");
		p.addDog(d);
		d = new Dog("Zoro");
		p.addDog(d);
		d = new Dog("Leo");
		p.addDog(d);

		System.out.println(p);

		System.out.println(p.walkDogs());
		
		Dog d2 = p.getDog(1);
		System.out.println(d2);

		Dog[] dogs = new Dog[] { new Dog("Gigi"), new Dog("Spot") };
		Person p2 = new Person("Liz", dogs);
		System.out.println(p2);
		p2.addDog(new Dog("Delila"));
		System.out.println(p2);

		testLoseDog();



	}
	public static void testLoseDog() {
		System.out.println("testLoseDog()");
		Dog[] dogs = new Dog[] { new Dog("Gigi"), new Dog("Spot"), new Dog("Waldo") };
		Person p2 = new Person("Liz", dogs);
		System.out.println(p2);
		p2.loseDog(0);
		System.out.println(p2);

		p2.addDog(new Dog("Goofy"));
		System.out.println(p2);
		p2.loseDog(1);
		System.out.println(p2);
		p2.loseDog(1);
		System.out.println(p2);

	}

}