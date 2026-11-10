package test_pkg;

import org.testng.annotations.Test;

import base_pkg.BaseClass;

public class CheckoutTest extends BaseClass
{
	@Test(priority = 1)
	public void DetailsTest()
	{
		checkoutobj.DetailsMtd("jithin","daniel","200060");
	}
	
	@Test(priority = 2)
	public void continueTest()
	{
		checkoutobj.continueMtd();
	}

}
