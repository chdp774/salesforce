package com.sfdc.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sfdc.qa.base.Base;

public class Loginpage extends Base {
	
	// page factory or OR:
	@FindBy(xpath = "//input[@id='username']")
	WebElement username;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath = "//input[@id='Login']")
	WebElement loginbtn;
	
	//@FindBy(xpath = "//img[@name='logo']")
	@FindBy(xpath = "//div[@id='left']//div[@id='logo_wrapper']/div")
	WebElement sfdclogo;
	
	@FindBy(xpath = "//input[@name='rememberUn']")
	WebElement rememberme;
	
	// initializing the page object
	public Loginpage() {
		PageFactory.initElements(driver, this);
	}
	
	// actions
	public String validateLoginPageTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public boolean validateLogo() {
		// boolean flag = logo.isDisplayed();
		//driver.switchTo().frame(3);
		return sfdclogo.isDisplayed();
//		WebElement logo = driver.findElement(By.xpath("//img[@name='logo']"));
//		return logo.isDisplayed();
		
	}
	
	public HomePage validateLogin(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		rememberme.click();
		loginbtn.click();

//		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(un);
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
//		driver.findElement(By.xpath("//input[@id='Login']")).click();
		return new HomePage();
	}
}
