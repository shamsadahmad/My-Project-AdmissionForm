package com.edu.OnlineAdmissionSystem.ObjectRepositoryUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CollectIdpassword {
	WebDriver driver;
	public CollectIdpassword(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="u_sub")
	private WebElement LoginButton;
	
	@FindBy(xpath="//font")
	private WebElement collectFont;
	
	public WebDriver getDriver() {
		return driver; 
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}

	public WebElement getCollectFont() { 
		return collectFont;
	}
	
/*	public void collectAndCLick(WebDriver driver, String getfont) {
		collectFont.getText();
		LoginButton.click();
	}   */
	
}
 