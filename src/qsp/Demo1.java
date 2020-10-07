package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 
{
	static
	{
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		System.setProperty("webdriver.ie.driver","./Drivers/IEDriverServer.exe");
	}
	public static void main(String[] args)throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		String s = driver.getTitle();
		System.out.println(s);
		String s1 = driver.getCurrentUrl();
		System.out.println(s1);
		String s2 = driver.getPageSource();
		System.out.println(s2);
		Thread.sleep(3000);
		driver.close();
		
	}

}
