package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class Sports extends Base {
	
	//pagefactory
	@FindBy(xpath = "//a[@class='sc-RcBXQ fzVlIP' and text()='Sports']")
	WebElement sportBut;
	
	@FindBy(xpath = "//img[@alt='Travelling Clues - Online Games']")
	WebElement selectSport;
	
	public void sportsBut() {
		PageFactory.initElements(driver, this);
		sportBut.click();
	}
	public void  selectBut() {
		selectSport.click();
	}
	public String sportsPage() {
		return driver.getTitle();			
	}
}