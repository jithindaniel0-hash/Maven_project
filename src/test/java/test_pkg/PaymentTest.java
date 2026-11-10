package test_pkg;

import org.testng.annotations.Test;

import base_pkg.BaseClass;

public class PaymentTest extends BaseClass {
	
	@Test(priority = 1)
	public void scrnsrtTest() throws Exception
	{
		paymentobj.ScreenshotMtd();
	}
	
	@Test(priority = 2)
	public void finishTest()
	{
		paymentobj.finishMtd();
	}

}
