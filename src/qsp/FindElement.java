package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElement 
{
	public static void main(String[] args)throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/BCNGOWDA/Desktop/sample.html");
		
		WebElement link = driver.findElement(By.id("fb"));
		
		link.click();
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.findElement(By.name("gmail")).click();
		WebElement ele = driver.switchTo().activeElement();
		ele.sendKeys("java");
		 Thread.sleep(3000);
		 
		 driver.navigate().back();
		 Thread.sleep(3000);
		 
		 driver.findElement(By.tagName("a")).click();
		 Thread.sleep(3000);
		 
		 driver.navigate().back();
		 Thread.sleep(2000);
		 
		/* driver.findElement(By.className("gm")).click();
		 driver.navigate().refresh();
		 Thread.sleep(2000); 
		 
		 driver.navigate().back();
		 Thread.sleep(2000);  */
		 
		 driver.findElement(By.linkText("Gmail")).click();
		 Thread.sleep(2000);
		 
		 driver.navigate().back();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.partialLinkText("g")).click();
		 Thread.sleep(2000);
		 driver.close();
	}

}
