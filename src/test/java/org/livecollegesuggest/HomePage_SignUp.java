package org.livecollegesuggest;

import org.pageobject.BaseClass;
import org.pageobject.HomePageObject;
import org.testng.annotations.Test;

public class HomePage_SignUp extends BaseClass {
	HomePageObject homePageObject;

	// Entering all the valid information in sign up
	@Test(priority = 1)

	public void cs_Verify_Sign_Up_With_Valid_Information_0001() throws InterruptedException {
		Thread.sleep(4000);
		homePageObject = new HomePageObject(driver);
		homePageObject.clickOnSignButton();
		Thread.sleep(2000);
		homePageObject.clickOnSignupButton();
		Thread.sleep(2000);
		homePageObject.enterTheNameOfSignup();
		Thread.sleep(2000);
		homePageObject.enterTheMobileNumber();
		Thread.sleep(2000);
		homePageObject.enterTheEmailId();
		Thread.sleep(2000);
		homePageObject.clickOnSignUpButtonFinal();
		Thread.sleep(3000);

	}

}
