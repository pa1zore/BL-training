package Functional;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][]=new int[2][2];
		System.out.println("enter elements of having 2 rows and 2 colunm");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
			System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
