package inheritance;

import java.util.Scanner;

class Parent
{
	int a,b;
	void read()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter First Number");
		a=scan.nextInt();
		System.out.println("Enter Second Number");
		b=scan.nextInt();
	}
}
class Add extends Parent
{
	void plus()
	{
		System.out.println("Addition of two Numbers is \n"+(a+b));
	}
}

class Sub extends Parent
{
	void minus()
	{
		System.out.println("Subtraction of two Numbers is "+(a-b));
	}
}

class Mul extends Parent
{
	void into()
	{
		System.out.println("Multiplication  of two Numbers is "+(a*b));
	}
}

public class Hirachical {
	

	public static void main(String[] args)
	{
		Add a=new Add();
		System.out.println("For Addition");
		a.read();
		a.plus();
		Sub b=new Sub();
		System.out.println("\nFor Subtraction");
		b.read();
		b.minus();
		Mul c=new Mul();
		System.out.println("\nFor Multiplication");
		c.read();
		c.into();

	}

}
