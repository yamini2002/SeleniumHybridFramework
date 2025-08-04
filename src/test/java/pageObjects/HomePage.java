package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//span[normalize-space()='My Account']")
	WebElement lnkMyaccount;

	@FindBy(xpath = "//a[normalize-space()='Register']")
	WebElement lnkRegister;

	@FindBy(xpath = "//div[@id =\'top-links\']/ul/li[2]/ul/li[2]/a")
	WebElement lnkLogin;

	// Click on "My Account" to open the dropdown
	public void clickMyAccount() {
		lnkMyaccount.click();
	}

	// Click on "Register" to navigate to the registration page
	public void clickRegister() {
		lnkRegister.click();
	}

	// Click on "Login" to navigate to the login page
	public void ClickLogin() {
		lnkLogin.click();
	}
}
