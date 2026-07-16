package mainproject;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base
{
	HomePage hp;
	ManageNewsPage np;
	@Test
	
	public void verifyWhetherUserIsAbleToAddNews() throws IOException
	{
		String usernameValue = ExcelUtility.getStringData(0, 0, "LoginPage");
		String passwordValue = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername(usernameValue);
		lp.enterPassword(passwordValue);
		lp.clickLogin();
		//HomePage hp =new HomePage(driver);
		hp.clickAdmin();
		np=hp.clickNewsMoreInfo();
		
		//ManageNewsPage np = new ManageNewsPage(driver);
		np.manageNews();
		np.clickNew();
		String newNewsValue = ExcelUtility.getStringData(0, 0, "News");
		np.enterNewNews(newNewsValue);
		np.clickSaveNews();
		String actual = np.verifyAddNewsAlertIsDisplayed();
		String expected = "x\nAlert!\nNews Created Successfully";
		Assert.assertEquals(actual, expected,Constant.ADDNEWNEWSERROR);
		
}
	public void verifyWhetherUserIsAbleToSearchNewlyAddedNews() throws IOException
	{
		String usernameValue = ExcelUtility.getStringData(0, 0, "LoginPage");
		String passwordValue = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername(usernameValue).enterPassword(passwordValue);
		hp=lp.clickLogin();
		//HomePage hp =new HomePage(driver);
		//hp.clickAdmin();
		np=hp.clickNewsMoreInfo();
		
		//ManageNewsPage np = new ManageNewsPage(driver);
		np.clickSearch();
	
		String newNewsValue = ExcelUtility.getStringData(0, 0, "News");
		np.enterNewNews(newNewsValue);
		np.clickSearchNews();
		String actual = np.verifySearchedNewsDisplayed();
		String expected = "x\nAlert!\nNews Created Successfully";
		Assert.assertEquals(actual, expected,Constant.NEWSNOTFOUNDERROR);
}
}

