package org.livecollegesuggest;

import org.pageobject.BaseClass;
import org.pageobject.HomePageObject;
import org.testng.annotations.Test;

public class HomePage_YoutubeSession extends BaseClass {
	HomePageObject homePageObject;

	// click whether the youtube session clickable or not
	@Test(priority = 1)
	public void cs_Verify_Youtube_Session_Is_Clickable_0001() throws InterruptedException {
		sleep(3000);
		homePageObject = new HomePageObject(driver);
		homePageObject.clickOnYoutubeSession();
		sleep(5000);
		homePageObject.clickOnCloseButton();
	}

	// click whether the openplaylist session is clickable or not
	@Test(priority = 2)

	public void cs_Verify_OpenPlaylist_Is_Clickable_0002() throws InterruptedException {
		sleep(3000);
		homePageObject.clickOnOpenPlayList();
		sleep(4000);
	}
	private void sleep(int milliseconds) throws InterruptedException {
		Thread.sleep(milliseconds);
	}
}