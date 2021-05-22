package com.sfdc.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sfdc.qa.base.Base;
import com.sfdc.qa.pages.FreeTrailpage;
import com.sfdc.qa.pages.RegisterPage;

public class FreeTrailPageTest extends Base{
	
	FreeTrailpage freeTrailPage;
	RegisterPage registerPage;
	public FreeTrailPageTest() {
		super();
	}
	
	@BeforeMethod()
	public void setUp() {
		initialization();
		freeTrailPage = new FreeTrailpage();
	}
	
	@Test
	public void trailBtnTest() {
		//registerPage = freeTrailPage.validateTrail();
	}
	
	@AfterMethod()
	public void tearDown() {
		driver.quit();
	}
	
}
