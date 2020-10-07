package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EncapLoginJB 
{
	@FindBy(id = "username")
	private WebElement unTB;
	@FindBy(name = "pwd")
	private WebElement pwTB;
	@FindBy(id = "loginButton")
	private WebElement lgBT;
	public EncapLoginJB(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void getUnTB(String uname) {
		unTB.sendKeys(uname);
	}
	public void getPwTB(String pass) {
		pwTB.sendKeys(pass);
	}
	public void getLgBT() {
		lgBT.click();
	}
	

}
