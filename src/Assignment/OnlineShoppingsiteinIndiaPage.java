package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnlineShoppingsiteinIndiaPage 
{
	@FindBy(xpath = "(//span[@class='nav-line-2 '])[1]")
	private WebElement signin;
	@FindBy(xpath = "//a[@class='nav-a  '][3]")
	private WebElement todaysDeal;
	public OnlineShoppingsiteinIndiaPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickOnSignin()
	{
		signin.click();
	}
	public void clickOnTodaysDeals()
	{
		todaysDeal.click();
	}
	

}
