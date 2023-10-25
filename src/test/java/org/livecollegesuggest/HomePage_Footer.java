package org.livecollegesuggest;

import org.pageobject.BaseClass;
import org.pageobject.HomePageObject;
import org.testng.annotations.Test;

public class HomePage_Footer extends BaseClass {
	HomePageObject homePageObject;

	private void sleep(int milliseconds) throws InterruptedException {
		Thread.sleep(milliseconds);
	}

	// scrolling down and clicking gfti engineering footer link
	@Test(priority = 1)
	public void cs_Verify_Footer_Section_Engineering_College_Link_Is_Clickable_0001() throws InterruptedException {

		sleep(6000);
		homePageObject = new HomePageObject(driver);
		homePageObject.clickOnGftiCollegeFooter();
	}

	// scrolling down and clicking private medical footer link
	@Test(priority = 2)
	public void cs_Verify_Footer_Section_Medical_College_Link_Is_Clickable_0002() throws InterruptedException {
		sleep(2000);
		homePageObject.clickOnPrivateMedicalFooter();
	}

	// scrolling down and clicking government dental footer link
	@Test(priority = 3)

	public void cs_Verify_Footer_Section_Dental_College_Link_Is_Clickable_0003() throws InterruptedException {
		sleep(2000);
		homePageObject.clickOnGovernmentDentalFooter();
	}

	// scrolling down and clicking nit architecture footer link
	@Test(priority = 4)

	public void cs_Verify_Footer_Section_Architecture_College_Link_Is_Clickable_0004() throws InterruptedException {
		sleep(2000);
		homePageObject.clickOnNitArchitectureFooter();
	}

	// scrolling down and clicking private pharmacy footer link
	@Test(priority = 5)

	public void cs_Verify_Footer_Section_Pharmacy_College_Link_Is_Clickable_0005() throws InterruptedException {
		sleep(2000);
		homePageObject.clickOnPrivatePharmacyFooter();
	}

}
