package inheritance;

import java.util.Scanner;

class read
{
	String name,rollnumber;
	int marks1,marks2;
	void enter()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter Your name\n");
		name=scan.next();
		System.out.println("enter Your Roll Number\n");
		rollnumber=scan.next();
		System.out.println("enter Your marks one\n");
		marks1=scan.nextInt();
		System.out.println("enter Your marks two\n");
		marks2=scan.nextInt();
	}
		
}
class Process extends read
{
	double total,avg;
	void result()
	{
		total=marks1+marks2;
		avg=total/2;
	}
}
class Show extends Process
{
	void display()
	{
		System.out.println("********Student Details are********");
		System.out.println("Name: "+name);
		System.out.println("USN: "+rollnumber);
		System.out.println("Marks1: "+marks1);
		System.out.println("Marks2: "+marks2);
		System.out.println("Total Marks: "+total);
		System.out.println("Average: "+avg);
		
		
		
		
	}
}

public class Mutilevel {

	public static void main(String[] args) {
		Show obj=new Show();
		obj.enter();
		obj.result();
		obj.display();

	}

}
