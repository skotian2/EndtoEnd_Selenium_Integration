package com.src.Enterprise.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.src.Enterprise.Helper.Base;

public class AmazonLoginPO extends Base
{
    public WebDriver driver;
    
    By Account = By.xpath("//*[@id=\"nav-link-accountList\"]");
   
    public AmazonLoginPO(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void Account()
    {
      Actions At= new Actions(driver);
      At.clickAndHold(driver.findElement(Account)).build().perform();   
    }


}


