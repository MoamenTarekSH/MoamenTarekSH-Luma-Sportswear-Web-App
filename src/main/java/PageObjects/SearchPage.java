package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SearchPage extends BasePage 
{
	

	
	public SearchPage(WebDriver driver) 
	{
		super(driver);
	}

	@FindBy(id =  "search")
	WebElement SearchBox;
	

	
	
	@FindBy(xpath =  "//*[@id=\"qs-option-1\"]")
	WebElement Search_1;
	
	@FindBy(xpath  =  "//*[@id=\"qs-option-2\"]")
	WebElement Search_2;
	
	@FindBy(id =  "qs-option-3")
	WebElement Search_3;
	
	@FindBy(id =  "qs-option-4")
	WebElement Search_4;
	
	@FindBy(xpath = "/html/body/div[2]/main/div[3]/div[1]/div[3]/div[2]/ol/li[1]/div/div/strong/a")
	public WebElement Item_1;

	@FindBy(xpath = "/html/body/div[2]/main/div[3]/div[1]/div[3]/div[2]/ol/li[2]/div/div/strong/a")
	public  WebElement Item_2;

	@FindBy(xpath = "/html/body/div[2]/main/div[3]/div[1]/div[3]/div[2]/ol/li[3]/div/div/strong/a")
	public WebElement Item_3;

	@FindBy(xpath = "/html/body/div[2]/main/div[3]/div[1]/div[3]/div[2]/ol/li[4]/div/div/strong/a")
	public WebElement Item_4;

	@FindBy(xpath = "/html/body/div[2]/main/div[3]/div[1]/div[3]/div[2]/ol/li[5]/div/div/strong/a")
	public WebElement Item_5;

	@FindBy(xpath = "/html/body/div[2]/main/div[3]/div[1]/div[3]/div[2]/ol/li[6]/div/div/strong/a")
	public WebElement Item_6;
	
	@FindBy(xpath = "/html/body/div[2]/main/div[3]/div[1]/div[3]/div[2]/ol/li[7]/div/div/strong/a")
	public WebElement Item_7;
	
	public void Auto_Search(String itemName) throws InterruptedException
	{
		CliclBTN(SearchBox);
		EnterTXT(SearchBox, itemName);
		CliclBTN(Search_1);
	}
	
	
	public void SearchItem(String ItemName)
	{
		EnterTXT(SearchBox, ItemName);
		SearchBox.submit();
	}
	
	
	@FindBy(xpath = "/html/body/div[2]/main/div[3]/div[1]/div[3]/div[2]/ol/li[1]/div/div/div[3]/div/div[2]/a[2]")
	WebElement Compare_1;
	
	@FindBy(xpath = "/html/body/div[2]/main/div[3]/div[1]/div[3]/div[2]/ol/li[2]/div/div/div[3]/div/div[2]/a[2]")
	WebElement Compare_2;
	
	@FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div[3]/div[1]/div[2]/div/div[1]/a")
	WebElement Compare_BTN;
	
	public void Select_Items1_Compare() throws InterruptedException
	{
		CliclBTN(Item_1);
	}
	public void Select_Items2_Compare() throws InterruptedException
	{
		CliclBTN(Item_2);
	}
	
	public void Select_Item4_WishList()
	{
		CliclBTN(Item_4);
	}
	
	public void Select_Item5_WishList()
	{
		CliclBTN(Item_5);
	}
	
	public void Opan_Compare()
	{
		CliclBTN(Compare_BTN);
	}
	
	
	public void Item_1()
	{
		CliclBTN(Item_1);
	}
	public void Item_2()
	{
		CliclBTN(Item_2);
	}
	public void Item_3()
	{
		CliclBTN(Item_3);
	}
	public void Item_4()
	{
		CliclBTN(Item_4);
	}
	
	
	@FindBy(id = "mode-grid")
	WebElement Grid;
	
	@FindBy(id =  "mode-list")
	WebElement List;
	
	@FindBy(id = "sorter")
	WebElement Sorter_BY;
	

	public void Change_SearchPage() throws InterruptedException
	{
		
		CliclBTN(List);
		Thread.sleep(2000);
		Select StorOpt = new Select(Sorter_BY);
		StorOpt.selectByValue("name");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
