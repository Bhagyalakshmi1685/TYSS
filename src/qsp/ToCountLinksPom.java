package qsp;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToCountLinksPom 
{
	@FindBy(tagName="a")
	private List<WebElement> alllinks;
	public ToCountLinksPom(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void getAlllinks()
	{
		int count = alllinks.size();
		System.out.println("no of links presents in a page" + count);
		int visiblelinks = 0;
		int hiddenlinks = 0;
		for(WebElement link : alllinks)
		{
			boolean v = link.isDisplayed();
			if(v)
			{
				visiblelinks++;
			}
			else
				hiddenlinks++;
		}
		System.out.println("visisble links are = " +visiblelinks);
		System.out.println("hidden links are = " +hiddenlinks);
	}
	
}
