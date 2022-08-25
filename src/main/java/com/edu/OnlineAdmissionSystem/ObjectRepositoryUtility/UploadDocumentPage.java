package com.edu.OnlineAdmissionSystem.ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadDocumentPage {
	public UploadDocumentPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="fpic")
	private WebElement passportimg;
	
	@FindBy(id="ftndoc")
	private WebElement matricMrks;
	
	@FindBy(id="fdcdoc")
	private WebElement interMarks;
	
	@FindBy(id="fide")
	private WebElement idproof;
	
	@FindBy(id="fsig")
	private WebElement sign;

	public WebElement getPassportimg() {
		return passportimg;
	}

	public WebElement getMatricMrks() {
		return matricMrks;
	}

	public WebElement getInterMarks() {
		return interMarks;
	}

	public WebElement getIdproof() {
		return idproof;
	}

	public WebElement getSign() {
		return sign;
	}
	
	public void documents(String passport,String matricMarks, String InterMarks, String idProof, String Sign) {
		passportimg.sendKeys(passport);
		matricMrks.sendKeys(matricMarks);
		interMarks.sendKeys(InterMarks);
		idproof.sendKeys(idProof);
		sign.sendKeys(Sign);
	}
	
}
