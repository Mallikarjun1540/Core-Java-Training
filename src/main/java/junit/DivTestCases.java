package junit;

import org.junit.Assert;
import org.junit.Test;

public class DivTestCases 
{
	@Test
	public void method() 
	{
		CommonOperation obj=new CommonOperation();
		int a=obj.div(10, 5);
		Assert.assertEquals(2, a);
	}

}
