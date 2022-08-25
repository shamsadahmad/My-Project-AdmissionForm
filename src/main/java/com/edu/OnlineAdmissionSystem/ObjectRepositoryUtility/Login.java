package com.edu.OnlineAdmissionSystem.ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Rule:1- Create a Java Class for every page in a application
public class Login {  
	
	 // Rule:2- Execute all the element & initialize the element PagFactory.initElements(initialize)
	public Login(WebDriver driver) { 
		PageFactory.initElements(driver, this);
	}
	
	// Rule:3 Identify all the element using @FindBy,@FindBys,@FindAll(Declaration)
	@FindBy(id="u_id")      
	private WebElement Usrname;
	
	@FindBy(id="u_ps")
	private WebElement PassWord;
	
	@FindBy(id="u_sub")
	private WebElement LoginButton;

	
	// Rule4:- Declare all the element as private getters method, business method for utility.
	public WebElement getUsrname() {  
		return Usrname;  
	}

	public WebElement getPassWord() {
		return PassWord; 
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}
	public void loginApp(String Username, String Password) {
		// Step : Login the Application
		Usrname.sendKeys(Username);
		PassWord.sendKeys(Password);
 		LoginButton.click();
		}
	
	
}
