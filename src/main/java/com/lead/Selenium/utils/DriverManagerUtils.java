package com.lead.Selenium.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DriverManagerUtils {
	
 static {
	 System.setProperty("webdriver.chrome.driver", "C:\\workspace\\chromedriver_win32\\chromedriver.exe");
      }  
	 public static  WebDriver driver = new ChromeDriver();
	 
	@Test
	 public void DriverExecutionText()
	 {
		 System.out.println("Driver Execute");
	 }
	 
	 private DriverManagerUtils(){
		 
	 }
        
}
