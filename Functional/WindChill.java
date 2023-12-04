package Functional;

import java.util.Scanner;

public class WindChill {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("please enter temperature in Fahrenheit less than 50 only");
	double t=sc.nextInt();
	System.out.println("please enter speed in wind chill less than 120 and greater than 3 only");
	double v=sc.nextInt();
	if(t<50 && v>3 && v<120)
	{
		double temp=(0.4275 - 35.75)*v;
		double w=35.74 +0.6215*t + Math.pow(temp,0.16);
		System.out.println(w);
	}
	else
	{
		System.out.println("please enter valid input ");
	}
}
}
