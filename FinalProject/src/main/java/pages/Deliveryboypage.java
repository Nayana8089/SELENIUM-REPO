package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Deliveryboypage {
	public WebDriver driver;

	public Deliveryboypage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']") WebElement newbtn;
	@FindBy(id="name") WebElement name;
	@FindBy(id="email") WebElement email;
	@FindBy(id="phone") WebElement phone;
	@FindBy(id="address") WebElement address;
	@FindBy(id="username") WebElement username;
	@FindBy(id="password") WebElement password;
	@FindBy(xpath="//button[@name='create']") WebElement savebtn;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']") WebElement searchbtn;
	@FindBy(id="un") WebElement uname;
	@FindBy(id="ut") WebElement utemail;
	@FindBy(id="ph") WebElement number;
	@FindBy(xpath="//button[@class='btn btn-block-sm btn-danger']") WebElement srchlistbtn;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-warning']") WebElement reset;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement alert;

	
   
   public Deliveryboypage clickNewButton()
   {
	   newbtn.click();
	   return this;
   }
   
   public Deliveryboypage enterName(String dname)
   {
	   name.sendKeys(dname);
	   return this;
   }
   
   public Deliveryboypage enterEmail(String mail)
   {
	   email.sendKeys(mail);
	   return this;
   }
   
   public Deliveryboypage enterPhonenumber(String phn)
   {
	   phone.sendKeys(phn);
	   return this;
   }
   
   public Deliveryboypage enterAddress(String add)
   {
	   address.sendKeys(add);
	   return this;
   }
   
   public Deliveryboypage enterUsername(String usname)
   {
	   username.sendKeys(usname);
	   return this;
   }
   
   public Deliveryboypage enterPassword(String pass)
   {
	   password.sendKeys(pass);
	   return this;
   }
   
   public Deliveryboypage clickSave()
   {
	   Actions actions = new Actions(driver);
	   actions.scrollToElement(savebtn).perform();
	   savebtn.click();
	   return this;
	   
   }
   public Deliveryboypage clickSearchbtn()
   {
	   searchbtn.click();
	   return this;
   }
   
   public Deliveryboypage enterUname(String un)
   {
	   uname.sendKeys(un);
	   return this;
   }
   
   public Deliveryboypage enteruserEmail(String eml)
   {
	   utemail.sendKeys(eml);
	   return this;
   }
   
   public Deliveryboypage enterUserNumber(String nbr)
   {
	   number.sendKeys(nbr);
	   return this;
   }
   
   public Deliveryboypage clickSeacrchlistButton()
   {
	   srchlistbtn.click();
	   return this;
   }
   
   public Deliveryboypage clickResetButton()
   {
	   reset.click();
	   return this;
   }
   public String getAlertText()
   {
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	   wait.until(ExpectedConditions.visibilityOf(alert));
	   return alert.getText();
   }
}
