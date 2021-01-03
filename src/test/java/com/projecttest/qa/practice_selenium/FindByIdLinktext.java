package com.projecttest.qa.practice_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindByIdLinktext {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hphp\\Downloads\\Compressed\\New folders\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.actitime.com");
		 driver.findElement(By.linkText("Try Free")).click();
		  WebDriverWait wait =new WebDriverWait(driver,10);
		 wait.until(ExpectedConditions.urlToBe("https://www.actitime.com/free-online-trial"));
		 driver.findElement(By.id("first-name")).sendKeys("firstname");
		 driver.findElement(By.id("last-name")).sendKeys("lastname");
		 driver.findElement(By.id("email")).sendKeys("email@test.com");
		 driver.findElement(By.id("company")).sendKeys("company");
	}

}
