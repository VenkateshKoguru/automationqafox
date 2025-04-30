package testCases;




import org.testng.Assert;

import org.testng.annotations.Test;


import pageObjects.LoginJala;
import pageObjects.PwiddyRegisterPage;


public class TC_001_pwiddyRegister extends BaseTest {
	

	@Test
	public void verify_PwiddyRegister() {
		
		logger.info("***** Starting verify_PwiddyRegister method****");
		PwiddyRegisterPage pd = new PwiddyRegisterPage(driver);
		
		pd.clickNewAccountLink();
		
		String text=pd.getCreateAcccountLabel();
		//Assert.assertEquals(text, "Create your account");
		Assert.assertTrue(text.contains("Create"));
		
		pd.setFullName("kiran");
		pd.setEmail("kiran@gmail.com");
		pd.setPassword("kiran@123");
		pd.setConfirmPassword("kiran@123");
		pd.clickCreateAccountButton();
		pd.clickSignToYourExistingAccountLink();
		
		logger.info("*****Ending verify_PwiddyRegister method");

	}
	
	

}
