package prob1;

public class Store {

	private static Employee[] emps = new Employee[20];
	private static int numEmps = 0;
	
	public Store(){
		
	}
	public void addEmp(Employee e){
		for(int i = 0 ; i <= numEmps; i++)
			if(emps[i] == null){
				emps[i]= e;
				numEmps++;
				break;
			}
	}
	public Employee getEmp(int i){
		
		if (emps[i-1] == null)
			return null;
		else
			return emps[i-1];
	}
	public int getNumEmps(){
		return numEmps;
	}
	public double getTotalHours(){
		double hours = 0;
		int countTH = 0;
		while (emps[countTH] != null){
			hours += emps[countTH].getTotalHours();
			countTH++;
		}
		return hours;
	}
	public double getTotalPay(){
		double pay = 0;
		int countTP = 0;
		while (emps[countTP] != null){
			pay += emps[countTP].getPay();
			countTP++;
		}
		return pay;
	}
	public Employee removeEmployee(int i){
		if (i > numEmps)
			return null;
		
		Employee aEmployee = emps[i];
		
		for(int j=i ; j < numEmps; j++){
			if ((emps[j+1]) != null)
				emps[j] = emps[j+1];
		}
		numEmps--;
		
		return aEmployee;
	}
	public String toString(){
		String test = String.format("\nPayroll Report"
				+ "\nNum Employees: %d, Total Hours: %.2f, Total Pay: %.2f"
				, numEmps, getTotalHours(), getTotalPay());
	return test;
	}
	
	
}
