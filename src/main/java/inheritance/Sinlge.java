package inheritance;

import java.util.Scanner;

class Base
{
	int marks1,marks2;
	String name;
	String rollnumber;
	void read()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter Your name\n");
		name=scan.next();
		System.out.println("enter Your Roll number\n");
		rollnumber=scan.next();
		System.out.println("enter Your marks one\n");
		marks1=scan.nextInt();
		System.out.println("enter Your marks two\n");
		marks2=scan.nextInt();
	}
}

class Derived extends Base
{
	double total,avg;
	void display()
	{
		System.out.println("Your Name: "+name);
		System.out.println("Your Roll number: "+rollnumber);
		System.out.println("Your Marks1: "+marks1);
		System.out.println("Your Marks2: "+marks2);
		total=marks1+marks2;
		avg=total/2;
		System.out.println("Average Marks:"+avg);
		
	}
}
public class Sinlge {

	public static void main(String[] args) {
		Derived d=new Derived();
		d.read();
		d.display();

	}

}
