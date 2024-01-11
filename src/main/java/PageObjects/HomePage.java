package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage 
{

	public HomePage(WebDriver driver) 
	{
		super(driver);
	}

	@FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[3]/a")
	WebElement Register;

	@FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[2]/a")
	WebElement Signin;

	@FindBy(id =  "ui-id-3")
	WebElement WhatNew;

	@FindBy(id =  "ui-id-4")
	WebElement Women;

	@FindBy(xpath = "ui-id-5")
	WebElement Men;
	
	@FindBy(xpath = "/html/body/div[2]/footer/div/div/div/ul/li[3]/a")
	WebElement ContactUs;
	
	public void OpenRegister()
	{
		CliclBTN(Register);
	}
	
	public void OpenWomen()
	{
		CliclBTN(Women);
	}
	
	public void ContactUs() 
	{
		CliclBTN(ContactUs);
	}

	public void Open_Siginin_Page()
	{
		CliclBTN(Signin);
	}
	
	
	@FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[2]/span/button")
	WebElement Acc_List;
	
	
	@FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a")
	WebElement Signout_Link;
	
	public void SignOut_Steps() throws InterruptedException
	{
		CliclBTN(Acc_List);
		Thread.sleep(1000);
		CliclBTN(Signout_Link);
	}
	
	
	
	
	
	
	
}
