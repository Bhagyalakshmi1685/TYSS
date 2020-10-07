package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		String key = "webdriver.gecko.driver";
		String value = "./Drivers/geckodriver.exe";
		System.setProperty(key,value);
		FirefoxDriver fd=new FirefoxDriver();
		Thread.sleep(5000);
		fd.close();
		
	}

}
