package page_pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage
{
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a") WebElement carticon;
	@FindBy(xpath="//*[@id=\"header_container\"]/div[2]/span") WebElement yourcartLable;
	@FindBy(xpath="//*[@id=\"checkout\"]") WebElement checkoutBtn;
	
//	Constructor
	public CartPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	
//	Method
	public void carticonMtd()
	{
		carticon.click();
	}
	
	public String yourcartVerify()
	{
		String yourcartText=yourcartLable.getText();
		return yourcartText;
	}
	
	public void checkoutBtnMtd()
	{
		checkoutBtn.click();
	}
	
	

}
