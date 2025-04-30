package testCases;




import org.testng.Assert;

import org.testng.annotations.Test;


import pageObjects.LoginJala;


public class TC_001_LoginJalaTest extends BaseTest {
	

	@Test
	public void verify_signin_jala() {
		
		logger.info("***** Starting TC001_signin_jala method****");
		LoginJala lj = new LoginJala(driver);
		
		String text=lj.getFreeForAll();
		Assert.assertEquals(text, "Learn everything on Real-Time Scenarios. FREE for all.");
		lj.setUserName("training@jalaacademy.com");
		lj.setPasswor("jobprogram");
		lj.clcikRememberMeCheckBox();
		lj.clcikSignInButton();
		
		logger.info("*****Ending TC001_signin_jala method");

	}
	
	

}
