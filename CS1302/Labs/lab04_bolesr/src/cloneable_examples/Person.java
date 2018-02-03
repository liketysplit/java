package cloneable_examples;

public class Person implements Cloneable{
	private int age;
	private Dog dog;

	public Person(int age, Dog dog) {
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
		return super.clone();
	}

	@Override
	public String toString() {
		return "Person age=" + age + ", " + dog;
	}

}
