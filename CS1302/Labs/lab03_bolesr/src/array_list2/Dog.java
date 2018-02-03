package array_list2;

public class Dog {
	private String name;

	public Dog(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String bark() {
		return name + " is barking";
	}

	@Override
	public String toString() {
		return "Dog named " + name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}

