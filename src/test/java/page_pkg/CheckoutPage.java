package page_pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"first-name\"]") WebElement firstnamefield;
	@FindBy(xpath="//*[@id=\"last-name\"]") WebElement lastnamefield;
	@FindBy(xpath="//*[@id=\"postal-code\"]") WebElement zipcodefield;
	@FindBy(xpath="//*[@id=\"continue\"]") WebElement continueBtn;
	
//	constructor
	public CheckoutPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	

	//	Method
	public void DetailsMtd(String fname, String lname, String zip)
	{
		firstnamefield.sendKeys(fname);
		lastnamefield.sendKeys(lname);
		zipcodefield.sendKeys(zip);
	}
	
	public void continueMtd()
	{
		continueBtn.click();
		
	}
	


}
