package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class WebShopHome extends TestBase{
	
	@FindBy(linkText ="Log in")
	WebElement loginbtn;
	
	
	
	
	public WebShopHome() {
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(driver, this);
	}
	
	public void loginpg() {
		
		loginbtn.click();
	}

}
