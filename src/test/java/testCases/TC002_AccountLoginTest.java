package testCases;

import java.time.Duration;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testCases.BaseClass;

public class TC002_AccountLoginTest extends BaseClass {
	@Test
	public void verify_login() {

		// Created a HomePage object and navigating to login page
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.ClickLogin();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Create LoginPage object and perform login
		LoginPage lp = new LoginPage(driver);
		lp.getEmail("yaminik@gmail.com");
		lp.getPassword("test@123");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// for verification whether data was successfully entered.
		lp.clickSumbit();
	}
}
