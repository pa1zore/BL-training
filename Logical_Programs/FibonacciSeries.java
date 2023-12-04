package Logical_Programs;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int a=0,b=1,sum=0;
        System.out.println("fibonacci series upto nth terms is ");
        for(int i=0;i<n;i++)
        {
        	System.out.print(" "+a);
        	sum=a+b;
        	a=b;
        	b=sum;
        }
	}

}
