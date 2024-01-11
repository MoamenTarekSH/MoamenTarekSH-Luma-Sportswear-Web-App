package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishPage extends BasePage 
{

	public WishPage(WebDriver driver) 
	{
		super(driver);
	}
	
	
	@FindBy(xpath = "//*[@id=\"wishlist-view-form\"]/div[2]/div[1]/button[1]")
	WebElement Update_List;
	
	public void Update_List()
	{
		CliclBTN(Update_List);
	}
	
	@FindBy(xpath = "//*[@id=\"wishlist-view-form\"]/div[2]/div[1]/button[2]")
	WebElement Share_List;
	
	@FindBy(id =  "email_address")
	WebElement EmailToShare;
	
	@FindBy(id =  "message")
	WebElement Message;
	
	@FindBy(xpath =   "//*[@id=\"form-validate\"]/div/div[1]/button")
	WebElement Share_Btn;
	
	public void Share_List(String email , String msg)
	{
		CliclBTN(Share_List);
		EnterTXT(EmailToShare, email);
		EnterTXT(Message, msg);
		CliclBTN(Share_Btn);
	}
	
	@FindBy(xpath = "//*[@id=\"wishlist-view-form\"]/div[2]/div[1]/button[3]")
	WebElement AddAll_Cart;
	

}
