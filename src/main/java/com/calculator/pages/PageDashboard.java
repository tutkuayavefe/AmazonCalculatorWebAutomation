package com.calculator.pages;

import org.openqa.selenium.WebDriver;

public class PageDashboard {
	
	private String headlineText = "//h1[contains(.,'Calculator')]";
	private String resultField = "//input[@placeholder='Result']";
	private String deleteButton = "//input[@id='clear']";
	private String addition = "//input[@value='+']";
	private String minus = "//input[@value='-']";
	private String multiply = "//input[@value='x']";
	private String equals = "//input[@value='=']";		
	private String dot = "//input[@value='.']";
	private String divide = "//input[@value='/']";

	private String zero = "//input[@id='zero']";
	private String one = "//input[@id='one']";
	private String two = "//input[@id='two']";
	private String three = "//input[@id='three']";
	private String four = "//input[@id='four']";
	private String five = "//input[@id='five']";
	private String six = "//input[@id='six']";
	private String seven = "//input[@id='seven']";
	private String eight = "//input[@id='eight']";
	private String nine = "//input[@id='nine']";

	private String expectedHeadlineText = "Calculator";
	
	


	public PageDashboard(WebDriver driver) {
		// TODO Auto-generated constructor stub

	}
	
	
	public String getHeadlineText() {
		return headlineText;
	}
	public String getResultField() {
		return resultField;
	}
	public String getDeleteButton() {
		return deleteButton;
	}
	public String getAddition() {
		return addition;
	}
	public String getMinus() {
		return minus;
	}
	public String getMultiply() {
		return multiply;
	}
	public String getEquals() {
		return equals;
	}
	public String getDot() {
		return dot;
	}
	public String getDivide() {
		return divide;
	}
	public String getZero() {
		return zero;
	}
	public String getOne() {
		return one;
	}
	public String getTwo() {
		return two;
	}
	public String getThree() {
		return three;
	}
	public String getFour() {
		return four;
	}
	public String getFive() {
		return five;
	}
	public String getSix() {
		return six;
	}
	public String getSeven() {
		return seven;
	}
	public String getEight() {
		return eight;
	}
	public String getNine() {
		return nine;
	}

	public String getExpectedHeadlineText() {
		return expectedHeadlineText;
	}
}
