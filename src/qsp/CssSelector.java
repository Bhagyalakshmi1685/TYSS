package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelector
{
	public static void main(String[] args)throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/BCNGOWDA/Desktop/sample.html");
		
		driver.findElement(By.cssSelector("input[type = 'text']")).sendKeys("bhagya");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input[type = 'password']")).sendKeys("bhagya");
		Thread.sleep(4000);
		
		driver.close();
	}

}
