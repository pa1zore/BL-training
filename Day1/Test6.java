package Day1;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter divisor ");
		int divisor=sc.nextInt();
		System.out.println("enter dividend ");
		int dividend=sc.nextInt();
		int quetient=divisor/dividend;
		int remainder=divisor%dividend;
		System.out.println("quetient is "+quetient);
		System.out.println("remainder is "+remainder);
		
		

	}

}
