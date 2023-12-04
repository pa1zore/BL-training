package Day1;

import java.util.Scanner;

public class Test9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	  System.out.println("enter the character");
	  char ch=sc.next().charAt(0);
	  if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='i'||ch=='o'||ch=='u')
	  {
		  System.out.println(ch+" is vowels");
	  }
	  else
	  {
		  System.out.println(ch+" is consonent");
	  }
	}

}
