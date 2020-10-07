package qsp;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipCart 
{
	public static void main(String[] args)throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone xs 64");
		List<WebElement> allsug = driver.findElements(By.xpath("//li[@class='_1va75j']"));
		int count = allsug.size() ;
		System.out.println(count);
		TreeSet<String> ts = new TreeSet<String>();
		Thread.sleep(3000);
		for(int i=0; i<allsug.size(); i++)
		{
			WebElement sug = allsug.get(i);
			String text = sug.getText();
			ts.add(text);
		} 
		for(String e : ts)
		{
			System.out.println(e);
		}
			
		
		Thread.sleep(5000);
		
		
		
		driver.close();
		
	}




}
