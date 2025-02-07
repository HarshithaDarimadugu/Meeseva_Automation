package pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ADB_DYMRO_Services_Page {
	
	public ADB_DYMRO_Services_Page (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//header[@class='main-header']")
	private WebElement headerImage;
	
	@FindBy(xpath = "//span[contains(text(),'User Profile')]/parent::a")
	private WebElement userProfileLink;
	
	@FindBy(xpath = "//span[contains(@class,'pull-right-container')]")
	private WebElement downarrowIconButton;
	
	@FindBy(xpath = "//a[contains(text(),'User Information')]")
	private WebElement userInformationLink;
	
	@FindBy(xpath = "//a[contains(text(),'Settings')]")
	private WebElement settingsLink;
	
	@FindBy(xpath = "//span[contains(text(),'Downloads')]/parent::a")
	private WebElement downloadsLink;
	
	@FindBy(xpath = "//span[contains(text(),'Notifications')]/parent::a")
	private WebElement notificationsLink;
	
	@FindBy(xpath = "//span[contains(text(),'Contact Us')]/parent::a")
	private WebElement contactUsLink;
	
	@FindBy(xpath = "//span[contains(text(),'Signout')]/parent::a")
	private WebElement signOutLink;
	
	@FindBy(xpath = "//h1[contains(text(),'Meeseva')]")
	private WebElement meesevaHeaderText;
	
	@FindBy(xpath = "//input[contains(@type,'search')]")
	private WebElement searchBarTextField;
	
	@FindBy(xpath = "//a[contains(@title,'Brahmin Community Certificate')]")
	private WebElement brahminCommunityCertificateLink;
	
	@FindBy(xpath = "//a[contains(@title,'Community Date')]")
	private WebElement communityDateOfBirthCertificateRequestLink;
	
	@FindBy(xpath = "//span[contains(text(),'Income Certificate')]/ancestor::div[@class='front front-one']")
	private WebElement incomeCertificateRequestsLink;
	
	@FindBy(xpath = "//span[contains(text(),'Nativity Certificate')]/ancestor::div[@class='front front-one']")
	private WebElement nativityCertificateRequestsLink;

	public WebElement getHeaderImage() {
		return headerImage;
	}

	public WebElement getUserProfileLink() {
		return userProfileLink;
	}

	public WebElement getDownarrowIconButton() {
		return downarrowIconButton;
	}

	public WebElement getUserInformationLink() {
		return userInformationLink;
	}

	public WebElement getSettingsLink() {
		return settingsLink;
	}

	public WebElement getDownloadsLink() {
		return downloadsLink;
	}

	public WebElement getNotificationsLink() {
		return notificationsLink;
	}

	public WebElement getContactUsLink() {
		return contactUsLink;
	}

	public WebElement getSignOutLink() {
		return signOutLink;
	}

	public WebElement getMeesevaHeaderText() {
		return meesevaHeaderText;
	}

	public WebElement getSearchBarTextField() {
		return searchBarTextField;
	}

	public WebElement getBrahminCommunityCertificateLink() {
		return brahminCommunityCertificateLink;
	}

	public WebElement getCommunityDateOfBirthCertificateRequestLink() {
		return communityDateOfBirthCertificateRequestLink;
	}

	public WebElement getIncomeCertificateRequestsLink() {
		return incomeCertificateRequestsLink;
	}

	public WebElement getNativityCertificateRequestsLink() {
		return nativityCertificateRequestsLink;
	}
	
	
	
	

}
