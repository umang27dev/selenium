package com.projecttest.qa.practice_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handelfileuploadpopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\hphp\\Downloads\\Compressed\\New\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://html.com/input-type-file/");
		
		driver.findElement(By.xpath("//*[@id=\"fileupload\"]")).sendKeys("C:\\Users\\hphp\\Desktop\\tb folder\\GARAGE COMMUNICATION_30 SEC.MP4");
		
		

	}

}
