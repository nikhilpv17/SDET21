package com.vtiger.comcast.pomrepositylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Organizations")
	private WebElement orglink;
	
	@FindBy(xpath="//a[text()='Leads']")
	private WebElement lead_link;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminimg;
	
	@FindBy(linkText="Sign Out")
	private WebElement logout;
	
	public WebElement getOrglink() {
		return orglink;
	}

	public WebElement getLead_link() {
		return lead_link;
	}

	public WebElement getAdminimg() {
		return adminimg;
	}

	public WebElement getLogout() {
		return logout;
	}
	
	public void logout() {
		Actions actions=new Actions(driver);
		actions.moveToElement(adminimg).perform();
		logout.click();
	}

}
