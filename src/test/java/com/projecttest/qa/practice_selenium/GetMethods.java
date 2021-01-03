package com.projecttest.qa.practice_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hphp\\Downloads\\Compressed\\New folders\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com");
		 System.out.println(driver.getCurrentUrl());
		 System.out.println(driver.getTitle());
		 System.out.println(driver.getWindowHandles());
		 System.out.println(driver.getPageSource());
	}

}
