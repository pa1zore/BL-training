package Day2;

import java.util.Scanner;

public class SpringSeason {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter month in digit");
	int m=sc.nextInt();
	System.out.println("enter day of month in digit");
	int d=sc.nextInt();
	if(m<6 && m>=3)
	{
		if(m==3&&d>=20&&d<=31)
		{
			System.out.println("true");
		}
		else if(m==4&&d>=1&&d<=30)
		{
			System.out.println("true");
		}
		else if(m==5&&d>=1&&d<=31)
		{
			System.out.println("true");
		}
		else if(m==6&&d>=1&&d<=20)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
	else
	{
		System.out.println("false");
	}
	}
}
