package Day3;

import java.util.Scanner;

public class Test9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int n  = sc.nextInt();
		System.out.println("enter elements of array");
		int arr[]= new int[n];
		for(int i=0;i<n;i++)
		{
		arr[i]=sc.nextInt();	
		}
		System.out.println("before sorting");
		for(int i=0;i<n;i++)
		{
		System.out.print(" "+arr[i]);
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("after sorting");
		for(int i=0;i<n;i++)
		{
		System.out.print(" "+arr[i]);
		}
	}

}
