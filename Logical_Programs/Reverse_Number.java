package Logical_Programs;

import java.util.Scanner;

public class Reverse_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int rev=0;
        System.out.println("before reversing");
        System.out.println(n);

        for(;n>0;)
        {
        	int rem=n%10;
        	rev=rev*10+rem;
        	n=n/10;
        }
        System.out.println("after reversing");
        System.out.println(rev);
	}

}
