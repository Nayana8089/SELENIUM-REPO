package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
public WebDriver driver;
	
	//constructor creation
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
		//locating elements
	
	  @FindBy(name="username")WebElement usernameField;
	  @FindBy(name="password")WebElement passwordField;
	  @FindBy(xpath = "//button[@type='submit']")WebElement loginBtn;
	  @FindBy(xpath="//a[@data-toggle='dropdown']") WebElement adminbtn;
	  @FindBy(xpath="//b[text()='7rmart supermarket']")WebElement logintxt;
	  
	  
	  //webelement actions
	  
	  public LoginPage eneterUsernameOnUsernamefield(String username)
	  {
			usernameField.sendKeys(username);
			return this;

	  }
	  public LoginPage  enterPasswordOnPasswordField(String password)
	  {
			passwordField.sendKeys(password);
			return this;


	  }
	  public Homepage clickOnLoginButton()
	  {
			loginBtn.click();
			return new Homepage(driver);

	  }
	  public boolean adminButtonEnabled()
	  {
		 return adminbtn.isEnabled();
	  }
	  public String getLogintext()
	  {
		  return logintxt.getText();
	  }
}



