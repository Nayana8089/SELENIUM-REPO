package testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import constants.Constant;
import pages.Deliveryboypage;
import pages.Homepage;
import pages.LoginPage;
import seleniumcore.TestngBase;
import utilities.Excelutility;

public class DeliveryBoyTest extends TestngBase {
	Homepage home;
	Deliveryboypage delivery;
 
		@Test(description= "verify admin is able to add new delivery boy")
	
	public void  createDeliveryBoy() throws IOException {

	String username=Excelutility.readStringData(0, 0, "LoginPage");
    String password=Excelutility.readStringData(0, 1,"LoginPage" );
	LoginPage login = new LoginPage(driver);
	login.eneterUsernameOnUsernamefield(username).enterPasswordOnPasswordField(password);
	home=login.clickOnLoginButton();
	
	delivery=home.clickdeliveryboymoreinfo();
	
	Faker faker = new Faker();
	String randomName = faker.name().firstName();
    String randomEmail = faker.internet().emailAddress();
    String randomPhone = faker.number().digits(10); 
    String randomAddress = faker.address().fullAddress();
    String randomUserName = randomName.toLowerCase() + faker.number().digits(3);
    String randomPassword = faker.internet().password();
    
    delivery.clickNewButton().enterName(randomName).enterEmail(randomEmail).enterPhonenumber(randomPhone).enterAddress(randomAddress).enterUsername(randomUserName).enterPassword(randomPassword).clickSave();
 Assert.assertTrue(driver.getPageSource().contains(randomName), Constant.DELIVERYBOYNOTADDEDERROR);
	
	
	
	}
	@Test(description="verify admin is able to search deliveryboy")
	public void searchDeliveryBoy() throws IOException {
		
		String username=Excelutility.readStringData(0, 0, "LoginPage");
	    String password=Excelutility.readStringData(0, 1,"LoginPage" );
		LoginPage login = new LoginPage(driver);
		login.eneterUsernameOnUsernamefield(username).enterPasswordOnPasswordField(password);

		home=login.clickOnLoginButton();
		delivery=home.clickdeliveryboymoreinfo();

		
		
		delivery.clickSearchbtn().enterUname("ammu").enteruserEmail("ammu12@gmail.com").enterUserNumber("9562082671").clickSeacrchlistButton();
  Assert.assertFalse(driver.getPageSource().contains("RESULT NOT FOUND"), Constant.DELIVERYBOYSEARCHERROR);
		
	}
}
