package threads;

class Demo extends Thread
{
	public void run()
	{
		System.out.println("First Thread Starts");
		String s="Hello World";
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
		System.out.println("First Thread Ends");
	}
}

class Demo1 extends Thread
{
	public void run()
	{
		System.out.println("Second Thread Starts");
		String s="Welcome to Edubridge";
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
		System.out.println("Second Thread Ends");
	}
}

class Demo2 extends Thread
{
	public void run()
	{
		System.out.println("Third Thread Starts");
		String s="Good Morning";
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
		System.out.println("Third Thread Ends");
	}
}

public class ThreadExtendsDemo {
	public static void main(String[] args)
	{
		Demo d=new Demo();
		Demo1 d1=new Demo1();
		Demo2 d2=new Demo2();
		
		d.start();
		d1.start();
		d2.start();
	}

}
