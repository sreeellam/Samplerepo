package mainproject;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import constant.Constant;
import utilities.ScreenshotUtility;

public class Base
{
	public WebDriver driver;
	Properties prop;
	FileInputStream fis;// These are 2 classes to read data from file config
	@BeforeMethod(alwaysRun = true)
	@Parameters("browsers")
	public void browserInitialization(String browsers) throws IOException
	{
		prop = new Properties();
		fis = new FileInputStream(Constant.CONFIGFILE);//file read
		prop.load(fis);//for loading the file
		if(browsers.equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browsers.equalsIgnoreCase("Safari"))
		{
			driver = new SafariDriver();
		}
		
		//driver.get("https://groceryapp.uniqassosiates.com/admin/login");	
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//To apply wait - Implicit wait application.Implicit wait usually apply to the URL launch.
		
	}
	@AfterMethod(alwaysRun = true)
	public void closeBrowser(ITestResult itestresult) throws IOException//parameterised method. ITestResult is an interface - used to manages the lifecycle of a testcase.(provides the status pass or fail) 
	{
	if(itestresult.getStatus()==ITestResult.FAILURE) //if status is fail then capture the screenshot.
	{
	ScreenshotUtility screenshotutility=new ScreenshotUtility();// object creation for screenshotutility.
	screenshotutility.getScreenshot(driver, itestresult.getName());
	}
	// driver.close();
	//driver.quit();
	}
}
