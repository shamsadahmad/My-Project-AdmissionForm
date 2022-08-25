package com.edu.OnlineAddmissionSystem.genericutility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class LisImpClass extends BaseClass implements ITestListener {

	public void onTestFailure(ITestResult result)  {
		String testName = result.getMethod().getMethodName();
		int RndTestNm = jLib.getRandomNumber();
		String dateortime = jLib.getSystemDate();
		System.out.println(testName + "=====Excute the Listner===");
		EventFiringWebDriver efd = new EventFiringWebDriver(BaseClass.sDriver);
		File src = efd.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("./ScreenShot/"+ dateortime + testName + RndTestNm + ".png"));
		} catch (Exception e) {
			e.printStackTrace(); 
		}
	}
}
