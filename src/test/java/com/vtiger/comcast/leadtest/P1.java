package com.vtiger.comcast.leadtest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;


public class P1 {
	
	@Test

	public void mrp() throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		EventFiringWebDriver edriver=new EventFiringWebDriver(driver);
		File srcFile=edriver.getScreenshotAs(OutputType.FILE);
		File destFIle=new File("/SDET20/getScreenshots/nikhil.png");
		FileUtils.copyFile(srcFile, destFIle);
		
		

	}

}
