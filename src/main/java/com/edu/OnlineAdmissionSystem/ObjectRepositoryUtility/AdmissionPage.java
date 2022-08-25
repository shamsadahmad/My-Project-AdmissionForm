package com.edu.OnlineAdmissionSystem.ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.edu.OnlineAddmissionSystem.genericutility.ExcelUtility;
import com.edu.OnlineAddmissionSystem.genericutility.FileUtility;
import com.edu.OnlineAddmissionSystem.genericutility.JavaUtility;
import com.edu.OnlineAddmissionSystem.genericutility.WebDriverUtility;

public class AdmissionPage {
	public AdmissionPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="uphn1")
	private WebElement studentMno;
	
	@FindBy(id="uphn2")
	private WebElement studentMno2;
	
	@FindBy(id="ufname")
	private WebElement FatherName;
	
	@FindBy(id="ufocc")
	private WebElement FatherOcup;
	
	@FindBy(id="ufphn")
	private WebElement FatherOcupPh;
	 
	@FindBy(id="umname")
	private WebElement MotherName;
	
	@FindBy(id="umocc")
	private WebElement MotherOcup;
	
	@FindBy(id="umphn")
	private WebElement Mno;
	
	@FindBy(id="inc") 
	private WebElement IncomeParents;
	
	@FindBy(id="cadr")
	private WebElement Cadd;
	
	@FindBy(id="cast")
	private WebElement CState;
	
	@FindBy(id="capin")
	private WebElement CPin;
	
	@FindBy(id="camob")
	private WebElement CMobile;
	
	@FindBy(id="padr")
	private WebElement PAdd;
	
	@FindBy(id="past")
	private WebElement PState;
	
	@FindBy(id="papin")
	private WebElement PPin;
	
	@FindBy(id="pamob")
	private WebElement Pmob;
	
	public WebElement getPmob() {
		return Pmob;
	}

	public WebElement getFrmnext() {
		return frmnext;
	}
	@FindBy(id="natn")
	private WebElement Nathional;
	
	@FindBy(id="relg")
	private WebElement Regions;
	
	@FindBy(id="oarank")
	private WebElement Rank;
	
	@FindBy(id="oaroll")
	private WebElement Roll_no;
	
	@FindBy(id="oabrn")
	private WebElement AllocateOfBranch;
	
	@FindBy(id="pcm")
	private WebElement PercentOfpcm;
	
	@FindBy(id="nob1")
	private WebElement NameOFUniversity;
	
	@FindBy(id="yop1")
	private WebElement YearOfPass;
	
	@FindBy(id="tm1")
	private WebElement TotalMark;
	
	@FindBy(id="mo1")
	private WebElement MarksObt;
	
	@FindBy(id="divs1")
	private WebElement Div1;
	
	@FindBy(id="pom1")
	private WebElement Percent;
	
	@FindBy(id="nob2")
	private WebElement NameOFUniversity2;
	
	@FindBy(id="yop2")
	private WebElement YearOfPass2;
	
	@FindBy(id="tm2")
	private WebElement TotalMark2;
	
	@FindBy(id="mo2")
	private WebElement MarksObt2;
	
	@FindBy(id="divs2")
	private WebElement Div2;
	
	@FindBy(id="pom2")
	private WebElement Percent2;
	
	@FindBy(id="frmnext")
	WebElement frmnext;

	public WebElement getStudentMno() {
		return studentMno;
	}

	public WebElement getStudentMno2() {
		return studentMno2;
	}

	public WebElement getFatherName() {
		return FatherName;
	}

	public WebElement getFatherOcup() {
		return FatherOcup;
	}

	public WebElement getFatherOcupPh() {
		return FatherOcupPh;
	}

	public WebElement getMotherName() {
		return MotherName;
	}

	public WebElement getMotherOcup() {
		return MotherOcup;
	}

	public WebElement getMno() {
		return Mno;
	}

	public WebElement getIncomeParents() {
		return IncomeParents;
	}

	public WebElement getCadd() {
		return Cadd;
	}

	public WebElement getCState() {
		return CState;
	}

	public WebElement getCPin() {
		return CPin;
	}

	public WebElement getCMobile() {
		return CMobile;
	}

	public WebElement getPAdd() {
		return PAdd;
	}

	public WebElement getPState() {
		return PState;
	}

	public WebElement getPPin() {
		return PPin;
	}

	public WebElement getNathional() {
		return Nathional;
	}

	public WebElement getRegions() {
		return Regions;
	}

	public WebElement getRank() {
		return Rank;
	}

	public WebElement getRoll_no() {
		return Roll_no;
	}

	public WebElement getAllocateOfBranch() {
		return AllocateOfBranch;
	}

	public WebElement getPercentOfpcm() {
		return PercentOfpcm;
	}

	public WebElement getNameOFUniversity() {
		return NameOFUniversity;
	}

	public WebElement getYearOfPass() {
		return YearOfPass;
	}

	public WebElement getTotalMark() {
		return TotalMark;
	}

	public WebElement getMarksObt() {
		return MarksObt;
	}

	public WebElement getDiv1() {
		return Div1;
	}

	public WebElement getPercent() {
		return Percent;
	}

	public WebElement getNameOFUniversity2() {
		return NameOFUniversity2;
	}

	public WebElement getYearOfPass2() {
		return YearOfPass2;
	}

	public WebElement getTotalMark2() {
		return TotalMark2;
	}

	public WebElement getMarksObt2() {
		return MarksObt2;
	}

	public WebElement getDiv2() {
		return Div2;
	}

	public WebElement getPercent2() {
		return Percent2;
	}
	
	public void TestAllNameContactComponent(String studMno,String studMno2, String fatherName,String fatherOcup,String fatherOcupPh,String motherName,String motherOcup,String mno,String incomeParents) {
		studentMno.sendKeys(studMno);
		studentMno2.sendKeys(studMno2);
		FatherName.sendKeys(fatherName);
		FatherOcup.sendKeys(fatherOcup);
		FatherOcupPh.sendKeys(fatherOcupPh);
		MotherName.sendKeys(motherName);
		MotherOcup.sendKeys(motherOcup);
		Mno.sendKeys(mno);
		IncomeParents.sendKeys(incomeParents);	
	}
	public void TestAllAddressComponent(String corresAdd, String coressState, String CorresPin, String coresMobil, String ParAddress,String ParState, String ParPin, String ParMobile, String Nation, String region) {
		Cadd.sendKeys(corresAdd);
		CState.sendKeys(coressState);
		CPin.sendKeys(CorresPin);
		CMobile.sendKeys(coresMobil);
		PAdd.sendKeys(ParAddress);
		PState.sendKeys(ParState);
		PPin.sendKeys(ParPin);
		Pmob.sendKeys(ParMobile);
		Nathional.sendKeys(Nation); 
		Regions.sendKeys(region);
	}
	public void TestEdducationDetails(String ranks,String rollno,String allocateofbr, String perofpcm, String NOfUniversity, String YrOfPass, String TotlMr, String MarkObtn, String Divsion,String per, String NOfUniversity2, String YrOfPass2, String TotlMr2, String MarkObtn2, String divsion2,String per2 ) {
		Rank.sendKeys(ranks);
		Roll_no.sendKeys(rollno);
		AllocateOfBranch.sendKeys(allocateofbr);
		PercentOfpcm.sendKeys(perofpcm);
		NameOFUniversity.sendKeys(NOfUniversity);
		YearOfPass.sendKeys(YrOfPass);
		TotalMark.sendKeys(TotlMr);
		MarksObt.sendKeys(MarkObtn);
		Div1.sendKeys(Divsion);
		Percent.sendKeys(per);
		NameOFUniversity2.sendKeys(NOfUniversity2);
		YearOfPass2.sendKeys(YrOfPass2);
		TotalMark2.sendKeys(TotlMr2);
		MarksObt2.sendKeys(MarkObtn2);
		Div2.sendKeys(divsion2);
		Percent2.sendKeys(per2);	
	} 
	
	public void nextpage() {
		frmnext.click();
	}
}
