package com.lead.Selenium.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.lead.Selenium.utils.DriverManagerUtils;
import com.lead.Selenium.utils.UrlTextUtils;
import com.lead.Selenium.utils.XpathUtils;


public class LoginTest {
	private WebDriver driver=null;
	
	@Test (priority = 1)
	public void VerifyloginpageTitle(){
		driver = DriverManagerUtils.driver ;
		driver.get(UrlTextUtils.BASE_URL);
		Assert.assertEquals(driver.getTitle(), UrlTextUtils.Login_page_Title);
		System.out.println("Log in page verified");
	
		}
	
	@Test (priority = 2)
	public void loginTest(){
		driver.findElement(By.xpath(XpathUtils.Login.USER_NAME)).sendKeys("tutorial");
		driver.findElement(By.xpath(XpathUtils.Login.Password)).sendKeys("tutorial");
		driver.findElement(By.xpath(XpathUtils.Login.Sign_In_BTN)).click();
	}
	

}
