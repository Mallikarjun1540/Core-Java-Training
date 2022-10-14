package oops;

import java.util.Scanner;

class Student1
{
	String name,branch;
	static String college;
	int rollno;
	void read()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Your name");
		name=scan.next();
		System.out.println("Enter your Roll Number");
		rollno=scan.nextInt();
		System.out.println("Enter your Branch");
		branch=scan.next();
		System.out.println("Enter your college name");
		college=scan.next();
		
		
	}
	static void display1()
	{
		System.out.println("Your College Name is "+college);
		//System.out.println("Your Name is "+name);
	}
	 void display()
	{
		System.out.println("Your Name is "+name);
		System.out.println("Your  Roll Number "+rollno);
		System.out.println("Your Branch is "+branch);
		
		
	}
	 void change()
	 {
		 college="JTBCA";
	 }
}

public class Staticmethod {

	public static void main(String[] args) {
		Student1 stud=new Student1();
		stud.read();
		stud.change();
		stud.display();
		Student1.display1();

	}

}
