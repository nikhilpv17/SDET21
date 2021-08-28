package com.vtiger.comcast.pomrepositylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name="user_name")
	private WebElement user_name;
	
	@FindBy(name="user_password")
	private WebElement pass_word;
	
	@FindBy(id="submitButton")
	private WebElement login_btn;

	public WebElement getUser_name() {
		return user_name;
	}

	public WebElement getPass_word() {
		return pass_word;
	}

	public WebElement getLogin_btn() {
		return login_btn;
	}
	
	public void loginToApp(String username, String password) {
		user_name.sendKeys(username);
		pass_word.sendKeys(password);
		login_btn.click();
	}
	

}
