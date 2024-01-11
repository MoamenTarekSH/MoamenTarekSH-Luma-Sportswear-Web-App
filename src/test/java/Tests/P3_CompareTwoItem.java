package Tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import PageObjects.AboutItemPage;
import PageObjects.ComparePage;
import PageObjects.HomePage;
import PageObjects.SearchPage;

public class P3_CompareTwoItem extends TestBase 
{
 
	

	HomePage homeObj;
	SearchPage searchObj;
	ComparePage compareObj;
	AboutItemPage aboutObj;
	String ItemName_1 = "Diva Gym Tee";
	String ItemName_2 = "Aero Daily Fitness Tee";
	
	@Test
	public void Test_Compare_Item() throws InterruptedException
	{	
		searchObj = new SearchPage(driver);
		searchObj.SearchItem(ItemName_1);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,800)");
		searchObj.Item_1.click();
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,500)");
		aboutObj = new AboutItemPage(driver);
		aboutObj.ADDToCompare();
		searchObj.SearchItem(ItemName_2);
		jse.executeScript("window.scrollBy(0,800)");
		searchObj.Item_2.click();
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,500)");
		aboutObj.ADDToCompare();
		Thread.sleep(1000);
		aboutObj.OpenCompareLink();
		compareObj = new ComparePage(driver);
		Thread.sleep(3000);
		compareObj.Remove_One_Item();
	}
	
}
