package threads;


class Demo3 extends Thread
{
	public void run()
	{
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

class Demo4 extends Thread
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

class Demo5 extends Thread
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

public class ThreadPriority {
	public static void main(String[] args)
	{
		Demo3 d=new Demo3();
		Demo4 d1=new Demo4();
		Demo5 d2=new Demo5();
		
		//d.setPriority(Thread.NORM_PRIORITY);
		//d1.setPriority(Thread.MIN_PRIORITY);
		d2.setPriority(10);
		
	
		d.start();
		
		
		
		d1.start();
	
		
	
		d2.start();
	
	}

}


