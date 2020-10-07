package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLoginTest
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com");
		actiTIMELoginPage pom1 = new actiTIMELoginPage(driver);
		actiTIMEEnterTimeTrackPage pom2 = new actiTIMEEnterTimeTrackPage(driver);
		pom1.enterUsername("admin");
		pom1.enterPassword("manager");
		pom1.clickOnLogin();
		Thread.sleep(3000);
		pom2.clickOnLogout();
		Thread.sleep(2000);
		driver.close();
		
	}

}
