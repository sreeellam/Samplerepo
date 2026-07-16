package mainproject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ManageDeliveryBoyPage;
import utilities.ExcelUtility;
import utilities.RandomDataUtility;

public class ManageDeliveryBoyTest extends Base
{
	HomePage hp;
	ManageDeliveryBoyPage manageDeliveryBoyPage;
	@Test (description = "User trying to add Delivery Boy details")
	public void verifyWhetherUserableToAddDeliveryBoyDetails() throws IOException 
	{
		String userNameValue =ExcelUtility.getStringData(0, 0, "LoginPage");
	    String passwordValue = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsername(userNameValue).enterPassword(passwordValue);
		hp=loginPage.clickLogin();
		manageDeliveryBoyPage = hp.clickManageDeliveryBoy();
		
		RandomDataUtility rd = new RandomDataUtility();
		
		//String deliveryBoyUserName = ExcelUtility.getStringData(0, 0, "DeliveryBoy");
		//String deliveryBoyPassword = ExcelUtility.getStringData(0, 1, "DeliveryBoy");
		String deliveryBoyName = rd.randomfullName();
		String deliveryBoyEmail =rd.randomMailID();
		String deliveryBoyPhoneNumber = rd.getRandomPhoneNumber();
		String deliveryBoyAddress = rd.randomAddress();
		String deliveryBoyUserName =rd.generateRandomUsername();
		String deliveryBoyPassword =rd.generateRandomPassword();
	
	    manageDeliveryBoyPage.clickNew();
	    manageDeliveryBoyPage.deliveryBoyName(deliveryBoyName);
	    manageDeliveryBoyPage.deliveryBoyEmail(deliveryBoyEmail);
	    manageDeliveryBoyPage.deliveryBoyPhone(deliveryBoyPhoneNumber);
	    manageDeliveryBoyPage.deliveryBoyAddress(deliveryBoyAddress);
	    manageDeliveryBoyPage.enterNewUsername(deliveryBoyUserName);
	    manageDeliveryBoyPage.enterNewPassword(deliveryBoyPassword);
	    manageDeliveryBoyPage.clickSaveDeliveryBoyDetails();
	    //manageDeliveryBoyPage.clickCancelDeliveryBoyDetails();
	    
	    String actual = manageDeliveryBoyPage.successfullyAddedDeliveryBoyAlert();
		String expected =  "Alert!Delivery Boy Details Created Successfully";
		Assert.assertEquals(actual, expected, "Unable to create new user");
		
}
}

