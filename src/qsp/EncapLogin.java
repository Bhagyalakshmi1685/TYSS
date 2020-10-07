package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EncapLogin 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/");
		Thread.sleep(2000);
		EncapLoginJB fb1 = new EncapLoginJB(driver);
		fb1.getUnTB("Bhagya");
		Thread.sleep(2000);
		fb1.getPwTB("Bhagya");
		Thread.sleep(2000);
		fb1.getLgBT();
		Thread.sleep(2000);
		EncapLoginJB fb2 = new EncapLoginJB(driver);
		fb2.getUnTB("admin");
		Thread.sleep(2000);
		fb2.getPwTB("manager");
		Thread.sleep(2000);
		fb2.getLgBT();
		
	}

}
