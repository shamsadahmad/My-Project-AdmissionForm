package com.edu.AdmissionFormTest;

import org.testng.annotations.Test;

import com.edu.OnlineAddmissionSystem.genericutility.BaseClass;
import com.edu.OnlineAdmissionSystem.ObjectRepositoryUtility.AdmissionPage;


public class POM_VerifyPinTest extends BaseClass{
	
	@Test
	public void pOM_VerifyPin() throws Throwable {
		String CPin = eLib.getExcelData("Sheet1", 1, 9);
		AdmissionPage ap = new AdmissionPage(driver);
		ap.getCPin(); 
//		ap.nextpage();
//		Assert.fail();
	}   
}
