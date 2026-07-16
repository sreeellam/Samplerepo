package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage 

{
		public WebDriver driver;
		public ManageNewsPage(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class=' nav-link'] ") WebElement manageNews;
		@FindBy(xpath="//a[@onclick='click_button(1)']") WebElement addNewNews;
		@FindBy(xpath="//textarea[@id='news']") WebElement enterNewNews;
		@FindBy(xpath="//button[@name='create']") WebElement saveNews;
		@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement successText;
		@FindBy(xpath="//a[@onclick='click_button(2)']") WebElement search;
		@FindBy(xpath="//input[@name='un']") WebElement newsTitle;
		@FindBy(xpath="//button[@name='search']") WebElement searchNews;
		
		public ManageNewsPage  manageNews()
		{
			manageNews.click();
			return this;
		}
				
		public ManageNewsPage  clickNew()
		{
			addNewNews.click();
			return this;
		}
		public ManageNewsPage  enterNewNews(String newNewsValue)
		{
			enterNewNews.sendKeys(newNewsValue);
			return this;
		}
			
		public ManageNewsPage  clickSaveNews()
		{
			saveNews.click();
			return this;
		}
		public String verifyAddNewsAlertIsDisplayed()
		{
			return successText.getText();
		}
		public ManageNewsPage  clickSearch()
		{
			search.click();
			return this;
		}
		public ManageNewsPage  enterNewsToSearch(String newsToSearch)
		{
			newsTitle.sendKeys(newsToSearch);
			return this;
		}
		public ManageNewsPage  clickSearchNews()
		{
			searchNews.click();
			return this;
		}

		public String verifySearchedNewsDisplayed() 
		{
			// TODO Auto-generated method stub
			searchNews.click();
			return null;
		
		
		}
		
				
				
		
	}


