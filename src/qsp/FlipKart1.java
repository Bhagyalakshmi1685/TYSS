package qsp;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class FlipKart1
{
	public static void main(String[] args)throws InterruptedException, IOException
	{
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone xs 64");
		List<WebElement> allsug = driver.findElements(By.xpath("//li[@class='_1va75j']"));
		Thread.sleep(4000);
		for(WebElement sug : allsug)
		{
			
			String text = sug.getText();
			
			if(text.equals("apple iphone xs 64 gold"))
			{
				sug.click();
				
			}
		}
		Thread.sleep(4000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Demo.png");
		Files.copy(src,dest);
		Thread.sleep(2000);
		driver.close();
	}
	
}
