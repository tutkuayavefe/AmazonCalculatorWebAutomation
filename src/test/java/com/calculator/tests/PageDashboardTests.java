package com.calculator.tests;

import com.calculator.base.BaseTest;
import com.calculator.pages.PageDashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageDashboardTests extends BaseTest {

	PageDashboard pageDashboard;

	@Test(priority = 1)
	public void NavigateToUrl() {

		// This test is to verify that if url is navigated to correct page
		pageDashboard = new PageDashboard(driver);
		WebDriverWait wait = new WebDriverWait(driver, 10);

		WebElement headlineText = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pageDashboard.getHeadlineText())));
		Assert.assertEquals(headlineText.getText(), pageDashboard.getExpectedHeadlineText(), "They are not equal: ");

		
	}

	// this test case is to verify that addition is working fine
	@Test(priority = 2)
	public void Addition() {

		NavigateToUrl();

		WebElement number1 = driver.findElement(By.xpath(pageDashboard.getOne()));
		WebElement number2 = driver.findElement(By.xpath(pageDashboard.getTwo()));
		WebElement plusSign = driver.findElement(By.xpath(pageDashboard.getAddition()));
		WebElement equalsSign = driver.findElement(By.xpath(pageDashboard.getEquals()));
		WebElement resultField = driver.findElement(By.xpath(pageDashboard.getResultField()));
		number1.click();
		plusSign.click();
		number2.click();
		equalsSign.click();
		
		Assert.assertEquals(resultField.getAttribute("value"), "3", "They are not equal: ");

	}

	// this test case is to verify that subtraction is working fine
	@Test(priority = 3)
	public void Subtraction() {
		NavigateToUrl();

		WebElement number3 = driver.findElement(By.xpath(pageDashboard.getThree()));
		WebElement number4 = driver.findElement(By.xpath(pageDashboard.getFour()));
		WebElement minusSign = driver.findElement(By.xpath(pageDashboard.getMinus()));
		WebElement equalsSign = driver.findElement(By.xpath(pageDashboard.getEquals()));
		WebElement resultField = driver.findElement(By.xpath(pageDashboard.getResultField()));
		number4.click();
		minusSign.click();
		number3.click();
		equalsSign.click();
		
		Assert.assertEquals(resultField.getAttribute("value"), "1", "They are not equal: ");

	}
	
	
	// this test case is to verify that multiply is working fine
	@Test(priority = 4)
	public void Multiply() {

		NavigateToUrl();

		WebElement number5 = driver.findElement(By.xpath(pageDashboard.getFive()));
		WebElement number6 = driver.findElement(By.xpath(pageDashboard.getSix()));
		WebElement multiplySign = driver.findElement(By.xpath(pageDashboard.getMultiply()));
		WebElement equalsSign = driver.findElement(By.xpath(pageDashboard.getEquals()));
		WebElement resultField = driver.findElement(By.xpath(pageDashboard.getResultField()));
		number5.click();
		multiplySign.click();
		number6.click();
		equalsSign.click();
		
		Assert.assertEquals(resultField.getAttribute("value"), "30", "They are not equal: ");
	}

	
	//this test case is to verify that division is working fine
	@Test(priority = 5)
	public void Division() {

		NavigateToUrl();

		WebElement number8 = driver.findElement(By.xpath(pageDashboard.getEight()));
		WebElement number2 = driver.findElement(By.xpath(pageDashboard.getTwo()));
		WebElement divideSign = driver.findElement(By.xpath(pageDashboard.getDivide()));
		WebElement equalsSign = driver.findElement(By.xpath(pageDashboard.getEquals()));
		WebElement resultField = driver.findElement(By.xpath(pageDashboard.getResultField()));
		number8.click();
		divideSign.click();
		number2.click();
		equalsSign.click();
		
		Assert.assertEquals(resultField.getAttribute("value"), "4", "They are not equal: ");
	}

	//this test case is to verify that fractional operation is working fine
	@Test(priority = 5)
	public void FractionalOperations() {

		NavigateToUrl();

		WebElement number8 = driver.findElement(By.xpath(pageDashboard.getEight()));
		WebElement number2 = driver.findElement(By.xpath(pageDashboard.getTwo()));
		WebElement plusSign = driver.findElement(By.xpath(pageDashboard.getAddition()));
		WebElement dotSign = driver.findElement(By.xpath(pageDashboard.getDot()));
		WebElement equalsSign = driver.findElement(By.xpath(pageDashboard.getEquals()));
		WebElement resultField = driver.findElement(By.xpath(pageDashboard.getResultField()));
		number8.click();
		dotSign.click();
		number8.click();
		plusSign.click();
		number2.click();
		equalsSign.click();
		
		Assert.assertEquals(resultField.getAttribute("value"), "10.8", "They are not equal: ");
	}

	//This is a negative test case scenario
	//this test case is to verify that to get a undefined result for dividing zero
	@Test(priority = 7)
	public void DivideByZero() {

		NavigateToUrl();

		WebElement number7 = driver.findElement(By.xpath(pageDashboard.getSeven()));
		WebElement number0 = driver.findElement(By.xpath(pageDashboard.getZero()));
		WebElement divideSign = driver.findElement(By.xpath(pageDashboard.getDivide()));
		WebElement equalsSign = driver.findElement(By.xpath(pageDashboard.getEquals()));
		WebElement resultField = driver.findElement(By.xpath(pageDashboard.getResultField()));
		number7.click();
		divideSign.click();
		number0.click();
		equalsSign.click();
		
		Assert.assertEquals(resultField.getAttribute("value"), "Undefined", "They are not equal: ");
	}

	
    //this test case is to verify that clear button is working fine
	@Test(priority = 8)
	public void RandomClickAndDelete() {

		NavigateToUrl();

		WebElement number7 = driver.findElement(By.xpath(pageDashboard.getSeven()));
		WebElement number1 = driver.findElement(By.xpath(pageDashboard.getOne()));
		WebElement resultField = driver.findElement(By.xpath(pageDashboard.getResultField()));
		WebElement clear = driver.findElement(By.xpath(pageDashboard.getDeleteButton()));
		number7.click();
		number1.click();
		number7.click();
		number1.click();
		clear.click();
		
		Assert.assertEquals(resultField.getAttribute("value"), "", "They are not equal: ");
	}

	//this is a negative test case scenario
	//this test case is to verify that user should not be able to click on dot button directly without any number
	@Test(priority = 9)
	public void UserShouldNotClickOnDotDirectly() {

		NavigateToUrl();

		WebElement dotSign = driver.findElement(By.xpath(pageDashboard.getDot()));
		WebElement resultField = driver.findElement(By.xpath(pageDashboard.getResultField()));
		dotSign.click();
		dotSign.click();
		dotSign.click();

		Assert.assertEquals(resultField.getAttribute("value"), "", "They are not equal: ");
	}

	//this is a negative test case scenario
	//this test case is to verify that user should not be able to click on operational signs directly
	@Test(priority = 9)
	public void UserShouldNotClickOnOperationsDirectly() {

		NavigateToUrl();

		WebElement multiply = driver.findElement(By.xpath(pageDashboard.getMultiply()));
		WebElement resultField = driver.findElement(By.xpath(pageDashboard.getResultField()));
		multiply.click();
		multiply.click();

		Assert.assertEquals(resultField.getAttribute("value"), "", "They are not equal: ");
	}

	//this is a negative test case scenario
	//this test case is to verify that user should not be able to click on zero multiple times
	@Test(priority = 10)
	public void MaximumZeroShouldBeOneDigit() {

		NavigateToUrl();

		WebElement number0 = driver.findElement(By.xpath(pageDashboard.getZero()));
		WebElement resultField = driver.findElement(By.xpath(pageDashboard.getResultField()));
		number0.click();
		number0.click();
		number0.click();

		Assert.assertEquals(resultField.getAttribute("value"), "0", "They are not equal: ");
	}

	//this test case is to verify that negative result can get
	@Test(priority = 11)
	public void SubtractionForNegativeResult() {
		NavigateToUrl();

		WebElement number3 = driver.findElement(By.xpath(pageDashboard.getThree()));
		WebElement number4 = driver.findElement(By.xpath(pageDashboard.getFour()));
		WebElement minusSign = driver.findElement(By.xpath(pageDashboard.getMinus()));
		WebElement equalsSign = driver.findElement(By.xpath(pageDashboard.getEquals()));
		WebElement resultField = driver.findElement(By.xpath(pageDashboard.getResultField()));
		number3.click();
		minusSign.click();
		number4.click();
		equalsSign.click();

		Assert.assertEquals(resultField.getAttribute("value"), "-1", "They are not equal: ");

	}

}
