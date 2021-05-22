package com.sfdc.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sfdc.qa.base.Base;
import com.sfdc.qa.pages.HomePage;
import com.sfdc.qa.pages.Loginpage;

public class LoginPageTest extends Base {
	
	private static final boolean False = false;
	private static final boolean True = false;
	Loginpage loginpage;
	HomePage homepage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod()
	public void setUp() {
		initialization();
		loginpage = new Loginpage();
	}
	
	@Test(priority = 1)
	public void logoValidateTest() {
		boolean logo = loginpage.validateLogo();
		//System.out.println(logo);
		Assert.assertTrue(logo);
	}
	
	@Test(priority = 2)
	public void LoginPageTitleTest() {
		String title = loginpage.validateLoginPageTitle();
		Assert.assertEquals(title, "Login | Salesforce");
	}
	
	@Test(priority = 3)
	public void LoginTest() {
		homepage = loginpage.validateLogin(prop.getProperty("userid"), prop.getProperty("password"));
		//homepage = loginpage.validateLogin(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@AfterMethod()
	public void tearDown() {
		driver.quit();
	}
	
}
