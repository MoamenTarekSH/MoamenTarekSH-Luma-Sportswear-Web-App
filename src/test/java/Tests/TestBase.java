package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import Utilities.Helper;

public class TestBase 
{

	public static WebDriver driver;


	@BeforeSuite
	@Parameters({"Browser"})
	public void OpenWebSite(@Optional("firefox") String broswerName) 
	{
		if(broswerName.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(broswerName.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(broswerName.equalsIgnoreCase("ie"))
		{
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	
	@AfterSuite
	public void CloseWebsite()
	{
		driver.quit();
	}
	
	
	@AfterMethod
	public void ScreenShotOnFailure(ITestResult Result)
	{
		if(Result.getStatus()== ITestResult.FAILURE)
		{
			System.out.println("Failed!");
			System.out.println("Takeing ScreenShot....");
			Helper.TakeScreenShoot(driver, Result.getName());
		}
		
	}
	
}
