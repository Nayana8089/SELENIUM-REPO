package testscripts;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
//import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constant;
import pages.Homepage;
import pages.LoginPage;
import seleniumcore.TestngBase;
import utilities.Excelutility;

public class HomepageTest extends TestngBase {
	Homepage home;
	
	
	@Test(description = "verify admin can login to homepage and logout successfuly")
	
	public void verifySuccesfullUserLogout() throws IOException
	{
		
		String username=Excelutility.readStringData(0, 0, "LoginPage");
	    String password=Excelutility.readStringData(0, 1,"LoginPage" );
		LoginPage login = new LoginPage(driver);
		login.eneterUsernameOnUsernamefield(username).enterPasswordOnPasswordField(password);
		home =login.clickOnLoginButton();
		
		home.clickAdmin();
		
		login =home.clicklogout();
		String expected= "7rmart supermarket";
		String actual = login.getLogintext();
		Assert.assertEquals(actual, expected, Constant.INVALIDPASSWORDERROR);


	
		
		
		
		
		
	}
	
	

}
