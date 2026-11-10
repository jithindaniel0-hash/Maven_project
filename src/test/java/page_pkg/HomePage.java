package page_pkg;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"header_container\"]/div[2]/span") WebElement productLabel;
	@FindBy(tagName="a")List<WebElement>links;
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-backpack\"]")WebElement cartBtn;
	
//	Constructor
	public HomePage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	
//	Method
	public String productLableVerification()
	{
		String actualText=productLabel.getText();
		return actualText;
	}
	
	public int linkCountMtd()
	{
		int Linkcount=links.size();
		return Linkcount;
	}
	
	public void cartMtd()
	{
		cartBtn.click();
	}

}
