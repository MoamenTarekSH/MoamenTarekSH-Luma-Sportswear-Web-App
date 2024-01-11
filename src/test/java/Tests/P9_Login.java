package Tests;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import PageObjects.HomePage;
import PageObjects.RegisterPage;
import PageObjects.SigninPage;

public class P9_Login extends TestBase
{
	HomePage homeObj;
	RegisterPage registerObj;
	SigninPage signObj;
	Faker fake = new Faker();
	String Fname = fake.name().firstName();
	String Lname = fake.name().lastName();
	String Email = fake.internet().emailAddress();
	String Pass = fake.internet().password()+"Amn@#14";

	
	
	@Test(priority = 0)
	public void Test_Registration() throws InterruptedException
	{
		homeObj = new HomePage(driver);
		homeObj.OpenRegister();
		registerObj = new RegisterPage(driver);
		registerObj.RegisterInputs(Fname, Lname, Email, Pass);
		Thread.sleep(3000);
	}
	
	@Test(priority = 1)
	public void Test_Signout() throws InterruptedException
	{
		homeObj = new HomePage(driver);
		homeObj.SignOut_Steps();		
	}
	
	@Test(priority = 2)
	public void Test_Login() throws InterruptedException
	{
		//driver.get("https://magento.softwaretestingboard.com/");
		homeObj = new HomePage(driver);
		homeObj.Open_Siginin_Page();
		signObj = new SigninPage(driver);
		signObj.Enter_LoginData(Email, Pass);	

	}
	
	
}
