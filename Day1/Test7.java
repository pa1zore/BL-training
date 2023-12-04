package Day1;

import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		int n1=sc.nextInt();
		System.out.println("enter second number");
		int n2=sc.nextInt();
		System.out.println("before swaping n1 ="+n1+" and n2 = "+n2);
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.println("after  swaping n1 ="+n1+" and n2 = "+n2);
		
	}

}
