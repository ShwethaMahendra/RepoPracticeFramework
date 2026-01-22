package com.vtiger.orgtest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CreateOrgTest {
	
	@Test
	public void LoginToApp() {
		
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		String USERNAME = System.getProperty("username");
		String PWD = System.getProperty("password");
		
		WebDriver driver= null;
		if(BROWSER.equals("chrome"))
			driver= new ChromeDriver();
		if(BROWSER.equals("firefox"))
			driver= new FirefoxDriver();
		if(BROWSER.equals("edge"))
			driver= new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(URL);
		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PWD);
	}
	
	@Test
	public void CreateOrgWithName() {
		
		System.out.println("CreateOrgTest");
		
	}
}
