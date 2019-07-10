package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

import junit.framework.Assert;

public class WebShopLogin extends TestBase {
	
	@FindBy(id="Email")
	WebElement emailbox;
	
	@FindBy(id="Password")
	WebElement pwd;
	
	@FindBy(xpath="//input[@value='Log in']")
	WebElement loginbtn;
	
	@FindBy(linkText ="Log out")
	WebElement logoutbtn;
	
	public WebShopLogin() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void loginWebshop(String username, String password) {
		
		emailbox.sendKeys(username);
		pwd.sendKeys(password);
		
		loginbtn.click();
		
		
		
	}
	
	public void logoutWebshop() {
		
		try {
		logoutbtn.click();
		}
		catch(Exception e) {
			
			String expecErrormsg="Login was unsuccessful. Please correct the errors and try again.\r\n" + 
					"The credentials provided are incorrect";
			String errormsg=driver.findElement(By.xpath("//div [@class='validation-summary-errors']")).getText();
			System.out.println(errormsg);
			Assert.assertEquals(expecErrormsg, errormsg);
			//driver.close();
		}
	}
	
	

}
