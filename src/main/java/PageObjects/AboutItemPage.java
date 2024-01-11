package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AboutItemPage extends BasePage 
{

	public AboutItemPage(WebDriver driver) 
	{
		super(driver);
	}


	@FindBy(id = "product-addtocart-button")
	WebElement AddTo_Cart;

	@FindBy(xpath = "/html/body/div[2]/main/div[1]/div[2]/div/div/div/a")
	WebElement OpenCart_Link;


	@FindBy(xpath =  "//*[@id=\"maincontent\"]/div[2]/div/div[2]/div[5]/div/a[2]")
	WebElement AddTo_Compare;

	@FindBy(xpath =  "//*[@id=\"maincontent\"]/div[2]/div/div[2]/div[5]/div/a[1]")
	WebElement AddTo_Wish;

	@FindBy(xpath = "//*[@id=\"maincontent\"]/div[2]/div/div[2]/div[2]/div[2]/a[2]")
	WebElement Add_Review;

	@FindBy(xpath = "//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div/a")
	WebElement Compare_Link;

	@FindBy(xpath =  "//*[@id=\"option-label-size-143-item-168\"]")
	WebElement ItemMeasure ;

	@FindBy(xpath =   "//*[@id=\"option-label-color-93-item-53\"]")
	WebElement ItemColor ;


	public void AddCart()
	{
		CliclBTN(ItemMeasure);
		CliclBTN(ItemColor);
		CliclBTN(AddTo_Cart);
		CliclBTN(OpenCart_Link);
	}

	public void ADDToCompare()
	{
		CliclBTN(AddTo_Compare);
	}
	public void AddToWish()
	{
		CliclBTN(AddTo_Wish);
	}

	public void AddReview()
	{
		CliclBTN(Add_Review);
	}

	public void OpenCompareLink()
	{
		CliclBTN(Compare_Link);
	}






}
