package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	
public LoginPage(WebDriver driver) {
		super(driver);
	}
@FindBy(xpath="//form/div/input[@type='text']") 
WebElement txtEmail;

@FindBy(xpath="//form/div[2]/input[@type='password']")
WebElement txtPassword;

@FindBy(xpath="//form/input[@type='submit']")
WebElement btnSumbit;

public void getEmail(String email) {
	txtEmail.sendKeys(email);
}

public void getPassword(String password) {
	txtPassword.sendKeys(password);
}

public void clickSumbit() {
	btnSumbit.click();
}


}

