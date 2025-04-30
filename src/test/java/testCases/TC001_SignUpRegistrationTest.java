package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import pageObjects.SignUpPage;

public class TC001_SignUpRegistrationTest {
	public WebDriver driver;

	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.opencart.com/index.php?route=account/register");

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void verify_signup_registration() throws InterruptedException {
		
		SignUpPage sp = new SignUpPage(driver);
		sp.clickLoginLink();
		sp.clickSignUp();
		/*
		String RemoteTalentText=hp.getSignupforRemoteTalentLabel();
		Assert.assertEquals(RemoteTalentText, "Log in to Remote Talent");
		*/
	    
/*
		RegisterPage regpage = new RegisterPage(driver);
		
		String orangeTopText=regpage.getOrangeTopUpLabel();
		Assert.assertEquals(orangeTopText, "Orange Top Up");
		
		regpage.setFirstName("kiya");
		regpage.setLastName("b");
		regpage.setEmail("kiya123@gmail.com");
		regpage.setConfirmEmail("kiya123@gmail.com");
		regpage.clickItiArrowDropDown();	
		regpage.clickCountryFilterDropDown();
		regpage.enterMobileNumber("8106700347");
		regpage.setPassword("venkat@123");
		regpage.setConfirmPassword("venkat@123");
		regpage.clickTermsConditions();
		regpage.clickPromotionalOffersByEmail();
		regpage.clickConfirmButton();

		

	}
*/
	}
}
