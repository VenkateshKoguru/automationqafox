package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends BasePage {

	@FindBy(xpath = "//div[@class='log-register log-reg']//a[@id='toggle']")
	WebElement lnkLogin;

	@FindBy(xpath = "//a[normalize-space()='SIGN UP']")
	WebElement lnkSignUp;

	WebDriver driver;

	public SignUpPage(WebDriver driver) {
		super(driver);
	}

	public void clickLoginLink() {
		lnkLogin.click();
	}
	

	public void clickSignUp() {

		lnkSignUp.click();
	}

}
