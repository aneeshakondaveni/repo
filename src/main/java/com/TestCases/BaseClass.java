package com.TestCases;




import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.Utilities.ReadConfig;

public class BaseClass {
	ReadConfig read=new ReadConfig();
	public String baseURL=read.getURL();
	public String uname=read.getUname();
	public String pswd=read.getpsdL();
	public static WebDriver driver;
	public static Logger logger;
@Parameters("browser")
@BeforeClass
	
	public void setup(String br) {
		
		
		logger=Logger.getLogger("ibanking");
		PropertyConfigurator.configure("Log4j.properties");
		if(br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", read.getcromepath());	
			driver=new ChromeDriver();
		}
		else if(br.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", read.getfirefoxpath());	
			driver=new FirefoxDriver();
		}
		driver.get(baseURL);
		
	}


@AfterClass
public void tearDown() {
	driver.quit();
}
public void captureScreen(WebDriver driver, String tname) throws IOException {
	TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
	FileUtils.copyFile(source, target);
	System.out.println("Screenshot taken");
}

}
