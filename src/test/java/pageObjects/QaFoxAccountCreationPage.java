package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class QaFoxAccountCreationPage extends BasePage{
	
	public QaFoxAccountCreationPage(WebDriver driver)
	{
		super(driver);
	}
//https://tutorialsninja.com/demo/index.php?route=account/register	

@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
WebElement lblYourAccountHasBeenCreated;

@FindBy(xpath="//span[normalize-space()='My Account']")
WebElement btnMyAccount;

@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Logout']")
WebElement btnLogOut;

@FindBy(xpath="//h1[normalize-space()='Account Logout']")
WebElement lblAccountLogout;

public String getYourAccountHasBeenCreatedLabel() {
	try {
		return (lblYourAccountHasBeenCreated.getText());
	} catch (Exception e) {
		return (e.getMessage());
	}
}

public void clickOnMyAccountButton() throws InterruptedException {
	
	
	btnMyAccount.click();
	
	/*
	Thread.sleep(1000);
	Actions act=new Actions(driver);
	act.moveToElement(btnMyAccount).click().perform();
	*/
}
public void clickOnLogOutButton() {
	btnLogOut.click();
}

public String getLogoutText() {
	try {
		return (lblAccountLogout.getText());
	} catch (Exception e) {
		return (e.getMessage());
	}
}



}
