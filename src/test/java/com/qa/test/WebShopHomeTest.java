package com.qa.test;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.base.TestBase;
import com.qa.pages.WebShopHome;

public class WebShopHomeTest extends TestBase {
	
	
	WebShopHome home;
	
	public WebShopHomeTest() {
		
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		home=new WebShopHome();
	}
	
	@Test
	public void naviagetoLogin() {
		
		home.loginpg();
	}
	
	@AfterMethod
	public void teardown() {
		
		//driver.close();
	}

}
