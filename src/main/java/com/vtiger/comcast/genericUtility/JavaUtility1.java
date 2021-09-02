package com.vtiger.comcast.genericUtility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.Random;

public class JavaUtility1 {
	
	/**
	 * This method generates randon numbers
	 * 
	 * suthor: Nikhil
	 */
	public int getRandomNo() {
		Random random=new Random();
		int num=random.nextInt();
		return num;
	}
	
	/**
	 * This method generates current system date and time
	 * 
	 * Author: Nikhil
	 */
	public String getDateAndTime() {
		Date date=new Date();
		String dateNow=date.toString();
		return dateNow;
	}
	
	/**
	 * this method is used for key press and key release of enter key
	 * 
	 * author: nikhil
	 * @throws AWTException 
	 */
	public void enterKeyPressRelease() throws AWTException {
		Robot rob=new Robot();
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
	}

}
