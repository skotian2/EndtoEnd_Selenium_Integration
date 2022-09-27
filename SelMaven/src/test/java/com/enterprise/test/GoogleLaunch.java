package com.enterprise.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleLaunch {
  @Test
  public void BrowserLaunch() 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Code\\Chrome\\chromedriver.exe");	  
	   WebDriver demo = new ChromeDriver();
	   demo.get("https://www.facebook.com");
  }
}
