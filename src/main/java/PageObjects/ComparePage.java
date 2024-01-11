package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComparePage extends BasePage 
{

	public ComparePage(WebDriver driver) 
	{
		super(driver);
	}
	
	
	@FindBy(xpath = "/html/body/div[2]/main/div[3]/div/div[3]/table/thead/tr/td/a")
	WebElement Remove_Btn;
	
	@FindBy(xpath = "/html/body/div[3]/aside[2]/div[2]/footer/button[2]")
	WebElement Ok_Btn;
	
	@FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div/a")
	WebElement Print_Compare;
	
	
	public void Remove_One_Item() throws InterruptedException
	{
		CliclBTN(Remove_Btn);
		Thread.sleep(2000);
		CliclBTN(Ok_Btn);
	}
	


}
