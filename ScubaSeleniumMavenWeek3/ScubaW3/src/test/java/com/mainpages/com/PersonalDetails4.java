package com.mainpages.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PersonalDetails4 {
	WebDriver driver;
	By infoTab=By.xpath("//b[contains(text(),'My Info')]");
	By editOption=By.cssSelector("input#btnSave");
	By employeeID=By.cssSelector("input#personal_txtEmployeeId");
	By driverLicence=By.cssSelector("input#personal_txtLicenNo");
	By ssnNumber=By.cssSelector("input#personal_txtNICNo");
	By nickName=By.id("personal_txtEmpNickName");
	By save=By.xpath("//input[@id='btnSave']");

	public PersonalDetails4(WebDriver driver)
	{
		this.driver=driver;
	}

	public void PerfonalInfoEdit() throws InterruptedException {

		driver.findElement(infoTab).click();
		driver.findElement(editOption).click();
		
		driver.findElement(editOption).clear();
		driver.findElement(employeeID).sendKeys("9795");
		Thread.sleep(4000);


		driver.findElement(driverLicence).clear();
		driver.findElement(driverLicence).sendKeys("LF12");
		
		driver.findElement(ssnNumber).clear();
		driver.findElement(ssnNumber).sendKeys("46565");
		
		driver.findElement(nickName).clear();
		driver.findElement(nickName).sendKeys("Saravana");
		
		driver.findElement(save);
		Thread.sleep(3000);

	}

}


