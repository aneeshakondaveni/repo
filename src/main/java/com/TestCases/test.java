package com.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Chandra Shekar\\eclipse-workspace\\Ibanking\\drivers\\chromedriver.exe");
		WebDriver driver=new FirefoxDriver();// TODO Auto-generated method stub
driver.get("www.google.com");
	}
}
