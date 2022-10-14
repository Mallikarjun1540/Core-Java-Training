package junit;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class AddTestCase 
{
	@After
	public void m1()
	{
		System.out.println("Before Test Case");
	}
	@Before
	public void m2()
	{
		System.out.println("After Test Case");
	}
	
	@Test
	public void method() 
	{
		CommonOperation obj=new CommonOperation();
		int a=obj.add(5, 5);
		System.out.println("with in Test case");
		Assert.assertEquals(10, a);
	}

}
