package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathByText 
{
	public static void main(String[] args)throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.dev/downloads/");
		driver.findElement(By.xpath("//td[text()='Java']"));
		Thread.sleep(8000);
		driver.close();
		
	}

}
