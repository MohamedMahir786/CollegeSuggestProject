package org.livecollegesuggest;

import org.pageobject.BaseClass;
import org.pageobject.HomePageObject;
import org.pageobject.ListingPageObject;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ListingPage_BookMark extends BaseClass {
	HomePageObject homePageObject;

	@BeforeClass
	public void setup() throws InterruptedException {
		sleep(5000);
		homePageObject = new HomePageObject(driver);
		homePageObject.clickOnPharmacyMenu();
		sleep(3000);
		homePageObject.clickOnPrivatePharmacyCollege();
		sleep(3000);

	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}

	private void sleep(int milliseconds) throws InterruptedException {
		Thread.sleep(milliseconds);

	}
	// checking whether the bookmark is clickable or not

	@Test(priority = 1)
	public void cs_Verify_BookMark_Is_Clickable_0001() throws InterruptedException {

		sleep(2000);
		ListingPageObject listingPage = new ListingPageObject(driver);
		sleep(2000);
		listingPage.clickOnBookMarkButton();
		sleep(2000);
		listingPage.clickOnCompareButton();
		sleep(2000);
		listingPage.clickOnLearnMoreButton();
		sleep(4000);
	}
}
