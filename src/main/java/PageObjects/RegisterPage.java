package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage
{

	public RegisterPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(id = "firstname")
	WebElement FNamen;
	
	@FindBy(id = "lastname")
	WebElement LNamen;
	
	@FindBy(id = "email_address")
	WebElement Email;
	
	@FindBy(id = "password")
	WebElement Pass;
	
	@FindBy(id = "password-confirmation")
	WebElement ConfPass;
	
	@FindBy(xpath =  "/html/body/div[2]/main/div[3]/div/form/div/div[1]/button")
	WebElement Create_Btn;
	

	public void RegisterInputs(String fname , String lname , String email , String pass) 
	{
		EnterTXT(FNamen, fname);
		EnterTXT(LNamen, lname);
		EnterTXT(Email, email);
		EnterTXT(Pass, pass);
		EnterTXT(ConfPass, pass);
		CliclBTN(Create_Btn);
	}
	
	
	@FindBy(xpath = "/html/body/div[2]/main/div[2]/div[1]/div[4]/div[2]/div/div[2]/a[1]")
	WebElement EditAcc;
	
	@FindBy(xpath = "/html/body/div[2]/main/div[2]/div[1]/div[4]/div[2]/div/div[2]/a[2]")
	WebElement ChangePass;
	
	public void Open_ChangePass()
	{
		CliclBTN(ChangePass);
	}
	
	
	
}
