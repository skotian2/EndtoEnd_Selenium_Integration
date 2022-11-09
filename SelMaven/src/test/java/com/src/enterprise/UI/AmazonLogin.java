package com.src.enterprise.UI;

import org.testng.annotations.Test;

import com.src.Enterprise.Helper.Base;
import com.src.Enterprise.PageObject.AmazonLoginPO;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class AmazonLogin extends Base
{
	
	private static final Logger logger = LogManager.getLogger(AmazonLogin.class);
	
	 @Test
	  public void Login() 
	  {

		  BasicConfigurator.configure();
		  logger.info("Hello world");
		  logger.info("we are in logger info mode");
		 	// TODO Auto-generated method stub  
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
