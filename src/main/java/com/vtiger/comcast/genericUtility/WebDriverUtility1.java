package com.vtiger.comcast.genericUtility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility1 {
	
	public void impliWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void expliWait(WebDriver driver, WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(element));		
	}
	
	public void sel1(WebElement element, int index) {
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	
	public void sel2(WebElement element, String text) {
		Select sel2=new Select(element);
		sel2.selectByValue(text);
	}
	
	public void mouseHover(WebDriver driver, WebElement element) {
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	public String tsst(WebDriver driver) {
		String fd=driver.switchTo().alert().getText();
		return fd;
	}
	
	public void tsst1(WebDriver driver) {
		driver.switchTo().alert().accept();
		return;
	}

}
