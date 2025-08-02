package testCases;

import java.time.Duration;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LogoutPage;
import testCases.BaseClass;

public class TC003_AccountLogoutTest extends BaseClass {
	@Test
	public void verify_logout() {
		TC002_AccountLoginTest at = new TC002_AccountLoginTest();
		at.verify_login();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		LogoutPage lp = new LogoutPage(driver);
		lp.clickLogout();

		String logoutmsg = lp.logoutConfirmationMsg();
		Assert.assertEquals(logoutmsg, "Account Logout");
		System.out.println("Account Logout");
	}
}
