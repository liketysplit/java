package prob3;

public class Worker {

	private String name;

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}

	public Worker(String name) {
		super();
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
