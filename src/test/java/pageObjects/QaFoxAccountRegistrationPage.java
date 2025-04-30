package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QaFoxAccountRegistrationPage extends BasePage{
	
	public QaFoxAccountRegistrationPage(WebDriver driver)
	{
		super(driver);
	}
//https://tutorialsninja.com/demo/index.php?route=account/register	

@FindBy(xpath="//input[@id='input-firstname']") 
WebElement txtFirstname;

@FindBy(xpath="//input[@id='input-lastname']") 
WebElement txtLasttname;

@FindBy(xpath=" //input[@id='input-email']") 
WebElement txtEmail;

@FindBy(xpath="//input[@id='input-telephone']") 
WebElement txtTelephone;

@FindBy(xpath="//input[@id='input-password']") 
WebElement txtPassword;

@FindBy(xpath="//input[@id='input-confirm']") 
WebElement txtConfirmPassword;

@FindBy(xpath="//label[normalize-space()='Yes']")
WebElement rdoSubscribebutton;		

@FindBy(xpath="//input[@name='agree']") 
WebElement chkdPrivacyPolicy;

@FindBy(xpath="//input[@value='Continue']") 
WebElement btnContinue;

@FindBy(xpath="//h1[normalize-space()='Register Account']")
WebElement lblRegisterAccount;



public void setFirstName(String fname) {
	txtFirstname.sendKeys(fname);

}

public void setLastName(String lname) {
	txtLasttname.sendKeys(lname);

}

public void setEmail(String email) {
	txtEmail.sendKeys(email);

}

public void setTelephone(String tel) {
	txtTelephone.sendKeys(tel);

}

public void setPassword(String pwd) {
	txtPassword.sendKeys(pwd);

}

public void setConfirmPassword(String pwd) {
	txtConfirmPassword.sendKeys(pwd);

}

public void clickSubScribeRadioButton() {
	rdoSubscribebutton.click();

}

public void clickPrivacyPolicyCheckBox() {
	chkdPrivacyPolicy.click();

}

public void clickContinueButton() {
	//sol1 
	btnContinue.click();
	
	//sol2 
	//btnContinue.submit();
	
	//sol3
	//Actions act=new Actions(driver);
	//act.moveToElement(btnContinue).click().perform();
				
	//sol4
	//JavascriptExecutor js=(JavascriptExecutor)driver;
	//js.executeScript("arguments[0].click();", btnContinue);
	
	//Sol 5
	//btnContinue.sendKeys(Keys.RETURN);
	
	//Sol6  
	//WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
	//mywait.until(ExpectedConditions.elementToBeClickable(btnContinue)).click();
	
}

public String getRegisterAccountLabel() {
	try {
		return (lblRegisterAccount.getText());
	} catch (Exception e) {
		return (e.getMessage());

	}
	
}



}
