package Employee_Program;

public class UC_6 {
	public static void main(String[] args) {
		double workingDaysInMonth = 20;
		double totalHours = 100;
		double hourlyWage = 20;
		
		String name = "Prakash Zodge";
		System.out.println("Employee Name: " + name);
		System.out.println("Hourly Wage: " + hourlyWage);
		double hoursPerDay = totalHours / workingDaysInMonth;
		System.out.println("Hours per day : "+hoursPerDay);
		
		// Calculate salary until 20 working days
		double salaryPerDay = hourlyWage * hoursPerDay;
		double salary = 0;
		for(int day=1;day<=workingDaysInMonth;day++) {
			salary += salaryPerDay;
			System.out.println("Day : "+day+", earned salary : "+salary);
		}
	}
}
