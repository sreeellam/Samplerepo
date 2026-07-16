package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

public class LoginPage {
	
public WebDriver driver;
WaitUtility wu = new WaitUtility();
	
	public LoginPage(WebDriver driver)// constructor
	{
		this.driver = driver; // local variable & instance variable are same, so using this keyword
		PageFactory.initElements(driver, this);// To initialize driver using PageFactory to 
		
	
	}
	//Syntax: @FindBy(locator= "attribute value") WebElement name; - is an annotation that provided by PageFactory
	@FindBy(xpath="//input[@placeholder='Username']") WebElement username;
	@FindBy(xpath = "//input[@placeholder='Password']") WebElement password;
	@FindBy(xpath = "//button[@class='btn btn-dark btn-block']") WebElement signin;
	@FindBy(xpath = "//p[text()='Dashboard']") WebElement dashboard;
	@FindBy(xpath = "//b[text()='7rmart supermarket']") WebElement text;
	
	public LoginPage enterUsername(String usernameValue)// change void to class name(LoginPage) and return this- navigate to the same page
	{
	username.sendKeys(usernameValue);
	return this;

	}
	public LoginPage enterPassword(String passwordValue)
	{
	password.sendKeys(passwordValue);
	return this;
	}
	public HomePage clickLogin()
	{
		wu.waitUntilElementToBeClickable(driver, signin);
		signin.click();
		return new HomePage(driver);// navigate to the new page so new keyword and pass driver.
	}
	public boolean verifyWhetherDashboardIsDisplayed()
	{
		return dashboard.isDisplayed();
	}
	public String verifyLoginTextIsDisplayed()
	{
		return text.getText();
	}

}
