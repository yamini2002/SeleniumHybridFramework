package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Add2CartPage extends BasePage {
	Actions a;
	public Add2CartPage(WebDriver driver) {
		super(driver);
		a = new Actions(driver);
	}
	
	@FindBy(xpath="//div[@class='button-group']/button")
	WebElement btnCart;
	
	@FindBy(css="#cart-total")
	WebElement txtItem;
	
	@FindBy(xpath="//div[@id='cart']/button")
	WebElement btnItem;
	
	@FindBy(xpath="//p[@class='text-right']/a[1]/strong")
	WebElement lnkCart;
	
	@FindBy(xpath="//a[@class='btn btn-primary']")
	WebElement btnCheckout;
	
	// Clicks on the product's "Add to Cart" button
	public void clickCart() {
		a.moveToElement(btnCart).click().build().perform();
	}
	// Prints the current number of items and total amount in the cart
	public void getItem() {
		a.moveToElement(txtItem).build().perform();
		System.out.println(txtItem.getText());
	}
	// Opens the cart dropdown by clicking the cart icon
	public void clickItem() {
		a.moveToElement(btnItem).click().build().perform();
	}
	// Clicks on the "View Cart" link inside the cart dropdown using JavaScript
	public void clickCartBtn() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", lnkCart);
	}
	// Proceeds to checkout after verifying the checkout button is clickable
	public void clickCheckout() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		a.moveToElement(btnCheckout).click().build().perform();
		System.out.println("Item is added successfully....");
	}
}
