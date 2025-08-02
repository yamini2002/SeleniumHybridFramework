package testCases;

import java.time.Duration;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testCases.BaseClass;

public class TC002_AccountLoginTest extends BaseClass{
@Test
 public void verify_login() {
	 HomePage hp = new HomePage(driver);
	 hp.clickMyAccount();
	 hp.ClickLogin();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 LoginPage lp = new LoginPage(driver);
	 lp.getEmail("yaminik@gmail.com");
	 lp.getPassword("test@123");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// for verification whether data was successfully entered  
	 lp.clickSumbit();
 }	
}
