package junit;

import org.junit.Assert;
import org.junit.Test;

public class MulTestCase 
{
	@Test
	public void method() 
	{
		CommonOperation obj=new CommonOperation();
		int a=obj.mul(5, 5);
		Assert.assertEquals(25, a);
	}

}
