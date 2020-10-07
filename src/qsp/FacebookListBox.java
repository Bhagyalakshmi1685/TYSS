package qsp;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookListBox 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://facebook.com");
		WebElement day = driver.findElement(By.id("day"));
		Select sel = new Select(day);
		sel.selectByValue("25");
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.id("month"));
		Select sel1 = new Select(month);
		sel1.selectByValue("5");
		Thread.sleep(2000);
		WebElement year = driver.findElement(By.id("year"));
		Select sel2 = new Select(year);
		sel2.selectByValue("1990");
		Thread.sleep(2000);
		
		driver.close();
	}

}
