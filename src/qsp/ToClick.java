package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToClick
{
	public static void main(String[] args)throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/BCNGOWDA/Desktop/FirstName.html");
		WebElement ele = driver.findElement(By.id("s"));
		ele.click();
		Thread.sleep(3000);
		driver.navigate().back();
		//Thread.sleep(3000);
		ele.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.navigate().back();
		//Thread.sleep(3000);
		ele.submit();
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
