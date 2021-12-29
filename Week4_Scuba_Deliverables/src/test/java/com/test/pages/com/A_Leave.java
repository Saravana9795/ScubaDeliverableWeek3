package com.test.pages.com;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.com.BaseClass;

public class A_Leave {
	
	WebDriver driver;
	
	@FindBy(id="menu_leave_viewLeaveModule")
	WebElement LeaveModule;
	
	@FindBy(xpath="//a[@id='menu_leave_assignLeave']")
	WebElement AssignLeave;
	
	@FindBy(xpath="//input[@id='assignleave_txtEmployee_empName']")
	WebElement EmpName; // Orange
	
	@FindBy(xpath="//select[@id='assignleave_txtLeaveType']")
	WebElement LeaveType; // Index no 6
	
	@FindBy(xpath="//input[@id='assignleave_txtFromDate']")
	WebElement FromDate; // Leave From Date
	
	@FindBy(xpath="//input[@id='assignleave_txtToDate']")
	WebElement ToDate;
	
	@FindBy(xpath="//select[@id='assignleave_duration_duration']")
	WebElement Duration;
	
	@FindBy(xpath="//option[contains(text(),'Full Day')]")
	WebElement FullDay;
	
	@FindBy(id="assignleave_txtComment")
	WebElement CommentType;
	
	@FindBy(xpath="//input[@id='assignBtn']")
	WebElement Assign;
	
	@FindBy(xpath="//h3[contains(text(),'OrangeHRM - Confirm Leave Assignment')]")
	WebElement LeaveBalanceMessage;
	
	@FindBy(xpath="//input[@id='confirmOkButton']")
	WebElement LeaveBalOKButn;
	
	@FindBy(id="assignBtn")
	WebElement AssignBtn;
	
	
	
	public A_Leave(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	
	}
	
	public void AssignLeave1() throws Exception{
		BaseClass ob=new BaseClass();
		LeaveModule.click();
		ob.takeSnapShot(driver, "D:\\Automation\\Screenshots\\test9.png");
		AssignLeave.click();
		ob.takeSnapShot(driver, "D:\\Automation\\Screenshots\\test10.png");
		
		EmpName.clear();
		EmpName.sendKeys("Orange");
		EmpName.sendKeys(Keys.ARROW_DOWN);
		EmpName.sendKeys(Keys.ENTER);
		EmpName.sendKeys(Keys.TAB);
		ob.takeSnapShot(driver, "D:\\Automation\\Screenshots\\test11.png");
		
		LeaveType.click();
		Select Sel=new Select(LeaveType);
		Sel.selectByIndex(5);
		ob.takeSnapShot(driver, "D:\\Automation\\Screenshots\\test12.png");
		// Sel.selectByValue("CAN - Vacation");
		
		FromDate.clear();
		FromDate.sendKeys("2022-01-19");
		ob.takeSnapShot(driver, "D:\\Automation\\Screenshots\\test13.png");
		ToDate.clear();
		ToDate.sendKeys("2022-01-19");
		ob.takeSnapShot(driver, "D:\\Automation\\Screenshots\\test14.png");
		ToDate.sendKeys(Keys.TAB);
		
		ob.takeSnapShot(driver, "D:\\Automation\\Screenshots\\test15.png");
		Duration.click();
		ob.takeSnapShot(driver, "D:\\Automation\\Screenshots\\test16.png");
		FullDay.click();
		ob.takeSnapShot(driver, "D:\\Automation\\Screenshots\\test17.png");
		
		CommentType.sendKeys("Testing_SICK Leave");
		ob.takeSnapShot(driver, "D:\\Automation\\Screenshots\\test18.png");
		CommentType.sendKeys(Keys.TAB);
		
	
		AssignBtn.click();
		ob.takeSnapShot(driver, "D:\\Automation\\Screenshots\\test19.png");
	
		LeaveBalOKButn.click();
		ob.takeSnapShot(driver, "D:\\Automation\\Screenshots\\test20.png");
		
	}
	

}
