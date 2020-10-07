package Assignment;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBPhotoUpload
{
	public static void main(String[] args)throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("lakshmics143@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("lakshmilakshmi");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		
	}

}
