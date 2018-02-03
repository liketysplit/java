package prob2;

public class EngineerDriver {
	public static void main(String[] args) {
		double[] hours = {8.0,8.0,8.0,8.0,8.0,0,0};
		Engineer e = new Engineer("Wilma", hours );
		double wages = e.getWages(20.0);
		String msg = e.getName() + " made $" + wages;
		System.out.println(msg);
	}
}

