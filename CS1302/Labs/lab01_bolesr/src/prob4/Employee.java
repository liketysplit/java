package prob4;

public class Employee {

	private String name;

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}

	public Employee(String name) {
		super();
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
