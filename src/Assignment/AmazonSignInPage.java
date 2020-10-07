package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSignInPage 
{
	@FindBy(id = "ap_email")
	private WebElement phno;
	
	@FindBy(id = "continue")
	private WebElement continue1;
	
	@FindBy(id = "ap_password")
	private WebElement pwd;
	
	@FindBy(id = "signInSubmit")
	private WebElement signin;
	
	public AmazonSignInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void enterPhno(String ph)
	{
		phno.sendKeys(ph);
	}
	public void clickOnContinue()
	{
		continue1.click();
	}
	public void enterPwd(String pass)
	{
		pwd.sendKeys(pass);
	}
	public void clickOnSignin()
	{
		signin.click();
	}
}
