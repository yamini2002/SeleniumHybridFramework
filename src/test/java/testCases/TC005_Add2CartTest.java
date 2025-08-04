package testCases;

import java.time.Duration;

import org.testng.annotations.Test;

import pageObjects.Add2CartPage;

public class TC005_Add2CartTest extends BaseClass {
	@Test
	public void verifycart() {
	// Step 1: Perform search for a product using the search test case
	TC004_AccountSearchTest at = new TC004_AccountSearchTest(); 
	at.verify_search();
	// Step 2: Initialize the Add2CartPage with current driver
	Add2CartPage ap = new Add2CartPage(driver);
	ap.clickCart();
	ap.getItem();
	ap.clickItem();
	ap.clickCartBtn();
	ap.clickCheckout();
	}
}
