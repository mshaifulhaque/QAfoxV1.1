package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountRegistrationPage {
	WebDriver driver;
	
	//constructor
	
	public AccountRegistrationPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//Locator
	@FindBy(id="input-firstname")
	WebElement txtFirstName;
	
	@FindBy(id="input-lastname")
	WebElement txtLastName;
	
	@FindBy(id="input-email")
	WebElement txtEmail;
	
	@FindBy(id = "input-telephone")
	WebElement txtTelePhone;
	
	@FindBy(id = "input-password")
	WebElement txtPassword;
	
	@FindBy(id="input-confirm")
	WebElement txtConfPassword;
	
	@FindBy(name = "agree")
	WebElement chkPolicy;
	
	@FindBy(xpath = "//*[@value=\"Continue\"]")
	WebElement btnContinue;
	
	@FindBy(xpath="//h1[text()=\"Your Account Has Been Created!\"]")
	WebElement chkConfirmationMessage;
	
	//Action Method
	
	public void setFirstName(String fname)
	{
		txtFirstName.sendKeys(fname);
	}
	
	public void setLastName (String lname)
	{
		txtLastName.sendKeys(lname);
	}

	public void setEmail(String email)
	{
		txtEmail.sendKeys(email);
	}
	
	public void setPhone(String phone)
	{
		txtTelePhone.sendKeys(phone);
	}

	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	public void setConPassword(String conpwd)
	{
		txtConfPassword.sendKeys(conpwd);
	}
	
	public void setPrivacyPolicy()
	{
		chkPolicy.click();
	}
	public void clicnContinue() {
		btnContinue.click();
	}

	public String getConfirmationMessage() {
		String confMessage = chkConfirmationMessage.getText();
	return confMessage;
	}

}



