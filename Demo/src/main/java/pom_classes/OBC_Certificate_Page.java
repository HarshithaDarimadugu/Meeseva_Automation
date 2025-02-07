package pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OBC_Certificate_Page {
	
	public OBC_Certificate_Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//td[@class='tsDesktop']")
	private WebElement mainNavigationBarImage;
	
	@FindBy(xpath = "//td[@class='tab-hd']")
	private WebElement departmentWithServiceNameText;
	
	@FindBy(id = "lblApplicantDetails")
	private WebElement applicantDetailsText;
	
	@FindBy(id = "btnClear")
	private WebElement clearFieldsButton;
	
	@FindBy(id = "btnCitizen")
	private WebElement searchInCitizen360Button;
	
	@FindBy(id = "lblApplicationNumber")
	private WebElement applicationNumberText;
	
	@FindBy(id = "txtApplicationNo")
	private WebElement applicationNoTextField;
	
	@FindBy(id = "lblAadhaarCardNo")
	private WebElement aadhaarNoText;
	
	@FindBy(id = "txtAadharNo")
	private WebElement aadhaarNoTextField;
	
	@FindBy(id = "lblApplicantName")
	private WebElement applicantNameText;
	
	@FindBy(id = "txtAppName")
	private WebElement applicantNameTextField;
	
	@FindBy(id = "lblGender")
	private WebElement genderText;
	
	@FindBy(id = "ddlGender")
	private WebElement genderDropDown;
	
	@FindBy(id = "lblRelation")
	private WebElement relationshipText;
	
	@FindBy(id = "ddlRelation")
	private WebElement relationshipCategoryDropDown;
	
	@FindBy(id = "txtFather")
	private WebElement relationshipWithPersonNameTextField;
	
	@FindBy(id = "lblDateOfBirth")
	private WebElement dateOfBirthText;
	
	@FindBy(id = "txtDob")
	private WebElement dateOfBirthSelectField;
	
	@FindBy(id = "lblEmailID")
	private WebElement emailIdText;
	
	@FindBy(id = "txtEmail")
	private WebElement emailIdTextField;
	
	@FindBy(id = "lblRationCardNo")
	private WebElement rationCardNoText;
	
	@FindBy(id = "txtRationCard")
	private WebElement rationCardNoTextField;
	
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
	
	@FindBy(id = "lblOBCCommunicationDistrict")
	private WebElement districtText;
	
	@FindBy(id = "ddlPerDistrict")
	private WebElement districtDropDown;
	
	@FindBy(id = "lblCommunicationMandal")
	private WebElement mandalText;
	
	@FindBy(id = "ddlPerMandal")
	private WebElement mandalDropDown;
	
	@FindBy(id = "lblOBCVillageOrWard")
	private WebElement villageOrWardText;
	
	@FindBy(id = "ddlPerVillage")
	private WebElement villageOrWardDropDown;
	
	@FindBy(id = "lblCommunicationPinCode")
	private WebElement pincodeText;
	
	@FindBy(id = "txtPerPincode")
	private WebElement pincodeTextField;
	
	@FindBy(id = "lblMobileNo")
	private WebElement mobileNoText;
	
	@FindBy(id = "txtMobile")
	private WebElement mobileNoTextField;
	
	@FindBy(id = "lblPhoneNo")
	private WebElement phoneNoText;
	
	@FindBy(id = "txtPhone")
	private WebElement phoneNoTextField;
	
	@FindBy(id = "lblDeliveryType")
	private WebElement deliveryTypeText;
	
	@FindBy(id = "ddlDelivery")
	private WebElement deliveryTypeDropDown;
	
	@FindBy(id = "lblCasteCertificate")
	private WebElement casteCertificateText;
	
	@FindBy(xpath = "//td[contains(text(),'State')]")
	private WebElement stateText;
	
	@FindBy(id = "ddlPerState")
	private WebElement stateDropDown;
	
	@FindBy(id = "lblIssuedCasteCertificateInPast")
	private WebElement issuedCasteCertificateInPastText;
	
	@FindBy(id = "ddlIssuedCertificate")
	private WebElement issuedCasteCertificateInPastDropDown;
	
	@FindBy(id = "lblCasteClaimed")
	private WebElement casteClaimedText;
	
	@FindBy(id = "ddlCasteClaimed")
	private WebElement casteClaimedDropDown;
	
	@FindBy(id = "lblCasteCategory")
	private WebElement casteCategoryText;
	
	@FindBy(id = "txtCasteCategory")
	private WebElement casteCategoryReadOnlyField;
	
	@FindBy(id = "lblEducationCertificateContainsCaste")
	private WebElement educationCertificateContainsCasteText;
	
	@FindBy(id = "ddlEcaste")
	private WebElement educationCertificateContainsCasteDropDown;
	
	@FindBy(id = "lblPurposeofCasteCertificate")
	private WebElement purposeOfCasteCertificateText;
	
	@FindBy(id = "ddlPurpose")
	private WebElement purposeOfCasteCertificateDropDown;
	
	@FindBy(id = "lblReligion")
	private WebElement religionText;
	
	@FindBy(id = "ddlReligion")
	private WebElement religionDropDown;
	
	@FindBy(id = "lblFamilyIncome")
	private WebElement familyIncomeText;
	
	@FindBy(id = "txtIncome")
	private WebElement familyIncomeTextField;
	
	@FindBy(id = "lblDocumentsList")
	private WebElement documentListText;
	
	@FindBy(id = "lblUploadDocsNote")
	private WebElement documentNoteText;
	
	@FindBy(id = "chkOBCApp_0")
	private WebElement applicationFormCheckBox;
	
	@FindBy(xpath = "//label[contains(text(),'Application Form')]")
	private WebElement applicationFormText;
	
	@FindBy(id = "FileOBCApp")
	private WebElement applicationFormFileUpload;
	
	@FindBy(id = "chkOBCRation_0")
	private WebElement rationOrAadhaarOrVoterCardCheckBox;
	
	@FindBy(xpath = "//label[contains(text(),'Ration Card / Aadhaar')]")
	private WebElement rationOrAadhaarOrVoterCardText;
	
	@FindBy(id = "FileOBCRation")
	private WebElement rationOrAadhaarOrVoterCardFileUpload;
	
	@FindBy(id = "chkOBCProperty_0")
	private WebElement applicantFatherOrMotherPropertyCheckBox;
	
	@FindBy(xpath = "//label[contains(text(),'Applicant Father / Mother property')]")
	private WebElement applicantFatherOrMotherPropertyText;
	
	@FindBy(id = "FileOBCProperty")
	private WebElement applicantFatherOrMotherPropertyFileUpload;
	
	@FindBy(id = "chkOBCEmp_0")
	private WebElement applicantFatherOrMotherEmploymentCheckBox;
	
	@FindBy(xpath = "//label[contains(text(),'Applicant Father/Mother Employment')]")
	private WebElement applicantFatherOrMotherEmploymentText;
	
	@FindBy(id = "FileOBCEmp")
	private WebElement applicantFatherOrMotherEmploymentFileUpload;
	
	@FindBy(id = "chkDec")
	private WebElement declarationCheckBox;
	
	@FindBy(xpath = "//input[@id='chkDec']/following-sibling::label")
	private WebElement declarationText;
	
	@FindBy(id = "btnSubmit")
	private WebElement showPaymentButton;
	
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
	
	@FindBy(id = "txtFinalAmount")
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

	public WebElement getMainNavigationBarImage() {
		return mainNavigationBarImage;
	}

	public WebElement getDepartmentWithServiceNameText() {
		return departmentWithServiceNameText;
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

	public WebElement getApplicationNoTextField() {
		return applicationNoTextField;
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

	public WebElement getGenderText() {
		return genderText;
	}

	public WebElement getGenderDropDown() {
		return genderDropDown;
	}

	public WebElement getRelationshipText() {
		return relationshipText;
	}

	public WebElement getRelationshipCategoryDropDown() {
		return relationshipCategoryDropDown;
	}

	public WebElement getRelationshipWithPersonNameTextField() {
		return relationshipWithPersonNameTextField;
	}

	public WebElement getDateOfBirthText() {
		return dateOfBirthText;
	}

	public WebElement getDateOfBirthSelectField() {
		return dateOfBirthSelectField;
	}

	public WebElement getEmailIdText() {
		return emailIdText;
	}

	public WebElement getEmailIdTextField() {
		return emailIdTextField;
	}

	public WebElement getRationCardNoText() {
		return rationCardNoText;
	}

	public WebElement getRationCardNoTextField() {
		return rationCardNoTextField;
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
		return mobileNoTextField;
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

	public WebElement getCasteCertificateText() {
		return casteCertificateText;
	}

	public WebElement getStateText() {
		return stateText;
	}

	public WebElement getStateDropDown() {
		return stateDropDown;
	}

	public WebElement getIssuedCasteCertificateInPastText() {
		return issuedCasteCertificateInPastText;
	}

	public WebElement getIssuedCasteCertificateInPastDropDown() {
		return issuedCasteCertificateInPastDropDown;
	}

	public WebElement getCasteClaimedText() {
		return casteClaimedText;
	}

	public WebElement getCasteClaimedDropDown() {
		return casteClaimedDropDown;
	}

	public WebElement getCasteCategoryText() {
		return casteCategoryText;
	}

	public WebElement getCasteCategoryReadOnlyField() {
		return casteCategoryReadOnlyField;
	}

	public WebElement getEducationCertificateContainsCasteText() {
		return educationCertificateContainsCasteText;
	}

	public WebElement getEducationCertificateContainsCasteDropDown() {
		return educationCertificateContainsCasteDropDown;
	}

	public WebElement getPurposeOfCasteCertificateText() {
		return purposeOfCasteCertificateText;
	}

	public WebElement getPurposeOfCasteCertificateDropDown() {
		return purposeOfCasteCertificateDropDown;
	}

	public WebElement getReligionText() {
		return religionText;
	}

	public WebElement getReligionDropDown() {
		return religionDropDown;
	}

	public WebElement getFamilyIncomeText() {
		return familyIncomeText;
	}

	public WebElement getFamilyIncomeTextField() {
		return familyIncomeTextField;
	}

	public WebElement getDocumentListText() {
		return documentListText;
	}

	public WebElement getDocumentNoteText() {
		return documentNoteText;
	}

	public WebElement getApplicationFormCheckBox() {
		return applicationFormCheckBox;
	}

	public WebElement getApplicationFormText() {
		return applicationFormText;
	}

	public WebElement getApplicationFormFileUpload() {
		return applicationFormFileUpload;
	}

	public WebElement getRationOrAadhaarOrVoterCardCheckBox() {
		return rationOrAadhaarOrVoterCardCheckBox;
	}

	public WebElement getRationOrAadhaarOrVoterCardText() {
		return rationOrAadhaarOrVoterCardText;
	}

	public WebElement getRationOrAadhaarOrVoterCardFileUpload() {
		return rationOrAadhaarOrVoterCardFileUpload;
	}

	public WebElement getApplicantFatherOrMotherPropertyCheckBox() {
		return applicantFatherOrMotherPropertyCheckBox;
	}

	public WebElement getApplicantFatherOrMotherPropertyText() {
		return applicantFatherOrMotherPropertyText;
	}

	public WebElement getApplicantFatherOrMotherPropertyFileUpload() {
		return applicantFatherOrMotherPropertyFileUpload;
	}

	public WebElement getApplicantFatherOrMotherEmploymentCheckBox() {
		return applicantFatherOrMotherEmploymentCheckBox;
	}

	public WebElement getApplicantFatherOrMotherEmploymentText() {
		return applicantFatherOrMotherEmploymentText;
	}

	public WebElement getApplicantFatherOrMotherEmploymentFileUpload() {
		return applicantFatherOrMotherEmploymentFileUpload;
	}

	public WebElement getDeclarationCheckBox() {
		return declarationCheckBox;
	}

	public WebElement getDeclarationText() {
		return declarationText;
	}

	public WebElement getShowPaymentButton() {
		return showPaymentButton;
	}

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
