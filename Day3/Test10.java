package Day3;

import java.util.Scanner;

public class Test10 {

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
	int temp1=arr[0];
	int temp2=Integer.MIN_VALUE;
	
	   for(int i=1;i<n;i++)
	   {
		   if(temp1<arr[i])
		   {
			   temp2=temp1;
			   temp1=arr[i];
		   }
	   }
	   System.out.println("second largest number is "+temp2);
	
}
	}

