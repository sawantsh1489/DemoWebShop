package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class WebShopLogin extends TestBase {
	
	@FindBy(id="Email")
	WebElement emailbox;
	
	@FindBy(id="Password")
	WebElement pwd;
	
	@FindBy(xpath="//input[@value='Log in']")
	WebElement loginbtn;
	
	public WebShopLogin() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void loginWebshop(String username, String password) {
		
		emailbox.sendKeys(username);
		pwd.sendKeys(password);
		
		loginbtn.click();
		
		
	}

}
