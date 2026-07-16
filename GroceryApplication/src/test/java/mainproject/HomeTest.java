package mainproject;

import org.testng.annotations.Test;

import constant.Constant;

import org.testng.AssertJUnit;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUserPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class HomeTest extends Base 
{
	HomePage hp;
	AdminUserPage ap;
	@Test
	public void verifyWhetherUserIsAbleToSuccessfullyLoggedOut() throws IOException
	{
		String usernameValue = ExcelUtility.getStringData(0, 0, "LoginPage");
		String passwordValue = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername(usernameValue);
		lp.enterPassword(passwordValue);
		hp=lp.clickLogin();
		
		hp=hp.clickAdmin();
		lp=hp.clickLogout();
		
		String actual = lp.verifyLoginTextIsDisplayed();
		String expected = "7rmart supermarket";
		Assert.assertEquals(actual, expected,Constant.LOGOUTERROR);
		
		
	}
	@Test
	
	public void verifyWhethertheUserIsAbleToAddNewAdminUser() throws IOException
	{
		String usernameValue = ExcelUtility.getStringData(0, 0, "LoginPage");
		String passwordValue = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername(usernameValue);
		lp.enterPassword(passwordValue);
		lp.clickLogin();
		//HomePage hp =new HomePage(driver);
		hp=hp.clickAdmin();
		
		
		ap=hp.clickAdminMoreInfo();
		//Assert.assertEquals(actual, expected,Constant.);
		
		
	}

}
