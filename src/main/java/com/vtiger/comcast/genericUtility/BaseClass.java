package com.vtiger.comcast.genericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.vtiger.comcast.pomrepositylib.HomePage;
import com.vtiger.comcast.pomrepositylib.LoginPage;

public class BaseClass {
	
	//public static WebDriver bdriver;
	public static WebDriver bdriver;
	
	public WebDriver driver;
	public JavaUtility jLib=new JavaUtility();
	public WebDriverUtility wLib=new WebDriverUtility();
	public ExcelUtility eLib=new ExcelUtility();
	public FileUtility fLib=new FileUtility();
	
	@BeforeSuite(groups={"smoketest"})
	public void configBS() {
		System.out.println("before suite executed");
		
	}
	
	/*@Parameters("BROWSER")
	@BeforeClass
	public void configBC(String BROWSER) throws Throwable   {
		String chromekey=fLib.getPropertyKeyValue("chromeKey");
		String chromePath=fLib.getPropertyKeyValue("chromePath");
		String geckokey=fLib.getPropertyKeyValue("geckokey");
		String geckoPath=fLib.getPropertyKeyValue("geckopath");
		System.setProperty(chromekey, chromePath);
		System.setProperty(geckokey, geckoPath);
		if(BROWSER.equals("chrome")) {
			driver=new ChromeDriver();
		}else if(BROWSER.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
	}*/
	
	
	
	/*@Parameters("BROWSER")
	@BeforeClass
	public void configBC(String BROWSER) {
		if(BROWSER.equals("chrome")) {
			driver=new ChromeDriver();
	}else {
		driver=new FirefoxDriver();
	}
}*/
	
	@BeforeClass(groups={"smoketest","regressiontest"})
	public void configBC() throws Throwable {
		String geckokey=fLib.getPropertyKeyValue("geckokey");
		String geckoPath=fLib.getPropertyKeyValue("geckopath");
		System.setProperty(geckokey, geckoPath);
		driver=new FirefoxDriver();
		bdriver=driver;
		driver.manage().window().maximize();
	}
	
	/*@Parameters("BROWSER")
	@BeforeClass
	public void cbt1(String BROWSER ) {
		if(BROWSER.equals("chrome"))
			driver=new ChromeDriver();
		else if(BROWSER.equals("firefox"))
			driver=new FirefoxDriver();
	}*/
	
	@BeforeMethod(groups={"smoketest","regressiontest"})
	public void configBM() throws Throwable {
		String url=fLib.getPropertyKeyValue("appUrl");
		wLib.waitUntilPageLoad(driver);
		driver.get(url);
		String userName=fLib.getPropertyKeyValue("username");
		String passWord=fLib.getPropertyKeyValue("password");
		LoginPage loginpge=new LoginPage(driver);
		loginpge.loginToApp(userName, passWord);
		
	}
	
	@AfterMethod(groups={"smoketest","regressiontest"})
	public void configAM() {
		HomePage homepge=new HomePage(driver);
		homepge.logout();
	}
	
	@AfterClass(groups={"smoketest","regressiontest"})
	public void configAC() {
		driver.quit();	
	}
	
	@AfterSuite(groups={"smoketest","regressiontest"})
	public void configAS() {
		System.out.println("after suite executed");
		
	}
	
}
