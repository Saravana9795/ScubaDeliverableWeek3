package com.test.pages.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPg {


	WebDriver driver;

	@FindBy(id="txtUsername")
	WebElement Username;



	@FindBy(name="txtPassword")
	WebElement Password;


	@FindBy(xpath="//input[@name='Submit']")
	WebElement LoginButton;

	

	@FindBy(xpath="//a[contains(text(),'Forgot your password?')]")
	WebElement ForgotPassword;
	
	@FindBy(xpath="//div[@id='welcome-menu']")
	WebElement WelMenu;
	
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	WebElement Logout;




	public LoginPg(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}


	public void loginModule(String userid, String pass) {
		// TODO Auto-generated method stub
		Username.sendKeys(userid);
		Password.sendKeys(pass);
		LoginButton.click();
	
	}
	
	public void Logout()
	{
	WelMenu.click();
	Logout.click();
	}
}


