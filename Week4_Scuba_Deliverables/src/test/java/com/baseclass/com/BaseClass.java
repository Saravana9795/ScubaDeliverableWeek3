package com.baseclass.com;


import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.test.pages.com.A_Leave;
import com.test.pages.com.Dashboard;
import com.test.pages.com.LoginPg;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	 @Test(priority = 1)
public void TimesheetSubmit() throws Exception 
	{	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		BaseClass ob=new BaseClass();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		LoginPg obj=new LoginPg(driver);
		
		ob.takeSnapShot(driver, "D:\\Automation\\Screenshots\\test.png");
		obj.loginModule("Admin", "admin123");
		ob.takeSnapShot(driver, "D:\\Automation\\Screenshots\\test1.png");
		
		Dashboard obj2=new Dashboard(driver);
		ob.takeSnapShot(driver, "D:\\Automation\\Screenshots\\test2.png");
		obj2.Verify_Dashboard();
		ob.takeSnapShot(driver, "D:\\Automation\\Screenshots\\test3.png");
		
		obj2.VerifyTimesheet();
		ob.takeSnapShot(driver, "D:\\Automation\\Screenshots\\test4.png");
		obj2.SelectProjectAndActivity("ACME Ltd - ACME Ltd", 5);
		
		ob.takeSnapShot(driver, "D:\\Automation\\Screenshots\\test5.png");
		obj2.SaveAndSubmit();
		ob.takeSnapShot(driver, "D:\\Automation\\Screenshots\\test6.png");
		
		Thread.sleep(5000);
	
				
	} 
	
	@Test(priority = 2)
	
	public void AssignLeaveTC2() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		BaseClass ob=new BaseClass();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		LoginPg obj=new LoginPg(driver);
		
		ob.takeSnapShot(driver, "D:\\Automation\\Screenshots\\test7.png");
		obj.loginModule("Admin", "admin123");
		ob.takeSnapShot(driver, "D:\\Automation\\Screenshots\\test8.png");
		A_Leave obj4=new A_Leave(driver);
		
		obj4.AssignLeave1();
		
		
	}
	
	public void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{


        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
 
                File DestFile=new File(fileWithPath);

                FileUtils.copyFile(SrcFile, DestFile);

    }
}

	
		


