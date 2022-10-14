package conditionalstatements;

import java.util.Scanner;

public class If_else {

	public static void main(String[] args) {
		int a,b;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two Numbers\n");
		a=scan.nextInt();
		b=scan.nextInt();

		if(a>b)
		{
			System.out.println("First number is Big");
		}
		else
		{
			System.out.println("Second number is Big");
		}


	}

}
