package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class PwiddyFoodDelivery extends BasePage {

	public PwiddyFoodDelivery(WebDriver driver) {
		super(driver);	
	}
		
	@FindBy(xpath = "//h1[normalize-space()='Food Delivery']")
	WebElement lblFoodDeliveryText;
	
	
	public Boolean isFoodDeliveryExists() {
		try {
		return (lblFoodDeliveryText.isDisplayed());
	    }
		catch(Exception e) {
			
		}
		return false;
		
	}

}
