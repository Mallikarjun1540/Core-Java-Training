package exceptionhandling;

class ExceptionHandling
{
	void input()
	{
		int a=10,b=0;
		int c[]= {10,20,30};
		try
		{
			int z=a/b;
			System.out.println("value of z is"+z);
			System.out.println("c[5]    "+c[5]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("arithmetic exception occured"+e);
			
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println("Array Index Out Of Bound Exception occured "+e1);
		}
		finally
		{
			System.out.println("Value of A is "+a);
			System.out.println("Value of B is "+b);
			
		}
	}
}


public class ExceptionDemo {

	public static void main(String[] args) {
		ExceptionHandling obj=new ExceptionHandling();
		obj.input();

	}

}
