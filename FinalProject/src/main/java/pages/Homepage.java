 package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

public class Homepage {
	WaitUtility wait = new WaitUtility();
	
	public WebDriver driver;
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@data-toggle='dropdown']")
	WebElement admin;
	@FindBy(xpath="//a[contains(@href,'/admin/logout')]")
	WebElement logout;
	@FindBy(xpath="//p[normalize-space()='Admin Users']")
	WebElement adminusers;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin']")
	WebElement adminusermoreinfo;
	  @FindBy(xpath="//b[text()='7rmart supermarket']")WebElement logintxt;
	@FindBy(xpath="//a[contains(@href,'/admin/list-deliveryboy')]") WebElement deliveryboymoreinfo;


	
	
	public Homepage clickAdmin() {
		admin.click();
		return this;
	}
	public LoginPage clicklogout()
	{
		wait.waitUntilElementToBeClickable(driver, logout);
		
		logout.click();
		return new LoginPage(driver);
	}
	//public void clickadminuser() {
		//adminusers.click();
		//}
	public AdminUsersPage clickAdminUsermoreinfo() {
		adminusermoreinfo.click();
		return new AdminUsersPage(driver);
	}
	
		
		
		public String getLogintext()
		  {
			  return logintxt.getText();
		  }
			
		public Deliveryboypage clickdeliveryboymoreinfo()
		   {
			deliveryboymoreinfo.click();
			return new Deliveryboypage(driver);
			
		   }
		   
		
	}
	

	


