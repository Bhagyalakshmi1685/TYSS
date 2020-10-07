package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actiTIMELoginPage
{
	@FindBy(id = "username")
	private WebElement unTB;
	@FindBy(name = "pwd")
	private WebElement pwTB;
	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement lgBT;
	
	public actiTIMELoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void enterUsername(String un)
	{
		unTB.sendKeys(un);
	}
	public void enterPassword(String pw)
	{
		pwTB.sendKeys(pw);
	}
	public void clickOnLogin()
	{
		lgBT.click();
	}
	

}
