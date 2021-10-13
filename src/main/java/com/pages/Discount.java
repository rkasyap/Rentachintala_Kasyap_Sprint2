package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class Discount extends Base {
	
		//pagefactory
		@FindBy(xpath = "//div[@class='style_FlexBox-sc-1kcq93d-0 styleHorizontalFlexBox-sc-1kcq93d-1 style_SmileyWrapper-sc-1kcq93d-3 bjUOHW']")
		WebElement donationamt;
		
		@FindBy(xpath = "//ul/button/span")
		WebElement donateBut;
		
		@FindBy(xpath = "//div/input[@placeholder='Email Address']")
		WebElement email;
		
		@FindBy(xpath = "//div/input[@id='txtMobile']")
		WebElement ph_no;
		
		@FindBy(xpath = "//div/a[@data-auto='contact-details-continue']")
		WebElement continueBut;
		
		@FindBy(xpath = "//li[@data-auto='gift-voucher']")
		WebElement giftBut;
		
		@FindBy(xpath = "//div/input[@id='txtGVCode']")
		WebElement voucher;
		
		@FindBy(xpath = "//div/button[@id='lnkGV']")
		WebElement voucherCheck;
		
		
		public void paymentPage() {
			PageFactory.initElements(driver, this);
			donationamt.click();
			donateBut.click();
		}
		
		public void details(String mail, String mobilenumber) {
			email.sendKeys(mail);
			ph_no.sendKeys(mobilenumber);
			continueBut.click();
				
		}
		
		public void applyVoucher(String coupon) {
			giftBut.click();
			voucher.sendKeys(coupon);
		}
		
		public void pay() {
			voucherCheck.click();
		}


}