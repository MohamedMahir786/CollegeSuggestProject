package org.livecollegesuggest;

import org.pageobject.BaseClass;
import org.pageobject.HomePageObject;
import org.pageobject.ListingPageObject;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ListingPage_SortBy extends BaseClass {
	HomePageObject homePageObject;

	@BeforeClass
	public void setup() throws InterruptedException {
		sleep(5000);
		homePageObject = new HomePageObject(driver);
		homePageObject.clickOnEngineeringMenu();
		sleep(2000);
		homePageObject.clickOnIitCollege();
		sleep(2000);

	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}

	private void sleep(int milliseconds) throws InterruptedException {
		Thread.sleep(milliseconds);

	}
	// checking whether the dropdown of sortby is clickable or not

	@Test(priority = 1)
	public void cs__Verify_DropDown_Is_Clickable_0001() throws InterruptedException {

		sleep(2000);
		ListingPageObject listingPage = new ListingPageObject(driver);
		sleep(2000);
		listingPage.clickOnFeesDropDown();
		sleep(2000);
		listingPage.clickOnPlacementDropDown();
		sleep(2000);
		listingPage.clickOnCampusDropDown();
		sleep(2000);
		listingPage.clickOnListingPageSearchCollege();
		sleep(3000);

	}

}
