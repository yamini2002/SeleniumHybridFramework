package testCases;

import org.testng.annotations.Test;

import pageObjects.AccountPage;

public class TC006_MyAccountTest extends BaseClass {

	@Test
	public void verify_Links() {
		TC002_AccountLoginTest at = new TC002_AccountLoginTest();
		at.verify_login();
		// Get and print the number of links
		AccountPage ap = new AccountPage(driver);
		int linkCount = ap.getContentLinksCount();
		System.out.println("Total links on My Account page: " + linkCount);
		// Print the text of each link
		ap.printAllLinkTexts();
		// Click and verify each link
		ap.openAndVerifyAllLinks();
	}
}
