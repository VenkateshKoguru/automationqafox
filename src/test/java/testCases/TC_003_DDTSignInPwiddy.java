package testCases;




import org.testng.Assert;

import org.testng.annotations.Test;

import pageObjects.PwiddyFoodDelivery;
import pageObjects.SignInPwiddyPage;
import utilities.DataProviders;


public class TC_003_DDTSignInPwiddy extends BaseTest {
	

	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)
	public void verify_SignInPwiddy(String email,String pwd,String exp) {
		
		logger.info("***** Starting verify_SignInPwiddy method****");
		
		try {
		SignInPwiddyPage spd = new SignInPwiddyPage(driver);

		
		String text=spd.getSignInToYourAccoungtLabel();
		//Assert.assertEquals(text, "Create your account");
		Assert.assertTrue(text.contains("Sign in to your account"));
		
		spd.setEmail(email);
		spd.setPassword(pwd);
		spd.clickCheckBox();
		spd.clickSignInButton();
		
		PwiddyFoodDelivery pfd=new PwiddyFoodDelivery(driver);
		boolean targetPage=pfd.isFoodDeliveryExists();
		
		
		if(exp.equalsIgnoreCase("Valid")) {
			if(targetPage==true) {
				Assert.assertTrue(true);
				
			}
			else {
				Assert.assertTrue(false);
			}if(exp.equalsIgnoreCase("Invalid")) {
				if(targetPage==true) {
					pfd.isFoodDeliveryExists();
					Assert.assertTrue(false);
				}
				else {
					Assert.assertTrue(true);
				}
			}
		}
		
		}catch (Exception e){
			Assert.fail();
		}
		logger.info("*****Ending verify_SignInPwiddy method");

	}
	
	

}
