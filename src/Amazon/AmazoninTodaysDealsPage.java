package Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazoninTodaysDealsPage 
{
	@FindBy(xpath = "(//input[@type='checkbox'])[25]")
	private WebElement scroll;
	@FindBy(xpath = "(//input[@type='checkbox'])[27]")
	private WebElement check;
	@FindBy(xpath = "//span[@class='a-expander-prompt']")
	private WebElement link;
	@FindBy(xpath = "(//input[@type='checkbox'])[66]")
	private WebElement scroll2;
	@FindBy(xpath = "(//input[@type='checkbox'])[66]")
	private WebElement check2;
	@FindBy(xpath = "//span[text()='Department']")
	private WebElement scrollUp;
	@FindBy(xpath = "(//span[@tabindex='-1'])[1]")
	private WebElement dropDown;
	@FindBy(xpath="(//a[@class='a-dropdown-link a-active'])[2]")
	private WebElement option;
	@FindBy(xpath = "//img[@alt='[eBook] The Unknown Life of Jesus Christ']")
	private WebElement selectBook;
	public AmazoninTodaysDealsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public int scrollDown()
	{
		return scroll.getLocation().getY();
	}
	public void clickOnCheckbox1()
	{
		check.click();
	}
	public void clickOnLink()
	{
		link.click();
	}
	public int scrollDown2()
	{
		return scroll2.getLocation().getY();
	}
	public void clickOnCheckbox2()
	{
		check2.click();
	}
	public int scrollUp1() 
	{
		return scrollUp.getLocation().getY();
	}
	public void clickOnDropdown()
	{
		 dropDown.click();;
	}
	public void clickOnOption()
	{
		
		option.click();
	}
	public void clickOnBook1()
	{
		selectBook.click();
	}
	

}
