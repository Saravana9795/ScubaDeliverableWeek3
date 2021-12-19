package com.sampletest.pak.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.mainpages.com.ContactDetails1;
import com.mainpages.com.EmergencyDetails2;
import com.mainpages.com.LoginPage3;
import com.mainpages.com.PersonalDetails4;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {


	@Test
	
	public void Browser_Lanch() throws InterruptedException 
	{	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		LoginPage3 obj=new LoginPage3(driver);
		obj.loginModule("Admin", "admin123");
		
		PersonalDetails4 obj2=new PersonalDetails4(driver);
		obj2.PerfonalInfoEdit();
		
		ContactDetails1 obj3 = new ContactDetails1(driver);
		obj3.ContractInfo();
		
		EmergencyDetails2 obj4 = new EmergencyDetails2(driver);
		obj4.EmergencyContact();
		
		
	}
	
}
