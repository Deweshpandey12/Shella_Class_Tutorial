package genericlibrary;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Photo 
{
	public void getPhoto(WebDriver driver,String name) throws IOException
	{
		Date d = new Date();
		String currentDate = d.toString().replaceAll(":","-");
		TakesScreenshot sc = (TakesScreenshot)driver;
		File src = sc.getScreenshotAs(OutputType.FILE);
		File dest = new File(IPathConstant.photoPath+currentDate+name+".png");
		FileUtils.copyFile(src, dest);
	}
}
