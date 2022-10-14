package exceptionhandling;
class Demo
{
	int a=10,b=0;
	int c[]= {11,12,13,14,15};
	void input()
	{
		try
		{
			int z=a/b;
			System.out.println("Value of Z is "+z);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception Occured "+e);
		}
		finally
		{
			System.out.println("Value of A is "+a);
			System.out.println("Value of B is "+b);
			
		}
		
	}
	void output()
	{
		try
		{
			System.out.println("c[6]  =  "+c[6]);
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Array Out of Bond Exception Occured "+ex);
		}
		finally
		{
			System.out.println("c[0]  =   "+c[0]);
		}
	}
}

public class ExceptionhandlingDemo {

	public static void main(String[] args) {
		Demo d=new Demo();
		d.input();
		d.output();

	}

}
