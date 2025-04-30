package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginJala extends BasePage {
	WebDriver driver;

	public LoginJala(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@id='UserName']")
	WebElement txtUserName;

	@FindBy(xpath = "//input[@id='Password']")
	WebElement txtPassword;

	@FindBy(xpath = "//span[@class='checkmark']")
	WebElement chkRememberMe;

	@FindBy(xpath = "//button[@id='btnLogin']")
	WebElement btnSignIn;
	
	@FindBy(xpath="//b[contains(text(),' Learn everything on Real-Time Scenarios. FREE for all.')]")
    WebElement lblFreeForAll;
	
	   
	public String getFreeForAll() {
		return lblFreeForAll.getText();
		
	}
	
	public void setUserName(String userName) {
		txtUserName.sendKeys(userName);
	}

	public void setPasswor(String pwd) {
		txtPassword.sendKeys(pwd);
	}

	public void clcikRememberMeCheckBox() {

		chkRememberMe.click();
	}

	public void clcikSignInButton() {

		btnSignIn.click();
	}

}
