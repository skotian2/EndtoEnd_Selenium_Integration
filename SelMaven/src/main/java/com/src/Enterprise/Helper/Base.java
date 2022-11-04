package com.src.Enterprise.Helper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base extends ConstantVariable 
{
	public static WebDriver driver=null;
	@BeforeClass
	public static WebDriver Browsersetup()
	{
		Reporter.log("=====Browser Session Started=====", true);
	    //Use Of Singleton Concept and Initilize webDriver
		if (driver == null)
		{
			try {
				if (ConstantVariable.BrowserName.equals("Chrome"))
				{
				    System.setProperty("webdriver.chrome.driver",ConstantVariable.Driverpath);
					 ChromeOptions options = new ChromeOptions();
					 options.addArguments("--incongnito");
				     options.addArguments("-no-sandbox");
					 //options.addArguments("--headless");
				     options.addArguments("--window-size=1920,1080");
				     options.addArguments("--start-maximized");
				     //Reporter.log(options, true);
				     driver=new ChromeDriver(options);
				 }
				else if (ConstantVariable.BrowserName.equals("chrome headless"))
				{
				    ChromeOptions options = new ChromeOptions();
				    options.addArguments("--headless");
				    //driver = new ChromeDriver();
				    driver = new ChromeDriver(options);
				}
				else if (ConstantVariable.BrowserName.equals("Firefox"))
				{
					driver = new ChromeDriver();
				}
				else if (ConstantVariable.BrowserName.equals("IE"))
				{
					driver = new ChromeDriver();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		//Perform Basic Operations
		driver.manage().window().maximize();
		return driver;


	}
	public static void quit()
	{
		driver.quit();
		driver = null; // we destroy the driver object after quit operation
	}



}

