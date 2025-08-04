package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.SearchPage;

public class TC004_AccountSearchTest extends BaseClass {

	@Test
	public void verify_search() {
		//Performs login before accessing the search functionality
		TC002_AccountLoginTest ac = new TC002_AccountLoginTest();
		ac.verify_login();
		//Created instance of SearchPage
		SearchPage sp = new SearchPage(driver);
		sp.setSearch("phone");
		sp.clickSearch();
		
		//Validating the expected message
		String msg=sp.searchConfirmationMsg();
		Assert.assertEquals(msg, "Products meeting the search criteria");
		System.out.println("Products meeting the search criteria");
	}

}
