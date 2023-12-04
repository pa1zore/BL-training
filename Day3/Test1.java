package Day3;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter size of array");
		int n  = sc.nextInt();
		System.out.println("enter elements of array");
		int arr[]= new int[n];
		for(int i=0;i<n;i++)
		{
		arr[i]=sc.nextInt();	
		}
		
		for(int i=0;i<n;i++)
		{
		System.out.print(" "+arr[i]);
		}
		
	}

}
