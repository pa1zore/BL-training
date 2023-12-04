package Day3;

import java.util.Scanner;

public class Test4 {
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
		int temp=arr[0];
		for(int i=1;i<n;i++)
		{
			if(temp>arr[i])
			{
				temp=arr[i];
			}
		}
		System.out.println("smallest element is "+temp);
		
		
	}

}
