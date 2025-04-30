package testCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.MyAccountPage;
import pageObjects.QafoxLoginPage;
import utilities.DataProviders;

public class TC003_QafoxLoginDDTTest extends BaseTest {

	@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class,groups="Datadriven")
	public void verify_loginDDT_qafox(String email, String pwd, String exp) {
		logger.info("****Starting method of verify_login_qafox****");
		try {
			QafoxLoginPage qafoxlogin = new QafoxLoginPage(driver);
            driver.manage().window().maximize(); 
			
			qafoxlogin.setEmail(email);
			qafoxlogin.setPassword(pwd);
			qafoxlogin.clickOnLoginButton();
			
			
		  // boolean alert=qafoxlogin.isAlertMsgExist();
	
			//qafoxlogin.clerTextEmail();
			//qafoxlogin.clearPassword();
			
			
			boolean alert = qafoxlogin.isAlertMsgExist();;

			if (alert) {
			    qafoxlogin.clerTextEmail();
			    qafoxlogin.clearPassword();
			    
			} else {
			  
			}

			MyAccountPage myaccText = new MyAccountPage(driver);
			boolean targetPage = myaccText.isMyAccontExists();

			if (exp.equalsIgnoreCase("Valid")) {
				if (targetPage == true) {
					Assert.assertTrue(true);
					myaccText.clickLogOutLink();
				}
			} else {

				Assert.assertTrue(true);
			}

			if (exp.equalsIgnoreCase("Invalid")) {
				if (targetPage == true) {

					myaccText.clickLogOutLink();
					Assert.assertTrue(false);
				} else {
					Assert.assertTrue(true);
				}
			}
		} catch (Exception e) {
			Assert.fail();
		}

		logger.info("****Ending method of verify_login_qafox****");

	}
}
