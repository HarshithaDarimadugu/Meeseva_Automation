package pom_classes;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	public Home_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[contains(@title,'Welcome to Telangana MeeSeva Portal...')]")
	private WebElement meesevaLogoImage;
	
	@FindBy(xpath = "//div[contains(text(),'Sri A. Revanth Reddy ')]")
	private WebElement nameOfCmText;
	
	@FindBy(xpath = "//div[contains(text(),\"Hon'ble Chief Minister\")]")
	private WebElement designationOfCmText;
	
	@FindBy(xpath = "//div[contains(text(),\"Sri D.Sridhar Babu\")]")
	private WebElement nameofItMinisterText;
	
	@FindBy(xpath = "//div[contains(text(),\"Hon'ble Minister for IT\")]")
	private WebElement designationOfMinisterText;
	
	@FindBy(xpath = "//*[@id='navbarSupportedContent']/ul/li[1]/a")
	private WebElement homeLink;
	
	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a")
	private WebElement serviceLink;
	
	@FindBy(xpath = "//*[@id='navbarSupportedContent']/ul/li[3]/a")
	private WebElement galleryLink;
	
	@FindBy(xpath = "//*[@id='navbarSupportedContent']/ul/li[4]/a")
	private WebElement downloadsLink;
	
	@FindBy(xpath = "//*[@id='navbarSupportedContent']/ul/li[5]/a")
	private WebElement otherLinkslink;
	
	@FindBy(xpath = "//*[@id='navbarSupportedContent']/ul/li[6]/a")
	private WebElement grievanceLink;
	
	@FindBy(xpath = "//*[@id='navbarSupportedContent']/ul/li[7]/a")
	private WebElement meeSevaCentresLink;
	
	@FindBy(xpath = "//*[@id='navbarSupportedContent']/ul/li[8]/a")
	private WebElement contactUsLink;
	
	@FindBy(xpath = "//h4[contains(text(),'Important Alerts !')]")
	private WebElement importantAlertsText;
	
	@FindBy(xpath = "//b[contains(text(),'Printing & Supply of Secured Base')]")
	private WebElement importantAlertsLink;
	
	@FindBy (xpath = "//div[contains(text(),'Citizen Services')]")
	private WebElement citizenServicesText;
	
	@FindBy(xpath = "//div[@class ='cardHeadingSmall']/a")
	private WebElement searchForServiceLink;
	
	@FindAll({@FindBy(xpath = "//div[contains(text(),'RTA')]"), @FindBy(xpath = "(//div[@class='ServiceDiv']/div/a)[1]")})
	private WebElement rtaServicesTab;
	
	@FindBy(xpath = "//div[contains(text(),'GHMC')]")
	private WebElement ghmcServicesTab;
	
	@FindBy(xpath = "//div[contains(text(),'TGSPDCL')]")
	private WebElement tgspdclServicesTab;
	
	@FindBy(xpath = "//div[contains(text(),'Police')]")
	private WebElement policeServicesTab;
	
	@FindBy(xpath = "//div[contains(text(),'Registration')]")
	private WebElement registrationTab;
	
	@FindBy(xpath = "//div[contains(text(),'Revenue')]")
	private WebElement revenueServicesTab;
	
	@FindBy(xpath = "//div[contains(text(),'Twallet')]")
	private WebElement twalletServicesTab;
	
	@FindBy(xpath = "//div[contains(text(),'HMWSSB')]")
	private WebElement hmwssbServicesTab;
	
	@FindBy(xpath = "//div[contains(text(),'Endowment')]")
	private WebElement endownmentServicesTab;
	
	@FindBy(xpath = "//div[contains(text(),'Other Payments')]")
	private WebElement otherPaymentsTab;
	
	@FindBy(xpath = "//div[contains(text(),'Agriculture')]")
	private WebElement agricultureServicesTab;
	
	@FindBy(xpath = "//div[contains(text(),'CDMA')]")
	private WebElement cdmaServicesTab;
	
	@FindBy(xpath = "//div[contains(text(),'Login')]")
	private WebElement loginText;
	
	@FindAll({@FindBy(id = "j_username"), @FindBy(xpath = "//input[contains(@id,'j_username')]")})
	private WebElement loginIdTextField;
	
	@FindAll({@FindBy(id = "password"), @FindBy(xpath = "//input[contains(@id,'password')]")})
	private WebElement passwordTextField;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement showPasswordCheckBox;
	
	@FindBy(xpath = "//button[text()='Login']")
	private WebElement loginButton;
	
	@FindBy(xpath = "//a[text()='New User']")
	private WebElement newUserLink;
	
	@FindBy(xpath = "//a[text()='Forgot Password']")
	private WebElement forgotPasswordLink;
	
	@FindBy(xpath = "//span[contains(text(),'Welcome to MeeSeva Portal')]")
	private WebElement welcomeToMeesevaPortalText;
	
	@FindBy(xpath = "//label[contains(text(),'Know Your Application Status')]")
	private WebElement knowYourApplicationStatusText;
	
	@FindAll({@FindBy(id = "searchAppl"), @FindBy(xpath = "//input[contains(@id,'searchAppl')]")})
	private WebElement knowYourApplicationStatusTextField;
	
	@FindBy(xpath = "//label[contains(text(),'MeeSeva Certificate (Application No)')]")
	private WebElement meesevaCertificateText;
	
	@FindAll({@FindBy(id = "searchCert"), @FindBy(xpath = "//input[contains(@id,'searchCert')]")})
	private WebElement meesevaCertificateTextField;
	
	@FindBy(xpath = "//input[contains(@id,'searchAppl')]/../div/button")
	private WebElement knowYourApplicationStatusSearchButton;
	
	@FindBy(xpath = "//input[contains(@id,'searchCert')]/../div/button")
	private WebElement meesevaCertificateSearchButton;
	
	@FindBy(xpath = "//a[contains(text(),'Know Your GHMC Application Status (Birth/Death)')]")
	private WebElement knowYourGhmcApplicationStatusLink;
	
	@FindBy(xpath = "//a[contains(text(),'Transactions Recorded Today')]")
	private WebElement transactionsRecordedTodayLink;
	
	@FindBy(xpath = "//a[contains(text(),'MeeSeva Dashboard')]")
	private WebElement meesevaDashboardLink;
	
	@FindBy(xpath = "//a[contains(text(),'Latest Updates')]")
	private WebElement latestUpdatesLink;
	
	@FindBy(xpath = "//a[contains(text(),'DOST Launched')]")
	private WebElement dostLaunchedLink;
	
	@FindBy(xpath = "//a[@class='prev']")
	private WebElement previousIconLink;
	
	@FindBy(xpath = "//a[@class='next']")
	private WebElement nextIconLink;
	
	@FindBy(xpath = "//form[@id='FooterForm']")
	private List<WebElement> footerLinks;

	public WebElement getMeesevaLogoImage() {
		return meesevaLogoImage;
	}

	public WebElement getNameOfCmText() {
		return nameOfCmText;
	}

	public WebElement getDesignationOfCmText() {
		return designationOfCmText;
	}

	public WebElement getNameofItMinisterText() {
		return nameofItMinisterText;
	}

	public WebElement getDesignationOfMinisterText() {
		return designationOfMinisterText;
	}

	public WebElement getHomeLink() {
		return homeLink;
	}

	public WebElement getServiceLink() {
		return serviceLink;
	}

	public WebElement getGalleryLink() {
		return galleryLink;
	}

	public WebElement getDownloadsLink() {
		return downloadsLink;
	}

	public WebElement getOtherLinkslink() {
		return otherLinkslink;
	}

	public WebElement getGrievanceLink() {
		return grievanceLink;
	}

	public WebElement getMeeSevaCentresLink() {
		return meeSevaCentresLink;
	}

	public WebElement getContactUsLink() {
		return contactUsLink;
	}

	public WebElement getImportantAlertsText() {
		return importantAlertsText;
	}

	public WebElement getImportantAlertsLink() {
		return importantAlertsLink;
	}

	public WebElement getCitizenServicesText() {
		return citizenServicesText;
	}

	public WebElement getSearchForServiceLink() {
		return searchForServiceLink;
	}

	public WebElement getRtaServicesTab() {
		return rtaServicesTab;
	}

	public WebElement getGhmcServicesTab() {
		return ghmcServicesTab;
	}

	public WebElement getTgspdclServicesTab() {
		return tgspdclServicesTab;
	}

	public WebElement getPoliceServicesTab() {
		return policeServicesTab;
	}

	public WebElement getRegistrationTab() {
		return registrationTab;
	}

	public WebElement getRevenueServicesTab() {
		return revenueServicesTab;
	}

	public WebElement getTwalletServicesTab() {
		return twalletServicesTab;
	}

	public WebElement getHmwssbServicesTab() {
		return hmwssbServicesTab;
	}

	public WebElement getEndownmentServicesTab() {
		return endownmentServicesTab;
	}

	public WebElement getOtherPaymentsTab() {
		return otherPaymentsTab;
	}

	public WebElement getAgricultureServicesTab() {
		return agricultureServicesTab;
	}

	public WebElement getCdmaServicesTab() {
		return cdmaServicesTab;
	}

	public WebElement getLoginText() {
		return loginText;
	}

	public WebElement getLoginIdTextField() {
		return loginIdTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getShowPasswordCheckBox() {
		return showPasswordCheckBox;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getNewUserLink() {
		return newUserLink;
	}

	public WebElement getForgotPasswordLink() {
		return forgotPasswordLink;
	}

	public WebElement getWelcomeToMeesevaPortalText() {
		return welcomeToMeesevaPortalText;
	}

	public WebElement getKnowYourApplicationStatusText() {
		return knowYourApplicationStatusText;
	}

	public WebElement getKnowYourApplicationStatusTextField() {
		return knowYourApplicationStatusTextField;
	}

	public WebElement getMeesevaCertificateText() {
		return meesevaCertificateText;
	}

	public WebElement getMeesevaCertificateTextField() {
		return meesevaCertificateTextField;
	}

	public WebElement getKnowYourApplicationStatusSearchButton() {
		return knowYourApplicationStatusSearchButton;
	}

	public WebElement getMeesevaCertificateSearchButton() {
		return meesevaCertificateSearchButton;
	}

	public WebElement getKnowYourGhmcApplicationStatusLink() {
		return knowYourGhmcApplicationStatusLink;
	}

	public WebElement getTransactionsRecordedTodayLink() {
		return transactionsRecordedTodayLink;
	}

	public WebElement getMeesevaDashboardLink() {
		return meesevaDashboardLink;
	}

	public WebElement getLatestUpdatesLink() {
		return latestUpdatesLink;
	}

	public WebElement getDostLaunchedLink() {
		return dostLaunchedLink;
	}

	public WebElement getPreviousIconLink() {
		return previousIconLink;
	}

	public WebElement getNextIconLink() {
		return nextIconLink;
	}

	public List<WebElement> getFooterLinks() {
		return footerLinks;
	}
	
	
	
	
	
	
	
}
