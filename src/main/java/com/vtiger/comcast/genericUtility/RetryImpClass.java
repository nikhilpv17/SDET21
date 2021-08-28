package com.vtiger.comcast.genericUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryImpClass implements IRetryAnalyzer{
	int counter=0;
	int retrycounter=4;
	
	public boolean retry(ITestResult result) {
		if(counter<retrycounter) {
			counter++;
			return true;
		}
		return false;
	}
	

}
