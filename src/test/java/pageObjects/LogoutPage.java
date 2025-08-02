package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends BasePage {

	public LogoutPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//div/a[contains(text(), 'Logout')]")
	WebElement bntLogout;

	@FindBy(xpath = "//div[@id = 'content']/ h1")
	WebElement msglogout;

	public void clickLogout() {
		Actions action = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", bntLogout);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		action.moveToElement(bntLogout).click().build().perform();
	}

	public String logoutConfirmationMsg() {
		try {
			return (msglogout.getText());
		} catch (Exception e) {
			return (e.getMessage());

		}

	}
}
