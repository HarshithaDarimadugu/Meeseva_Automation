package pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DLF_ADB_Firm_Dashboard_Page {
	
	public DLF_ADB_Firm_Dashboard_Page (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "/html/body/header")
	private WebElement headerImage;
	
	@FindBy(xpath = "//a[text()='DashBoard']")
	private WebElement dashboardLink;
	
	@FindBy(xpath = "//a[text()='My Pending request']")
	private WebElement myPendingRequestLink;
	
	@FindBy(xpath = "//a[text()='Change Password']")
	private WebElement changePasswordLink;
	
	@FindBy(xpath = "//li[text()='Logged in User : DLF-AS-ADI-ADMIN']")
	private WebElement dlfUserIdText;
	
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logoutLink;
	
	@FindBy(xpath = "//label[text()='Registration of Firms (Under Section: 58)']/parent::td/following-sibling::td[3]/a")
	private WebElement applicationsPendingInFirmLink;
	
	@FindBy(xpath = "//label[text()='Registration of Firms (Under Section: 58)']/parent::td/following-sibling::td[2]/a")
	private WebElement applicationsApprovedInFirmLink;
	
	@FindBy(xpath = "//label[text()='Changes / Alterations in Firm (Under Sections: 60,61,62)']/parent::td/following-sibling::td[3]/a")
	private WebElement applicationsPendingInAlterationsInFirmLink;
	
	@FindBy(xpath = "//label[text()='Change in Constitution of Firm (Under Section: 63)']/parent::td/following-sibling::td[3]/a")
	private WebElement applicationsPendingInChangeInConstitutionInFirmLink;
	
	@FindBy(xpath = "//label[text()='Change in Constitution of Firm (Under Section: 63)']/parent::td/following-sibling::td[6]/a")
	private WebElement applicationsPendingBeyondSLAInChangeInConstitutionInFirmLink;
	
	@FindBy(xpath = "//footer[@class='footerBg']")
	private WebElement footerTextsAndLinks;

	public WebElement getHeaderImage() {
		return headerImage;
	}

	public WebElement getDashboardLink() {
		return dashboardLink;
	}

	public WebElement getMyPendingRequestLink() {
		return myPendingRequestLink;
	}

	public WebElement getChangePasswordLink() {
		return changePasswordLink;
	}

	public WebElement getDlfUserIdText() {
		return dlfUserIdText;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public WebElement getApplicationsPendingInFirmLink() {
		return applicationsPendingInFirmLink;
	}

	public WebElement getApplicationsApprovedInFirmLink() {
		return applicationsApprovedInFirmLink;
	}

	public WebElement getApplicationsPendingInAlterationsInFirmLink() {
		return applicationsPendingInAlterationsInFirmLink;
	}

	public WebElement getApplicationsPendingInChangeInConstitutionInFirmLink() {
		return applicationsPendingInChangeInConstitutionInFirmLink;
	}

	public WebElement getApplicationsPendingBeyondSLAInChangeInConstitutionInFirmLink() {
		return applicationsPendingBeyondSLAInChangeInConstitutionInFirmLink;
	}

	public WebElement getFooterTextsAndLinks() {
		return footerTextsAndLinks;
	}
	
	

}
