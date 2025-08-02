package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {
	Actions a = new Actions(driver);

	public SearchPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@type ='text']")
	WebElement txtSearch;

	@FindBy(xpath = "//span/button[@type='button']")
	WebElement btnSearch;

	@FindBy(xpath = "//input[@type='button']/following-sibling::h2")
	WebElement msg;

	public void setSearch(String search) {

		a.moveToElement(txtSearch).click().build().perform();
		txtSearch.sendKeys(search);
	}

	public void clickSearch() {
		a.moveToElement(btnSearch).click().build().perform();
	}

	public String searchConfirmationMsg() {
		try {
			return (msg.getText());
		} catch (Exception e) {
			return (e.getMessage());

		}
	}
}
