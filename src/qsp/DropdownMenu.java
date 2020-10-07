package qsp;

import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropdownMenu 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://home.redbrickhealth.com");
		verifyTitle(driver,"Corporate wellness and employee engagement solution – RedBrick Health");
		List<WebElement> allmenu = driver.findElements(By.xpath("//ul[@id='main-menu']//li[5]/preceding-sibling::li"));
		int count1 = allmenu.size();
		System.out.println("num of dropdown menus - " +count1);
		String xp = "//a[text()='RedBrick Health']/ancestor::nav//a[@title='Solutions']";
		WebElement solu = driver.findElement(By.xpath(xp));
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(solu).perform();
		String xp1 = "(//ul[@class=' dropdown-menu'])[1]/li";
		List<WebElement> submenu = driver.findElements(By.xpath(xp1));
		int count = submenu.size();
		System.out.println("SOLUTIONS DROP-DOWN MENU");
		System.out.println("num of submenus under solutions - " +count);
		int num = 0;
		Thread.sleep(4000);
		TreeSet<String> ts = new TreeSet<String>();
		for(WebElement sub : submenu)
		{
			String text = sub.getText();
			ts.add(text);
			//System.out.println(++num+" - " +text);
		}
		for(String tset : ts)
		{
			System.out.println(++num+" - "+ tset);
		}
		Thread.sleep(2000);
		String xp2 = "//a[text()='RedBrick Health']/ancestor::nav//a[@title='Results']";
		WebElement res = driver.findElement(By.xpath(xp2));
		act.moveToElement(res).perform();
		String xp3 = "(//ul[@class=' dropdown-menu'])[2]/li";
		List<WebElement> submenu1 = driver.findElements(By.xpath(xp3));
		int count2 = submenu1.size();
		System.out.println("RESULTS DROP-DOWN MENU");
		System.out.println("num of submenus under results - "+count2);
		int num1 = 0;
		Thread.sleep(2000);
		TreeSet<String> ts1 = new TreeSet<String>();
		for(WebElement sub : submenu1)
		{
			String text = sub.getText();
			ts1.add(text);
			//System.out.println(++num1+" - " +text);
		}
		for(String tset : ts1)
		{
			System.out.println(++num1+" - "+tset);
		}
		Thread.sleep(2000);
		
		String xp4 = "//a[text()='RedBrick Health']/ancestor::nav//a[@title='About Us']";
		WebElement abt = driver.findElement(By.xpath(xp4));
		act.moveToElement(abt).perform();
		String xp5 = "(//ul[@class=' dropdown-menu'])[3]/li";
		List<WebElement> submenu2 = driver.findElements(By.xpath(xp5));
		int count3 = submenu2.size();
		System.out.println("ABOUT US DROP-DOWN MENU");
		System.out.println("num of submenus under about us - "+count3);
		int num2 = 0;
		Thread.sleep(2000);
		for(WebElement sub : submenu2)
		{
			String text = sub.getText();
			System.out.println(++num2+" - " +text);
		}
		driver.close();
	}
	public static void verifyTitle(WebDriver driver, String title)
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		try
		{
			wait.until(ExpectedConditions.titleIs(title));
			System.out.println("title is matching");
		}
		catch(Exception e)
		{
			System.out.println("title is not matching");
		}
	}

}
