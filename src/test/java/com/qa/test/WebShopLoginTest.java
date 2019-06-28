package com.qa.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.WebShopHome;
import com.qa.pages.WebShopLogin;
import com.qa.utils.TestUtil;

public class WebShopLoginTest extends TestBase {
	
	WebShopLogin login;
	WebShopHome home;
	String sheetName = "users";
	
public  WebShopLoginTest() {
	// TODO Auto-generated constructor stub
	super();
}
	 
	
	@BeforeMethod
	  public void setup() {
		
		initialization();
		login=new WebShopLogin();
		home=new WebShopHome();
		
	  }
	
	
  @Test(dataProvider="getdata")
  public void loginTest(String username, String password) {
	  
	  home.loginpg();
	  
	  login.loginWebshop(username, password);
	  
  }

  
  @DataProvider
  public Object[][] getdata(){
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}

  @AfterMethod
  public void afterMethod() {
	  
	  //driver.close();
  }

}
