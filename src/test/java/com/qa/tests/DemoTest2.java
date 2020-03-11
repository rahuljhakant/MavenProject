package com.qa.tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest2 {
	
	@BeforeTest
    public void beforeTest() {
		
		WebDriverManager.chromedriver().setup();
    }
	
	@Test(priority = 1)
	public void sum() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("Test is getting printed");
		driver.close();
		int a =10;
		int b=20;
		Assert.assertEquals(30, a+b);
	}
	
	@Test(priority = 2)
	public void sub() {
		int a =10;
		int b=20;
		Assert.assertEquals(10, b-a);
	}
	
	@Test(priority = 3)
	public void div() {
		int a =10;
		int b=20;
		Assert.assertEquals(2, b/a);
	}
	
	@Test(priority = 4)
	public void multi() {
		int a =10;
		int b=20;
		Assert.assertEquals(200, a*b);
	}

}
