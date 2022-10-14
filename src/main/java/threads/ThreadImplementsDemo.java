package threads;

class A implements Runnable
{
	public void run() {
		System.out.println("First Thread Starts");
		String s="Hello World";
		for(int i=0;i<s.length();i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(s.charAt(i));
		}
		System.out.println("First Thread Ends");
	}
}


class B implements Runnable
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

class C implements Runnable
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
public class ThreadImplementsDemo {

	public static void main(String[] args) {
		A a=new A();
		B b=new B();
		C c=new C();
		
		Thread t1=new Thread(a);
		Thread t2=new Thread(b);
		Thread t3=new Thread(c);
		
		t1.start();
		t2.start();
		t3.start();

	}

}
