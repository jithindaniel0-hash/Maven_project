package page_pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"user-name\"]") WebElement username;
	@FindBy(xpath="//*[@id=\"password\"]") WebElement password;
	@FindBy(xpath="//*[@id=\"login-button\"]") WebElement login_btn;
	
	//consturctor
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	
	//method
	
	public String titleMtd()
	{
		String title=driver.getTitle();
		return title;
	}
	
	public void loginMtd(String un, String pw)
	{
		username.sendKeys(un);
		password.sendKeys(pw);
		login_btn.click();
	}
	
	public String urlMtd()
	{
		String actualurl=driver.getCurrentUrl();
		return actualurl;
	}

}
