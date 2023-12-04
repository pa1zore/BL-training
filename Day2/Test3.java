package Day2;

import java.util.Scanner;

public class Test3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number");
	int n=sc.nextInt();
  int count=0;
  int sum=0;
  while(count<=n)
  {
	  sum=sum+count;
	  count++;
  }
	System.out.println(sum);
}
}
