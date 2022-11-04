package com.src.enterprise.UI;

import org.testng.annotations.Test;

import com.src.Enterprise.Helper.Base;
import com.src.Enterprise.PageObject.AmazonLoginPO;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class AmazonLogin extends Base
{
	
	 @Test
	  public void Login() 
	  {
		   driver.get("https://www.amazon.com");
		   AmazonLoginPO APO = new AmazonLoginPO(driver);
		   APO.Account();
		   
		   
		   
	  }
	  @BeforeMethod
	  public void beforeMethod() {
	  }
	 
	  @AfterMethod
	  public void afterMethod() {
	  }

}
