package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actiTIMEEnterTimeTrackPage
{
	@FindBy(id = "logoutLink")
	private WebElement logout;
	public actiTIMEEnterTimeTrackPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickOnLogout()
	{
		logout.click();
	}

}
