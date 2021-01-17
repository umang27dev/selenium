package com.projecttest.qa.practice_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Loctors2 {

	public static void main(String[] args)  {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hphp\\Downloads\\Compressed\\New folders\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);

		a.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).build().perform();
		
		driver.findElement(By.xpath("//span[@class='nav-action-inner']")).click();
		driver.findElement(By.xpath("//a[text()='Privacy Notice']")).click();
		driver.navigate().back();
		
		System.out.println(driver.findElement(By.xpath("//span[@class='a-expander-prompt']")).getText());
		
		List <WebElement> links = driver.findElements(By.cssSelector("a"));
		
		for(WebElement link : links) {
			    String text = link.getText();
			    if (!text.trim().isEmpty())
			    {
			System.out.println(link.getText());
			System.out.println("**********************");
		}
		}
		
		System.out.println(links.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hphp\\Downloads\\Compressed\\New folders\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		/*driver.findElement(By.id("email")).sendKeys("xyz");
		driver.findElement(By.name("pass")).sendKeys("hbvhgv");
		driver.findElement(By.linkText("Forgotten password?")).click();
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
