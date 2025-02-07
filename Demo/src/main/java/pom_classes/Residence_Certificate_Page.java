package pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Residence_Certificate_Page {
	
	public Residence_Certificate_Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "//td[@class='tsDesktop']")
	private WebElement headerImage;
	
	@FindBy(id = "lblAppDepartment")
	private WebElement departmentNameText;
	
	@FindBy(id = "lblResidenceCertificateRequest")
	private WebElement serviceNameText;
	
	@FindBy(id = "lblApplicantDetails")
	private WebElement applicantDetailsText;
	
	@FindBy(id = "btnClear")
	private WebElement clearFieldsButton;
	
	@FindBy(id = "btnCitizen")
	private WebElement searchInCitizen360Button;
	
	@FindBy(id = "lblApplicationNumber")
	private WebElement applicationNumberText;
	
	@FindBy(id = "txtApplicationNumber")
	private WebElement applicationNumberTextField;
	
	@FindBy(id = "lblAadhaarCardNo")
	private WebElement aadhaarNoText;
	
	@FindBy(id = "txtAadharNo")
	private WebElement aadhaarNoTextField;
	
	@FindBy(id = "lblApplicantName")
	private WebElement applicantNameText;
	
	@FindBy(id = "txtApplicantName")
	private WebElement applicantNameTextField;
	
	@FindBy(id = "lblFatherOrHusbandOrMotherOrGuardianName")
	private WebElement fatherOrHusbandOrMotherOrGuardianNameText;
	
	@FindBy(id = "txtFatHusName")
	private WebElement fatherOrHusbandOrMotherOrGuardianNameTextField;
	
	@FindBy(id = "lblGender")
	private WebElement genderText;
	
	@FindBy(id = "ddlGender")
	private WebElement genderDropDown;
	
	@FindBy(id = "lblDateOfBirth")
	private WebElement dateOfBirthText;
	
	@FindBy(id = "txtDateOfBirth")
	private WebElement dateOfBirthTextField;
	
	@FindBy(id = "lblPermanentAddress")
	private WebElement permanentAddressText;
	
	@FindBy(id = "lblDoorNo")
	private WebElement doorNoText;
	
	@FindBy(id = "txtPerDoorNo")
	private WebElement doorNoTextField;
	
	@FindBy(id = "lblLocalityOrLandMark")
	private WebElement localityOrLandmarkText;
	
	@FindBy(id = "txtPerLocality")
	private WebElement localityOrLandmarkTextField;
	
	@FindBy(id = "lblDistrict")
	private WebElement districtText;
	
	@FindBy(id = "ddlPerDistrict")
	private WebElement districtDropDown;
	
	@FindBy(id = "lblCommunicationMandal")
	private WebElement mandalText;
	
	@FindBy(id = "ddlPerMandal")
	private WebElement mandalDropDown;
	
	@FindBy(id = "lblVillageOrWard")
	private WebElement villageOrWardText;
	
	@FindBy(id = "ddlPerVillage")
	private WebElement villageOrWardDropDown;
	
	@FindBy(id = "lblPincode")
	private WebElement pincodeText;
	
	@FindBy(id = "txtPerPinCode")
	private WebElement pincodeTextField;
	
	@FindBy(id = "lblMobileNo")
	private WebElement mobileNoText;
	
	@FindBy(id = "txtMobile")
	private WebElement MobileNoTextField;
	
	@FindBy(id = "lblPhoneNo")
	private WebElement phoneNoText;
	
	@FindBy(id = "txtPhone")
	private WebElement phoneNoTextField;
	
	@FindBy(id = "lblDeliveryType")
	private WebElement deliveryTypeText;
	
	@FindBy(id = "ddlDelivery")
	private WebElement deliveryTypeDropDown;
	
	@FindBy(id = "lblRationCardNo")
	private WebElement rationCardNoText;
	
	@FindBy(id = "txtRationCard")
	private WebElement rationCardNoTextField;
	
	@FindBy(id = "lblResidenceCertificateDetails")
	private WebElement residenceCertificateDetailstText;
	
	@FindBy(id = "lblPurpose")
	private WebElement purposeText;
	
	@FindBy(id = "ddlPurpose")
	private WebElement purposeDropDown;
	
	@FindBy(id = "lblResidingSinceInYears")
	private WebElement residingSinceInYearsText;
	
	@FindBy(id = "lblYYMM")
	private WebElement yearAndMonthText;
	
	@FindBy(id = "txtResidingSince")
	private WebElement residingSinceTextField;
	
	@FindBy(id = "lblDocumentList")
	private WebElement documentListText;
	
	@FindBy(id = "lblNoteUploadPdfOnly")
	private WebElement documentListNoteText;
	
	@FindBy(id = "chkApp_0")
	private WebElement supportingDocumentsCheckBox;
	
	@FindBy(xpath = "//input[@id='chkApp_0']/following-sibling::label")
	private WebElement supportingDocumentsText;
	
	@FindBy(id = "fileApp")
	private WebElement supportingDocumentsFileUpload;
	
	@FindBy(id = "chkPhoto_0")
	private WebElement passportSizePhotoCheckBox;
	
	@FindBy(xpath = "//input[@id='chkPhoto_0']/following-sibling::label")
	private WebElement passportSizePhotoText;
	
	@FindBy(id = "lblPassportSizePhotoUploadPassportonlyjpgOnly")
	private WebElement passportSizePhotoNoteText;
	
	@FindBy(id = "filePhoto")
	private WebElement photoFileUpload;
	
	@FindBy(id = "lblHeightAndWidthInCM")
	private WebElement heightAndWidthText;
	
	@FindBy(id = "lblpdf")
	private WebElement uploadedDocumentNoteText;
	
	@FindBy(id = "Label3")
	private WebElement documentListToBeAttachedText;
	
	@FindBy(xpath = "//span[@id='lblImportantInstructions']/ancestor::span")
	private WebElement documentsListToBeAttachedNoteText;
	
	@FindBy(id = "btnShowPayment")
	private WebElement showPaymentButton;
	
	@FindBy(xpath = "//table[@class='footer']")
	private WebElement footerLinksAndText;

	public WebElement getHeaderImage() {
		return headerImage;
	}


	public WebElement getDepartmentNameText() {
		return departmentNameText;
	}


	public WebElement getServiceNameText() {
		return serviceNameText;
	}


	public WebElement getApplicantDetailsText() {
		return applicantDetailsText;
	}

	public WebElement getClearFieldsButton() {
		return clearFieldsButton;
	}

	public WebElement getSearchInCitizen360Button() {
		return searchInCitizen360Button;
	}

	public WebElement getApplicationNumberText() {
		return applicationNumberText;
	}

	public WebElement getApplicationNumberTextField() {
		return applicationNumberTextField;
	}

	public WebElement getAadhaarNoText() {
		return aadhaarNoText;
	}

	public WebElement getAadhaarNoTextField() {
		return aadhaarNoTextField;
	}

	public WebElement getApplicantNameText() {
		return applicantNameText;
	}

	public WebElement getApplicantNameTextField() {
		return applicantNameTextField;
	}

	public WebElement getFatherOrHusbandOrMotherOrGuardianNameText() {
		return fatherOrHusbandOrMotherOrGuardianNameText;
	}

	public WebElement getFatherOrHusbandOrMotherOrGuardianNameTextField() {
		return fatherOrHusbandOrMotherOrGuardianNameTextField;
	}

	public WebElement getGenderText() {
		return genderText;
	}

	public WebElement getGenderDropDown() {
		return genderDropDown;
	}

	public WebElement getDateOfBirthText() {
		return dateOfBirthText;
	}

	public WebElement getDateOfBirthTextField() {
		return dateOfBirthTextField;
	}

	public WebElement getPermanentAddressText() {
		return permanentAddressText;
	}

	public WebElement getDoorNoText() {
		return doorNoText;
	}

	public WebElement getDoorNoTextField() {
		return doorNoTextField;
	}

	public WebElement getLocalityOrLandmarkText() {
		return localityOrLandmarkText;
	}

	public WebElement getLocalityOrLandmarkTextField() {
		return localityOrLandmarkTextField;
	}

	public WebElement getDistrictText() {
		return districtText;
	}

	public WebElement getDistrictDropDown() {
		return districtDropDown;
	}

	public WebElement getMandalText() {
		return mandalText;
	}

	public WebElement getMandalDropDown() {
		return mandalDropDown;
	}

	public WebElement getVillageOrWardText() {
		return villageOrWardText;
	}

	public WebElement getVillageOrWardDropDown() {
		return villageOrWardDropDown;
	}

	public WebElement getPincodeText() {
		return pincodeText;
	}

	public WebElement getPincodeTextField() {
		return pincodeTextField;
	}

	public WebElement getMobileNoText() {
		return mobileNoText;
	}

	public WebElement getMobileNoTextField() {
		return MobileNoTextField;
	}

	public WebElement getPhoneNoText() {
		return phoneNoText;
	}

	public WebElement getPhoneNoTextField() {
		return phoneNoTextField;
	}

	public WebElement getDeliveryTypeText() {
		return deliveryTypeText;
	}

	public WebElement getDeliveryTypeDropDown() {
		return deliveryTypeDropDown;
	}

	public WebElement getRationCardNoText() {
		return rationCardNoText;
	}

	public WebElement getRationCardNoTextField() {
		return rationCardNoTextField;
	}


	public WebElement getResidenceCertificateDetailstText() {
		return residenceCertificateDetailstText;
	}

	public WebElement getPurposeText() {
		return purposeText;
	}

	public WebElement getPurposeDropDown() {
		return purposeDropDown;
	}

	public WebElement getResidingSinceInYearsText() {
		return residingSinceInYearsText;
	}

	public WebElement getYearAndMonthText() {
		return yearAndMonthText;
	}

	public WebElement getResidingSinceTextField() {
		return residingSinceTextField;
	}

	public WebElement getDocumentListText() {
		return documentListText;
	}

	public WebElement getDocumentListNoteText() {
		return documentListNoteText;
	}

	public WebElement getSupportingDocumentsCheckBox() {
		return supportingDocumentsCheckBox;
	}

	public WebElement getSupportingDocumentsText() {
		return supportingDocumentsText;
	}

	public WebElement getSupportingDocumentsFileUpload() {
		return supportingDocumentsFileUpload;
	}

	public WebElement getPassportSizePhotoCheckBox() {
		return passportSizePhotoCheckBox;
	}

	public WebElement getPassportSizePhotoText() {
		return passportSizePhotoText;
	}

	public WebElement getPassportSizePhotoNoteText() {
		return passportSizePhotoNoteText;
	}

	public WebElement getPhotoFileUpload() {
		return photoFileUpload;
	}

	public WebElement getHeightAndWidthText() {
		return heightAndWidthText;
	}

	public WebElement getUploadedDocumentNoteText() {
		return uploadedDocumentNoteText;
	}

	public WebElement getDocumentListToBeAttachedText() {
		return documentListToBeAttachedText;
	}

	public WebElement getDocumentsListToBeAttachedNoteText() {
		return documentsListToBeAttachedNoteText;
	}

	public WebElement getShowPaymentButton() {
		return showPaymentButton;
	}

	public WebElement getFooterLinksAndText() {
		return footerLinksAndText;
	}
	
	@FindBy(id = "lblReceivePayment")
	private WebElement receivePaymentText;
	
	@FindBy(id = "lblChallanAmount")
	private WebElement challanAmountText;
	
	@FindBy(id = "txtCertCharges")
	private WebElement challanAmountReadOnlyField;
	
	@FindBy(id = "lblUserCharges")
	private WebElement userChargesText;
	
	@FindBy(id = "txtUserCharges")
	private WebElement userChargesReadOnlyField;
	
	@FindBy(id = "lblCourierCharges")
	private WebElement courierChargesText;
	
	@FindBy(id = "txtCourier")
	private WebElement courierChargesReadOnlyField;
	
	@FindBy(id = "lblTotalAmount")
	private WebElement totalAmountText;
	
	@FindBy(id = "txtTotalAmount")
	private WebElement totalAmountReadOnlyField;
	
	@FindBy(id = "btnConfirmPayment")
	private WebElement confirmPaymentButton;
	
	@FindBy(id = "heading")
	private WebElement paymentOptionsText;
	
	@FindBy(xpath = "//span[contains(text(),'CASH')]/parent::a")
	private WebElement cashPaymentOptionLink;
	
	@FindBy(xpath = "//span[contains(text(),'TWALLET PG')]/parent::a")
	private WebElement twalletPgPaymentOptionLink;
	
	@FindBy(xpath = "//span[contains(text(),'TWALLET')]/parent::a")
	private WebElement twalletPaymentOptionLink;
	
	@FindBy(xpath = "//span[contains(text(),'HDFC PG')]/parent::a")
	private WebElement hdfcPGPaymentOptionLink;
	
	@FindBy(xpath = "//span[contains(text(),'DD')]/parent::a")
	private WebElement ddPaymentOptionLink;
	
	@FindBy(xpath = "//span[contains(text(),'SBIePAY')]/parent::a")
	private WebElement sbiepayPaymentOptionLink;
	
	@FindBy(xpath = "//span[contains(text(),'BANKS')]/parent::a")
	private WebElement banksPaymentOptionLink;
	
	@FindBy(xpath = "//span[contains(text(),'QRCODE')]/parent::a")
	private WebElement qrcodePaymentOptionLink;
	
	@FindBy(id = "paymentsubmit")
	private WebElement makePaymentButton;
	
	@FindBy(id = "paymentcancel")
	private WebElement cancelPaymentButton;

	public WebElement getReceivePaymentText() {
		return receivePaymentText;
	}

	public WebElement getChallanAmountText() {
		return challanAmountText;
	}

	public WebElement getChallanAmountReadOnlyField() {
		return challanAmountReadOnlyField;
	}

	public WebElement getUserChargesText() {
		return userChargesText;
	}

	public WebElement getUserChargesReadOnlyField() {
		return userChargesReadOnlyField;
	}

	public WebElement getCourierChargesText() {
		return courierChargesText;
	}

	public WebElement getCourierChargesReadOnlyField() {
		return courierChargesReadOnlyField;
	}

	public WebElement getTotalAmountText() {
		return totalAmountText;
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

	public WebElement getCashPaymentOptionLink() {
		return cashPaymentOptionLink;
	}

	public WebElement getTwalletPgPaymentOptionLink() {
		return twalletPgPaymentOptionLink;
	}

	public WebElement getTwalletPaymentOptionLink() {
		return twalletPaymentOptionLink;
	}

	public WebElement getHdfcPGPaymentOptionLink() {
		return hdfcPGPaymentOptionLink;
	}

	public WebElement getDdPaymentOptionLink() {
		return ddPaymentOptionLink;
	}

	public WebElement getSbiepayPaymentOptionLink() {
		return sbiepayPaymentOptionLink;
	}

	public WebElement getBanksPaymentOptionLink() {
		return banksPaymentOptionLink;
	}

	public WebElement getQrcodePaymentOptionLink() {
		return qrcodePaymentOptionLink;
	}

	public WebElement getMakePaymentButton() {
		return makePaymentButton;
	}

	public WebElement getCancelPaymentButton() {
		return cancelPaymentButton;
	}

	
	

}
