package com.xxx.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class xxx {

	@Test()
	public void testCase1() {
		  System.out.println("This is the Test Case 1");
		  
		  System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			   
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.close();
		 

		 
		
	}
}
