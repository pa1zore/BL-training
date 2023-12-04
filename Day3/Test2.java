package Day3;

import java.util.Scanner;

public class Test2 {
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
		for(int i=0;i<n;i++)
		{
			int count=1;
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j] && arr[i]!=-1)
				{
					arr[j]=-1;
					count++;
				} 
			

			}
			if(arr[i]!=-1)
			{
				System.out.println("number "+arr[i]+" having count "+count);

			}
			
		}
	}

}
