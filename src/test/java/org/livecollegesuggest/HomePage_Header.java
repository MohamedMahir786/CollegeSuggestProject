package org.livecollegesuggest;

import org.pageobject.BaseClass;
import org.pageobject.HomePageObject;
import org.testng.annotations.Test;

public class HomePage_Header extends BaseClass {

	HomePageObject homePageObject;

	private void sleep(int milliseconds) throws InterruptedException {
		Thread.sleep(milliseconds);
	}

	// clicking header section of iit engineering college
	@Test(priority = 1)

	public void cs_Verify_Header_Section_Engineering_College_Link_Is_Clickable_0001() throws InterruptedException {
		sleep(3000);
		homePageObject = new HomePageObject(driver);
		homePageObject.clickOnEngineeringMenu();
		sleep(2000);
		homePageObject.clickOnIitCollege();
		sleep(2000);

	}

	// clicking header section of government medical college
	@Test(priority = 2)
	public void cs_Verify_Header_Section_Medical_College_Link_Is_Clickable_0002() throws InterruptedException {
		sleep(2000);
		homePageObject.clickOnMedicalMenu();
		sleep(2000);
		homePageObject.clickOnGovernmentMedicalCollege();
		sleep(2000);

	}

	// clicking header section of government dental college
	@Test(priority = 3)

	public void cs_Verify_Header_Section_Dental_College_Link_Is_Clickable_0003() throws InterruptedException {
		sleep(2000);
		homePageObject.clickOnDentalMenu();
		sleep(2000);
		homePageObject.clickOnGovernmentDentalCollege();
		sleep(2000);

	}

	// clicking header section of private architecture college
	@Test(priority = 4)
	public void cs_Verify_Header_Section_Architecture_College_Link_Is_Clickable_0004() throws InterruptedException {
		sleep(3000);
		homePageObject.clickOnArchitectureMenu();
		sleep(3000);
		homePageObject.clickOnPrivateArchitectureCollege();
		sleep(3000);

	}

	// clicking header section private pharmacy college
	@Test(priority = 5)

	public void cs_Verify_Header_Section_Pharmacy_College_Link_Is_Clickable_0005() throws InterruptedException {
		sleep(3000);
		homePageObject.clickOnPharmacyMenu();
		sleep(3000);
		homePageObject.clickOnPrivatePharmacyCollege();
		sleep(3000);

	}

	// clicking header section engineering exams menu
	@Test(priority = 6)

	public void cs_Verify_Header_Section_Exams_College_Link_Is_Clickable_0006() throws InterruptedException {
		sleep(3000);
		homePageObject.clickOnExamMenu();
		sleep(3000);
		homePageObject.clickOnEngineeringExam();
		sleep(3000);

	}

}