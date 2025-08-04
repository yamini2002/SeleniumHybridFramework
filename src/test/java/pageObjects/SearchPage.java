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

	// Method to enter text into the search box
	public void setSearch(String search) {
		a.moveToElement(txtSearch).click().build().perform();
		txtSearch.sendKeys(search);
	}

	// Method to click on the search button
	public void clickSearch() {
		a.moveToElement(btnSearch).click().build().perform();
	}

	// Method to retrieve the confirmation message or product name from search results
	public String searchConfirmationMsg() {
		try {
			return (msg.getText());
		} catch (Exception e) {
			return (e.getMessage());

		}
	}
}
