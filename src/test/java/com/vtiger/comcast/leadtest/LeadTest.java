package com.vtiger.comcast.leadtest;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.comcast.genericUtility.BaseClass;

//@Listeners(com.vtiger.comcast.genericUtility.LisImpClass1.class)
public class LeadTest  {
	
	@Test(dataProvider="dataTest")
	public void kbcTest(String df, String ds) {
		System.out.println(""+df+"+"+ds+"");
		//Assert.assertEquals(false, true);
	}
	
	@DataProvider
	public Object[][] dataTest(){
		Object[][] abc=new Object[5][2];
		abc[0][0]="bangalore";
		abc[0][1]="mysore";
		
		abc[1][0]="hubli";
		abc[1][1]="dharwad";
		
		abc[2][0]="baglore";
		abc[2][1]="belgaum";
		
		abc[3][0]="baglore1";
		abc[3][1]="belgau9m";
		
		abc[4][0]="baglo00re";
		abc[4][1]="belgaum432";
		
		return abc;
	}

}
