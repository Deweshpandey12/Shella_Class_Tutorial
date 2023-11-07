package pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoappSkillraryPage 
{
	@FindBy(id="course")
	private WebElement coursebtn;
	
	@FindBy(xpath = "//a[text()=\"Selenium Training\"]")
	private WebElement seleniumTraining;
	
	@FindBy(name="addresstype")
	private WebElement selectDropdown;
	
	public DemoappSkillraryPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getCourse() {
		return coursebtn;
	}

	public WebElement getSeleniumTraining() {
		return seleniumTraining;
	}

	public WebElement getSelectCategoryDropdown() {
		return selectDropdown;
	}
	public void seleniumtrainingtab()
	{
		seleniumTraining.click();
	}
	
}
