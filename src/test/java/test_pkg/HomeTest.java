package test_pkg;

import org.testng.Assert;
import org.testng.annotations.Test;

import base_pkg.BaseClass;

public class HomeTest extends BaseClass {
	
	@Test(priority = 1)
	public void productLableTest()
	{
		
//		loginobj.loginMtd("standard_user", "secret_sauce"); // calls the login method before executing the homePage method
		String productText=homeobj.productLableVerification();
		Assert.assertEquals(productText,"Products");
	}
	
	@Test(priority = 2)
	public void  linkCountTest()
	{
		int linkcount=homeobj.linkCountMtd();
		System.out.println("linkcount is : " +linkcount);
	}
	
	@Test(priority = 3)
	public void  cartTest()
	{
		homeobj.cartMtd();
	}

}
