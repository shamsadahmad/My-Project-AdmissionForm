package com.edu.OnlineAddmissionSystem.genericutility;

import java.util.Date;
import java.util.Random;

/** 
 * 
 * @author Shamshad
 *
 */
public class JavaUtility {
	/** 
	 * Its used to generate the random number within the range of 1000 
	 * @return
	 */
	public static int getRandomNumber() {
		Random random = new Random();
		int randomNo = random.nextInt(1000); 
		return randomNo; 
	}
	
	/**
	 * Its used to get the Current system Date Base on the YYYY-MM-DD Format
	 * @return 
	 * 
	 */
	public String getSystemDate() {
		Date date = new Date(); 
		String currentDate = date.toString();
		System.out.println(currentDate); 
		String[] arr = currentDate.split(" ");
		
		String year = arr[5];
		String dd = arr[2];
		int mon = date.getMonth();
		String format = year + "-" + dd + "-" + mon;
		return format;
	}
	/**
	 * It's used to the System date bases on DD-MM-YYYY format
	 * @return
	 */
	public String getSystemDateInIST() {
		Date date = new Date();
		String sysDate = date.toString();
		System.out.println(sysDate);
		String [] arr = sysDate.split(" ");
		String yyyy = arr[5];
		String dd = arr[2];
		int mm = date.getMonth()+1;
		String formate = dd+"-"+mm+"-"+yyyy;
		return formate;

	}
	
//	public String displayTimeWithDate() {
//		Date date = new Date();
//		String currentDate = date.toString();
//		System.out.println(currentDate);
//		return currentDate;
//	}
	
}
