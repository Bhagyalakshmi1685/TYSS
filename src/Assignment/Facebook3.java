package Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebook3
{
	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.get("http://www.facebook.com");

        //This will scroll the web page till end.		
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		verifyTitle(driver,"Facebook – log in or sign up");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("lakshmics143@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("lakshmilakshmi");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		verifyTitle(driver,"(6) Facebook");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Friend Lists']")).click();
		driver.findElement(By.xpath("//a[text()='See All Friends']")).click();
		//driver.findElement(By.xpath("//span[text()='All Friends']")).click();
		
		List<WebElement> frnd = driver.findElements(By.xpath("//ul/li//div[@class='fsl fwb fcb']/a"));
		int count = frnd.size();
		System.out.println("no of friends = "+count);
		System.out.println("all friends names");
		for(WebElement fname : frnd)
		{
			String text = fname.getText();
			System.out.println(text);
		}
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@id='userNavigationLabel']")).click();
		driver.findElement(By.xpath("//span[text()='Log Out']")).click();
		driver.close();
	}
	public static void verifyTitle(WebDriver driver, String title)
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		try
		{
			wait.until(ExpectedConditions.titleIs(title));
			System.out.println("page is displayed");
		}
		catch(Exception e)
		{
			System.out.println("page not displayed");
		}
	}

}
