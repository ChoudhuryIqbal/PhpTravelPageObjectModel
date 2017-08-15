/**
 * 
 */
package com.phptravels.TestNg.PhpTravelTestNg.uiAction;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.phptravels.TestNg.PhpTravelTestNg.BaseClass.TestBase;


/**
 * @author choudhuryIqbal
 *
 */
public class HomePage extends TestBase {
	
		public static final Logger log = Logger.getLogger(HomePage.class.getName());
		WebDriver driver;

		@FindBy(linkText="My Account")
		private WebElement accountLocator;
		
		@FindBy(linkText="Sign Up")
		private WebElement signUpButtonLocator;

		
		public HomePage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}


		
		public void clickOnMyAccount() {
					accountLocator.click();
					log.info("==========My account is clicked===========");
					signUpButtonLocator.click();
					log.info("==========Sign up button is clicked=========");
		}


		
		public void clickOnSignUp() {
		
			
		}
		
		
	


}
