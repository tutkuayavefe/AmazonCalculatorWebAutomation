package com.calculator.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	public WebDriver driver;

	@BeforeMethod
	protected void methodSetup() {
		System.out.println("Method set up ");
		System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://talentry-qa-take-home-exercise.s3.eu-central-1.amazonaws.com/index.html");

		
	}

	@AfterMethod
	protected void methodTearDown() {
		System.out.println("Method tear down");
		// driver.quit();
	}

}

