package Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import qsp.ToCountLinksPom;

public class ToCountLinksTest
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://selenium.dev/downloads");
		ToCountLinksPom tcl = new ToCountLinksPom(driver);
		tcl.getAlllinks();
		driver.close();
		
	}
	
}
