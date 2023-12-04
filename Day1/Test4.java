package Day1;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		double sum=0;
		for(int i=1;i<=n;i++)
		{
			//System.out.println(1/i);
			sum=sum+(double)1/i;
		}
		System.out.println(sum);
	}

}
