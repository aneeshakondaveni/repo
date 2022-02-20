package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver idriver){
		driver=idriver;
		PageFactory.initElements(driver, this);
		

}
	
	@FindBy (name="loginId")
	WebElement uname;
	
	@FindBy (name="password")
	WebElement pswd;
	
	@FindBy (xpath="//button[@class='blue button']")
	WebElement login;
	
	//actions
	
	public void set_userName(String unme) {
		uname.sendKeys(unme);
		
	}
	
	public void set_pswd(String pwd) {
		pswd.sendKeys(pwd);
		
	}
	
	public void click() {
		login.click();;
		
	}
}
