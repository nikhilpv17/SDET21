package com.vtiger.comcast.pomrepositylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewLeadPage1 {
	
	public CreateNewLeadPage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="jjdhdjs")
	private WebElement name;
	
	public WebElement getName() {
		return name;
	}
	
	@FindBy(name="jjdhs")
	private WebElement id;
	
	public WebElement getId() {
		return id;
	}
	
	public void createLead(String name,String id) {
		this.name.sendKeys("jfjffj");
     	this.id.click();
		
	}

}
