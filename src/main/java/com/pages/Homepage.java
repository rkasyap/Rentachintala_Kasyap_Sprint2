package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class Homepage extends Base{
	
	@FindBy(xpath = "//div[contains(text(),'Sign in')]")
	WebElement sign;
	
	public Homepage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateUrl() {
		return driver.getCurrentUrl();
	}
	
	public void Signin() {
		driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);
		//System.out.println("is displayed");
		sign.click();
		//System.out.println("is clicked");
	}
	public String validateTitle() {
		return driver.getTitle();
	}

}