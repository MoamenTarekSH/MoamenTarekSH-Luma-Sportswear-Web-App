package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangePassPage extends BasePage 
{

	public ChangePassPage(WebDriver driver) 
	{
		super(driver);
	}
	

	
	@FindBy(xpath =   "//*[@id=\"current-password\"]")
	WebElement CurrentPss;
	
	@FindBy(xpath = "//*[@id=\"password\"]")
	WebElement NewPass;
	
	
	@FindBy(xpath =  "//*[@id=\"password-confirmation\"]")
	WebElement ConfPass;
	
	
	@FindBy(xpath = "/html/body/div[2]/main/div[2]/div[1]/form/div/div[1]/button")
	WebElement Save_Btn;
	
	public void EnterNewPass(String curpass , String newpass , String confpass)
	{
		EnterTXT(CurrentPss, curpass);
		EnterTXT(NewPass, newpass);
		EnterTXT(ConfPass, confpass);
		CliclBTN(Save_Btn);
	}

}
