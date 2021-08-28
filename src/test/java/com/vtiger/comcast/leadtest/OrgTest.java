package com.vtiger.comcast.leadtest;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class OrgTest {
	
	@Test(priority=1)
	public void testing() {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(true, false);
		System.out.println(4);
		System.out.println(5);
		sa.assertAll();
	}
	
	@Test(priority=2)
	public void mfn() {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
	}
	
	
	

}
