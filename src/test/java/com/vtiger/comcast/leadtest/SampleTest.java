package com.vtiger.comcast.leadtest;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(com.vtiger.comcast.genericUtility.LisImpClass.class)
public class SampleTest {
	@Test
	public void abc()  throws Throwable{
		System.out.println("...test start...");
		Assert.assertEquals(false, true);
		System.out.println("...test end...");
	}

}
