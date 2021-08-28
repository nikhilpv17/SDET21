package com.vtiger.comcast.pomrepositylib;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LeadsPage {
	public LeadsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@src=\"themes/softed/images/btnL3Add.gif\"]")
	private WebElement lead_link;

	public WebElement getLead_link() {
		return lead_link;
	}
	
	@FindBy(xpath="//td[contains(text(),'LEA')]")
	private List<WebElement> leadNo;

	public List<WebElement> getLeadNo() {
		return leadNo;
	}
	
	public ArrayList initialLeadNos() {
		ArrayList l1=new ArrayList();
		for(WebElement e1:leadNo) {
			 l1.add(e1.getText());
		}
		return l1;
	}
	
	public ArrayList updatedLeadsNo() {
		ArrayList l2=new ArrayList();
		for(WebElement e2:leadNo) {
			l2.add(e2.getText());
		}
		return l2;		
	}
	
}
