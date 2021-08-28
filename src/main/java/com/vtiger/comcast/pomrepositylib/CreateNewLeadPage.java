package com.vtiger.comcast.pomrepositylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewLeadPage {
	public CreateNewLeadPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name=\"lastname\"]")
	private WebElement last_name;
	
	@FindBy(xpath="//input[@name=\"company\"]")
	private WebElement company;
	
	@FindBy(xpath="//input[@title=\"Save [Alt+S]\"]")
	private WebElement savebtn;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement email_Tf;
	
	@FindBy(xpath="//input[@id=\"secondaryemail\"]")
	private WebElement secodaryEmail_Tf;
	
	@FindBy(xpath="//input[@id=\"phone\"]")
	private WebElement phone_No;
	
	@FindBy(xpath="//input[@id=\"mobile\"]")
	private WebElement mobile_No;
	
	@FindBy(xpath="//span[@class=\"dvHeaderText\"]")
	private WebElement textMsg;
	
	public WebElement getTextMsg() {
		return textMsg;
	}

	public WebElement getPhone_No() {
		return phone_No;
	}

	public WebElement getMobile_No() {
		return mobile_No;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public WebElement getCompany() {
		return company;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}

	public WebElement getEmail_Tf() {
		return email_Tf;
	}

	public WebElement getSecodaryEmail_Tf() {
		return secodaryEmail_Tf;
	}
	
	
	public void createLead(String lastname, String comp, String email, String secodaryEmail ) {
		last_name.sendKeys(lastname);
		company.sendKeys(comp);
		email_Tf.sendKeys(email);
		secodaryEmail_Tf.sendKeys(secodaryEmail);
		savebtn.click();
	}
	public void createLead(String lastname, String comp,String mob_no,String ph_no,boolean flg) {
		last_name.sendKeys(lastname);
		company.sendKeys(comp);
		phone_No.sendKeys(ph_no);
		mobile_No.sendKeys(mob_no);
		savebtn.click();
	}
	public void createLead(String lastname, String comp, String email, String secodaryEmail,String mob_no,String ph_no) {
		last_name.sendKeys(lastname);
		company.sendKeys(comp);
		email_Tf.sendKeys(email);
		secodaryEmail_Tf.sendKeys(secodaryEmail);
		phone_No.sendKeys(ph_no);
		mobile_No.sendKeys(mob_no);
		savebtn.click();
	}
	
	

}
