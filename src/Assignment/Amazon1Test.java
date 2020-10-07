package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Amazon.AmazoninTodaysDealsPage;

public class Amazon1Test 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		OnlineShoppingsiteinIndiaPage osip = new OnlineShoppingsiteinIndiaPage(driver);
		osip.clickOnSignin();
		AmazonSignInPage asip =  new AmazonSignInPage(driver);
		asip.enterPhno("8861310204");
		asip.clickOnContinue();
		asip.enterPwd("8861310204");
		asip.clickOnSignin();
		Thread.sleep(30000);
		osip.clickOnTodaysDeals();
		AmazoninTodaysDealsPage atdp = new AmazoninTodaysDealsPage(driver);
		int y = atdp.scrollDown();
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,'"+y+"')");
		Thread.sleep(2000);
		atdp.clickOnCheckbox1();
		atdp.clickOnLink();
		int y1 = atdp.scrollDown2();
		jse.executeScript("window.scrollBy(0,'"+y1+"')");
		atdp.clickOnCheckbox2();
		atdp.scrollUp1();
		atdp.clickOnDropdown();
		
		 atdp.clickOnOption();
		
		
		
	}

}
