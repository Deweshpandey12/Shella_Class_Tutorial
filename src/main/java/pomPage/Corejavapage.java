package pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Corejavapage 
{
	@FindBy(linkText=" Core Java for Selenium")
	private WebElement corejavaforselenium;
	
	public Corejavapage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void javaforselenium()
	{
		corejavaforselenium.click();
	}
}
