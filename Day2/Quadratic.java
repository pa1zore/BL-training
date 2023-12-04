package Day2;

import java.util.Scanner;

public class Quadratic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter coeficient of x power 2");
		int a=sc.nextInt();
		System.out.println("enter coeficient of x");
		int b=sc.nextInt();
		System.out.println("enter coeficient of constant");
		int c=sc.nextInt();
		double d=b*b-4*a*c;
		double r1=(-b+Math.sqrt(d))/(2*a);
		double r2=(-b-Math.sqrt(d))/(2*a);
		System.out.println("roots are "+r1+" and "+r2);

	}

}
