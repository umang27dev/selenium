package com.projecttest.qa.practice_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcepts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hphp\\Downloads\\Compressed\\New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F");

		// 1.xpath:absolute x path not used only relative used like in case of id
		// driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("tom");
		// System.out.println("1");
		// driver.quit();

		// 2.id
		driver.findElement(By.id("firstname")).sendKeys("tom");
		// 3.name
		driver.findElement(By.name("firstname")).sendKeys("tom");
        //4.linktext:for link we have "a" in starting of html code
		driver.findElement(By.linkText("sign in")).click();
		//5.partial link text
		//6.cssselector:it is equal to #id or .class
		//7.classname
		
	}

}
