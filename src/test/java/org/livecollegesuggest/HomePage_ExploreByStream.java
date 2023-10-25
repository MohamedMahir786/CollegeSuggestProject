package org.livecollegesuggest;

import org.pageobject.BaseClass;
import org.pageobject.HomePageObject;
import org.testng.annotations.Test;

public class HomePage_ExploreByStream extends BaseClass {
	HomePageObject homePageObject;

	private void sleep(int milliseconds) throws InterruptedException {
		Thread.sleep(milliseconds);
	}

	@Test
	public void cs_Verify_Explore_By_Stream_Linkcard_Is_Clickable_0001() throws InterruptedException {
		homePageObject = new HomePageObject(driver);
		sleep(3000);
		homePageObject.clickOnEngineeringLinkCard();
		homePageObject.clickOnMedicalLinkCard();
		homePageObject.clickOnDentalLinkCard();
		homePageObject.clickOnArchitectureLinkCard();
		homePageObject.clickOnpharmacyLinkCard();
	}
}
