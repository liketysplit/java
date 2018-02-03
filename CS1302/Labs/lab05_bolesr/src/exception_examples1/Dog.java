package exception_examples1;

public class Dog {
	private String name;
	public Dog(String name) {
		if( name.length() < 2) {
			throw new IllegalArgumentException("Name length must be 2 or more");
		}
		else {
			this.name = name;
		}
	}

	@Override
	public String toString() {
		return "Dog's name is: " + name;
	}

	public static void main(String[] args) {
		Dog d;
		try{
			d = new Dog("albert");
			System.out.println(d);
		}
		catch(RuntimeException e){
			System.out.println(e);
		}
		System.out.println("Program over!");
	}
}