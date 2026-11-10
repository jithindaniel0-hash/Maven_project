package test_pkg;

import org.testng.Assert;
import org.testng.annotations.Test;

import base_pkg.BaseClass;

public class CartTest extends BaseClass 
{
	@Test(priority = 1)
	public void cartTestMtd()
	{
		cartobj.carticonMtd();
	}
	
	@Test(priority = 2)
	public void yourcartTestMtd()
	{
		String actualText=cartobj.yourcartVerify();
		Assert.assertEquals(actualText, "Your Cart");
	}
	
	@Test(priority = 3)
	public void checkoutTest()
	{
		cartobj.checkoutBtnMtd();
	}
		

}
