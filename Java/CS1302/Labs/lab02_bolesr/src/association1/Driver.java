package association1;

public class Driver {

	public static void main(String[] args) {
		Dog d = new Dog("Juno");
		Person p = new Person("Xavier", d);
		System.out.println(p);
		System.out.println(p.walkDog());
		d = p.getDog();
		System.out.println(d.walk());
		Dog d2 = new Dog("Reily");
		System.out.println(d.barkAt(d2));

	}
}
