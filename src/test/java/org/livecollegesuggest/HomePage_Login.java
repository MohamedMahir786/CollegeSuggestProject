package org.livecollegesuggest;

import org.pageobject.BaseClass;
import org.pageobject.HomePageObject;
import org.testng.annotations.Test;

public class HomePage_Login extends BaseClass {

	HomePageObject homePageObject;

	// Entering all the valid information in loginpage
	@Test(priority = 1)

	public void cs_Verify_Login_Page_With_Valid_Phonenumber_001() throws InterruptedException {

		sleep(4000);
		homePageObject = new HomePageObject(driver);
		homePageObject.clickOnSignButton();
		sleep(2000);
		homePageObject.clickOnPhoneNumber();
		sleep(2000);
		homePageObject.clickOnLoginButton();

	}
	private void sleep(int milliseconds) throws InterruptedException {
		Thread.sleep(milliseconds);
	}

}
