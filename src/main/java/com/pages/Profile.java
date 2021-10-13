package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class Profile extends Base {
	
	//pagefactory
	@FindBy(xpath = "//div[@class='sc-dEoRIm fHKQop']")
	WebElement hamburgerMenu;
	
	@FindBy(xpath = "//*[@id='super-container']/div[2]/div[2]/div[2]/div/div[3]/div/div[2]/div")
	WebElement notify;
	
	@FindBy(xpath = "//*[@id='super-container']/div[2]/div[2]/div[2]/div/div[3]/a[5]/div/div[2]")
	WebElement  bookSmile;
	
	@FindBy(xpath = "//div[@class='sc-gpHHfC gqjquv']")
	WebElement notiWindow;
	
	@FindBy(xpath = "//button/span")
	WebElement smileWindow;
	
	
	public void hamburgerMenu() {
		PageFactory.initElements(driver, this);
		hamburgerMenu.click();
	}
	
	public void validateNotification() {
		notify.click();
		
	}
	
	public boolean notificationWindows() {
		
		Boolean bool = notiWindow.isDisplayed();
		return bool;
	}
	
	public void bookasmile() {
		bookSmile.click();
		
	}
	
	public boolean bookasmileWindow() {
		Boolean bol = smileWindow.isDisplayed();
		return bol;
	}

}