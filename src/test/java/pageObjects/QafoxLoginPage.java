package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QafoxLoginPage extends BasePage {

	public QafoxLoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement btnLogin;
	
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	WebElement linkAlertMsg;
	
	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}
	
	public void setPassword(String password) {
		txtPassword.sendKeys(password);
	}
	
	public void clickOnLoginButton() {
		btnLogin.click();
	}
	
	public boolean isAlertMsgExist() {
		try {
		return (linkAlertMsg.isDisplayed());
		
		}catch (Exception e) {
			return false;
		}
			
	}
	public void clerTextEmail(){
		txtEmail.clear();
	}
	public void clearPassword() {
		txtPassword.clear();
	}
	
	
	

}
