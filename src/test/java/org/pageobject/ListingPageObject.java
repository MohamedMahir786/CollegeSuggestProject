package org.pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListingPageObject {

	WebDriver driver;

	@FindBy(xpath = "//select[@id='nirf_select']")
	private WebElement filterDrop;

	@FindBy(xpath = "//option[@value='fees']")
	private WebElement feesDropDown;

	@FindBy(xpath = "//option[@value='placed']")
	private WebElement placementDropDown;

	@FindBy(xpath = "//option[@value='campus']")
	private WebElement campusDropdown;

	@FindBy(xpath = "//input[@id='SearchTheCollege']")
	private WebElement searchCollege;

	@FindBy(xpath = "//button[@id='load_more_block']")
	private WebElement loadMore;

	@FindBy(xpath = "//div[@id='95']")
	private WebElement bookMark;

	@FindBy(xpath = "(//button[@id='95'])[1]")
	private WebElement compareButton;

	@FindBy(xpath = "(//a[@target='_blank '][normalize-space()='learn more'])[1]")
	private WebElement learnMoreButton;

	@FindBy(xpath = "//input[@id='checkedstate16']")
	private WebElement selectKerala;

	@FindBy(xpath = "(//button[@class='collapsed'][normalize-space()='City'])[1]")
	private WebElement cityFilterButton;

	@FindBy(xpath = "//input[@id='checkedcity174']")
	private WebElement selectPalakkad;

	public ListingPageObject(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnFilterDropdown() throws InterruptedException {
		Thread.sleep(2000);
		filterDrop.click();
	}

	public void clickOnFeesDropDown() throws InterruptedException {
		Thread.sleep(2000);
		feesDropDown.click();
	}

	public void clickOnPlacementDropDown() throws InterruptedException {
		Thread.sleep(2000);
		placementDropDown.click();
	}

	public void clickOnCampusDropDown() throws InterruptedException {
		Thread.sleep(2000);
		campusDropdown.click();
	}

	public void clickOnListingPageSearchCollege() throws InterruptedException {
		Thread.sleep(2000);
		searchCollege.sendKeys("St.Peter Engineeering College");
	}

	public void clickOnLoadMoreButtton() throws InterruptedException {
		Thread.sleep(2000);
		scrollandclick(loadMore);
		Thread.sleep(2000);
		scrollandclick(loadMore);
		Thread.sleep(2000);
	}

	public void clickOnBookMarkButton() throws InterruptedException {
		Thread.sleep(2000);
		bookMark.click();
		Thread.sleep(2000);
	}

	public void clickOnCompareButton() throws InterruptedException {
		Thread.sleep(2000);
		compareButton.click();
	}

	public void clickOnLearnMoreButton() throws InterruptedException {
		Thread.sleep(2000);
		learnMoreButton.click();
	}

	public void selectPalakkadCity() throws InterruptedException {
		Thread.sleep(2000);
		scrollandclick(selectPalakkad);
		Thread.sleep(2000);
	}

	public void clickOnCityFilterButton() throws InterruptedException {
		Thread.sleep(2000);
		cityFilterButton.click();
	}

	public void selectKeralaState() throws InterruptedException {
		Thread.sleep(2000);
		scrollandclick(selectKerala);
		Thread.sleep(2000);
	}

	private void scrollandclick(WebElement scroll) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Object element = scroll;
		js.executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
		Thread.sleep(6000);
		((WebElement) element).click();
		Thread.sleep(6000);

	}
}
