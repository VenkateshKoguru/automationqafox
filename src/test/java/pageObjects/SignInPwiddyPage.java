package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPwiddyPage extends BasePage {

	public SignInPwiddyPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@id='email-address']")
	WebElement txtEmail;

	@FindBy(xpath = "//input[@id='password']")
	WebElement txtPassword;

	@FindBy(xpath = " //input[@id='remember-me']")
	WebElement chkRememberme;

	@FindBy(xpath = "//button[normalize-space()='Sign in']")
	WebElement btnSignIn;

	@FindBy(xpath = "//h2[normalize-space()='Sign in to your account']")
	WebElement lblSignInToYourAccoungt;

	@FindBy(xpath = "//h1[normalize-space()='Food Delivery']")
	WebElement lblFoodDelivery;

	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}

	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}

	public void clickCheckBox() {
		chkRememberme.click();
	}

	public void clickSignInButton() {
		btnSignIn.click();

		// btnContinue.submit();

		/*
		 * Actions act=new Actions(driver);
		 * act.moveToElement(btnContinue).click().perform();
		 * 
		 * JavascriptExecutor js=(JavascriptExecutor)driver;
		 * js.executeAsyncScript("arguments[0].click();", btnContinue);
		 * 
		 * 
		 * btnContinue.sendKeys(Keys.RETURN);
		 * 
		 * WebDriverWait mywaite=new WebDriverWait(driver,Duration.ofSeconds(10));
		 * mywaite.until(ExpectedConditions.elementToBeClickable(btnContinue)).click();
		 */
	}

	public String getSignInToYourAccoungtLabel() {

		try {
			return lblSignInToYourAccoungt.getText();

		} catch (Exception e) {
			return (e.getMessage());

		}

	}

	public String getFoodDeliveryLabel() {
		try {
			return lblFoodDelivery.getText();
		} catch (Exception e) {
			return (e.getMessage());
		}
	}

}
