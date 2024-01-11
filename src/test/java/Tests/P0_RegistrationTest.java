package Tests;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import PageObjects.HomePage;
import PageObjects.RegisterPage;

public class P0_RegistrationTest extends TestBase
{
	HomePage homeObj;
	RegisterPage registerObj;
	Faker fake = new Faker();
	String Fname = fake.name().firstName();
	String Lname = fake.name().lastName();
	String Email = fake.internet().emailAddress();
	String Pass = fake.internet().password()+"ASD@#";
	
	@Test(priority = 0)
	public void Test_Registration()
	{
		homeObj = new HomePage(driver);
		homeObj.OpenRegister();
		registerObj = new RegisterPage(driver);
		registerObj.RegisterInputs(Fname, Lname, Email, Pass);
		driver.get("https://magento.softwaretestingboard.com/");
		driver.navigate().refresh();
	}
	
	//@Test(priority = 1)
	public void Test_Signout() throws InterruptedException
	{
		homeObj = new HomePage(driver);
		homeObj.SignOut_Steps();		
	}
	
}
