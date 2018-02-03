package prob4;

public class Engineer {

	private String name;
	private double hours[];

	public Engineer(String name, double[] hours) {
		this.name = name;
		this.hours = hours;
	}

	public String getName() {
		return name;
	}

	public double getWages(double payRate) {
		double wages = 0.0;
		for(double h : hours) {
			wages += h;
		}
		wages *= payRate;
		return wages;
	}

	@Override
	public String toString() {
		return name;
	}
}

