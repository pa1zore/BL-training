package Day2;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int temp=n;
		int reverse=0;
	for(;n>0;)
		{
			int rem=n%10;
			reverse=reverse*10+rem;
			n=n/10;
			
		}
	String s=	(temp==reverse)?"palindrome":"not palindrome";
	
	System.out.println(s);
	}

}
