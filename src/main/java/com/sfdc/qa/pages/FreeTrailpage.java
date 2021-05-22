package com.sfdc.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sfdc.qa.base.Base;

public class FreeTrailpage extends Base {
	
	//RegisterPage registerpage; 
	
	@FindBy(xpath = "//div[@class='btn-container  ']")
	WebElement trailbtn;
	
	@FindBy(xpath = "//input[@name='UserFirstName']")
	WebElement firstname;
	
	@FindBy(xpath = "//input[@name='UserLastName']")
	WebElement lastname;
	
	@FindBy(xpath = "//input[@name='UserTitle']")
	WebElement jobtitle;
	
	@FindBy(xpath = "//div[@class='btn-container']//a[@role='button']")
	WebElement nextbtn;
	
	public FreeTrailpage() {
		PageFactory.initElements(driver, this);
	}
	
	public RegisterPage validateTrail() {
		trailbtn.click();
		
		return new RegisterPage();
	}
	
}
