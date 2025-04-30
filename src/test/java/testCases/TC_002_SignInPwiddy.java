package testCases;




import org.testng.Assert;

import org.testng.annotations.Test;


import pageObjects.LoginJala;
import pageObjects.PwiddyRegisterPage;
import pageObjects.SignInPwiddyPage;


public class TC_002_SignInPwiddy extends BaseTest {
	

	@Test
	public void verify_SignInPwiddy() {
		
		logger.info("***** Starting verify_SignInPwiddy method****");
		SignInPwiddyPage spd = new SignInPwiddyPage(driver);

		
		String text=spd.getSignInToYourAccoungtLabel();
		//Assert.assertEquals(text, "Create your account");
		Assert.assertTrue(text.contains("Sign in to your account"));
		
		spd.setEmail(p.getProperty("Email"));
		spd.setPassword(p.getProperty("Password"));
		spd.clickCheckBox();
		spd.clickSignInButton();
		
		
		logger.info("*****Ending verify_SignInPwiddy method");

	}
	
	

}
