package pom_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ADB_MRO_Residence_Request_Page {

	public ADB_MRO_Residence_Request_Page(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "btnOK")
	private WebElement alertCloseButton;

	@FindBy(xpath = "//header[contains(@class,'cd-main-header')]")
	private WebElement headerImage;

	@FindBy(id = "lblrevenueHeader")
	private WebElement revenueDepartmentHeadingText;

	@FindBy(id = "lblTahsildarProcessingResidenceCertificate")
	private WebElement residenceServiceHeadingText;

	@FindBy(id = "lblRequests")
	private WebElement requestInServiceNameText;

	@FindBy(xpath = "//ul[contains(@class,'cd-top-nav')]/li[1]")
	private WebElement subHeaderNoteText;

	@FindBy(id = "SubHeaderUserControl_lbldate")
	private WebElement subHeaderDateText;

	@FindBy(xpath = "//a[text()='Home']/parent::li")
	private WebElement homeButton;

	@FindBy(xpath = "//a[text()='Logout']/parent::li")
	private WebElement logoutButton;

	@FindBy(id = "lblUserProfile")
	private WebElement userProfileText;

	@FindBy(id = "lblUserIds")
	private WebElement userIdText;

	@FindBy(id = "lblUserId")
	private WebElement userIdNameText;

	@FindBy(id = "lblRole")
	private WebElement roleText;

	@FindBy(id = "lblRoleName")
	private WebElement roleNameText;

	@FindBy(id = "lblSearchCriteria")
	private WebElement searchCriteriaText;

	@FindBy(id = "lblFromDates")
	private WebElement fromDateText;

	@FindBy(id = "txtFromDate")
	private WebElement fromDateSelect;

	@FindBy(id = "lblToDates")
	private WebElement toDateText;

	@FindBy(id = "txtToDate")
	private WebElement toDateSelect;

	@FindBy(id = "lblRequestStatus")
	private WebElement requestStautsText;

	@FindBy(id = "cmbProblemStatus")
	private WebElement requestStatusDropDown;

	@FindBy(id = "btnSearch")
	private WebElement getDetailsButton;

	@FindBy(xpath = "//span[contains(text(),'No. of records to be displayed')]")
	private WebElement noOfRecordsToBeDisplayedText;

	@FindBy(id = "ddlpagesize")
	private WebElement pageSizeDropDown;

	@FindBy(id = "lblResidenceApplicationRequestsFrom")
	private WebElement residenceApplicationRequestsFromMiniHeaderText;

	@FindBy(id = "lblFromDate")
	private WebElement fromDateMiniHeaderText;

	@FindBy(id = "lblToDate")
	private WebElement toDateMiniHeaderText;

	@FindBy(id = "lkExcel")
	private WebElement excelConvertionButton;

	@FindBy(id = "btnPDF")
	private WebElement pdfConvertionButton;

	@FindBy(id = "dgRes")
	private WebElement residenceApplicationsDataTableText;

	@FindBy(id = "footerNew")
	private WebElement footerTextAndLinks;

	public WebElement getAlertCloseButton() {
		return alertCloseButton;
	}

	public WebElement getHeaderImage() {
		return headerImage;
	}

	public WebElement getRevenueDepartmentHeadingText() {
		return revenueDepartmentHeadingText;
	}

	public WebElement getResidenceServiceHeadingText() {
		return residenceServiceHeadingText;
	}

	public WebElement getRequestInServiceNameText() {
		return requestInServiceNameText;
	}

	public WebElement getSubHeaderNoteText() {
		return subHeaderNoteText;
	}

	public WebElement getSubHeaderDateText() {
		return subHeaderDateText;
	}

	public WebElement getHomeButton() {
		return homeButton;
	}

	public WebElement getLogoutButton() {
		return logoutButton;
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

	public WebElement getFromDateText() {
		return fromDateText;
	}

	public WebElement getFromDateSelect() {
		return fromDateSelect;
	}

	public WebElement getToDateText() {
		return toDateText;
	}

	public WebElement getToDateSelect() {
		return toDateSelect;
	}

	public WebElement getRequestStautsText() {
		return requestStautsText;
	}

	public WebElement getRequestStatusDropDown() {
		return requestStatusDropDown;
	}

	public WebElement getGetDetailsButton() {
		return getDetailsButton;
	}

	public WebElement getNoOfRecordsToBeDisplayedText() {
		return noOfRecordsToBeDisplayedText;
	}

	public WebElement getPageSizeDropDown() {
		return pageSizeDropDown;
	}

	public WebElement getResidenceApplicationRequestsFromMiniHeaderText() {
		return residenceApplicationRequestsFromMiniHeaderText;
	}

	public WebElement getFromDateMiniHeaderText() {
		return fromDateMiniHeaderText;
	}

	public WebElement getToDateMiniHeaderText() {
		return toDateMiniHeaderText;
	}

	public WebElement getExcelConvertionButton() {
		return excelConvertionButton;
	}

	public WebElement getPdfConvertionButton() {
		return pdfConvertionButton;
	}

	public WebElement getResidenceApplicationsDataTableText() {
		return residenceApplicationsDataTableText;
	}

	public WebElement getFooterTextAndLinks() {
		return footerTextAndLinks;
	}


	public WebElement getLastApplicationNumbersListLink() {
		return lastApplicationNumbersListLink;
	}

	@FindBy(xpath = "(//table[@id='dgRes']/tbody/tr)[last()]/td/a[last()]")
	private WebElement lastApplicationNumbersListLink;
	
	public WebElement getNoNeedBasisRadioButton(WebDriver driver, String id) {
		return driver.findElement(By.xpath("//a[text()='"+id+"']"));
	}
	
	public WebElement getNeedBasicRadioButton(WebDriver driver,String id)
	{
		return driver.findElement(By.xpath("//a[text()='"+id+"']/ancestor::tr[1]/descendant::input[contains(@id,'dgRes_ImgDownloads')]"));
	}

}
