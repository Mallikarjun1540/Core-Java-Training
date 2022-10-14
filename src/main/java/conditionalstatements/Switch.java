package conditionalstatements;
import java.util.Scanner;
public class Switch {
	public static void main(String[] args) {
		int ch,a,b;
		Scanner scan=new Scanner(System.in);
		System.out.println("1.ADDITION\n 2.SUBTRACTION\n 3.MULTIPLICATION\n 4.DIVISION\n");
		System.out.println("Enter your Choice\n");
		ch=scan.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("enter two numbers\n");
			a=scan.nextInt();
			b=scan.nextInt();
			System.out.println("Addition of two numbers is "+(a+b));
			break;
		case 2:
			System.out.println("enter two numbers\n");
			a=scan.nextInt();
			b=scan.nextInt();
			System.out.println("Subtraction of two numbers is "+(a-b));
			break;
		case 3:
			System.out.println("enter two numbers\n");
			a=scan.nextInt();
			b=scan.nextInt();
			System.out.println("Multiplication of two numbers is "+(a*b));
			break;
		case 4:
			System.out.println("enter two numbers\n");
			a=scan.nextInt();
			b=scan.nextInt();
			System.out.println("Division of two numbers is "+(a/b));
			break;
		default:
			System.out.println("Invalid Choice");
		}
	}
}
