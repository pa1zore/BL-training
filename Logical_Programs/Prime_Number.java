package Logical_Programs;

import java.util.Scanner;


public class Prime_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        for(int i=2;i<=n/2;i++)
        {
        	if(n%i==0)
        	{
        		System.out.println(n+" not prime number");
        		System.exit(0);
        	}
        }
        
        
        	System.out.println(n+" is prime number");
        
        
	}

}
