package com.src.enterprise.UI;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.src.Enterprise.Helper.Base;
import com.src.Enterprise.PageObject.AmazonLoginPO;
import com.src.Enterprise.PageObject.GoogleLaunch;

public class GoogleLogin extends Base {
	private static final Logger logger = LogManager.getLogger(GoogleLogin.class);
	 @Test
	  public void Login() 
	  {
		// basic log4j configurator
		  BasicConfigurator.configure();
		  logger.info("Hello world");
		  logger.info("we are in logger info mode");
		 	// TODO Auto-generated method stub

		   driver.get("https://www.google.com");
		   GoogleLaunch GPO = new GoogleLaunch(driver);
		   GPO.Account(); 
	  }
	  @BeforeMethod
	  public void beforeMethod() {
	  }
	 
	  @AfterMethod
	  public void afterMethod() {
	  }
}
