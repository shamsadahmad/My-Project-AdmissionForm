package com.edu.OnlineAddmissionSystem.genericutility;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * It's developed using Apache poi libraries, which used to handle MicroShoft Excel Sheet.
 * @author Shamshad
 */
public class ExcelUtility { 
/**
 * It's used to read the data from the Excel-WorkBook based on below 
 * @param SheetName
 * @param RowName
 * @param Cell
 * 
 */
	public String getExcelData(String SheetName, int RowNum, int CellNum) throws Throwable {
		FileInputStream fis = new FileInputStream(IConstants.EXCELPATH);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet st = wb.getSheet(SheetName);
		Row row = st.getRow(RowNum);
		String data = row.getCell(CellNum).getStringCellValue();
		return data;
	}
	/**
	 * It's used to get last user rowNum on Specific sheet.
	 * @param Sheetname
	 * @return 
	 * @throws Throwable
	 */
	public int getRowCount(String sheetName) throws Throwable{
		FileInputStream fis = new FileInputStream(IConstants.EXCELPATH);
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sh = workbook.getSheet(sheetName);
		return sh.getLastRowNum();
	}
	/**
	 * Its used to write data back to Excel SHeet based on below Parameter
	 * @param SheetName
	 * @param RowNum
	 * @param CellNum
	 * @return
	 * @throws Throwable
	 */
	public void setDataExcel(String sheetname, int RowNum, int Cellnum, String data) throws Throwable {
		FileInputStream fis = new FileInputStream(IConstants.EXCELPATH);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet st = wb.getSheet(sheetname);
		Row row = st.getRow(RowNum);
		String data1 = row.getCell(Cellnum).getStringCellValue();
		
		FileOutputStream fos = new FileOutputStream(IConstants.EXCELPATH);
		wb.write(fos);
		wb.close();	
	}	
}

