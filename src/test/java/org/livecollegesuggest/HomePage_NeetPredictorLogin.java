package org.livecollegesuggest;

import org.pageobject.BaseClass;
import org.pageobject.HomePageObject;
import org.testng.annotations.Test;

public class HomePage_NeetPredictorLogin extends BaseClass {
	private void sleep(int milliseconds) throws InterruptedException {
		Thread.sleep(milliseconds);
	}

	HomePageObject homePageObject;
	
	//Entering  the valid phone number and verifying the otp 

	@Test(priority = 1)

	public void cs_Verify_Neet_Predictor_With_Valid_Phonenumber_And_OTP_001() throws InterruptedException {

		sleep(4000);
		homePageObject = new HomePageObject(driver);
		homePageObject.clickOnNeetPredictor();
		sleep(2000);
		homePageObject.enterTheValidPhoneNumber();
		sleep(2000);
		homePageObject.clickOnGetOtpNumber();
		sleep(2000);
		
	}
}
