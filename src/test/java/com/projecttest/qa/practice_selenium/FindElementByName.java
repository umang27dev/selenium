package com.projecttest.qa.practice_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindElementByName {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hphp\\Downloads\\Compressed\\New folders\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.findElement(By.name("field-keywords")).sendKeys("Barbie Dolls");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-text\"]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Barbie")).click();

		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("2019 Holiday")).click();

		Thread.sleep(1000);

		String producttitle = driver.findElement(By.id("productTitle")).getText();
		String productprices = driver.findElement(By.id("priceblock_ourprice")).getText();

		System.out.println("producttitle: " + producttitle);
		System.out.println("productprices: " + productprices);
	}

}
