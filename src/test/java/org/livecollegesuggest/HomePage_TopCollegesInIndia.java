package org.livecollegesuggest;

import org.pageobject.BaseClass;
import org.pageobject.HomePageObject;
import org.testng.annotations.Test;

public class HomePage_TopCollegesInIndia extends BaseClass {
	HomePageObject homePageObject;

	private void sleep(int milliseconds) throws InterruptedException {
		Thread.sleep(milliseconds);
	}
	
	//check whether the college of india is clickable or not

	@Test(priority = 1)
	public void cs_Verify_Top_Colleges_In_India_Is_Clickable_0001() throws InterruptedException {
		homePageObject = new HomePageObject(driver);
		sleep(3000);
		homePageObject.clickOnArchitectureCollegeIndia();
		homePageObject.clickOnGovernmentMedicalCollegeIndia();

	}
	
	//check whether the places of india is clickable or not

	@Test(priority = 2)

	public void cs_Verify_Top_Places_In_India_To_Study_Is_Clickable_002() throws InterruptedException {
		sleep(2000);
		homePageObject.clickOnPlaceDelhi();
		sleep(2000);
		homePageObject.clickOnPlaceChennai();
		sleep(2000);
		homePageObject.clickOnPlaceCalcutta();
	}
	
	//check whether the top courses of india is clickable or not

	@Test(priority = 3)

	public void cs_Verify_Top_Courses_Is_Clickable_003() throws InterruptedException {
		sleep(2000);
		homePageObject.clickOnCoursesCse();
		sleep(2000);
		homePageObject.clickOnCoursesAeronatical();
		sleep(2000);
		homePageObject.clickOnCoursesMbbs();

	}

}