package testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import constants.Constant;
import pages.AdminUsersPage;
import pages.Homepage;
import pages.LoginPage;
import seleniumcore.TestngBase;
import utilities.Excelutility;


public class Adminusertest extends TestngBase{
	Homepage home;
	AdminUsersPage admin;
	
	@Test(description="verify admin is able to add new user")
	
	
	public void verifyUserIsAbleToAddNewUser() throws IOException
	{
		String username=Excelutility.readStringData(0, 0, "LoginPage");
	    String password=Excelutility.readStringData(0, 1,"LoginPage" );
	    
	     Faker faker = new Faker();
        String adminusername=faker.name().firstName();
	    String adminpassword=faker.internet().password();
	  //  String userType=Constant.USERTYPE;
	    
	    
		LoginPage login = new LoginPage(driver);
		login.eneterUsernameOnUsernamefield(username).enterPasswordOnPasswordField(password);
		home=login.clickOnLoginButton();
		
		
		admin = home.clickAdminUsermoreinfo();
		
		                                                                            
		admin.clicknew().enterUserName(adminusername).enterPassword(adminpassword).selectUserType().clicksave();
		Assert.assertTrue(driver.getPageSource().contains(adminusername),Constant.ADMINUSERERROR);
		
	}
		
		
		@Test(description="verify admin is able to search the newly added user")		
	
		public void searchAdminUsers() throws IOException
	{
			String username=Excelutility.readStringData(0, 0, "LoginPage");
		    String password=Excelutility.readStringData(0, 1,"LoginPage" );
			LoginPage login = new LoginPage(driver);
			login.eneterUsernameOnUsernamefield(username).enterPasswordOnPasswordField(password);
		home=login.clickOnLoginButton();
			
			
		admin=	home.clickAdminUsermoreinfo();
			
			                                                                            
			AdminUsersPage admin =new AdminUsersPage(driver);       
			String adminusername=Excelutility.readStringData(0, 0, "AdminUser");
			String userType=Excelutility.readStringData(0, 2, "AdminUser");
			
	          admin.clicksearch().searchUsername(adminusername).searchUserType(userType).clicksearchIcon();
	     Assert.assertTrue(driver.getPageSource().contains(adminusername), Constant.ADMINUSERSEARCHERROR);
	                 
	}	
		
	
		@Test(description="verify reset button")
		public void testReset() throws IOException
	{
		String username=Excelutility.readStringData(0, 0, "LoginPage");
	    String password=Excelutility.readStringData(0, 1,"LoginPage" );
		LoginPage login = new LoginPage(driver);
		login.eneterUsernameOnUsernamefield(username).enterPasswordOnPasswordField(password);

		
		home =login.clickOnLoginButton();
		
	admin=	home.clickAdminUsermoreinfo();
		
		                                                                            
		AdminUsersPage admin =new AdminUsersPage(driver);                                             
		String adminusername=Excelutility.readStringData(0, 0, "AdminUser");
		 String userType=Excelutility.readStringData(0, 2, "AdminUser");
          
		 admin.clicksearch().searchUsername(adminusername).searchUserType(userType).clickreset();
     	}
		                                                     
		        
		
		
	}


