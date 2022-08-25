package com.edu.OnlineAdmissionSystem.ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp {
	public SignUp(WebDriver driver) {
		PageFactory.initElements(driver, this);
	} 
	@FindBy(xpath="//a[text()='Sign Up ']")
	private WebElement SignUpLink;
	
	@FindBy(id="in_name")
	private WebElement NAME;
	
	@FindBy(id="in_dob")
	private WebElement DateOfBirth; 
	
	@FindBy(id="in_eml")
	private WebElement EmailEdit;
	
	@FindBy(id="in_mob")
	private WebElement MobileNo;
	
	@FindBy(id="txt_captcha")
	private WebElement Capcha;
	
	@FindBy(id="in_sub")
	private WebElement SignUp;

	public WebElement getSignUpLink() {
		return SignUpLink;
	} 
	public WebElement getName() {
		return NAME;
	}
	public WebElement getDateOfBirth() {
		return DateOfBirth;
	}
	public WebElement getEmail() {
		return EmailEdit;
	}
	public WebElement getMobileNo() {
		return MobileNo;
	}
	public WebElement getCapcha() {
		return Capcha;
	}
	public WebElement getSignUp() {
		return SignUp;
	}	
	
	
	public void SignupPage(String Name,String DOB,String Email,String Mobile,String Chaptha) {
		SignUpLink.click();
		NAME.sendKeys(Name);
		DateOfBirth.sendKeys(DOB);
		EmailEdit.sendKeys(Email);
		MobileNo.sendKeys(Mobile);
		Capcha.sendKeys(Chaptha);
		SignUp.click();		 	
	}
}
