package prob4;

public class SmallestSalary {

	public static void main(String[] args) {
		//getSmallestSalaryString();
		String[] names = {"Jed", "Keisha", "Jaylen"};
		int[] ages = {22, 33, 44};
		double[] salaries = {48339.23423, 1234513.92430, 121042.04328};
		String report = getSmallestSalaryString(names, ages, salaries);
		System.out.println(report);

	}
	
		public static String getSmallestSalaryString (String names[], int ages[], double salaries[]){
			int z = 0;
			double k = 999999999;
			//finding min salary and position in array
			for (int i = 0; i < names.length; i++){
				if (salaries[i] < k){
					k = salaries[i];
					z = i;
				}//end of if
			}//end of min
			String answer = String.format("Smallest Salary: $%.2f, Name: %s, Age: %d", salaries[z], names[z], ages[z]);
			return answer;
	}
}
