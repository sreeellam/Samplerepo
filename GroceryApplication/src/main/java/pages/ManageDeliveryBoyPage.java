package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageDeliveryBoyPage 
{

	public WebDriver driver;
	public ManageDeliveryBoyPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[@class='small-box-footer' and @href='https://groceryapp.uniqassosiates.com/admin/list-page']")WebElement manageDeliveryBoyMoreInfo;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Deliveryboy/add']") WebElement New;
	@FindBy(xpath="//input[@id='name']") WebElement Name;
	@FindBy(xpath="//input[@id='email']")WebElement Email;
	@FindBy(xpath="//input[@id='phone']") WebElement Phone;
	@FindBy(xpath="//textarea[@id='address']") WebElement Address;
	@FindBy(xpath="//input[@id='username']") WebElement Username;
	@FindBy(xpath="//input[@id='password']") WebElement Password;
	@FindBy(xpath="//button[@class='btn btn-danger']") WebElement Save;
	@FindBy(xpath="//a[@class='btn btn-default btn-fix']") WebElement cancel;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement successfulAlertDeliveryBoy;
	
	public ManageDeliveryBoyPage clickNew()
	{
		New.click();
		return this;
	}
	public  ManageDeliveryBoyPage deliveryBoyName(String deliveryBoyName) 
	{
		Name.sendKeys(deliveryBoyName);
		return this;
	}
	public  ManageDeliveryBoyPage deliveryBoyPhone(String deliveryBoyPhone) 
	{
		Name.sendKeys(deliveryBoyPhone);
		return this;
	}
	
	public  ManageDeliveryBoyPage deliveryBoyEmail(String deliveryBoyEmail) 
	{
		Email.sendKeys(deliveryBoyEmail);
		return this;
	}
	public  ManageDeliveryBoyPage deliveryBoyAddress(String deliveryBoyAddress) 
	{
		Address.sendKeys(deliveryBoyAddress);
		return this;
	}
	public ManageDeliveryBoyPage  enterNewUsername(String deliveryBoyUsernameValue) 
	{
		Username.sendKeys(deliveryBoyUsernameValue);
		return this;

	}

	public ManageDeliveryBoyPage enterNewPassword(String deliveryBoyPasswordValue) 
	{
		Password.sendKeys(deliveryBoyPasswordValue);
		return this;
	}
	public ManageDeliveryBoyPage clickSaveDeliveryBoyDetails() 
	{
		Save.click();
		return this;
	}
	public ManageDeliveryBoyPage clickCancelDeliveryBoyDetails() 
	{
		cancel.click();
		return this;
	}
	public String successfullyAddedDeliveryBoyAlert()
	{
		return successfulAlertDeliveryBoy.getText();
	}

	
}
