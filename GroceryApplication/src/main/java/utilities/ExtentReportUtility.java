package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportUtility
{
	
	//extentReports & ExtentSparkReporter helps to create report.
	public static final ExtentReports extentReports = new ExtentReports();// static instance of extentreports that can
	// be shared accross the application
	public synchronized static ExtentReports createExtentReports() 
	{
	ExtentSparkReporter reporter = new ExtentSparkReporter("./extent-reports/extent-report.html");// ./path of the project's local directory
	reporter.config().setReportName("7RMartSupermarketProject");//Report name
	extentReports.attachReporter(reporter);

	extentReports.setSystemInfo("Organization", "Obsqura");
	extentReports.setSystemInfo("Name", " Sreerekha Ellam"); // provides context of the report
	return extentReports;
	}
}
