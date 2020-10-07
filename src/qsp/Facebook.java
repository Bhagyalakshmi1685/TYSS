package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("Bhagya");
		Thread.sleep(1000);
		
		driver.findElement(By.name("pass")).sendKeys("bhagya");
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Forgotten account?")).click();
		Thread.sleep(1000);
				
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input[type = 'submit']")).click();
		Thread.sleep(1000);
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.name("firstname")).sendKeys("Lakshmi");
		Thread.sleep(1000);
		
		driver.findElement(By.name("lastname")).sendKeys("Harish");
		Thread.sleep(1000);
		
		driver.findElement(By.name("reg_email__")).sendKeys("8861310204");
		Thread.sleep(1000);
		
		driver.findElement(By.id("u_0_w")).sendKeys("Lahanvi");
		Thread.sleep(1000);
		
		driver.findElement(By.id("day")).sendKeys("20");
		Thread.sleep(1000);
		
		driver.findElement(By.name("birthday_month")).sendKeys("may");
		Thread.sleep(1000);
		
		driver.findElement(By.id("year")).sendKeys("1989");
		Thread.sleep(1000);
		
		driver.findElement(By.id("u_0_6")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("u_0_7")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("u_0_8")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Terms")).click();
		Thread.sleep(1000);
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.id("privacy-link")).click();
		Thread.sleep(1000);
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.id("cookie-use-link")).click();
		Thread.sleep(1000);
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.className("_6j mvm _6wk _6wl _58mi _3ma _6o _6v")).click();
		Thread.sleep(1000);
		
		driver.navigate().back();
		Thread.sleep(1000);
		driver.close();
	}

}
