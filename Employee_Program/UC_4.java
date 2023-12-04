package Employee_Program;

import java.util.Scanner;

public class UC_4 {
	public static void main(String[] args) {
		int wagePerHour = 20;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the type of employee (1 for Full-Time, 2 for Part-Time): ");
		int employeeType = scanner.nextInt();

		int dailyWage;

		switch (employeeType) {
		case 1:
			dailyWage = wagePerHour * 8; // Full-Time employee works 8 hours
			System.out.println("Daily Wage for Full-Time Employee: Rs." + dailyWage);
			break;

		case 2:
			dailyWage = wagePerHour * 4; // Part-Time employee works 4 hours
			System.out.println("Daily Wage for Part-Time Employee: Rs." + dailyWage);
			break;

		default:
			System.out.println("Invalid employee type entered.");
		}

	}

}
