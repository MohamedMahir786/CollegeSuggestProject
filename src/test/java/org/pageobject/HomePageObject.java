package org.pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObject {

	WebDriver driver;

	@FindBy(xpath = "//*[@id='searchTheCollege1']")
	private WebElement searchBox;

	@FindBy(xpath = "//a[normalize-space()='Sign In/Sign Up']")
	private WebElement signButton;

	@FindBy(xpath = "//input[@id='loginPhone']")
	private WebElement phoneNumber;

	@FindBy(xpath = "//button[@id='sendotp']")
	private WebElement loginButton;

	@FindBy(xpath = "//*[@id=\"offcanvaslink1\"]/div/div[3]/button[2]")
	private WebElement signupButton;

	@FindBy(xpath = "//input[@id='csName']")
	private WebElement nameSignup;

	@FindBy(xpath = "//input[@id='csMobile']")
	private WebElement mobileNumber;

	@FindBy(xpath = "//input[@id='csEmail']")
	private WebElement emailId;

	@FindBy(xpath = "//button[@type='button'][normalize-space()='Signup']")
	private WebElement clickSignUp;

	@FindBy(xpath = "//a[@href='top-engineering-colleges-in-india.html']")
	private WebElement engineeringLinkCard;

	@FindBy(xpath = "//a[@href='top-medical-colleges-in-india.html']")
	private WebElement medicalLinkCard;

	@FindBy(xpath = "//a[@href='top-dental-colleges-in-india.html']")
	private WebElement dentalLinkCard;

	@FindBy(xpath = "//a[@href='top-architecture-colleges-in-india.html']")
	private WebElement architectureLinkCard;

	@FindBy(xpath = "//a[@href='top-pharmacy-colleges-in-india.html']")
	private WebElement pharmacyLinkCard;

	@FindBy(xpath = "//div[@class='row col-reverse']//a[4]")
	private WebElement architectureCollegeIndia;

	@FindBy(xpath = "//a[normalize-space()='Top Government Medical colleges']")
	private WebElement governmentmedicalcollegeIndia;

	@FindBy(xpath = "//*[@id='searchresult1']/div/ul/li/a")
	private WebElement onClick;

	@FindBy(xpath = "(//span[@class='menu-icon'])[1]")
	private WebElement engineeringMenu;

	@FindBy(id = "topiit")
	private WebElement iitCollege;

	@FindBy(xpath = "(//span[@class='menu-icon'])[2]")
	private WebElement medicalMenu;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]")
	private WebElement governmentMedical;

	@FindBy(xpath = "(//span[@class='menu-icon'])[3]")
	private WebElement dentalMenu;

	@FindBy(xpath = "//div[@class='main-wrapper']//li[4]//ul[1]//li[1]//a[1]")
	private WebElement governmentDental;

	@FindBy(xpath = "(//span[@class='menu-icon'])[4]")
	private WebElement architectureMenu;

	@FindBy(xpath = "//div[@class='main-wrapper']//li[5]//ul[1]//li[4]//a[1]")
	private WebElement privateArchitecture;

	@FindBy(xpath = "(//span[@class='menu-icon'])[5]")
	private WebElement pharmacyMenu;

	@FindBy(xpath = "//div[@class='main-wrapper']//li[6]//ul[1]//li[2]//a[1]")
	private WebElement privatePharmacy;

	@FindBy(xpath = "(//span[@class='menu-icon'])[6]")
	private WebElement examMenu;

	@FindBy(xpath = "(//a[contains(text(),'engineering')])[2]")
	private WebElement engineeringExam;

	@FindBy(xpath = "//a[@class='play videoLightbox ']")
	private WebElement youtubeSession;

	@FindBy(xpath = "//a[@class='playlistbtn']")
	private WebElement openPlayList;

	@FindBy(xpath = "//button[@aria-label='Close']")
	private WebElement closeButton;

	@FindBy(xpath = "//*[@id=\"header\"]/div/div/div[2]/ul/li[1]/a")
	private WebElement homeButton;

	@FindBy(xpath = "(//a[contains(text(),'Top 10 Private Colleges in india')])[3]")
	private WebElement privateMedicalFooter;

	@FindBy(xpath = "(//a[@id='topiit'])[38]")
	private WebElement gftiCollege;

	@FindBy(xpath = "(//a[contains(text(),'Top 10 Government Colleges in india')])[4]")
	private WebElement governmentDentalFooter;

	@FindBy(xpath = "(//a[contains(text(),'Top 10 NIT Colleges in india')])[2]")
	private WebElement nitArchitectureFooter;

	@FindBy(xpath = "(//a[contains(text(),'Top 10 Private Colleges in india')])[5]")
	private WebElement privatePharmacyFooter;

	@FindBy(xpath = "//a[@href='https://collegesuggest.com/predictors/neet-predictor/?utm_source=home&utm_medium=organic&utm_campaign=NEET_Predictors']")
	private WebElement neetPredictor;

	@FindBy(xpath = "//input[@id='loginPhoneNumber']")
	private WebElement enterYourNumber;

	@FindBy(xpath = "(//button[normalize-space()='Get OTP'])[1]")
	private WebElement getOtpNumber;

	@FindBy(xpath = "//a[normalize-space()='Tamilnadu']")
	private WebElement placeDelhi;

	@FindBy(xpath = "//a[normalize-space()='Chennai']")
	private WebElement placeChennai;

	@FindBy(xpath = "//a[normalize-space()='Calcutta']")
	private WebElement placeCalcutta;

	@FindBy(xpath = "//a[normalize-space()='CSE']")
	private WebElement coursesCse;

	@FindBy(xpath = "//a[normalize-space()='Aeronatical']")
	private WebElement coursesAeronatical;

	@FindBy(xpath = "//a[normalize-space()='MBBS']")
	private WebElement coursesMbbs;

	@FindBy(xpath = "//form[@id='loginForm']//a[1]")
	private WebElement googleLoginForm;

	public HomePageObject(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void typeOnSearchBox() {
		searchBox.sendKeys("St.Peter");
	}

	public void clickOnSignButton() {
		signButton.click();
	}

	public void clickOnPhoneNumber() {
		phoneNumber.sendKeys("8220479227");
	}

	public void clickOnInvalidPhoneNumber() {
		phoneNumber.sendKeys("123456");
	}

	public void clickOnLoginButton() {
		loginButton.click();
	}

	public void clickOnSignupButton() {
		signupButton.click();
	}

	public void enterTheNameOfSignup() {
		nameSignup.sendKeys("Mahi");
	}

	public void enterTheMobileNumber() {
		mobileNumber.sendKeys("8220479227");
	}

	public void enterTheEmailId() {
		emailId.sendKeys("mohamedmahir768@gmail.com");
	}

	public void clickOnSignUpButtonFinal() {
		clickSignUp.click();
	}

	public void clickOnEngineeringLinkCard() throws InterruptedException {
		engineeringLinkCard.click();
		Thread.sleep(3000);
		homeButton.click();
		Thread.sleep(3000);
	}

	public void clickOnMedicalLinkCard() throws InterruptedException {
		medicalLinkCard.click();
		Thread.sleep(3000);
		homeButton.click();
		Thread.sleep(3000);
	}

	public void clickOnArchitectureLinkCard() throws InterruptedException {
		architectureLinkCard.click();
		Thread.sleep(3000);
		homeButton.click();
		Thread.sleep(3000);
	}

	public void clickOnDentalLinkCard() throws InterruptedException {
		dentalLinkCard.click();
		Thread.sleep(3000);
		homeButton.click();
		Thread.sleep(3000);
	}

	public void clickOnpharmacyLinkCard() throws InterruptedException {
		pharmacyLinkCard.click();
		Thread.sleep(3000);
		homeButton.click();
		Thread.sleep(3000);
	}

	public void clickOnArchitectureCollegeIndia() throws InterruptedException {
		scrollandclick(architectureCollegeIndia);
		Thread.sleep(4000);
		homeButton.click();
		Thread.sleep(3000);
	}

	public void clickOnGovernmentMedicalCollegeIndia() throws InterruptedException {
		scrollandclick(governmentmedicalcollegeIndia);
		Thread.sleep(4000);
		homeButton.click();
		Thread.sleep(3000);
	}

	public void onClickSearchBox() {
		onClick.click();
	}

	public void clickOnEngineeringMenu() {
		engineeringMenu.click();
	}

	public void clickOnIitCollege() {
		iitCollege.click();
	}

	public void clickOnMedicalMenu() {
		medicalMenu.click();
	}

	public void clickOnGovernmentMedicalCollege() {
		governmentMedical.click();
	}

	public void clickOnDentalMenu() {
		dentalMenu.click();
	}

	public void clickOnGovernmentDentalCollege() {
		governmentDental.click();
	}

	public void clickOnArchitectureMenu() {
		architectureMenu.click();
	}

	public void clickOnPrivateArchitectureCollege() {
		privateArchitecture.click();
	}

	public void clickOnPharmacyMenu() {
		pharmacyMenu.click();
	}

	public void clickOnPrivatePharmacyCollege() {
		privatePharmacy.click();
	}

	public void clickOnExamMenu() {
		examMenu.click();
	}

	public void clickOnEngineeringExam() {
		engineeringExam.click();
	}

	public void clickOnYoutubeSession() {
		youtubeSession.click();
	}

	public void clickOnCloseButton() {
		closeButton.click();
	}

	public void clickOnOpenPlayList() throws InterruptedException {
		Thread.sleep(3000);
		scrollandclick(openPlayList);
		Thread.sleep(3000);

	}

	public void clickOnGftiCollegeFooter() throws InterruptedException {
		Thread.sleep(2000);
		scrollandclick(gftiCollege);
		Thread.sleep(4000);
		homeButton.click();
	}

	public void clickOnPrivateMedicalFooter() throws InterruptedException {
		Thread.sleep(2000);
		scrollandclick(privateMedicalFooter);
		Thread.sleep(4000);
		homeButton.click();
	}

	public void clickOnGovernmentDentalFooter() throws InterruptedException {
		Thread.sleep(2000);
		scrollandclick(governmentDentalFooter);
		Thread.sleep(4000);
		homeButton.click();
	}

	public void clickOnNitArchitectureFooter() throws InterruptedException {
		Thread.sleep(2000);
		scrollandclick(nitArchitectureFooter);
		Thread.sleep(4000);
		homeButton.click();
	}

	public void clickOnPrivatePharmacyFooter() throws InterruptedException {
		Thread.sleep(2000);
		scrollandclick(privatePharmacyFooter);
		Thread.sleep(4000);
		homeButton.click();
	}

	public void clickOnNeetPredictor() throws InterruptedException {
		Thread.sleep(2000);
		neetPredictor.click();
	}

	public void enterTheValidPhoneNumber() throws InterruptedException {
		Thread.sleep(2000);
		enterYourNumber.sendKeys("8220479227");
	}

	public void clickOnGetOtpNumber() throws InterruptedException {
		Thread.sleep(2000);
		getOtpNumber.click();
	}

	public void clickOnPlaceDelhi() throws InterruptedException {
		Thread.sleep(2000);
		scrollandclick(placeDelhi);
		Thread.sleep(2000);
		homeButton.click();
	}

	public void clickOnPlaceChennai() throws InterruptedException {
		Thread.sleep(2000);
		scrollandclick(placeChennai);
		Thread.sleep(2000);
		homeButton.click();

	}

	public void clickOnPlaceCalcutta() throws InterruptedException {
		Thread.sleep(2000);
		scrollandclick(placeCalcutta);
		Thread.sleep(2000);
		homeButton.click();
	}

	public void clickOnCoursesCse() throws InterruptedException {
		Thread.sleep(2000);
		scrollandclick(coursesCse);
		Thread.sleep(2000);
		homeButton.click();
	}

	public void clickOnCoursesAeronatical() throws InterruptedException {
		Thread.sleep(2000);
		scrollandclick(coursesAeronatical);
		Thread.sleep(2000);
		homeButton.click();
	}

	public void clickOnCoursesMbbs() throws InterruptedException {
		Thread.sleep(2000);
		scrollandclick(coursesMbbs);
		Thread.sleep(2000);
		homeButton.click();
	}

	public void clickOnGoogleLoginForm() throws InterruptedException {
		Thread.sleep(2000);
		googleLoginForm.click();
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