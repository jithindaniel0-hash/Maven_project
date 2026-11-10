package test_pkg;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import base_pkg.BaseClass;

public class LoginTest extends BaseClass 
{
	@Test(priority = 1)
	public void titleVerificationMtd()
	{
		String actualtitle=loginobj.titleMtd();
		Assert.assertEquals(actualtitle, "Swag Labs");
	}
	
	@Test(priority = 2)
	public void loginTestMtd()
	{
		loginobj.loginMtd("standard_user", "secret_sauce");
		
	}
	
	@Test(priority = 3)
	public void urlTestMtd()
	{
		String Homeurl=loginobj.urlMtd();
		System.out.println(Homeurl);
//		Assert.assertEquals(Homeurl, "https://www.saucedemo.com/inventory.html");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlToBe("https://www.saucedemo.com/inventory.html"));
	}

}
