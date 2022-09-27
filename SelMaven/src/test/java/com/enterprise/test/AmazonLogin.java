package com.enterprise.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class AmazonLogin {
  @Test
  public void Login() 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Code\\Chrome\\chromedriver.exe");	  
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://www.amazon.com");
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}
