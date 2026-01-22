package com.vtiger.contacttest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CreateContactTest {
	
	@Test
	public void CreateContact() {
	
	String BROWSER = System.getProperty("browser");
	String URL = System.getProperty("url");
	String UN = System.getProperty("username");
	String PWD = System.getProperty("password");
	
	WebDriver driver= null;
	if(BROWSER.equals("chrome"))
		driver= new ChromeDriver();
	if(BROWSER.equals("firefox"))
		driver= new FirefoxDriver();
	if(BROWSER.equals("edge"))
		driver= new EdgeDriver();
	
		driver.get(URL);
		System.out.println("create contact");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	
		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(UN);
		System.out.println(PWD);
	}

	@Test
	public void CreateContactWithPhoneNo() {
		System.out.println("Create contact with phone number");
	}
}
