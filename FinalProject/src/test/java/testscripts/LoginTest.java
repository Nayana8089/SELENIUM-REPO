 package testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constant;
import pages.Homepage;
import pages.LoginPage;
import seleniumcore.TestngBase;
import utilities.Excelutility;


public class LoginTest extends TestngBase{
	Homepage home;
	
	
	@Test(description="verify login with valid credentials.",priority= 1 ,groups = ("smoke"))
	public void verifyuserloginwithvalidcredentials() throws IOException
	{
		
		String username=Excelutility.readStringData(0, 0, "LoginPage");
	    String password=Excelutility.readStringData(0, 1,"LoginPage" );
		LoginPage login = new LoginPage(driver);
		login.eneterUsernameOnUsernamefield(username).enterPasswordOnPasswordField(password);
		home =login.clickOnLoginButton();
		boolean buttonEnabled= login.adminButtonEnabled();
		Assert.assertTrue(buttonEnabled, Constant.VALIDLOGINERROR);
		
	}
	
	@Test(description="verify login with invalid credentials.",priority= 2 , groups = ("smoke"))
		public void verifyuserloginwithinvalidcredentials() throws IOException
		{
			
			String username=Excelutility.readStringData(1, 0, "LoginPage");
		    String password=Excelutility.readStringData(1, 1,"LoginPage" );
			LoginPage login = new LoginPage(driver);
			login.eneterUsernameOnUsernamefield(username).enterPasswordOnPasswordField(password).clickOnLoginButton();
			String expected= "7rmart supermarket";
			String actual = login.getLogintext();
			Assert.assertEquals(actual, expected, Constant.INVALIDLOGINERROR);
}
	@Test(description="verify login with invalid username.",priority= 3)
		public void verifyuserloginwithinvalidusername() throws IOException
		{
					
			String username=Excelutility.readStringData(2, 0, "LoginPage");
		    String password=Excelutility.readStringData(2, 1,"LoginPage" );
			LoginPage login = new LoginPage(driver);
			login.eneterUsernameOnUsernamefield(username).enterPasswordOnPasswordField(password).clickOnLoginButton();
			String expected= "7rmart supermarket";
			String actual = login.getLogintext();
			Assert.assertEquals(actual, expected, Constant.INVALIDUSERNAMEERROR);
			
		}
	@Test(description="verify login with invalid password.",priority= 4)
		public void verifyuserloginwithinvalidpassword() throws IOException
		{
			String username=Excelutility.readStringData(3, 0, "LoginPage");
		    String password=Excelutility.readStringData(3, 1,"LoginPage" );
			LoginPage login = new LoginPage(driver);
			login.eneterUsernameOnUsernamefield(username).enterPasswordOnPasswordField(password).clickOnLoginButton();
			String expected= "7rmart supermarket";
			String actual = login.getLogintext();
			Assert.assertEquals(actual, expected, Constant.INVALIDPASSWORDERROR);
			
		}
}
	
