package com.projecttest.qa.practice_selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\hphp\\Downloads\\Compressed\\New\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//driver.findElement(By.xpath("//*[@id=\"login1\"]")).sendKeys("tom");
		//System.out.println("fffffffff");
		
		driver.findElement(By.name("proceed")).click();
		
		//System.out.println("11111111111");
		Thread.sleep(5000);
	Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();//click ok 
		//alert.dismiss();//for cancel button
		
		
	}

}
