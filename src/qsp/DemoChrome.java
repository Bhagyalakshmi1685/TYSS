package qsp;
import org.openqa.selenium.firefox.*;
import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.ie.*;

public class DemoChrome 
{
	static
	{
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		System.setProperty("webdriver.ie.driver","./Drivers/IEDriverServer.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Browser name");
		
		String s = sc.next();
		if(s.equals("firefox"))
		{
			
			driver = new FirefoxDriver();
			
		}
		else if(s.equals("chrome"))
		{
		
			driver = new ChromeDriver();
			
		}
		else if(s.equals("ie"))
			
		{
			driver = new InternetExplorerDriver();
			
		}
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
