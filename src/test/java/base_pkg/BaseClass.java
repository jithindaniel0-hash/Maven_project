package base_pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import page_pkg.CartPage;
import page_pkg.CheckoutPage;
import page_pkg.HomePage;
import page_pkg.LoginPage;
import page_pkg.PaymentPage;

public class BaseClass 
{
	public static WebDriver driver;
	public LoginPage loginobj;
	public HomePage homeobj;
	public CartPage cartobj;
	public CheckoutPage checkoutobj;
	public PaymentPage paymentobj;
	
	@BeforeTest
	public void openurl()
	{
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--incognito");
		driver=new ChromeDriver(option);
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void objectMtd()
	{
		loginobj=new LoginPage(driver);
		homeobj=new HomePage(driver);
		cartobj=new CartPage(driver);
		checkoutobj=new CheckoutPage(driver); 
		paymentobj=new PaymentPage(driver);
	}

}
