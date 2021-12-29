package com.test.pages.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Dashboard {

	WebDriver driver;


	@FindBy(id="menu_dashboard_index")
	WebElement DB;


	@FindBy(xpath="//div[@id='dashboard-quick-launch-panel-menu_holder']/table/tbody/tr/td[6]/div/a/img")
	WebElement MyTimesheet;

	@FindBy(id="btnEdit")
	WebElement TimesheetEdit;

	@FindBy(xpath="//input[@id='initialRows_0_projectName']")
	WebElement ProjectName;


	@FindBy(id="initialRows_0_projectActivityName")
	WebElement ActivityName;

	@FindBy(xpath="//input[@id='initialRows_0_0']")
	WebElement MonTime;

	@FindBy(xpath="//input[@id='initialRows_0_1']")
	WebElement TueTime;

	@FindBy(xpath="//input[@id='initialRows_0_2']")
	WebElement WedTime;

	@FindBy(xpath="//input[@id='initialRows_0_3']")
	WebElement ThurTime;

	@FindBy(xpath="//input[@id='initialRows_0_4']")
	WebElement FriTime;

	@FindBy(xpath="//input[@id='submitSave']")
	WebElement SaveBtn;

	@FindBy(xpath="//input[@id='btnSubmit']")
	WebElement Submit;

	@FindBy(xpath="//input[@id='timesheet_status']")
	WebElement Result;
	
	

	public Dashboard(WebDriver driver) 
	{
		this.driver=driver;

		PageFactory.initElements(driver, this);

	}

	
	
	public void Verify_Dashboard() throws InterruptedException {

		if(driver.findElements(By.id("menu_dashboard_index"))!=null)
		{
			DB.isDisplayed();
			DB.click();

		}
		else 
		{
			System.out.println("Dashboard Web Element is not present ");
		}

	}
	
	
	
	public void VerifyTimesheet() 
	{
		if(driver.findElement(By.xpath("//div[@id='dashboard-quick-launch-panel-menu_holder']/table/tbody/tr/td[6]/div/a/img"))!= null)
		{
			MyTimesheet.click();
			TimesheetEdit.click();

		}
		else
		{
			System.out.println("Timesheet Web Element is not present ");
		}


	}
	
	
	
	

	public void SelectProjectAndActivity(String project,int ActivityIndex) throws InterruptedException {

		ProjectName.clear();
		ProjectName.click();
		ProjectName.sendKeys(project); 
		ProjectName.sendKeys(Keys.DOWN);
		ProjectName.sendKeys(Keys.ENTER);
		Thread.sleep(1000);

		Select se=new Select(ActivityName);
		se.selectByIndex(ActivityIndex);//5

		MonTime.clear();
		MonTime.click();
		MonTime.sendKeys("8");

		TueTime.clear();
		TueTime.click();
		TueTime.sendKeys("8");

		WedTime.clear();
		WedTime.click();
		WedTime.sendKeys("8");

		ThurTime.clear();
		ThurTime.click();
		ThurTime.sendKeys("8");

		FriTime.clear();
		FriTime.click();
		FriTime.sendKeys("8");
	}

	public void SaveAndSubmit() {


		SaveBtn.click();
		Submit.click();
		
		Assert.assertEquals(Result.getText(),"Status: Submitted");
		System.out.println("AssertEquals Test Passed\n");
		


	}

}

