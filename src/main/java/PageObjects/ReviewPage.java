package PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReviewPage extends BasePage 
{

	public ReviewPage(WebDriver driver) 
	{
		super(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30)) ;
		JS = (JavascriptExecutor)driver;
	}
	
	@FindBy(id = "nickname_field")
	WebElement Name;
	
	@FindBy(xpath =   "//*[@id=\"Rating_4_label\"]")
	WebElement Rate_Btn;
	
	
	@FindBy(id = "summary_field")
	WebElement Summary;
	
	@FindBy(id = "review_field")
	WebElement Review_MSG;
	
	@FindBy(xpath =  "//*[@id=\"review-form\"]/div/div/button")
	WebElement Submit;
	
	public void EnterReview(String name, String summry , String review)
	{
		
		//wait.until(ExpectedConditions.elementToBeClickable(By.id("Rating_4_label")));
		
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"Rating_4_label\"]"))); 
		JS.executeScript("arguments[0].click();", element);
		//Actions actions = new Actions(driver);
		//actions.moveToElement(Rate_Btn).click().build().perform();
		EnterTXT(Name, name);
		EnterTXT(Summary, summry);
		EnterTXT(Review_MSG, review);
		CliclBTN(Submit);
	}
	
}
