package com.projecttest.qa.practice_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		
		
		  System.setProperty("webdriver.gecko.driver",
		  "C:\\Users\\hphp\\Downloads\\Compressed\\New\\geckodriver.exe"); WebDriver
		  driver = new FirefoxDriver();
		 driver.get("https://www.google.com");

		// System.out.println("1");
		// driver.quit();
	}

}
