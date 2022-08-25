package com.edu.AdmissionFormTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

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

public class VerifyFatherNameWith_POM_Test extends BaseClass {

	@Test 
	public void testFatherName() throws Throwable {
		String FatherName = eLib.getExcelData("Sheet1", 1, 2);
		AdmissionPage ap = new AdmissionPage(driver);
		ap.getFatherName();   
		
	}
}
