package Day2;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number 1,10 and 100");
		int n=sc.nextInt();
		if(n==1)
		{
			System.out.println("unit");
		}
		else if(n==10)
		{
			System.out.println("ten");
		}
		else if(n==100)
		{
			System.out.println("hundread");
		}
		else
		{
			System.out.println("enter number upto 100 only");
		}
		
	}

}
