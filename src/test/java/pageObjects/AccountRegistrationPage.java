package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement txtFirstname;

	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement txtLasttname;

	@FindBy(xpath = "//input[@id='input-email']")
	WebElement txtEmail;

	@FindBy(xpath = "//input[@id='input-telephone']")
	WebElement txtTelephone;

	@FindBy(xpath = "//input[@id='input-password']")
	WebElement txtPassword;

	@FindBy(xpath = "//input[@id='input-confirm']")
	WebElement txtConfirmPassword;

	@FindBy(xpath = "//input[@name='agree']")
	WebElement chkdPolicy;

	@FindBy(xpath = "//input[@value='Continue']")
	WebElement btnContinue;

	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;

	//Method to enter First Name
	public void setFirstName(String fname) {
		txtFirstname.sendKeys(fname);

	}

	//Method to enter Last Name
	public void setLastName(String lname) {
		txtLasttname.sendKeys(lname);

	}

	// Method to enter Email
	public void setEmail(String email) {
		txtEmail.sendKeys(email);

	}

	// Method to enter Telephone
	public void setTelephone(String tel) {
		txtTelephone.sendKeys(tel);

	}

	// Method to enter Password
	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);

	}

	// Method to confirm Password
	public void setConfirmPassword(String pwd) {
		txtConfirmPassword.sendKeys(pwd);

	}

	// Method to click on the Privacy Policy checkbox
	public void setPrivacyPolicy() {
		chkdPolicy.click();

	}

	// Method to click on the Continue button
	public void clickContinue() {
		btnContinue.click();

	}

	// Method to get the confirmation message after account creation
	public String getConfirmationMsg() {
		try {
			return (msgConfirmation.getText());
		} catch (Exception e) {
			return (e.getMessage());

		}

	}
}
