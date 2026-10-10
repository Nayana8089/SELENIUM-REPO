package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import constants.Constant;
import utilities.PageUtility;

public class AdminUsersPage {
	PageUtility page = new PageUtility();
	public WebDriver driver;

	public AdminUsersPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")
			WebElement newbutton;
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")
	WebElement searchbutton;
	@FindBy(id="un")
	WebElement uname;
	@FindBy(id="ut")
	WebElement utype;
	@FindBy(xpath="//button[(@class='btn btn-block-sm btn-danger' and @name='Search')]")
	WebElement search;
	
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-warning']")
	WebElement resetbutton;
	
	@FindBy(id="username")
	WebElement adminusername;
	@FindBy(id="password")                                                                       
	WebElement adminpassword;
	@FindBy(id="user_type")                                                                                                                                                        
	WebElement userType;
	@FindBy(xpath="//button[@name='Create']")
	WebElement savebutton;                                              
	
		
	
	public AdminUsersPage enterUserName(String user)                               
	{
		adminusername.sendKeys(user);
		return this;
	}
	
	public AdminUsersPage enterPassword(String pass)
	{
		adminpassword.sendKeys(pass);
		return this;
	}
	public AdminUsersPage selectUserType()
	{
		page.selecetDropDownByVisibleText(userType, Constant.USERTYPE);
		
		return this;
	}
	
	

	
	public AdminUsersPage clicksave()
	{
		savebutton.click();
		return this;
	}
	//public void clickReset()
//	{
//		resetButton.click();
//	}


public AdminUsersPage clicknew()
{
	newbutton.click( );
	return this;
}

public AdminUsersPage clicksearch()
{
	searchbutton.click();
	return this;
}

public AdminUsersPage searchUsername(String user)
{
	uname.sendKeys(user);
	return this;
}

public AdminUsersPage searchUserType(String Type)
{
	page.selecetDropDownByVisibleText(utype, Constant.USERTYPE);
	
	return this;
	
}

public AdminUsersPage clicksearchIcon()
{
	search.click();
	return this;
}
public AdminUsersPage  clickreset()
{
	resetbutton.click();
	return this ;
}
}
