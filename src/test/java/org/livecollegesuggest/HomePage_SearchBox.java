package org.livecollegesuggest;

import org.pageobject.BaseClass;
import org.pageobject.HomePageObject;
import org.testng.annotations.Test;

public class HomePage_SearchBox extends BaseClass {

	HomePageObject homePageObject;

	// typing the valid information of the college
	@Test(priority = 1)

	public void cs_Verify_Search_Box_With_Valid_Information_0001() throws InterruptedException {

		Thread.sleep(3000);
		homePageObject = new HomePageObject(driver);
		sleep(3000);
		homePageObject.typeOnSearchBox();
		sleep(3000);
		homePageObject.onClickSearchBox();
		sleep(3000);

	}
	private void sleep(int milliseconds) throws InterruptedException {
		Thread.sleep(milliseconds);
	}

}
