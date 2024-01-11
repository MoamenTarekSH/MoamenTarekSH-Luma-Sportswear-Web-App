package Tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import PageObjects.AboutItemPage;
import PageObjects.ComparePage;
import PageObjects.HomePage;
import PageObjects.SearchPage;
import PageObjects.WishPage;

public class P4_AddToWishList extends TestBase {

	HomePage homeObj;
	SearchPage searchObj;
	ComparePage compareObj;
	AboutItemPage aboutObj;
	WishPage wishObj;
	String ItemName_1 = "Juno Jacket";
	String ItemName_2 = "Lando Gym Jacket";

	/*
	 * RegisterPage registerObj; Faker fake = new Faker(); String Fname =
	 * fake.name().firstName(); String Lname = fake.name().lastName(); String Email
	 * = fake.internet().emailAddress(); String Pass =
	 * fake.internet().password()+"ASD@#";
	 * 
	 * @Test(priority = 0) public void Creat_Account() { homeObj = new
	 * HomePage(driver); homeObj.OpenRegister(); registerObj = new
	 * RegisterPage(driver); registerObj.RegisterInputs(Fname, Lname, Email, Pass);
	 * }
	 */

	@Test(priority = 0)
	public void ReOpene_HomePage()
	{
		driver.get("https://magento.softwaretestingboard.com/");
		driver.navigate().refresh();
	}
	
	
	
	@Test(priority = 1)
	public void Test_WishList() throws InterruptedException 
	{
		
		
		searchObj = new SearchPage(driver);
		searchObj.SearchItem(ItemName_1);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,700)");
		searchObj.Select_Item4_WishList();
		aboutObj = new AboutItemPage(driver);
		aboutObj.AddToWish();
		searchObj.SearchItem(ItemName_2);
		jse.executeScript("window.scrollBy(0,700)");
		searchObj.Item_1.click();
		Thread.sleep(3000);
		aboutObj.AddToWish();
		/*
		 * jse.executeScript("window.scrollBy(0,700)"); Thread.sleep(3000); wishObj =
		 * new WishPage(driver); wishObj.Share_List("demo@gmail.com",
		 * "i want to buy this items what your opinion");
		 */
	}

}
