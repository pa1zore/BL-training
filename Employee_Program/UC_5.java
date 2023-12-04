package Employee_Program;

public class UC_5 {
	public static void main(String[] args) {
		int wagePerHour = 20;
        int fullDayHours = 8;
        int workingDaysInMonth = 20;

        int dailyWage = wagePerHour * fullDayHours;

        int monthlyWage = dailyWage * workingDaysInMonth;
        System.out.println("Monthly Employee Wage: Rs." + monthlyWage);

	}
}
