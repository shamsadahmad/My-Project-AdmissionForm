package com.edu.OnlineAddmissionSystem.genericutility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotUtility {
/**
 * Its used for as Prove like.
 * @param ScreenShotPath
 * @throws IOException 
 */
	public void getTakeScreenShot(WebDriver driver) throws IOException {
		TakesScreenshot ValueName = (TakesScreenshot)driver;
		File src = ValueName.getScreenshotAs(OutputType.FILE);
		File dest = new File(IConstants.ScreenShot_Path);
		FileUtils.copyFile(src, dest);
			
	} 
}
