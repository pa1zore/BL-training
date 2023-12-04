package Day1;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to flip");
		int n=sc.nextInt();
		int h=0,c=0,t=0;
		while(c<n)
		{
			double r=Math.random();
			System.out.println(r);
			if(r<0.5)
			{
				t++;
			}
			else
			{
				h++;
			}
			c++;
		}
		double hp=(double)h/c*100;
		double tp=(double)t/c*100;
System.out.println("percentage of head is "+hp+"% and percentage of tail is "+tp+"%");
	}

}
