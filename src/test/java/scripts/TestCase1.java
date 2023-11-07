package scripts;

import org.testng.annotations.Test;
import genericlibrary.BaseClass;
import pomPage.Addtocartpage;            
import pomPage.DemoappSkillraryPage;
import pomPage.SkillraryLoginPage;

public class TestCase1 extends BaseClass
{
	@Test
	public void tc1()
	{
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.gearbutton();
		s.skillrarydemoapplication();
		utilities.switchtobackframe(driver);
	    DemoappSkillraryPage ds = new DemoappSkillraryPage(driver);
	    utilities.mouseHover(driver, ds.getCourse());
	    ds.seleniumtrainingtab();
	    Addtocartpage a = new Addtocartpage(driver);
	    utilities.doubleclick(driver, a.getAddbtn());
	    a.cartbutton();
	    utilities.alertPopup(driver);
	}
}
