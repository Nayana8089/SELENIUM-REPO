package constants;

public class Constant {
	
 public static final String EXCELFILE = System.getProperty("user.dir")+"\\src\\test\\resources\\Testdata.xlsx";
 public static final String CONFIGFILE = System.getProperty("user.dir")+"\\src\\main\\resources\\config.properties";
 public static final String VALIDLOGINERROR="user was unable to login with valid credentials";
 public static final String INVALIDLOGINERROR="user was able to login with invalid credentials";
 public static final String INVALIDUSERNAMEERROR ="user was able to login with invalid username";
 public static final String INVALIDPASSWORDERROR ="user was able to login with invalid password";
 public static final String LOGOUTERROR="logout is not displayed";
 public static final String ADMINUSERERROR ="failed to create admin user";
 public static final String ADMINUSERSEARCHERROR="failed to search admin user";
 public static final String DELIVERYBOYNOTADDEDERROR="Failed to create delivery boy!";
 public static final String DELIVERYBOYSEARCHERROR ="search failed: Delivery records were not found!";
 public static final String USERTYPE ="Staff";
}
