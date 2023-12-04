package Day2;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter three numbers");
		double a=sc.nextInt();
		double b=sc.nextInt();
		double c=sc.nextInt();
		double e1=a+b*c;
		double e2=c+a/b;
		double e3=a%b+c;
		double e4=a*b+c;

	     System.out.println("maximum number is "+Math.max(Math.max(e1, e2),Math.max(e3, e4)));
	     System.out.println("minimum number is "+Math.min(Math.min(e1, e2),Math.min(e3, e4)));
	}

}
