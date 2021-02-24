package com.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task2 {
	
	@Test(dataProvider="loginPageData")
	public void tco(String userName, String password) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(password);
	}
	
	@DataProvider(name="loginPageData")
	public Object[][] data(){
	
		return new Object[][] {{"prabhusundaram28","Prabhu@1996"},{"nandha","kumar"}};
	}
	
	
	
	}

