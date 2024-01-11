package Tests;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import PageObjects.ChangePassPage;
import PageObjects.HomePage;
import PageObjects.RegisterPage;

public class P8_RegisterAndChangPass extends TestBase
{
	HomePage homeObj;
	RegisterPage registerObj;
	ChangePassPage changObj;
	Faker fake = new Faker();
	String Fname = fake.name().firstName();
	String Lname = fake.name().lastName();
	String Email = fake.internet().emailAddress();
	String Pass = fake.internet().password()+"Amnn@#";
	String NEWPass = fake.internet().password()+"MND@#";
	
	
	@Test(priority = 0)
	public void Test_Registration()
	{
		homeObj = new HomePage(driver);
		homeObj.OpenRegister();
		registerObj = new RegisterPage(driver);
		registerObj.RegisterInputs(Fname, Lname, Email, Pass);
	}
	
	
	@Test(priority = 1)
	public void Test_changePass() throws InterruptedException
	{
		registerObj = new RegisterPage(driver);
		registerObj.Open_ChangePass();
		Thread.sleep(3000);
		changObj = new ChangePassPage(driver);
		changObj.EnterNewPass(Pass, NEWPass, NEWPass);
	}
	
	//@Test(priority = 2)
	public void Test_Signout() throws InterruptedException
	{
		driver.get("https://magento.softwaretestingboard.com/");
		driver.navigate().refresh();
		homeObj = new HomePage(driver);
		homeObj.SignOut_Steps();		
	}
	

}
