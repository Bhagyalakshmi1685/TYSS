package Amazon;

import java.util.concurrent.TimeUnit;
import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://www.amazon.in");
		driver.findElement(By.xpath("//img[@alt='Refrigerators']")).click();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		
		driver.findElement(By.xpath("//span[text()='Haier 181 L 2 Star Direct-Cool Single Door Refrigerator (HED-1812BKS-E, Black Brushline)']/ancestor::div[5]//span[text()='9,990']"));
		driver.close();
	}
}
