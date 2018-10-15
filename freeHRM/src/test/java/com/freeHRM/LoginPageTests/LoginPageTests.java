package com.freeHRM.LoginPageTests;

import org.testng.annotations.Test;

import com.freeHRM.TestBase.TestBase;
import com.freecrm.Pages.LoginPage;

public class LoginPageTests extends TestBase
{
	//LoginPage loginpage;


	public LoginPageTests()
	{
		super();
		
	}
	@Test
	public void setup()
	{
		Intialization();
		LoginPage loginpage; 
	}
	
	/*@Test
	public void verifySuccessfulLogin()
	{
		loginpage.loginsuccessful("Admin", "Admin");
    }

	@Test
	public Object[][] data()
	{
		Object data[][]=TestUtils.getData();
		return data ;
	}

	@Test
	public void verifuydisplayed()
	{
		TestUtils.isdisplayed(loginpage.userNameTB,"Textbox");
	}
	
	*/
}