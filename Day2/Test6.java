package Day2;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	  System.out.println("enter the character");
	  char ch=sc.next().charAt(0);

       switch (ch) {
	case 'a': System.out.println("vowels");
	break;
	case 'e': System.out.println("vowels");
	break;
	case 'i': System.out.println("vowels");
	break;
	case 'o': System.out.println("vowels");
	break;
	case 'u': System.out.println("vowels");
	break;
	case 'A': System.out.println("vowels");
	break;
	case 'E': System.out.println("vowels");
	break;
	case 'I': System.out.println("vowels");
	break;
	case 'O': System.out.println("vowels");
	break;
	case 'U': System.out.println("vowels");
	break;
	default:
		System.out.println("consonents");
		break;
	}
	}

}
