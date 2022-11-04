package com.src.Enterprise.Helper;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.ScreenshotException;

public class ScreenShots 
{
	private static ScreenshotException ss;
    
    public static String Takescreenshot(ChromeDriver driver, String screenshotName , String testname)
    {
    	
        String path = testname + "_" + screenshotName + "_" + ".png";
       
        return path;
    }
}
