package pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage 
{
	@FindBy(xpath="(//a[text()=\"Selenium Training\"])[2]")
	private WebElement seleniumtraining;
	
	@FindBy(xpath="//div[@id=\"cartArea\"]")
	private WebElement cartarea;
	
	@FindBy(xpath="(//i[@class=\"fa fa-facebook\"])[2]")
	private WebElement facebooklink;

	public WebElement getSeleniumtraining() {
		return seleniumtraining;
	}

	public WebElement getCartarea() {
		return cartarea;
	}

	public WebElement getFacebooklink() {
		return facebooklink;
	}
	
	public TestingPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void facebookicon()
	{
		facebooklink.click();
	}
	
}
