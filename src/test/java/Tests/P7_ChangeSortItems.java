package Tests;

import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.SearchPage;

public class P7_ChangeSortItems extends TestBase 
{
	HomePage homeObj;
	SearchPage searchObj;
	String ItemName = "Lando Gym Jacket" ;
	
	@Test(priority = 0)
	public void ReOpene_HomePage()
	{
		driver.get("https://magento.softwaretestingboard.com/");
		driver.navigate().refresh();
	}

	@Test(priority = 1)
	public void Chang_Sort_Items() throws InterruptedException 
	{
		homeObj = new HomePage(driver);
		searchObj = new SearchPage(driver);
		searchObj.SearchItem(ItemName);
		Thread.sleep(3000);
		searchObj.Change_SearchPage();
	}


}
