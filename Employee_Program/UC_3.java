package Employee_Program;

public class UC_3 {
	public static void main(String[] args) {
		int partTimeHours = 4;
		int wagePerHour = 20;
        int fullDayHours = partTimeHours*2;
        
        // Calculate daily employee wage
        int dailyWageFullTime = wagePerHour * fullDayHours;
        System.out.println("Daily Wage for Full-Time Employee: Rs." + dailyWageFullTime);

        // Calculate daily part-time employee wage
        int dailyWagePartTime = wagePerHour * partTimeHours;
        System.out.println("Daily Wage for Part-Time Employee: Rs." + dailyWagePartTime);
	}

}
