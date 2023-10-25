package org.livecollegesuggest;

import org.pageobject.BaseClass;
import org.pageobject.HomePageObject;
import org.pageobject.ListingPageObject;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomePage_LoadMore extends BaseClass {

	HomePageObject homePageObject;

	@BeforeClass
	public void setup() throws InterruptedException {
		sleep(5000);
		homePageObject = new HomePageObject(driver);
		homePageObject.clickOnMedicalMenu();
		sleep(2000);
		homePageObject.clickOnGovernmentMedicalCollege();
		sleep(2000);

	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}

	private void sleep(int milliseconds) throws InterruptedException {
		Thread.sleep(milliseconds);

	}

	@Test(priority = 1)
	public void cs_verify_Load_More_Button_Is_Clickable_0001() throws InterruptedException {
		sleep(2000);
		ListingPageObject listingPage = new ListingPageObject(driver);
		sleep(2000);
		listingPage.clickOnLoadMoreButtton();
	}

}
