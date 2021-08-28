package com.vtiger.comcast.leadtest;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
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

public class Create_Lead_Invalid_Cred_1Test extends BaseClass {
	
	@Test

	public  void createLead1Test() throws Throwable{
		
		int randomInt=jLib.getRanDomNumber();
		int randomInt1=jLib.getRanDomNumber();
		int randomInt2=jLib.getRanDomNumber();
		int randomInt3=jLib.getRanDomNumber();
		
		/*test script data*/
		String last_name=eLib.getDataFromExcel("Sheet1", 1, 0)+randomInt;
		String company=eLib.getDataFromExcel("Sheet1", 1, 1)+randomInt1;
		String email=eLib.getDataFromExcel("Sheet1", 2, 2)+randomInt2;
		String secondEmail=eLib.getDataFromExcel("Sheet1", 2, 3)+randomInt3;
		
		/*navigating to Lead*/
		HomePage homepge=new HomePage(driver);
		homepge.getLead_link().click();
		
		/*navigating to create new lead page by clicking on + image*/
		LeadsPage createLead=new LeadsPage(driver);
		createLead.getLead_link().click();
		
		/*creating a lead*/
		CreateNewLeadPage createLeadPge=new CreateNewLeadPage(driver);
		createLeadPge.createLead(last_name, company, email, secondEmail);
		
		/*verification*/
		
		String acttualMessage=wLib.getText(driver);
		wLib.accept(driver);
		String expMsg=eLib.getDataFromExcel("Sheet1", 1, 4);
		
		if(acttualMessage.equals(expMsg)) {
			System.out.println("Pass: valid pop up message displayed and lead not created");
		}else
			System.out.println("Fail: valid message not displayed");
		
	}
	
	@Test
	public void createLeadwithInalid2Test() throws Throwable{
		
		boolean flag=true;

		int randomInt=jLib.getRanDomNumber();
		int randomInt1=jLib.getRanDomNumber();
		int randomInt2=jLib.getRanDomNumber();
		int randomInt3=jLib.getRanDomNumber();
		int randomInt4=jLib.getRanDomNumber();
		int randomInt5=jLib.getRanDomNumber();
		
		/*test script data*/
		String last_name=eLib.getDataFromExcel("Sheet1", 1, 0)+randomInt;
		String company=eLib.getDataFromExcel("Sheet1", 1, 1)+randomInt1;
		String email=eLib.getDataFromExcel("Sheet1", 2, 2)+randomInt2;
		String secondEmail=eLib.getDataFromExcel("Sheet1", 2, 3)+randomInt3;
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
		createLeadPge.createLead(last_name, company, mobileNum, phoneNum,flag);
		
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
	
	@Test
	public void createLeadInvalidcred3Test() throws Throwable {
		int randomInt=jLib.getRanDomNumber();
		int randomInt1=jLib.getRanDomNumber();
		int randomInt2=jLib.getRanDomNumber();
		int randomInt3=jLib.getRanDomNumber();
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
		
		/*navigating to create new lead page by clicking on + image*/
		LeadsPage createLead=new LeadsPage(driver);
		createLead.getLead_link().click();
		
		/*creating a lead*/
		CreateNewLeadPage createLeadPge=new CreateNewLeadPage(driver);
		createLeadPge.createLead(last_name, company, email, secondEmail,mobileNum,phoneNum);
		
		/*verification*/
		LeadInfoPage leadinfo=new LeadInfoPage(driver);
        String actText=leadinfo.getLead_Info().getText();
	        
	        if(actText.contains(last_name)) {
	        	System.out.println("Pass: lead created successfuly");
	        }else
	        	System.out.println("Fail: Lead not created successfully");
	        
		
	}

}
