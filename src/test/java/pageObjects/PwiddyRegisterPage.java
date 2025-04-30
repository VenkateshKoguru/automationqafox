package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PwiddyRegisterPage extends BasePage {

	public PwiddyRegisterPage(WebDriver driver) {
		super(driver);
	}
    @FindBy(xpath="//a[normalize-space()='create a new account']")
    WebElement lnkCreateNewAccount;
    
    
	@FindBy(xpath = "//input[@id='name']")
	WebElement txtFullName;

	@FindBy(xpath = "//input[@id='email']")
	WebElement txtEmail;

	@FindBy(xpath = "//input[@id='password']")
	WebElement txtPassword;

	@FindBy(xpath = "//input[@id='confirmPassword']")
	WebElement txtConfirmPassword;

	@FindBy(xpath = "//button[normalize-space()='Create account']")
	WebElement btnCreateAccoungt;
	
	@FindBy(xpath="//h2[normalize-space()='Create your account']")
	WebElement lblCreateAcccount;
	
	@FindBy(xpath="//a[normalize-space()='sign in to your existing account']")
	WebElement lnkSignToYourExistingAccount;

	public void clickNewAccountLink() {
		lnkCreateNewAccount.click();
	}
	public void setFullName(String fullName) {
		txtFullName.sendKeys(fullName);
	}

	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}

	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}

	public void setConfirmPassword(String Confirmpwd) {
		txtConfirmPassword.sendKeys(Confirmpwd);
	}

	public void clickCreateAccountButton() {
		btnCreateAccoungt.click();

		// btnCreateAccoungt.submit();

		/*
		 * Actions act=new Actions(driver);
		 * act.moveToElement(btnCreateAccoungt).click().perform();
		 * 
		 * JavascriptExecutor js=(JavascriptExecutor)driver;
		 * js.executeAsyncScript("arguments[0].click();", btnCreateAccoungt);
		 * 
		 * 
		 * btnContinue.sendKeys(Keys.RETURN);
		 * 
		 * WebDriverWait mywaite=new WebDriverWait(driver,Duration.ofSeconds(10));
		 * mywaite.until(ExpectedConditions.elementToBeClickable(btnCreateAccoungt)).click();
		 */
	}

	public String getCreateAcccountLabel() {

		try {
			return btnCreateAccoungt.getText();

		} catch (Exception e) {
			return (e.getMessage());

		}

	}

	public void clickSignToYourExistingAccountLink() {
		lnkSignToYourExistingAccount.click();
	}

}
