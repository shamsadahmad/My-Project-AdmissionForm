package com.edu.AdmissionFormTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

import com.edu.OnlineAddmissionSystem.genericutility.BaseClass;
import com.edu.OnlineAddmissionSystem.genericutility.ExcelUtility;
import com.edu.OnlineAddmissionSystem.genericutility.FileUtility;
import com.edu.OnlineAddmissionSystem.genericutility.JavaUtility;
import com.edu.OnlineAddmissionSystem.genericutility.WebDriverUtility;
import com.edu.OnlineAdmissionSystem.ObjectRepositoryUtility.AdmissionPage;
import com.edu.OnlineAdmissionSystem.ObjectRepositoryUtility.CollectIdpassword;
import com.edu.OnlineAdmissionSystem.ObjectRepositoryUtility.Login;
import com.edu.OnlineAdmissionSystem.ObjectRepositoryUtility.SignUp;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(com.edu.OnlineAddmissionSystem.genericutility.LisImpClass.class)
public class POM_VerifyFatherOccupationTest extends BaseClass{
//
	@Test(retryAnalyzer=com.edu.OnlineAddmissionSystem.genericutility.ReTryImpClass.class)
	public void  verifyFatherOcup() throws Throwable {

//		String FatherOcup = eLib.getExcelData("Sheet1", 1, 3);
		
		String FatherOcup = eLib.getExcelData("Sheet1", 2, 1);	
		AdmissionPage ap = new AdmissionPage(driver);
		ap.getFatherOcup();
//		ap.nextpage();
//		Assert.fail();
		
//		Assert.assertEquals(false, true);
	} 
}








//public void fieldTest()  throws Throwable {
//
//	// test Script Data 
//	int ran = jLib.getRandomNumber();
//	int ranDomUN = jLib.getRandomNumber();
//	int ranDonPW = jLib.getRandomNumber();
//	String FatherOcup = eLib.getExcelData("Sheet1", 1, 3);
//}
//	// Test the App
//	AdmissionPage ap = new AdmissionPage(driver);
//	ap.getFatherOcup().sendKeys(FatherOcup);
//} 
		   		
			// Create Object 
//		ExcelUtility eLib = new ExcelUtility();
//		FileUtility fLib = new FileUtility();
//		JavaUtility jLib = new JavaUtility();
//		WebDriverUtility wLib = new WebDriverUtility();
//		int ran = jLib.getRandomNumber();
//		int ranDomUN = jLib.getRandomNumber();
//		int ranDonPW = jLib.getRandomNumber();
//		
//		// Read Common Data from Property file
//		String BROWSER = fLib.getPropertyKeyValue("Browser");
//		String URL = fLib.getPropertyKeyValue("url");
//		String UN = fLib.getPropertyKeyValue("Username")+ranDomUN;
//		String PW = fLib.getPropertyKeyValue("Password")+ranDonPW;
	
     	//Read excel data to the SignUp Page
//		String NAME = eLib.getExcelData("Sheet1", 6, 1);
//		String DOB = eLib.getExcelData("Sheet1", 6, 2);
//		String EMAIL_ = eLib.getExcelData("Sheet1", 6, 3)+ran+"@gmail.com";
//		String PHONE = eLib.getExcelData("Sheet1", 6, 4);
//		String CHAPCHA = eLib.getExcelData("Sheet1", 6, 5);
		
	
		
//
//		// Step 2: Launch the browser
//		if(BROWSER.equalsIgnoreCase("Chrome")) { 
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//		}
//		else if(BROWSER.equalsIgnoreCase("FireFox")) {
//			WebDriverManager.firefoxdriver().setup();
//			driver = new FirefoxDriver();
//		} else {
//			System.out.println("Incorrect Browser");
//		}
//
//		// SignUp to Application 
//		driver.manage().window().maximize();
//		driver.get(URL);
//		SignUp signup = new SignUp(driver);
//		signup.SignupPage(NAME, DOB, EMAIL_, PHONE, CHAPCHA); 
//
//		CollectIdpassword cip = new CollectIdpassword(driver);
//		String font=cip.getCollectFont().getText();
//		String username = font.substring(16, 25);
//		String password = font.substring(42, 50);
//		cip.getLoginButton().click();
//
//		//Login to Application 
//		Login lg = new Login(driver);
//		lg.loginApp(username, password);

		

