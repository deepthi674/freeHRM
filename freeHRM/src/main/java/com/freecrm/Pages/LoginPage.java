package com.freecrm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freeHRM.TestBase.TestBase;


public class LoginPage extends TestBase
{
			
	@FindBy(xpath="//input[@name='username']")
	public WebElement userNameTB;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement passwordTB;
	
	//public By pdsd = By.xpath("//input[@name='password']");
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//actions
	public void enterUserName()
	{
		userNameTB.sendKeys("admin");
	}
	
	public void loginsuccessful(String name,String password)
	{
		userNameTB.sendKeys(name);
		passwordTB.sendKeys(password);
		loginBtn.click();
	}
	
}

