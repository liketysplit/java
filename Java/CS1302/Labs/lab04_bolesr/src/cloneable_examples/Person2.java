package cloneable_examples;

public class Person2 implements Cloneable{
	private int age;
	private Dog dog;

	public Person2(int age, Dog dog) {
		super();
		this.age = age;
		this.dog = dog;
	}

	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Person2 personClone = (Person2)super.clone();
		Dog dogClone = (Dog)dog.clone();
		personClone.setDog(dogClone);
		return personClone;

	}

	@Override
	public String toString() {
		return "Person age=" + age + ", " + dog;
	}

}
