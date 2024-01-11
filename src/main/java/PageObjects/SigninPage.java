package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SigninPage extends BasePage 
{

	public SigninPage(WebDriver driver) 
	{
		super(driver);
	}
	

	
	@FindBy(id = "email")
	WebElement Email;
	
	@FindBy(id = "pass")
	WebElement Pass;
	
	@FindBy(xpath = "//*[@id=\"send2\"]")
	WebElement Signin_btn;

	public void Enter_LoginData(String email , String pass)
	{
		EnterTXT(Email, email);
		EnterTXT(Pass, pass);
		CliclBTN(Signin_btn);
	}
	
}
