package Day1;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter three numbers");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		if(n1>n2)
		{
			if(n1>n3)
			{
				System.out.println(n1+"is greatest");
			}
		}
		else if(n2>n3)
		{
			System.out.println(n2+"is greatest");
		}
		else
		{
			System.out.println(n3+"is greatest");
		}
	}

}
