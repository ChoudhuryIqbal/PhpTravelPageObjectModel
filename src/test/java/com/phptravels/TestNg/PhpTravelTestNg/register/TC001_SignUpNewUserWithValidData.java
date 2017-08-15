/**
 * 
 */
package com.phptravels.TestNg.PhpTravelTestNg.register;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.phptravels.TestNg.PhpTravelTestNg.BaseClass.TestBase;
import com.phptravels.TestNg.PhpTravelTestNg.uiAction.HomePage;


/**
 * @author choudhuryIqbal
 *
 */
public class TC001_SignUpNewUserWithValidData extends TestBase {
	public static final Logger log = Logger.getLogger(TC001_SignUpNewUserWithValidData.class.getName());
	HomePage homePage;

	@BeforeClass
	public void setUp() throws IOException {
		init();

	}

	@Test
	public void signUpNewUserWithValidData() {
		log.info("=========== Starting signUpNewUserWithValidData Test=============");
		homePage = new HomePage(driver);
		homePage.clickOnMyAccount();
		homePage.clickOnSignUp();
		log.info("=========== Finished signUpNewUserWithValidData Test=============");
		
	}
	@

}
