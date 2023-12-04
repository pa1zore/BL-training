package Day1;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int p=1;
		for(int i=1;p<n;i++)
		{
			p=p*2;
		}
	}

}
