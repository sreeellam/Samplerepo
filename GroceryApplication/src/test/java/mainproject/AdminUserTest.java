package mainproject;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUserPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.RandomDataUtility;

public class AdminUserTest extends Base
{
	HomePage hp;
	AdminUserPage ap;
	@Test
	
public void verifyWhethertheUserIsAbledToAddNewAdminUser() throws IOException
{
	String usernameValue = ExcelUtility.getStringData(0, 0, "LoginPage");
	String passwordValue = ExcelUtility.getStringData(0, 1, "LoginPage");
	LoginPage lp = new LoginPage(driver);
	lp.enterUsername(usernameValue);
	lp.enterPassword(passwordValue);
	lp.clickLogin();
	//HomePage hp =new HomePage(driver);
	//hp.clickAdmin();
	ap=hp.clickAdminMoreInfo();
	
	//AdminUserPage ap = new AdminUserPage(driver);
	ap.clickNew();
	//RandomDataUtility rd = new RandomDataUtility();
	//String usernameValue1 = rd.generateRandomUsername();
	//String passwordValue1 = rd.generateRandomPassword();
	String usernameValue1 = ExcelUtility.getStringData(0, 0, "NewAdmin");
	String passwordValue1 = ExcelUtility.getStringData(0, 1, "NewAdmin");
	ap.enterNewUsername(usernameValue1);
	ap.enterNewPassword(passwordValue1);
	ap.selectUserType();
	ap.clickSaveUser();
	
	String actual = ap.alertSuccessfullTextIsDisplayed();
	String expected = " Alert!\n"+ "User Created Successfully";
	Assert.assertEquals(actual, expected, "Unable to create new user");
	
	
}
	@Test
	
	public void verifyWhetherUserIsAbledToSearchtheNewlyAddedAdminUser() throws IOException
	{
		String usernameValue = ExcelUtility.getStringData(0, 0, "LoginPage");
		String passwordValue = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername(usernameValue);
		lp.enterPassword(passwordValue);
		lp.clickLogin();
		HomePage hp =new HomePage(driver);
		hp.clickAdmin();
		ap=hp.clickAdminMoreInfo();
		
		//AdminUserPage ap = new AdminUserPage(driver);
		ap.clickSearch();
		String usernameToSearch = ExcelUtility.getStringData(0, 0, "NewAdmin");
		ap.enterUsernameToSearch(usernameToSearch);
		ap.selectSearchUserType();
		ap.clickSearchUser();
		
		String actual = ap.verifySearchedUsernameIsDisplayed();
		String expected = usernameToSearch;
		Assert.assertEquals(actual, expected, "User not found");
		
		
	
	}

}
