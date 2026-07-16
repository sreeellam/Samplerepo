package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtility
{
	public void getScreenshot(WebDriver driver, String failedTestCase) throws IOException //parameterised method //failedTestCase variable is used to store the failed method fetches and store it in the variable.
	{

		TakesScreenshot scrShot = (TakesScreenshot) driver;//Casting - scrShot is reference variable. (TakeScreenshot)is interface//TakeScreenshot is an interface to capture the screenshot.Casting is the process of passing driver control.
		File screenShot = scrShot.getScreenshotAs(OutputType.FILE);//To get output as file format.

		String timeStamp = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss").format(new Date());

		File f1 = new File(System.getProperty("user.dir") + "//outputScreenShot");// create file in directory//System is a class and using getproperty file location and //outputscreenshot is the folder name of the file we created
		if (!f1.exists()) {

		f1.mkdirs();
		}
		String destination = System.getProperty("user.dir") + "//outputScreenShot//" + failedTestCase + timeStamp
		+ ".png";
		
		File finalDestination = new File(destination);
		FileHandler.copy(screenShot, finalDestination);// copying screenshot content to finalDestination.
		}

}
