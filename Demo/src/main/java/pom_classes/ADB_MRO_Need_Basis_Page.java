package pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ADB_MRO_Need_Basis_Page {
	
	public ADB_MRO_Need_Basis_Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(),'HOME')]")
	private WebElement homeLink;
	
	@FindBy(xpath = "//a[contains(text(),'LOGOUT')]")
	private WebElement logoutLink;
	
	@FindBy(id = "lblTransactionReopenProcess")
	private WebElement needBasisText;
	
	@FindBy(id = "lblUserProfile")
	private WebElement userProfileText;
	
	@FindBy(id = "lblTRPUserId")
	private WebElement userIdText;
	
	@FindBy(id = "lblUserId")
	private WebElement userIdNameText;
	
	@FindBy(id = "lblRole")
	private WebElement roleText;
	
	@FindBy(id = "lblRoleName")
	private WebElement roleNameText;
	
	@FindBy(id = "lblSearchCriteria")
	private WebElement searchCriteriaText;
	
	@FindBy(id = "lblApplicationNoOrTransactionId")
	private WebElement applicationNoText;
	
	@FindBy(id = "txtApplNo")
	private WebElement applicationNoTextField;
	
	@FindBy(id = "gvEbc")
	private WebElement applicationNoDataTable;
	
	@FindBy(id = "lblRemarks")
	private WebElement remarksText;
	
	public WebElement getHomeLink() {
		return homeLink;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public WebElement getNeedBasisText() {
		return needBasisText;
	}

	public WebElement getUserProfileText() {
		return userProfileText;
	}

	public WebElement getUserIdText() {
		return userIdText;
	}

	public WebElement getUserIdNameText() {
		return userIdNameText;
	}

	public WebElement getRoleText() {
		return roleText;
	}

	public WebElement getRoleNameText() {
		return roleNameText;
	}

	public WebElement getSearchCriteriaText() {
		return searchCriteriaText;
	}

	public WebElement getApplicationNoText() {
		return applicationNoText;
	}

	public WebElement getApplicationNoTextField() {
		return applicationNoTextField;
	}

	public WebElement getApplicationNoDataTable() {
		return applicationNoDataTable;
	}

	public WebElement getRemarksText() {
		return remarksText;
	}

	public WebElement getRemarksTextField() {
		return remarksTextField;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	public WebElement getBackButton() {
		return backButton;
	}

	public WebElement getFooterText() {
		return footerText;
	}

	@FindBy(id = "txtRemarks")
	private WebElement remarksTextField;
	
	@FindBy(id = "btnProceed")
	private WebElement submitButton;
	
	@FindBy(id = "btnBack")
	private WebElement backButton;
	
	@FindBy(id = "//table[@class='footer']")
	private WebElement footerText;
	
	@FindBy(xpath = "//table[@id='gvEbc']/tbody/tr/th")
	private WebElement needBasisTableHeadersText;
	
	@FindBy(xpath = "//table[@id='gvEbc']/tbody/tr/td")
	private WebElement needBasisTableDataText;

	public WebElement getNeedBasisTableHeadersText() {
		return needBasisTableHeadersText;
	}

	public WebElement getNeedBasisTableDataText() {
		return needBasisTableDataText;
	}
	
	

}
