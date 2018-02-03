package prob1;

public class StoreTester {

	public static void main(String[] args) {
		Store eHost = new Store();
		
		Employee e1 = new Employee("Vaughn", 6.00);
		Employee e2 = new Employee("Barker", 4.00);
		Employee e3 = new Employee("Finney", 6.00);
		Employee e4 = new Employee("Farber", 6.00);
		Employee e5 = new Employee("Berthelot", 5.00);
		Employee e6 = new Employee("Green", 6.00);
		Employee e7 = new Employee("Blancett", 4.00);
		Employee e8 = new Employee("Oslin", 7.00);
		Employee e9 = new Employee("Rohrschieb", 5.00);
		
		e1.setHours(0, 8); e1.setHours(1, 8); e1.setHours(2, 8); e1.setHours(3, 8); e1.setHours(4, 8);
		e2.setHours(0, 8); e2.setHours(1, 8); e2.setHours(2, 8); e2.setHours(3, 8); e2.setHours(4, 8);
		e3.setHours(0, 8); e3.setHours(1, 8); e3.setHours(2, 8); e3.setHours(3, 8); e3.setHours(4, 8);
		e4.setHours(0, 8); e1.setHours(1, 8); e1.setHours(2, 8); e1.setHours(3, 8); e1.setHours(4, 8);
		e5.setHours(0, 8); e2.setHours(1, 8); e2.setHours(2, 8); e2.setHours(3, 8); e2.setHours(4, 8);
		e6.setHours(0, 8); e3.setHours(1, 8); e3.setHours(2, 8); e3.setHours(3, 8); e3.setHours(4, 8);
		e7.setHours(0, 8); e1.setHours(1, 8); e1.setHours(2, 8); e1.setHours(3, 8); e1.setHours(4, 8);
		e8.setHours(0, 8); e2.setHours(1, 8); e2.setHours(2, 8); e2.setHours(3, 8); e2.setHours(4, 8);
		e9.setHours(0, 8); e3.setHours(1, 8); e3.setHours(2, 8); e3.setHours(3, 8); e3.setHours(4, 8);
		e9.setHours(0, 8); e3.setHours(1, 8); e3.setHours(2, 8); e3.setHours(3, 8); e3.setHours(4, 8);
		
		eHost.addEmp(e1);
		eHost.addEmp(e2);
		eHost.addEmp(e3);
		eHost.addEmp(e4);
		eHost.addEmp(e5);
		eHost.addEmp(e6);
		eHost.addEmp(e7);
		eHost.addEmp(e8);
		eHost.addEmp(e9);
		
		System.out.println(eHost);
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(e3.toString());
		System.out.println(e4.toString());
		System.out.println(e5.toString());
		System.out.println(e6.toString());
		System.out.println(e7.toString());
		System.out.println(e8.toString());
		System.out.println(e9.toString());
	}

}