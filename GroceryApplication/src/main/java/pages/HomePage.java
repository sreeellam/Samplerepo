package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	public WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@class='img-circle']") WebElement admin;
	@FindBy(xpath="//i[@class='ace-icon fa fa-power-off']") WebElement logout;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']") WebElement moreinfo;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='nav-link']") WebElement contactMoreInfo;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='nav-link']") WebElement newsMoreInfo;
	@FindBy(xpath="//a[@class='small-box-footer' and @href='https://groceryapp.uniqassosiates.com/admin/list-page']")WebElement manageDeliveryBoyMoreInfo;
	
	
	public HomePage clickAdmin() 
	{
		admin.click();
		return this;
	}
	
	public LoginPage clickLogout()
	{
		logout.click();
		return new LoginPage(driver);
	}
	public AdminUserPage clickAdminMoreInfo()
	{
		moreinfo.click();
		return new AdminUserPage(driver);
	}
	public ManageContactPage clickContactMoreInfo() 
	{
		contactMoreInfo.click();
		return new ManageContactPage(driver);
		
	}
    public ManageNewsPage clickNewsMoreInfo()
    {
    	newsMoreInfo.click();
    	return new ManageNewsPage(driver);
    }

	public ManageDeliveryBoyPage clickManageDeliveryBoy()
	{
		 manageDeliveryBoyMoreInfo.click();
		return new ManageDeliveryBoyPage(driver);
	}
}
