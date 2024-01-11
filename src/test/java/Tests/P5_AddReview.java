package Tests;

import org.testng.annotations.Test;

import PageObjects.AboutItemPage;
import PageObjects.ComparePage;
import PageObjects.HomePage;
import PageObjects.ReviewPage;
import PageObjects.SearchPage;

public class P5_AddReview extends TestBase 
{
 
	HomePage homeObj;
	SearchPage searchObj;
	ComparePage compareObj;
	AboutItemPage aboutObj;
	ReviewPage reviewObj;
	String ItemName_1 = "Juno Jacket";

	
	@Test(priority = 0)
	public void Test_Compare_Item() throws InterruptedException
	{	
		searchObj = new SearchPage(driver);
		searchObj.SearchItem(ItemName_1);
		searchObj.Select_Item5_WishList();
		aboutObj = new AboutItemPage(driver);
		aboutObj.AddReview();
		Thread.sleep(1900);
		aboutObj.AddReview();
		reviewObj = new ReviewPage(driver);
		reviewObj.EnterReview("Moamen T" ,"Very Very Nice Producte", "When i see This Producte i buy it ");
	}
	
}
