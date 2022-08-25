package com.edu.AdmissionFormTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.edu.OnlineAddmissionSystem.genericutility.BaseClass;
import com.edu.OnlineAddmissionSystem.genericutility.ExcelUtility;
import com.edu.OnlineAddmissionSystem.genericutility.FileUtility;
import com.edu.OnlineAddmissionSystem.genericutility.JavaUtility;
import com.edu.OnlineAddmissionSystem.genericutility.WebDriverUtility;
import com.edu.OnlineAdmissionSystem.ObjectRepositoryUtility.AdmissionPage;
import com.edu.OnlineAdmissionSystem.ObjectRepositoryUtility.CollectIdpassword;
import com.edu.OnlineAdmissionSystem.ObjectRepositoryUtility.Login;
import com.edu.OnlineAdmissionSystem.ObjectRepositoryUtility.SignUp;
import com.mysql.cj.jdbc.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(com.edu.OnlineAddmissionSystem.genericutility.LisImpClass.class)
public class CreateAppTest_POMTest extends BaseClass {
  
	@Test(retryAnalyzer = com.edu.OnlineAddmissionSystem.genericutility.ReTryImpClass.class)
	public void TestApp() throws Throwable {
		
//	public static void main(String[] args) throws Throwable {
//		WebDriver driver = null;
//		// Create Object 
//		ExcelUtility eLib = new ExcelUtility();
//		FileUtility fLib = new FileUtility();
//		JavaUtility jLib = new JavaUtility();
//		WebDriverUtility wLib = new WebDriverUtility();
//		int ran = jLib.getRandomNumber(); 
//		int ranDomUN = jLib.getRandomNumber();
//		int ranDonPW = jLib.getRandomNumber(); 
		
		// Read Common Data from Property file
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
		
		// Read excel data to the Admission Page
//		String studentMno = eLib.getExcelData("Sheet1", 2, 3);
		
		String studentMno = eLib.getExcelData("Sheet1", 2, 1);
		String studentMno2 = eLib.getExcelData("Sheet1", 2, 3);
		String FatherName = eLib.getExcelData("Sheet1", 1, 2);
		String FatherOcup = eLib.getExcelData("Sheet1", 1, 3);
		String FatherOcupPh = eLib.getExcelData("Sheet1", 2, 3);
		String MotherName = eLib.getExcelData("Sheet1", 1, 4);
		String MotherOcup = eLib.getExcelData("Sheet1", 1, 5);
		String Mno = eLib.getExcelData("Sheet1", 2, 5);
		String IncomeParents = eLib.getExcelData("Sheet1", 1, 6);
		String Cadd = eLib.getExcelData("Sheet1", 1, 7);
		String CState = eLib.getExcelData("Sheet1", 1, 8);
		String CPin = eLib.getExcelData("Sheet1", 1, 9);
		String CMobile = eLib.getExcelData("Sheet1", 1, 10);
		String PAdd = eLib.getExcelData("Sheet1", 1, 11);
		String PState = eLib.getExcelData("Sheet1", 1, 12);
		String PPin = eLib.getExcelData("Sheet1", 1, 13);
		String PMobile = eLib.getExcelData("Sheet1", 1, 14);
		String Nathional = eLib.getExcelData("Sheet1", 1, 15);
		String Regions = eLib.getExcelData("Sheet1", 1, 16);
		String Rank = eLib.getExcelData("Sheet1", 1, 17);
		String Roll_no = eLib.getExcelData("Sheet1", 1, 18);
		String AllocateOfBranch = eLib.getExcelData("Sheet1", 1, 19);
		String PercentOfpcm = eLib.getExcelData("Sheet1", 1, 20);
		String NameOFUniversity = eLib.getExcelData("Sheet1", 1, 21);
		String YearOfPass = eLib.getExcelData("Sheet1", 1, 22);
		String TotalMark = eLib.getExcelData("Sheet1", 1, 23);
		String MarksObt = eLib.getExcelData("Sheet1", 1, 24);
		String Div1 = eLib.getExcelData("Sheet1", 1, 25);
		String Percent = eLib.getExcelData("Sheet1", 1, 26);
		String NameOFUniversity2 = eLib.getExcelData("Sheet1", 1, 27);
	 	String YearOfPass2 = eLib.getExcelData("Sheet1", 1, 28);
		String TotalMark2 = eLib.getExcelData("Sheet1", 1, 29);
		String MarksObt2 = eLib.getExcelData("Sheet1", 1, 30);
		String Div2 = eLib.getExcelData("Sheet1", 1, 31);
		String Percent2 = eLib.getExcelData("Sheet1", 1, 32);
		
		AdmissionPage admpg = new AdmissionPage(driver);
		admpg.TestAllNameContactComponent(Mno, Mno, FatherName, FatherOcup, FatherOcupPh, MotherName, MotherOcup, Mno, IncomeParents);
		admpg.TestAllAddressComponent(Cadd, CState, CPin, CMobile, PAdd, PState, PPin, PMobile, Percent2, Regions);
		admpg.TestEdducationDetails(Rank, Roll_no, AllocateOfBranch, PercentOfpcm, NameOFUniversity, YearOfPass, TotalMark, MarksObt, Div1, Percent, NameOFUniversity2, YearOfPass2, TotalMark2, MarksObt2, Div2, Percent2);
		admpg.nextpage(); 
		
		System.out.println("=====Passed ======");
		
//		String javaScript = eLib.getExcelData("Sheet1", 1, 34);
		
		// Launch the Browser
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
//		driver.manage().window().maximize();
//		driver.get(URL);
//		
//		
//		// SignUp to Application 
//		SignUp signup = new SignUp(driver);
//		signup.SignupPage(NAME, DOB, EMAIL_, PHONE, CHAPCHA); 
//		
//		CollectIdpassword cip = new CollectIdpassword(driver);
//		String font=cip.getCollectFont().getText();
//		String username = font.substring(16, 25);
//		String password = font.substring(42, 50);
//		cip.getLoginButton().click();
//		
		//Login to Application 
//		Login lg = new Login(driver);
//		lg.loginApp(username, password);
		
	}

}
