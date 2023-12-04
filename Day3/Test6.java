package Day3;

import java.util.Scanner;

public class Test6 {
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
		System.out.println("before reversing array");
		for(int i=0;i<n;i++)
		{
		System.out.print(" "+arr[i]);
		}
		System.out.println();
		for(int i=0;i<n/2;i++)
		{
			int temp=arr[i];
			arr[i]=arr[n-1-i];
			arr[n-1-i]=temp;
		}
		System.out.println("after reversing array");

		for(int i=0;i<n;i++)
		{
		System.out.print(" "+arr[i]);
		}
		
	}

}
