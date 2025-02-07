package pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Income_Certificate_Page {
	
	public Income_Certificate_Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "lblAppDepartment")
	private WebElement departmentNameText;
	
	@FindBy(id = "lblIncomeCertificateRequest")
	private WebElement incomeCertificateServiceText;
	
	
	@FindBy(id = "lblApplicantDetails")
	private WebElement applicantDetailsText;
	
	@FindBy(id = "btnDraft")
	private WebElement draftNavigationBarButton;
	
	@FindBy(xpath = "//span[@class='close']")
	private WebElement draftCloseButton;
	
	public WebElement getDraftCloseButton() {
		return draftCloseButton;
	}

	@FindBy(id = "btnClear")
	private WebElement clearFieldButton;
	
	@FindBy(id = "btnCitizen")
	private WebElement searchInCitizen360Button;
	
	@FindBy(id = "txtApplicationNumber")
	private WebElement applicationNumberTextField;
	
	@FindBy(id = "txtAadharNo")
	private WebElement aadhaarNoTextField;
	
	@FindBy(id = "txtApplicantName")
	private WebElement applicantNameTextField;
	
	@FindBy(id = "txtFatHusName")
	private WebElement fatherOrHusbandOrGuardianNameTextField;
	
	@FindBy(id = "txtfathUID")
	private WebElement fatherUidTextField;
	
	@FindBy(id = "txtmother")
	private WebElement motherNameTextField;
	
	@FindBy(id = "Txtmotheruid")
	private WebElement motherUidTextField;
	
	@FindBy(id = "txtRationCard")
	private WebElement rationCardNoTextField;
	
	@FindBy(id = "ddlGender")
	private WebElement genderDropDown;
	
	@FindBy(id = "txtEmail")
	private WebElement emailIdTextField;
	
	@FindBy(id = "lblPermanentAddress")
	private WebElement permanenetAddressText;
	
	@FindBy(id = "txtPerDoorNo")
	private WebElement doorNoTextField;
	
	@FindBy(id = "txtPerLocality")
	private WebElement localityOrLandmarkTextField;
	
	@FindBy(id = "ddlPerDistrict")
	private WebElement districtDropDown;
	
	@FindBy(id ="ddlPerMandal")
	private WebElement mandalDropDown;
	
	@FindBy(id = "ddlPerVillage")
	private WebElement villageOrWardDropDown;
	
	@FindBy(id = "txtPerPinCode")
	private WebElement pincodeTextField;
	
	@FindBy(id = "txtMobile")
	private WebElement mobileNoTextField;
	
	@FindBy(id = "ddlDelivery")
	private WebElement deliveryOptionsDropDown;
	
	@FindBy(id = "lblIncomeCertificateDetails")
	private WebElement incomeDetailsText;
	
	@FindBy(id = "txtLandIncome")
	private WebElement incomeOnLandOrBuildingsTextField;
	
	@FindBy(id = "txtBusinessIncome")
	private WebElement incomeOnBusinessTextField;
	
	@FindBy(id = "txtLabourIncome")
	private WebElement incomeOnLabourTextField;
	
	@FindBy(id = "txtEmpSal")
	private WebElement incomeFromSalaryTextField;
	
	@FindBy(id = "txtOtherIncome")
	private WebElement incomeOnOtherSourcesTextField;
	
	@FindBy(id = "txtTotalIncome")
	private WebElement totalIncomeReadOnlyField;
	
	@FindBy(id = "ddlPurpose")
	private WebElement purposeDropDown;
	
	@FindAll({@FindBy(id = "chkApp_0"), @FindBy(xpath = "//label[contains(text(),'Supporting Documents')]/preceding-sibling::input")})
	private WebElement supportingDocumentsCheckBox;
	
	@FindAll({@FindBy(id = "fileApp"), @FindBy(xpath = "//span[contains(@id,'lblFileBrowse')]/following-sibling::input")})
	private WebElement supportingDocumentFileUpload;
	
	@FindAll({@FindBy(id = "filePhoto"), @FindBy(xpath = "//span[contains(@id,'lblFileBrowsePhoto')]/following-sibling::input")})
	private WebElement applicantPassportSizePhotoFileUpload;
	
	@FindAll({@FindBy(id = "ChkPhoto_0"), @FindBy(xpath = "//label[contains(text(),'Passport Size photo')]/preceding-sibling::input")})
	private WebElement applicantPassportSizePhotoCheckBox;
	
	@FindBy(id = "lblPhotoFormat")
	private WebElement photoFormatText;
	
	@FindBy(id = "lblpdf" )
	private WebElement noteOfDocumentsAttachedText;
	
	@FindBy(id = "lbldoclist")
	private WebElement documentListToBeAttachedText;
	
	@FindBy(xpath =  "//tr[@id='trinstruction']//child::tr[2]")
	private WebElement importantInstructionsText;
	
	@FindBy(id = "btnShowPayment")
	private WebElement showPaymentButton;
	
	@FindBy(id = "lblReceivePayment")
	private WebElement receivePaymentText;
	
	@FindBy(id = "lblReceivePayment")
	private WebElement challanAmountReadOnlyField;
	
	@FindBy(id = "txtUserCharges")
	private WebElement userChargesReadOnlyField;
	
	@FindBy(id = "txtCourier")
	private WebElement courierChargesReadOnlyField;
	
	@FindBy(id = "txtTotalAmount")
	private WebElement totalAmountReadOnlyField;
	
	@FindBy(id = "btnConfirmPayment")
	private WebElement confirmPaymentButton;
	
	@FindBy(id = "heading")
	private WebElement paymentOptionsText;
	
	public WebElement getDepartmentNameText() {
		return departmentNameText;
	}

	public WebElement getIncomeCertificateServiceText() {
		return incomeCertificateServiceText;
	}

	public WebElement getApplicantDetailsText() {
		return applicantDetailsText;
	}

	public WebElement getDraftNavigationBarButton() {
		return draftNavigationBarButton;
	}

	public WebElement getClearFieldButton() {
		return clearFieldButton;
	}

	public WebElement getSearchInCitizen360Button() {
		return searchInCitizen360Button;
	}

	public WebElement getApplicationNumberTextField() {
		return applicationNumberTextField;
	}

	public WebElement getAadhaarNoTextField() {
		return aadhaarNoTextField;
	}

	public WebElement getApplicantNameTextField() {
		return applicantNameTextField;
	}

	public WebElement getFatherOrHusbandOrGuardianNameTextField() {
		return fatherOrHusbandOrGuardianNameTextField;
	}

	public WebElement getFatherUidTextField() {
		return fatherUidTextField;
	}

	public WebElement getMotherNameTextField() {
		return motherNameTextField;
	}

	public WebElement getMotherUidTextField() {
		return motherUidTextField;
	}

	public WebElement getRationCardNoTextField() {
		return rationCardNoTextField;
	}

	public WebElement getGenderDropDown() {
		return genderDropDown;
	}

	public WebElement getEmailIdTextField() {
		return emailIdTextField;
	}

	public WebElement getPermanenetAddressText() {
		return permanenetAddressText;
	}

	public WebElement getDoorNoTextField() {
		return doorNoTextField;
	}

	public WebElement getLocalityOrLandmarkTextField() {
		return localityOrLandmarkTextField;
	}

	public WebElement getDistrictDropDown() {
		return districtDropDown;
	}

	public WebElement getMandalDropDown() {
		return mandalDropDown;
	}

	public WebElement getVillageOrWardDropDown() {
		return villageOrWardDropDown;
	}

	public WebElement getPincodeTextField() {
		return pincodeTextField;
	}

	public WebElement getMobileNoTextField() {
		return mobileNoTextField;
	}

	public WebElement getDeliveryOptionsDropDown() {
		return deliveryOptionsDropDown;
	}

	public WebElement getIncomeDetailsText() {
		return incomeDetailsText;
	}

	public WebElement getIncomeOnLandOrBuildingsTextField() {
		return incomeOnLandOrBuildingsTextField;
	}

	public WebElement getIncomeOnBusinessTextField() {
		return incomeOnBusinessTextField;
	}

	public WebElement getIncomeOnLabourTextField() {
		return incomeOnLabourTextField;
	}

	public WebElement getIncomeFromSalaryTextField() {
		return incomeFromSalaryTextField;
	}

	public WebElement getIncomeOnOtherSourcesTextField() {
		return incomeOnOtherSourcesTextField;
	}

	public WebElement getTotalIncomeReadOnlyField() {
		return totalIncomeReadOnlyField;
	}

	public WebElement getPurposeDropDown() {
		return purposeDropDown;
	}

	public WebElement getSupportingDocumentsCheckBox() {
		return supportingDocumentsCheckBox;
	}

	public WebElement getSupportingDocumentFileUpload() {
		return supportingDocumentFileUpload;
	}

	public WebElement getApplicantPassportSizePhotoFileUpload() {
		return applicantPassportSizePhotoFileUpload;
	}

	public WebElement getApplicantPassportSizePhotoCheckBox() {
		return applicantPassportSizePhotoCheckBox;
	}

	public WebElement getPhotoFormatText() {
		return photoFormatText;
	}

	public WebElement getNoteOfDocumentsAttachedText() {
		return noteOfDocumentsAttachedText;
	}

	public WebElement getDocumentListToBeAttachedText() {
		return documentListToBeAttachedText;
	}

	public WebElement getImportantInstructionsText() {
		return importantInstructionsText;
	}

	public WebElement getShowPaymentButton() {
		return showPaymentButton;
	}

	public WebElement getReceivePaymentText() {
		return receivePaymentText;
	}

	public WebElement getChallanAmountReadOnlyField() {
		return challanAmountReadOnlyField;
	}

	public WebElement getUserChargesReadOnlyField() {
		return userChargesReadOnlyField;
	}

	public WebElement getCourierChargesReadOnlyField() {
		return courierChargesReadOnlyField;
	}

	public WebElement getTotalAmountReadOnlyField() {
		return totalAmountReadOnlyField;
	}

	public WebElement getConfirmPaymentButton() {
		return confirmPaymentButton;
	}

	public WebElement getPaymentOptionsText() {
		return paymentOptionsText;
	}

	public WebElement getCashOptionLink() {
		return cashOptionLink;
	}

	public WebElement getChequeOptionLink() {
		return chequeOptionLink;
	}

	public WebElement getCreditOrDebitCardOptionLink() {
		return creditOrDebitCardOptionLink;
	}

	public WebElement getQrCodeOptionLink() {
		return qrCodeOptionLink;
	}

	public WebElement getMakePaymentButton() {
		return makePaymentButton;
	}

	public WebElement getCashAmountReadOnlyField() {
		return cashAmountReadOnlyField;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}

	public WebElement getTwalletPaymentOptionLink() {
		return twalletPaymentOptionLink;
	}

	@FindBy(xpath = "//span[contains(text(),'CASH')]//parent::a")
	private WebElement cashOptionLink;
	
	@FindBy(xpath =  "//span[contains(text(),'CHEQUE')]//parent::a")
	private WebElement chequeOptionLink;
	
	@FindBy(xpath =  "//span[contains(text(),'CREDIT/DEBIT CARD')]//parent::a")
	private WebElement creditOrDebitCardOptionLink;
	
	@FindBy(xpath = "//span[contains(text(),'QRCODE')]//parent::a")
	private WebElement qrCodeOptionLink;
	
	@FindBy(id = "//span[contains(text(),'TWALLET')]/parent::a")
	private WebElement twalletPaymentOptionLink;
	
	@FindBy(id = "paymentsubmit")
	private WebElement makePaymentButton;
	
	@FindBy(id = "paymentcancel")
	private WebElement cancelButton;
	
	@FindBy(id = "cashAmtTxt")
	private WebElement cashAmountReadOnlyField;
	
	@FindBy(id = "lblIncomeCertificateApplicationReceipt")
	private WebElement incomePaymentReceiptText;

	public WebElement getIncomePaymentReceiptText() {
		return incomePaymentReceiptText;
	}
	
	

}
