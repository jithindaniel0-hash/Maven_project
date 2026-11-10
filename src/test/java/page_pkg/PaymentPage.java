package page_pkg;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"finish\"]") WebElement finishBtn;
	
	public PaymentPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	
//	Method
	
	public void ScreenshotMtd() throws Exception
	{
		File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(s, new File("C:\\Users\\USER\\eclipse-workspace\\MavenProject\\swagLabscnsrt\\paymentPage.png"));
	}
	
	public void finishMtd()
	{
		finishBtn.click();
	}

}
