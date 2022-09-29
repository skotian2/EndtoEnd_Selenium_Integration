package com.enterprise.test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Twitter {
  @Test
  public void twitterLaunch()
  {
  ChromeDriver CD= new ChromeDriver();
  CD.get("https://twitter.com/?lang=en");
  String Title="";
  }
}
