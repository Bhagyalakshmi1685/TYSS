package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyTextFromFN
{
	public static void main(String[] args)throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/BCNGOWDA/Desktop/FirstName.html");
		WebElement fname = driver.findElement(By.id("fn"));
		fname.sendKeys("Bhagya");
		fname.sendKeys(Keys.CONTROL+"ac");
		Thread.sleep(3000);
		WebElement lname = driver.findElement(By.id("ln"));
		lname.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		driver.close();
		
	}

}
