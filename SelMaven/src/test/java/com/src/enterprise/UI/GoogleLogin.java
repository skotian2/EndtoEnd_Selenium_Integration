package com.src.enterprise.UI;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.src.Enterprise.Helper.Base;
import com.src.Enterprise.PageObject.AmazonLoginPO;
import com.src.Enterprise.PageObject.GoogleLaunch;

public class GoogleLogin extends Base {

	 @Test
	  public void Login() 
	  {
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
