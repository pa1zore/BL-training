package Functional;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array");
		int n=sc.nextInt();
		int arr[]= new int[n];
		System.out.println("enter the  elements of array");
		int kk=0;
		while(kk<n)
		{
			arr[kk]=sc.nextInt();
			kk++;
		}
		
		for(int i=0;i<n-2;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if(arr[i]+arr[j]+arr[k]==0)
					{
						System.out.println(" numbers are "+arr[i]+" & "+arr[j]+" & "+arr[k]);
						System.exit(0);
					}
				}
			}
		}
		System.out.println("no triplets having addition is 0 in array set");
	}

}
