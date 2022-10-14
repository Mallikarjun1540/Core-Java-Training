package conditionalstatements;

import java.util.Scanner;

public class Else_if_ladder {

	public static void main(String[] args) {
		int a,b;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Numbers\n");
		a=scan.nextInt();
		if(a>0)
		{
			System.out.println("Number is Positive Number");
		}
		else if(a<0)
		{
			System.out.println("Number is Negative  Number");
		}
		else
		{
			System.out.println("Number is Zero");
		}

	}

}
