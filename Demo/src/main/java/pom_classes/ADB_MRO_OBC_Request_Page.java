package pom_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ADB_MRO_OBC_Request_Page {
	
	public ADB_MRO_OBC_Request_Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "lblUserIds")
	private WebElement userIdText;
	
	@FindBy(id = "lblUserId")
	private WebElement userIdNameText;
	
	@FindBy(id = "lblRole")
	private WebDriver roleText;
	
	@FindBy(id = "lblRoleName")
	private WebDriver roleNameText;
	
	@FindBy(id = "lblFromDates")
	private WebElement fromDateText;
	
	@FindBy(id = "txtFromDate")
	private WebElement fromDateTextField;
	
	@FindBy(id = "lblToDates")
	private WebElement toDateText;
	
	@FindBy(id = "txtToDate")
	private WebElement toDateTextField;
	
	@FindBy(id = "lblRequestStatus")
	private WebElement requestStatusText;
	
	@FindBy(id = "ddlProblemStatus")
	private WebElement requestStatusDropDown;
	
	@FindBy(id = "btnSearch")
	private WebElement getDetailsButton;
	
	@FindBy(id = "lblNumberofRecords")
	private WebElement noOfRecordsDisplayedText;
	
	@FindBy(id = "ddlpagesize")
	private WebElement pageSizeDropDown;
	
	public WebElement getNeedBasicRadioButton(WebDriver driver,String id)
	{
		return driver.findElement(By.xpath("//a[text()='"+id+"']/ancestor::tr[1]/descendant::input[contains(@id,'gvObc_ImgDownloads')]"));
	}

	public WebElement getUserIdText() {
		return userIdText;
	}

	public WebElement getUserIdNameText() {
		return userIdNameText;
	}

	public WebDriver getRoleText() {
		return roleText;
	}

	public WebDriver getRoleNameText() {
		return roleNameText;
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
	
	@FindBy(id = "lblOBCApplicationRequestsFrom")
	private WebElement obcApplicationRequestFromText;
	
	@FindBy(id = "lblFromDate")
	private WebElement fromDateValueText;
	
	@FindBy(id = "lblToDate")
	private WebElement toDateValueText;
	
	@FindBy(id = "lkExcel")
	private WebElement excelButton;
	
	@FindBy(id = "btnPDF")
	private WebElement pdfButton; 
	
	public WebElement getObcApplicationRequestFromText() {
		return obcApplicationRequestFromText;
	}

	public WebElement getFromDateValueText() {
		return fromDateValueText;
	}

	public WebElement getToDateValueText() {
		return toDateValueText;
	}

	public WebElement getExcelButton() {
		return excelButton;
	}

	public WebElement getPdfButton() {
		return pdfButton;
	}

	public WebElement getNoOfRecordsReviewedText() {
		return noOfRecordsReviewedText;
	}

	public WebElement getFooterLinksAndText() {
		return footerLinksAndText;
	}

	@FindBy(id = "ButtonPending")
	private WebElement noOfRecordsReviewedText;
	
	@FindBy(xpath = "//table[@class='footerNew']")
	private WebElement footerLinksAndText;
	
	@FindBy(id = "lblrevenueHeader")
	private WebElement departmentNameText;
	
	@FindBy(id = "lblTahsildarProcessingOBCCertificate")
	private WebElement serviceNameText;
	
	@FindBy(xpath = "//ul[@class='cd-top-nav']/li[1]")
	private WebElement noteTextWithFromAndToDateText;
	
	@FindBy(xpath = "//a[text()='Home']/parent::li")
	private WebElement homeButton;
	
	@FindBy(xpath = "//a[text()='Logout']/parent::li")
	private WebElement logoutButton;

	public WebElement getDepartmentNameText() {
		return departmentNameText;
	}

	public WebElement getServiceNameText() {
		return serviceNameText;
	}

	public WebElement getNoteTextWithFromAndToDateText() {
		return noteTextWithFromAndToDateText;
	}

	public WebElement getHomeButton() {
		return homeButton;
	}

	public WebElement getLogoutButton() {
		return logoutButton;
	}
	
//	@FindBy(xpath = "//a[contains(@id,'gvObc_hypId')]")
//	private WebElement noNeedBasisRadioButton;

	public WebElement getNoNeedBasisRadioButton(WebDriver driver, String id) {
		return driver.findElement(By.xpath("//a[text()='"+id+"']"));
	}
	
	@FindBy(xpath = "//input[contains(@id,'gvObc_ImgDownloads')]")
	private WebElement needBasisRadioButton;

	public WebElement getNeedBasisRadioButton() {
		return needBasisRadioButton;
	}
	
	@FindBy(xpath = "//tr[contains(@class,'gridbg1')]/descendant::td/input[contains(@id,'gvObc_ImgDownloads')]")
	private WebElement radioButton;

	public WebElement getRadioButton() {
		return radioButton;
	}
	
	

}
