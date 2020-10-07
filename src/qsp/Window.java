package qsp;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Window
{
	static
	{
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		System.setProperty("webdriver.ie.driver","./Drivers/IEDriverServer.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		Dimension d = new Dimension(200,300);
		driver.manage().window().setSize(d);
		Thread.sleep(4000);
		
		Point p =  new Point(220,330);
		driver.manage().window().setPosition(p);
		Thread.sleep(4000);
		
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		driver.manage().window().fullscreen();
		
		Thread.sleep(4000);
		driver.close();
		
		driver.quit();
		
	}

}
