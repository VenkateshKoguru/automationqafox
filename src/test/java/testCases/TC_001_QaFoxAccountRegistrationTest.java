package testCases;

import org.testng.Assert;

import org.testng.annotations.Test;

import pageObjects.PwiddyFoodDelivery;
import pageObjects.QaFoxAccountCreationPage;
import pageObjects.QaFoxAccountRegistrationPage;


public class TC_001_QaFoxAccountRegistrationTest extends BaseTest {
	

	@Test(groups={"Redression","Master"})
	public void verify_account_registration() throws InterruptedException {
		
		QaFoxAccountRegistrationPage regpage = new QaFoxAccountRegistrationPage(driver);
		
		String registerAccountLabel = regpage.getRegisterAccountLabel();
		Assert.assertEquals(registerAccountLabel, "Register Account");
		
		
		
		
		regpage.setFirstName(randomString().toLowerCase());// (randomeString().toUpperCase());
		regpage.setLastName(randomString().toUpperCase());// (randomeString().toUpperCase());
		regpage.setEmail(randomString()+"@gmail.com");// (randomeString()+"@gmail.com");// randomly generated the email
		regpage.setTelephone(randomNumber());// (randomeNumber());

		// String password=randomAlphaNumeric();
		String password=randomAlphaNumarice();
		regpage.setPassword(password);
		regpage.setConfirmPassword(password);

		regpage.clickSubScribeRadioButton();
		regpage.clickPrivacyPolicyCheckBox();
		regpage.clickContinueButton();
		
		
		QaFoxAccountCreationPage qcp=new QaFoxAccountCreationPage(driver);
		
		String accounthasCreated = qcp.getYourAccountHasBeenCreatedLabel();
		Assert.assertEquals(accounthasCreated, "Your Account Has Been Created!");
		
		qcp.clickOnMyAccountButton();
		qcp.clickOnLogOutButton();
		
		
		String successfullyLogOut = qcp.getLogoutText();
		Assert.assertEquals(successfullyLogOut, "Account Logout");
		
		
		

	}
	
	

}
