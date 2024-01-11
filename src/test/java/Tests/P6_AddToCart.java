package Tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import PageObjects.AboutItemPage;
import PageObjects.CartPage;
import PageObjects.HomePage;
import PageObjects.SearchPage;

public class P6_AddToCart extends TestBase 
{
	HomePage homeObj;
	SearchPage searchObj;
	AboutItemPage aboutObj;
	CartPage cartObj;
	String ItemName_1 = "Juno Jacket";
	String ItemName_2 = "Hero Hoodie";
	
	
	/*
	 * Faker fake = new Faker();
	 * String Fname = fake.name().firstName(); String Lname =
	 * fake.name().lastName(); String Email = fake.internet().emailAddress(); String
	 * ZIP = fake.address().zipCode(); String Address =
	 * fake.address().fullAddress(); String City = fake.address().cityName(); String
	 * Phone = fake.phoneNumber().phoneNumber();
	 */
	

	@Test(priority = 0)
	public void ReOpene_HomePage()
	{
		driver.get("https://magento.softwaretestingboard.com/");
		driver.navigate().refresh();
	}
	
	
	@Test(priority = 1)
	public void Test_AddToCart() throws InterruptedException
	{	
		searchObj = new SearchPage(driver);
		searchObj.SearchItem(ItemName_1);
		searchObj.Item_4();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		aboutObj = new AboutItemPage(driver);
		aboutObj.AddCart();
		Thread.sleep(3000);
		searchObj.SearchItem(ItemName_2);
		searchObj.Item_1();
		jse.executeScript("window.scrollBy(0,500)");
		aboutObj.AddCart();
		Thread.sleep(3000);
		cartObj = new CartPage(driver);
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		cartObj.RemoaveItem();		
		
	//Shipping Cart Item
		//Thread.sleep(6000);
		//jse.executeScript("window.scrollBy(0,1000)");
		//cartObj.EnterShippingData(Email, Fname, Lname ,  Address, City, ZIP, Phone);
		
	}
	
}
