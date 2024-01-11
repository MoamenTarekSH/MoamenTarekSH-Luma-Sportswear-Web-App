package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage 
{
	public WebDriver driver ;
	public WebDriverWait wait;
	JavascriptExecutor JS;
	public  BasePage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	protected void  CliclBTN(WebElement Button) 
	{
		Button.click();
	}
	
	protected void EnterTXT(WebElement textElement , String value) 
	{
		textElement.sendKeys(value);
	}
	
	public void ScrollDown()
	{
		JS.executeScript("scrollBy(0,2000)");
		
	}

}
