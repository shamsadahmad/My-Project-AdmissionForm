package com.edu.OnlineAddmissionSystem.genericutility;

import java.sql.DriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.edu.OnlineAdmissionSystem.ObjectRepositoryUtility.CollectIdpassword;
import com.edu.OnlineAdmissionSystem.ObjectRepositoryUtility.Login;
import com.edu.OnlineAdmissionSystem.ObjectRepositoryUtility.SignUp;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	 
	public WebDriver driver= null; 
	public static WebDriver sDriver;
	//Object Creation for Lib
	public JavaUtility jLib = new JavaUtility();
	public WebDriverUtility wLib = new WebDriverUtility();
	public FileUtility fLib = new FileUtility();
	public ExcelUtility eLib = new ExcelUtility();
	
	 
	@BeforeSuite
	public void configBS() {
		System.out.println("==== Connect to data base======");
	} 

//	@Parameters("BROWSER")
	
	@BeforeClass
	public void configBC(/*String BROWSER8*/) throws Throwable {
		System.out.println("==== Launch the Brouser =====");	
		
		String BROWSER = fLib.getPropertyKeyValue("Browser");
		if(BROWSER.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			System.out.println("Incorrect Browser");
		}
		
		sDriver=driver;
		wLib.waitForElementInDOM(driver);
		driver.manage().window().maximize(); 
		 
	}
	@BeforeMethod 
	public void configBM() throws Throwable {
		
		// Read Common Data from Property file
		String BROWSER = fLib.getPropertyKeyValue("Browser");
		String URL = fLib.getPropertyKeyValue("url");
		String UN = fLib.getPropertyKeyValue("Username");
		String PW = fLib.getPropertyKeyValue("Password");

//		//Read excel data to the SignUp Page
		String NAME = eLib.getExcelData("Sheet1", 6, 1);
		String DOB = eLib.getExcelData("Sheet1", 6, 2);
		int ranEmail = jLib.getRandomNumber();
		String EMAIL_ = eLib.getExcelData("Sheet1", 6, 3) + ranEmail +"@gmail.com";
		String PHONE = eLib.getExcelData("Sheet1", 6, 4);
		String CHAPCHA = eLib.getExcelData("Sheet1", 6, 5);
  
		// Navigate to App 
		driver.get(URL); 

		// SignUp to Application 
		SignUp signup = new SignUp(driver);
		signup.SignupPage(NAME, DOB, EMAIL_, PHONE, CHAPCHA); 

		CollectIdpassword cip = new CollectIdpassword(driver);
		String font=cip.getCollectFont().getText();
		String username = font.substring(16, 25);
		String password = font.substring(42, 50);
		cip.getLoginButton().click();

		//Login to Application 
		Login lg = new Login(driver); 
		lg.loginApp(username, password);

	}
	
	@AfterMethod
	public void configAM() {
		// Logout 
		System.out.println(" ===== Logout the Application======");
	}
	
	@AfterClass
	public void configAC() {
		System.out.println("=======Close the Browser=======");
		driver.close();
	}
	@AfterSuite
	public void configAS() {
		System.out.println("====== Close DataBase========");
	}
	
}
