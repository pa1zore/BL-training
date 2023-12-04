package Employee_Program;

import java.util.Random;

public class UC_1 {
	public static void main(String[] args) {
		Random random = new Random();
		int randomNumber = random.nextInt(2);

		if (randomNumber == 0) {
			System.out.println("The employee is present.");
		} 
		else {
			System.out.println("The employee is absent.");
		}

	}

}
