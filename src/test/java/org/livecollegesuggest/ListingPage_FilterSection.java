package org.livecollegesuggest;

import org.pageobject.BaseClass;
import org.pageobject.HomePageObject;
import org.pageobject.ListingPageObject;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ListingPage_FilterSection extends BaseClass {
	HomePageObject homePageObject;
	ListingPageObject listingPage;

	@BeforeClass
	public void setup() throws InterruptedException {
		sleep(3000);
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

	// Checks whether the filter section of state is clickable

	@Test(priority = 2)
	public void cs_Verify_State_Filter_Is_Clickable_0001() throws InterruptedException {
		sleep(2000);
		listingPage = new ListingPageObject(driver);
		sleep(2000);
		listingPage.selectKeralaState();

	}

	@Test(priority = 3)
	public void cs_verify_City_Filter_Is_Clickable_0002() throws InterruptedException {
		sleep(3000);
		listingPage.clickOnCityFilterButton();
		sleep(3000);
		listingPage.selectPalakkadCity();

	}
}