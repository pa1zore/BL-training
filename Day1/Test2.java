package Day1;

import java.util.Scanner;

public class Test2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter year");
	int n=sc.nextInt();
	if(n%4==0)
	{
		if(n%100==0&& n%400!=0)
		{
			System.out.println("not leap year");
		}
		else
		{
			System.out.println("leap year");
		}
	}
	else
	{
		System.out.println("not leap year");
	}
}
}
