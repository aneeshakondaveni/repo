package com.TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageObjects.LoginPage;

public class TC_loginTest_001 extends BaseClass{

@Test	
public void loginTest() throws InterruptedException, IOException {
		driver.get(baseURL);
		logger.info("entered url");
		LoginPage lp=new LoginPage(driver);
		lp.set_userName(uname);
		logger.info("entered uname");
		Thread.sleep(3000);
		lp.set_pswd(pswd);
		logger.info("entered pswd");
		lp.click();
		System.out.println(driver.getTitle());
		
		
		if (driver.getTitle().equals("Gurukul"))
				
				{
			Assert.assertTrue(true);
		}
		else {
			captureScreen (driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("screenshot taken");
		}
	}

}
