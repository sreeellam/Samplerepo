package mainproject;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ManageContactPage;
import utilities.ExcelUtility;
import utilities.RandomDataUtility;

public class ManageContactTest extends Base
{
	HomePage hp;
	ManageContactPage mp;
	@Test
	
  
	public void verifyWhetherUserIsAbleToUpdateContact() throws IOException
	{
		String usernameValue = ExcelUtility.getStringData(0, 0, "LoginPage");
		String passwordValue = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername(usernameValue);
		lp.enterPassword(passwordValue);
		lp.clickLogin();
		//HomePage hp =new HomePage(driver);
		hp.clickAdmin();
		mp=hp.clickContactMoreInfo();
		
		RandomDataUtility rd = new RandomDataUtility();
		String phoneNumberValue = rd.getRandomPhoneNumber();
		String emailIdValue = rd.generateRandoEmailId();
		String addressValue = ExcelUtility.getStringData(0, 0,"Contact");
		//ManageContactPage mp = new ManageContactPage(driver);
		mp.clickEdit();
		mp.editPhone(phoneNumberValue);
		mp.editEmailId(emailIdValue);
		mp.enterNewAddress(addressValue);
		mp.clickUpdate();
	}
  
}
