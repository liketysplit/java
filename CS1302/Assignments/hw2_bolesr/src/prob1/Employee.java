package prob1;

public class Employee {
	
	private double[] hours = {0.0,0.0,0.0,0.0,0.0,0.0,0.0};
	private String name = "";
	private double payRate = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Employee bob = new Employee("Bob", 10.00);
		Employee jane = new Employee("Jane", 10.00);
		bob.setHours(0, 10.0);
		bob.setHours(1, 10.0);
		bob.setHours(2, 10.0);
		bob.setHours(3, 10.0);
		bob.setHours(4, 8.0);
		jane.setHours(4, 10.0);
		jane.setHours(5, 20.0);
		jane.setHours(6, 20.0);
		bob.mergeEmployee(jane);
		System.out.println(bob);
		}
		
		public Employee(String name, double payrate){
			this.name = name;
			this.payRate = payrate;
			
		}
		
		public Double getHours(int i){
			return hours[i];
		}
		public void setHours(int i, double num){
			hours[i] = num;
		}
		public String getName(){
			return name;
		}
		public double getPayrate(){
			return payRate;
		}
		public Integer getNumDaysWorked(){
			int NumDaysWorked = hours.length;
			return NumDaysWorked;
			
		}
		public double getTotalHours(){
			double hours = 0;
			for(int i = 0; i < this.hours.length; i++)
				hours += this.hours[i];
			return hours;
		}
		public double getWeekdayHours(){
			double hours = 0;
			for(int i = 0; i < this.hours.length - 2; i++)
				hours += this.hours[i];
			return hours;			
		}
		public double getWeekendHours(){
			double hours = 0;
			for(int i = 5; i < this.hours.length; i++)
				hours += this.hours[i];
			return hours;			
		}
		public void newWeek(){
	
			for(int i = 0; i < this.hours.length; i++)
				this.hours[i] = 0.0;			
		}
		public double getPay(){
			double week = getWeekdayHours();
			double weekend = getWeekendHours() * (payRate * 2); 
			double totalPay = 0;
			int daysWorked = getNumDaysWorked();
			
			if (daysWorked == 7)
				totalPay += 50;
			
			if (week >= 40)
				totalPay += (payRate * 1.5) * (week - 40) + (payRate * 40);
			if (week < 40)
				totalPay += payRate * week;
			
			totalPay += weekend;
			
			return totalPay;
		}
		public void mergeEmployee(Employee a ){
			
			for(int i = 0; i < a.hours.length; i++)
				this.hours[i] += a.hours[i];
		}
		public String toString(){
			String answer = String.format("Name: %s, Pay Rate: %.2f"
					+ "\nHours: Mon:%.2f Tue:%.2f Wed:%.2f Thu:%.2f Fri:%.2f Sat:%.2f Sun:%.2f"
					+ "\nDays Worked: %d, Total Hours: %.2f"
					+ "\nWeekday Hours: %.2f, Weekend Hours: %.2f"
					+ "\nTotal Pay: %.2f" 
					, name, getPayrate()
					, getHours(0), getHours(1), getHours(2), getHours(3), getHours(4), getHours(5), getHours(6)
					, getNumDaysWorked(), getTotalHours() 
					, getWeekdayHours(), getWeekendHours() 
					, getPay());
			return answer;
		}
	

}
