package com.src.Enterprise.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.src.Enterprise.Helper.Base;

public class GoogleLaunch extends Base
{
    public WebDriver driver;
    
    By Account = By.xpath("//*[@id=\"nav-link-accountList\"]");
   
    public GoogleLaunch(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void Account()
    {
    driver.get("https://www.google.com");   
    }


}