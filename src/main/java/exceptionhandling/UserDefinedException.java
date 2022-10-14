package exceptionhandling;

class MyException extends Exception
{
	String msg1;
	MyException(String msg)
	{
	
		super(msg);
		msg1=msg;
	}
	
	
	
	public String toString() 
	{
		return("Exception occured"+msg1);
	}
}
public class UserDefinedException  {

	public static void main(String[] args) {
		try
		{
			System.out.println("Exception occured in Myexception method ");
			throw new MyException("This is my error msg");
		}
		catch(MyException e)
		{
			System.out.println("Exception is "+e);
		}
	}

}
