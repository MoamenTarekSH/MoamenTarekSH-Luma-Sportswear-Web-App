package Tests;

import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.SearchPage;

public class P1_SearchForItem extends TestBase 
{
	HomePage homeObj;
	SearchPage searchObj;
	String ItemName = "jackets for" ;

	
	@Test(priority = 0)
	public void ReOpene_HomePage()
	{
		driver.get("https://magento.softwaretestingboard.com/");
		driver.navigate().refresh();
	}
	
	@Test(priority = 1)
	public void Test_Auto_Search() throws InterruptedException 
	{
		homeObj = new HomePage(driver);
		searchObj = new SearchPage(driver);
		searchObj.Auto_Search(ItemName);
		searchObj.Item_2();
	}


}
