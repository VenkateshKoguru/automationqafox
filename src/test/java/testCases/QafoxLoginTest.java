package testCases;



import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.MyAccountPage;
import pageObjects.QafoxLoginPage;

public class QafoxLoginTest extends BaseTest {
	
	@Test(groups={"sanity","Master"})
	public void verify_login_qafox() {
		logger.info("****Starting method of verify_login_qafox****");
		try {
		QafoxLoginPage qafoxlogin=new QafoxLoginPage(driver);
		
		qafoxlogin.setEmail(p.getProperty("EMAIL"));
		qafoxlogin.setPassword(p.getProperty("PASSWORD"));
		qafoxlogin.clickOnLoginButton();
		
		MyAccountPage myaccText=new MyAccountPage(driver);
		boolean targetPage=myaccText.isMyAccontExists();
		
		Assert.assertTrue(targetPage);
		
		
		//clickLogOutLink.clickLogOut();
		
		
		}catch(Exception e){
			
			Assert.fail();
		}
		
		
		
		
		
		logger.info("Ending method of verify_login_qafox ");
	}

}
