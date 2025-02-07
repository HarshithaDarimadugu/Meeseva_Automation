package pom_classes;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ADB_DYMRO_Income_Request_Page {

	public ADB_DYMRO_Income_Request_Page (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "lblUserProfile")
	private WebElement userProfileText;
	
	@FindBy(id = "lblIncomeUserID")
	private WebElement userIdText;
	
	@FindBy(id = "lblUserId")
	private WebElement userIdNameText;
	
	@FindBy(id = "lblRole")
	private WebElement roleText;
	
	@FindBy(id = "lblRoleName")
	private WebElement roleNameText;
	
	@FindBy(id = "lblSearchCriteria")
	private WebElement searchCriteriaText;
	
	@FindBy(id = "lblIncomeFromDate")
	private WebElement fromDateText;
	
	@FindBy(id = "txtFromDate")
	private WebElement fromDateTextField;
	
	@FindBy(id = "lblCrackerLicencToDate")
	private WebElement toDateText;
	
	@FindBy(id = "txtToDate")
	private WebElement toDateTextField;
	
	@FindBy(id = "lblRequestStatus")
	private WebElement requestStatusText;
	
	@FindBy(id = "cmbProblemStatus")
	private WebElement requestStatusDropDown;
	
	@FindBy(id = "btnSearch")
	private WebElement getDetailsButton;
	
	@FindBy(id = "//span[contains(text(),'No. of Records')]")
	private WebElement noOfRecordsDisplayedText;
	
	@FindBy(id = "ddlpagesize")
	private WebElement pageSizeDropDown;
	
	@FindBy(id = "(//td[contains(@class,'tab-mini-hd')])[1]")
	private WebElement incomeRequestsFromAndToDateText;
	
	@FindBy(id = "lkExcel")
	private WebElement excelButton;
	
	@FindBy(id = "btnPDF")
	private WebElement pdfButton; 
	
	@FindBy(id = "lblSearch")
	private WebElement applicationNoText;
	
	@FindBy(id = "txtApplicationNO")
	private WebElement applicationNoSearchTextField;
	
	@FindBy(id = "btnAppSubmit")
	private WebElement submitButton;
	
	@FindBy(id = "dgMutation")
	private List<WebElement>  openStatusApplicationDetailsTable;
	
	@FindBy(xpath = "//input[contains(@id,'dgMutation_ImgDownloads')]")
	private List<WebElement> needBasisRadioButton;
	
	@FindBy(id = "ButtonPending")
	private WebElement noOfToBeReviewedHeaderText;
	
	@FindBy(id = "dgMutationPending")
	private List<WebElement> reviewedStatusApplicationDetailsTable;
	
	@FindBy(xpath = "//div[contains(@class,'app_box nav-justified1')]")
	private List<WebElement> countAndNameOfApplicationTable;
	
	@FindBy(xpath = "//div[@class='sub-header']/child::h2")
	private WebElement subHeaderText;
	
	@FindBy(xpath = "//ul[@class='cd-top-nav']/child::li[1]")
	private WebElement noteText;
	
	@FindBy(xpath = "//a[contains(text(),'Home')]/parent::li")
	private WebElement homeLink;
	
	@FindBy(xpath = "//a[contains(text(),'Logout')]/parent::li")
	private WebElement logoutLink;

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

	public WebElement getFromDateText() {
		return fromDateText;
	}

	public WebElement getFromDateTextField() {
		return fromDateTextField;
	}

	public WebElement getToDateText() {
		return toDateText;
	}

	public WebElement getToDateTextField() {
		return toDateTextField;
	}

	public WebElement getRequestStatusText() {
		return requestStatusText;
	}

	public WebElement getRequestStatusDropDown() {
		return requestStatusDropDown;
	}

	public WebElement getGetDetailsButton() {
		return getDetailsButton;
	}

	public WebElement getNoOfRecordsDisplayedText() {
		return noOfRecordsDisplayedText;
	}

	public WebElement getPageSizeDropDown() {
		return pageSizeDropDown;
	}

	public WebElement getIncomeRequestsFromAndToDateText() {
		return incomeRequestsFromAndToDateText;
	}

	public WebElement getExcelButton() {
		return excelButton;
	}

	public WebElement getPdfButton() {
		return pdfButton;
	}

	public WebElement getApplicationNoText() {
		return applicationNoText;
	}

	public WebElement getApplicationNoSearchTextField() {
		return applicationNoSearchTextField;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	public List<WebElement> getOpenStatusApplicationDetailsTable() {
		return openStatusApplicationDetailsTable;
	}

	public List<WebElement> getNeedBasisRadioButton() {
		return needBasisRadioButton;
	}

	public WebElement getNoOfToBeReviewedHeaderText() {
		return noOfToBeReviewedHeaderText;
	}

	public List<WebElement> getReviewedStatusApplicationDetailsTable() {
		return reviewedStatusApplicationDetailsTable;
	}

	public List<WebElement> getCountAndNameOfApplicationTable() {
		return countAndNameOfApplicationTable;
	}

	public WebElement getSubHeaderText() {
		return subHeaderText;
	}

	public WebElement getNoteText() {
		return noteText;
	}

	public WebElement getHomeLink() {
		return homeLink;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}
	
	
	
	
	
	
	
	
	
}
