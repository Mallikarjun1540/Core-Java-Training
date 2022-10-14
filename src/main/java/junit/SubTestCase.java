package junit;

import org.junit.Assert;
import org.junit.Test;

public class SubTestCase 
{
	@Test
	public void method() 
	{
		CommonOperation obj=new CommonOperation();
		int a=obj.sub(10, 5);
		Assert.assertEquals(5, a);
	}

}
