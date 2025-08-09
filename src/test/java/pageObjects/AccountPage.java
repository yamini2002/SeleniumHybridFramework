package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage extends BasePage {

	public AccountPage(WebDriver driver) {
		super(driver);
	}
	

	@FindBy(xpath = "//h2[text()='My Account']") // MyAccount Page heading
	WebElement msgHeading;
	
	@FindBy(xpath = "//div[@class='list-group']//a[text()='Logout']")
	WebElement lnkLogout;
	

	public boolean isMyAccountPageExists()   // MyAccount Page heading display status
	{
		try {
			return (msgHeading.isDisplayed());
		} catch (Exception e) {
			return (false);
		}
	}


	public void clickLogout() {
		lnkLogout.click();

	}

	@FindBy(xpath = "//div[@id='content']/ul/li/a")
	List<WebElement> links;

	// Method to return the number of links
	public int getContentLinksCount() {
		return links.size();
	}

	// Method to print all link texts
	public void printAllLinkTexts() {
		for (WebElement link : links) {
			System.out.println(link.getText());
		}
	}

	public void openAndVerifyAllLinks() {
		for (int i = 0; i < links.size(); i++) {
			// Get the text before clicking (since list might refresh after navigation)
			String linkText = links.get(i).getText();
			System.out.println("Clicking link: " + linkText);

			links.get(i).click();

			// Validate page header or title
			String currentTitle = driver.getTitle();
			System.out.println("Navigated to page title: " + currentTitle);

			// Navigate back to My Account page
			driver.navigate().back();

			// Reinitialize elements after navigation
			PageFactory.initElements(driver, this);
		}
	}
}
