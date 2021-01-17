package com.projecttest.qa.practice_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loctors {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hphp\\Downloads\\Compressed\\New folders\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		/*driver.findElement(By.id("email")).sendKeys("xyz");
		driver.findElement(By.name("pass")).sendKeys("hbvhgv");
		driver.findElement(By.linkText("Forgotten password?")).click();*/
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("kjhkhbj");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("kjhkhbj");
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id='error']")).getText());
		driver.quit();
		//Assert.assertFalse();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		/*auto suggest dropdown handling
		  driver.findElement(By.id("autosuggest")).sendKeys("ind");

Thread.sleep(3000);

List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

for(WebElement option :options)

{

if(option.getText().equalsIgnoreCase("India"))

{

option.click();

break;

}

}
		 */
		
	/*for checking that ui element is disabled or enabled	
	System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());

			System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

			driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

			System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

			if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))

			{

			System.out.println("its enabled");

			Assert.assertTrue(true);

			}

			else

			{

			Assert.assertTrue(false);

			}*/
	}
	

}
