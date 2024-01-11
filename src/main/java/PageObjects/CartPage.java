package PageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage extends BasePage 
{

	public CartPage(WebDriver driver) 
	{
		super(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30)) ;
		JS = (JavascriptExecutor)driver;
	}

	@FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div/div[3]/div[1]/ul/li[1]/button")
	WebElement ProcessdToCheck;


	@FindBy(css =   "#customer-email-fieldset > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)")
	WebElement Email;

	@FindBy(className =    "input-text")
	WebElement Fname;

	@FindBy(id =  "MVRC5DQ")
	WebElement Lname;

	@FindBy(id =  "NOL61PX")
	WebElement Address;

	@FindBy(id =  "D0W1HLD")
	WebElement City;

	@FindBy(xpath =   "//tagname[@name='region_id']\"")
	WebElement Region;

	@FindBy(id =  "MJXRMX4")
	WebElement ZIP;

	@FindBy(id =  "NAM6QP1")
	WebElement Contry;

	@FindBy(xpath =  "//*[@id=\"E6LKVXY\"]")
	WebElement Phone;

	@FindBy(xpath =  "//*[@id=\"checkout-shipping-method-load\"]/table/tbody/tr[1]/td[1]")
	WebElement Shipping_MTHD;

	@FindBy(xpath = "//*[@id=\"shipping-method-buttons-container\"]/div/button")
	WebElement Next_Btn;

	@FindBy(xpath =  "//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button")
	WebElement PlaceOrder;

	public void OpenCheckout()
	{
		CliclBTN(ProcessdToCheck);
	}

	public void EnterShippingData(String email , String fname , String lname ,  String address , String city , String zip , String phone ) throws InterruptedException
	{
		EnterTXT(Email, email + Keys.TAB +Keys.TAB 
				+ fname +Keys.TAB
				+lname +Keys.TAB+Keys.TAB+address+Keys.TAB+Keys.TAB+Keys.TAB+city );
		Select Reg = new Select(Region);
		Reg.selectByValue("123");
		EnterTXT(ZIP, zip);
		Select Con = new Select(Contry);
		Con.selectByValue("EG");
		EnterTXT(Phone, phone);
		CliclBTN(Shipping_MTHD);
		CliclBTN(Next_Btn);
		CliclBTN(PlaceOrder);
	}

	@FindBy(xpath = "//*[@id=\"shopping-cart-table\"]/tbody/tr[2]/td/div/a[2]")
	WebElement Remove_Item;
	public void RemoaveItem()
	{
		CliclBTN(Remove_Item);
	}

	@FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div/div[3]/p[2]/a")
	WebElement Home_Link;
	public void BackHome_Page()
	{
		CliclBTN(Home_Link);

	}



}
