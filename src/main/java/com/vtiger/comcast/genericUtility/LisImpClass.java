package com.vtiger.comcast.genericUtility;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class LisImpClass implements ITestListener {
	
	public void onTestFailure(ITestResult result) {
		String testName=result.getMethod().getMethodName();
		System.out.println("...Iam listening...");
		EventFiringWebDriver edriver=new EventFiringWebDriver(BaseClass.bdriver);
		File srcFile=edriver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File("./getScreenshots/"+testName+".png"));
		}catch(IOException e){
			e.printStackTrace();
			
		}
			
	}
	
}
