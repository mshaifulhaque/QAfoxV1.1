package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;

public class TC001_AccountRegistrationTest extends BaseClass {
	//WebDriver driver;
	
	//@BeforeMethod
	//public void setup() {
		//driver= new ChromeDriver();
		//				driver.manage().window().maximize();
	//	driver.manage().deleteAllCookies();
		
		//driver.get("https://tutorialsninja.com/demo/");
		
	//}
	
	
	@Test
	public void verify_account_registration() {
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		
		AccountRegistrationPage repage = new AccountRegistrationPage(driver);
		
		repage.setFirstName("John");
		repage.setLastName("Doe");
		repage.setPhone("12345678");
		repage.setEmail(p.getProperty("email"));
		repage.setPassword(p.getProperty("password"));
		repage.setConPassword(p.getProperty("password"));
		repage.setPrivacyPolicy();
		repage.clicnContinue();
		
		
		String confmsg=repage.getConfirmationMessage();
			Assert.assertEquals(confmsg, "Your Account Has Been Created!");
					
	}
	
	
	//@AfterMethod
	//public void tearDown() {
		
		//driver.quit();
		
	//}
	
	
	
}
