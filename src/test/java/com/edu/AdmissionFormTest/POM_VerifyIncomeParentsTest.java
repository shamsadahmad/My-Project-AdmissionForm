package com.edu.AdmissionFormTest;


import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.edu.OnlineAddmissionSystem.genericutility.BaseClass;
import com.edu.OnlineAdmissionSystem.ObjectRepositoryUtility.AdmissionPage;


@Listeners(com.edu.OnlineAddmissionSystem.genericutility.LisImpClass.class)
public class POM_VerifyIncomeParentsTest extends BaseClass {
	
	
	@Test
	public void testIncome() throws Throwable {
//		String IncomeParents = eLib.getExcelData("Sheet1", 1, 6);
		
	 	String IncomeParents = eLib.getExcelData("Sheet1", 1, 6);
		AdmissionPage ap = new AdmissionPage(driver);
		ap.getIncomeParents();
//		ap.nextpage();
//		Assert.fail();
	}   
}
