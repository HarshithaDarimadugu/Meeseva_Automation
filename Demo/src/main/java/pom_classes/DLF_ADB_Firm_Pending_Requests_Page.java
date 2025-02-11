package pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DLF_ADB_Firm_Pending_Requests_Page {
	
	public DLF_ADB_Firm_Pending_Requests_Page (WebDriver driver) {
		
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
	
	@FindBy(xpath = "//div[text()='MY REQUESTS']")
	private WebElement myRequestsText;
	
	@FindBy(xpath = "//select[@name='example_length']")
	private WebElement pageSizeDrpoDown;
	
	@FindBy(xpath = "//div[@id='example_filter']/label/input")
	private WebElement searchBarTextField;
	
	@FindBy(xpath = "//a[@id='example_previous']")
	private WebElement previousNavigationLink;
	
	@FindBy(xpath = "//a[@id='example_next']")
	private WebElement nextNavigationLink;
	
	@FindBy(xpath = "//table[@id='example']")
	private WebElement pendingRequestApplicationsTableData;
	
	@FindBy(xpath = "//table[@id='example']/tbody/tr/td[6]/a")
	private WebElement applicationActionLink;

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

	public WebElement getMyRequestsText() {
		return myRequestsText;
	}

	public WebElement getPageSizeDrpoDown() {
		return pageSizeDrpoDown;
	}

	public WebElement getSearchBarTextField() {
		return searchBarTextField;
	}

	public WebElement getPreviousNavigationLink() {
		return previousNavigationLink;
	}

	public WebElement getNextNavigationLink() {
		return nextNavigationLink;
	}

	public WebElement getPendingRequestApplicationsTableData() {
		return pendingRequestApplicationsTableData;
	}

	public WebElement getApplicationActionLink() {
		return applicationActionLink;
	}
	
	

}
