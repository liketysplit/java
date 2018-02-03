package association2;

public class Driver {

	public static void main(String[] args) {
		Dog d = new Dog("Juno");
		Person p = new Person("Xavier", d);
		d = p.getDog();
		Person p2 = d.getOwner();
		System.out.println(d.getName() + "'s owner is " + p2.getName() );


	}
}
