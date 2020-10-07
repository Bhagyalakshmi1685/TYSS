package Assignment;

import java.awt.AWTException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon 
{
	public static void main(String[] args)throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://www.amazon.in");
		driver.findElement(By.xpath("(//span[@class='nav-line-2 '])[1]")).click();
		//driver.findElement(By.xpath("(//span[text()='Sign in'])[1]")).click();
		WebElement ele = driver.findElement(By.xpath("//input[@id='ap_email']"));
		ele.sendKeys("8861310204");
		Thread.sleep(2000);
		ele.sendKeys(Keys.ENTER);
		WebElement ele1 = driver.findElement(By.xpath("//input[@type='password']"));
		ele1.sendKeys("8861310204");
		ele1.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//a[@href='/gp/goldbox?ref_=nav_topnav_deals']")).click();
		driver.findElement(By.xpath("(//div[@class='a-row layer backGround'])[1]")).click();
		List<WebElement> allimg = driver.findElements(By.xpath("//ul[@class='a-unordered-list a-nostyle a-button-list a-vertical a-spacing-top-micro']/li//img"));
		System.out.println(allimg.size());
		Actions a = new Actions(driver); 
		Iterator itr = allimg.iterator();
		while(itr.hasNext())
		{
			
			WebElement e = (WebElement) itr.next();
			a.moveToElement(e).perform();
		}
		
	}

}
