package pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage 
{
	@FindBy(xpath ="//a[text()=\" GEARS \"]")
	private WebElement gearbtn;
	
	@FindBy(xpath ="(//a[text()=\" SkillRary Demo APP\"])[2]")
	private WebElement skillrarydemoapp;
	
	@FindBy(name="q")
	private WebElement searchTF;
	
	@FindBy(xpath="//input[@value=\"go\"]")
	private WebElement searchBtn;
	
	public SkillraryLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getGearbtn() {
		return gearbtn;
	}

	public WebElement getSkillrarydemoapp() {
		return skillrarydemoapp;
	}

	public WebElement getSearchTF() {
		return searchTF;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}
	
	//utilization
	public void gearbutton()
	{
		gearbtn.click();
	}
	
	public void skillrarydemoapplication()
	{
		skillrarydemoapp.click();
	}
	public void searchTextbox(String name)
	{
		searchTF.sendKeys(name);
	}
	public void gobutton()
	{
		searchBtn.click();
	}
	
	
}
