package com.vtiger.comcast.leadtest;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.vtiger.comcast.genericUtility.BaseClass;
import com.vtiger.comcast.genericUtility.ExcelUtility;
import com.vtiger.comcast.genericUtility.FileUtility;
import com.vtiger.comcast.genericUtility.JavaUtility;
import com.vtiger.comcast.genericUtility.WebDriverUtility;
import com.vtiger.comcast.pomrepositylib.CreateNewLeadPage;
import com.vtiger.comcast.pomrepositylib.HomePage;
import com.vtiger.comcast.pomrepositylib.LeadInfoPage;
import com.vtiger.comcast.pomrepositylib.LeadsPage;
import com.vtiger.comcast.pomrepositylib.LoginPage;

public class Create_Lead_Invalid_Cred_3Test extends BaseClass {
	
	@Test(groups= {"smoketest"})

	public  void createLead3() throws Throwable{
		
		
		
		int randomInt=jLib.getRanDomNumber();
		int randomInt1=jLib.getRanDomNumber();
		int randomInt4=jLib.getRanDomNumber();
		int randomInt5=jLib.getRanDomNumber();
		
		
		
		/*test script data*/
		String last_name=eLib.getDataFromExcel("Sheet1", 1, 0)+randomInt;
		String company=eLib.getDataFromExcel("Sheet1", 1, 1)+randomInt1;
		String email=eLib.getDataFromExcel("Sheet1", 1, 2);
		String secondEmail=eLib.getDataFromExcel("Sheet1", 1, 3);
		String mobileNum=""+randomInt4;
		String phoneNum=""+randomInt5;
		
		
		/*navigating to Lead*/
		HomePage homepge=new HomePage(driver);
		homepge.getLead_link().click();
		
		LeadsPage le=new LeadsPage(driver);
		ArrayList k1 = le.initialLeadNos();
		
		/*navigating to create new lead page by clicking on + image*/
		LeadsPage createLead=new LeadsPage(driver);
		createLead.getLead_link().click();
		
		/*creating a lead*/
		CreateNewLeadPage createLeadPge=new CreateNewLeadPage(driver);
		createLeadPge.createLead(last_name, company, email, secondEmail,mobileNum,phoneNum);
		
		/*verification*/
		
		LeadInfoPage leadinfo=new LeadInfoPage(driver);
        String actText=leadinfo.getLead_Info().getText();
		
		homepge.getLead_link().click();
		
		ArrayList k2 = le.updatedLeadsNo();
		
		if(actText.contains(last_name) && !k1.contains(k2.get(k1.size()))) {
        	System.out.println("Pass: lead created successfuly with unique lead number");
        }else
        	System.out.println("Fail: Lead not created successfully");
		
	}

}
