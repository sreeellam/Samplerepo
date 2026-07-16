package mainproject;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import constant.Constant;

import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base {
HomePage home;// declare a reference variable for homepage
	@Test(priority=1,description="User is trying to login with valid credentials:",groups= {"smoke"})
	public void userLoginwithValidCredentials() throws IOException
	{
		String usernameValue = ExcelUtility.getStringData(0, 0, "LoginPage");
		String passwordValue = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername(usernameValue).enterPassword(passwordValue);//connect with .via we're in the same page
		home=lp.clickLogin();
		boolean dashboardvalue = lp.verifyWhetherDashboardIsDisplayed();
		Assert.assertTrue(dashboardvalue,Constant.VALIDCREDENTIALERROR);
		
		
	}
@Test(priority=2,description="User is trying to login with Invalid credentials:", retryAnalyzer=retry.Retry.class)
public void userLoginwithInValidCredentials() throws IOException
{
	String usernameValue = ExcelUtility.getStringData(1, 0, "LoginPage");
	String passwordValue = ExcelUtility.getStringData(1, 1, "LoginPage");
	LoginPage lp = new LoginPage(driver);
	lp.enterUsername(usernameValue).enterPassword(passwordValue).clickLogin();// same page
	String actual = lp.verifyLoginTextIsDisplayed();
	String expected = "7rmart supermarket";
	Assert.assertEquals(actual, expected,Constant.INVALIDCREDENTIALERROR);
	
}
@Test(priority=3,description="User is trying to login with Invalid Username")
public void userLoginwithInvalidUsername() throws IOException
{
	String usernameValue = ExcelUtility.getStringData(2, 0, "LoginPage");
	String passwordValue = ExcelUtility.getStringData(2, 1, "LoginPage");
	LoginPage lp = new LoginPage(driver);
	lp.enterUsername(usernameValue).enterPassword(passwordValue).clickLogin();
	String actual = lp.verifyLoginTextIsDisplayed();
	String expected = "7rmart supermarket";
	Assert.assertEquals(actual, expected,Constant.INVALIDUSERNAMEERROR);
	
}
@Test(priority=4,description="User is trying to login with Invalid password",groups= {"smoke"},dataProvider="loginData")
public void userLoginwithInvalidPassword(String usernameValue, String passwordValue) throws IOException
{
	
	//String usernameValue = ExcelUtility.getStringData(3, 0, "LoginPage");
	//String passwordValue = ExcelUtility.getStringData(3, 1, "LoginPage");
	LoginPage lp = new LoginPage(driver);
	lp.enterUsername(usernameValue).enterPassword(passwordValue).clickLogin();
	String actual = lp.verifyLoginTextIsDisplayed();
	String expected = "7rmart supermarket";
	Assert.assertEquals(actual, expected,Constant.INVALIDPASSWORDERROR);	

}
@DataProvider(name="loginData")
public Object[][] getDataFromDataProvider()
{
	return new Object[][] {new Object[] { "admin","admin22"}, new Object[] {"admin123"},};
}
}