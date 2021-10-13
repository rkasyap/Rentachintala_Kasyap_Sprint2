package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver driver;
	public static Properties prop;
	
	//pagefactory
			@FindBy(id = "wzrk-cancel")
			WebElement cancelPopup;
			
			@FindBy(xpath = "//img[contains(@alt,'MUMBAI')]")
			WebElement loc;
	
	public  Base() {
		
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(".//src/main/java/com/config/config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			System.out.println("File not found Exception!");
		} catch (IOException e) {
			System.out.println("Unable to read the file");
		}
	}
	
	public void initialization() {
		String browser = prop.getProperty("browser");
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equals("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		
		
		System.out.print("****************"+prop.getProperty("url"));
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
	}
	
	public void cancelPopup() {
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		cancelPopup.click();
		loc.click();
	}
	
	public void teardown() {
		driver.quit();
	}


}