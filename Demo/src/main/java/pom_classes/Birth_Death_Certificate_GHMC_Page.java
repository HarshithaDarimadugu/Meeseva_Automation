package pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Birth_Death_Certificate_GHMC_Page {
	
	public Birth_Death_Certificate_GHMC_Page (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	// created the locators only for birth application 
	
	@FindBy(xpath = "//td[@class='tsDesktop']")
	private WebElement headerImage;
	
	public WebElement getHeaderImage() {
		return headerImage;
	}

	public WebElement getDepartmentWithServiceNameText() {
		return departmentWithServiceNameText;
	}

	public WebElement getImportantInstructionText() {
		return importantInstructionText;
	}

	public WebElement getInstructionNoteText() {
		return instructionNoteText;
	}

	public WebElement getServiceTypeText() {
		return serviceTypeText;
	}

	public WebElement getServiceTypeDropDown() {
		return serviceTypeDropDown;
	}

	public WebElement getAcknowledgementNoText() {
		return acknowledgementNoText;
	}

	public WebElement getAcknowledgementNoTextField() {
		return acknowledgementNoTextField;
	}

	public WebElement getGetDetailsButton() {
		return getDetailsButton;
	}

	public WebElement getAcknowledgementNodateOfBirthText() {
		return acknowledgementNodateOfBirthText;
	}

	

	public WebElement getAcknowledgementNodateOfBirthSelect() {
		return acknowledgementNodateOfBirthSelect;
	}

	public WebElement getAcknowledgementNoRegistrationNoText() {
		return acknowledgementNoRegistrationNoText;
	}

	public WebElement getRegistrationNoTextField() {
		return registrationNoTextField;
	}

	public WebElement getCircleNoWithNameText() {
		return circleNoWithNameText;
	}

	public WebElement getCircleNoWithNameDropDown() {
		return circleNoWithNameDropDown;
	}

	public WebElement getAcknowledgementNoGenderText() {
		return acknowledgementNoGenderText;
	}

	public WebElement getGenderDropDown() {
		return genderDropDown;
	}

	public WebElement getAcknowledgementNoMotherNameText() {
		return acknowledgementNoMotherNameText;
	}

	public WebElement getMotherNameTextField() {
		return motherNameTextField;
	}

	public WebElement getAcknowledgementNoFatherNameText() {
		return acknowledgementNoFatherNameText;
	}

	public WebElement getFatherNameTextField() {
		return fatherNameTextField;
	}

	public WebElement getAcknowledgementNoGetDetailsButton() {
		return acknowledgementNoGetDetailsButton;
	}

	public WebElement getFooterLinkOfAcknowledgementNoPage() {
		return footerLinkOfAcknowledgementNoPage;
	}

	public WebElement getSelectBirthOrDeathRecordText() {
		return selectBirthOrDeathRecordText;
	}

	public WebElement getCheckBoxInAcknowledgementNumber() {
		return checkBoxInAcknowledgementNumber;
	}

	public WebElement getSubmitButtonInAcknowledgementPage() {
		return submitButtonInAcknowledgementPage;
	}

	public WebElement getApplicantDetailsText() {
		return applicantDetailsText;
	}

	public WebElement getOldApplicationNoText() {
		return oldApplicationNoText;
	}

	public WebElement getOldApplicationNoValueText() {
		return oldApplicationNoValueText;
	}

	public WebElement getAcknowledgementNoInApplicantDetailsText() {
		return acknowledgementNoInApplicantDetailsText;
	}

	public WebElement getAcknowledgementNoValueInApplicationDetailsText() {
		return acknowledgementNoValueInApplicationDetailsText;
	}

	public WebElement getRegistrationNoText() {
		return registrationNoText;
	}

	public WebElement getRegistrationNoValueText() {
		return registrationNoValueText;
	}

	public WebElement getChildNameText() {
		return childNameText;
	}

	public WebElement getChildNameValueText() {
		return childNameValueText;
	}

	public WebElement getDateOfBirthText() {
		return dateOfBirthText;
	}


	public WebElement getApplicantDateOfBirthValueText() {
		return applicantDateOfBirthValueText;
	}

	public WebElement getGenderNameText() {
		return genderNameText;
	}

	public WebElement getGenderValueText() {
		return genderValueText;
	}

	public WebElement getCircleNameText() {
		return circleNameText;
	}

	public WebElement getCircleNameValueText() {
		return circleNameValueText;
	}

	public WebElement getWardNameText() {
		return wardNameText;
	}

	public WebElement getWardNameValueText() {
		return wardNameValueText;
	}

	public WebElement getLocalityNameText() {
		return localityNameText;
	}

	public WebElement getLocalityNameValueText() {
		return localityNameValueText;
	}

	public WebElement getFatherNameText() {
		return fatherNameText;
	}

	public WebElement getFatherNameValueText() {
		return fatherNameValueText;
	}

	public WebElement getMotherNameText() {
		return motherNameText;
	}

	public WebElement getMotherNameValueText() {
		return motherNameValueText;
	}

	public WebElement getResidenceAddressText() {
		return residenceAddressText;
	}

	public WebElement getResidenceAddressValueText() {
		return residenceAddressValueText;
	}

	public WebElement getPermanenetAddressText() {
		return permanenetAddressText;
	}

	public WebElement getPermanentAddressValueText() {
		return permanentAddressValueText;
	}

	public WebElement getRegistrationDateText() {
		return registrationDateText;
	}

	public WebElement getRegistrationDateValueText() {
		return registrationDateValueText;
	}

	public WebElement getPlaceOfBirthText() {
		return placeOfBirthText;
	}

	public WebElement getPlaceOfBirthValueText() {
		return placeOfBirthValueText;
	}

	public WebElement getRemarksText() {
		return remarksText;
	}

	public WebElement getRemarksValueText() {
		return remarksValueText;
	}

	public WebElement getInformantDetailsText() {
		return informantDetailsText;
	}

	public WebElement getInformantNameText() {
		return informantNameText;
	}

	public WebElement getInformantNameTextField() {
		return informantNameTextField;
	}

	public WebElement getInformantRelationshipText() {
		return informantRelationshipText;
	}

	public WebElement getInformantRelationshipTextField() {
		return informantRelationshipTextField;
	}

	public WebElement getInformantAddressText() {
		return informantAddressText;
	}

	public WebElement getInformantAddressTextField() {
		return informantAddressTextField;
	}

	public WebElement getMobileNoText() {
		return mobileNoText;
	}

	public WebElement getMobileNoTextField() {
		return mobileNoTextField;
	}

	public WebElement getAadhaarNOtext() {
		return aadhaarNOtext;
	}

	public WebElement getAadhaarNoTextField() {
		return aadhaarNoTextField;
	}

	public WebElement getRationCardNoText() {
		return rationCardNoText;
	}

	public WebElement getRationcardNoTextField() {
		return rationcardNoTextField;
	}

	public WebElement getEmailIdText() {
		return emailIdText;
	}

	public WebElement getEmailIdTextField() {
		return emailIdTextField;
	}

	public WebElement getInformantRemarksText() {
		return informantRemarksText;
	}

	public WebElement getInformantRemarksTextField() {
		return informantRemarksTextField;
	}

	public WebElement getPincodeText() {
		return pincodeText;
	}

	public WebElement getPincodeTextField() {
		return pincodeTextField;
	}

	public WebElement getDeliveryTypeText() {
		return deliveryTypeText;
	}

	public WebElement getDeliveryTypeDropDown() {
		return deliveryTypeDropDown;
	}

	public WebElement getPurposeText() {
		return purposeText;
	}

	public WebElement getPurposeTextField() {
		return purposeTextField;
	}

	public WebElement getNoOfCopiesText() {
		return noOfCopiesText;
	}

	public WebElement getNoOfCopiesTextField() {
		return noOfCopiesTextField;
	}

	public WebElement getDocumentListText() {
		return documentListText;
	}

	public WebElement getDocumentListNoteText() {
		return documentListNoteText;
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

	public WebElement getShowPaymentButton() {
		return showPaymentButton;
	}

	public WebElement getBirthAndDeathDetailsPageFooterLinksAndText() {
		return birthAndDeathDetailsPageFooterLinksAndText;
	}

	@FindBy(xpath = "//span[@id='lblBirthOrDeathCertificateRequest']/parent::td")
	private WebElement departmentWithServiceNameText;
	
	@FindBy(id = "lblImportantInstructions")
	private WebElement importantInstructionText;
	
	@FindBy(id = "lblOnceTheCertificateIsPrinted")
	private WebElement instructionNoteText;
	
	@FindBy(id = "lblServiceType")
	private WebElement serviceTypeText;
	
	@FindBy(id = "ddlServiceType")
	private WebElement serviceTypeDropDown;
	
	@FindBy(id = "lblAcknowledgementNo")
	private WebElement acknowledgementNoText;
	
	@FindBy(xpath = "//span[@id='lblSearch']/parent::a")
	private WebElement acknowledgementNoTextField;
	
	@FindBy(id = "btnGetDetails")
	private WebElement getDetailsButton;
	
	@FindBy(id = "lblEventDate")
	private WebElement acknowledgementNodateOfBirthText;
	
	@FindBy(id = "txtDOB")
	private WebElement acknowledgementNodateOfBirthSelect;
	
	@FindBy(id = "lblRegistrationNo")
	private WebElement acknowledgementNoRegistrationNoText;
	
	@FindBy(id = "txtRegNo")
	private WebElement registrationNoTextField;
	
	@FindBy(id = "lblCircleNo")
	private WebElement circleNoWithNameText;
	
	@FindBy(id = "ddlCircle")
	private WebElement circleNoWithNameDropDown;
	
	@FindBy(id = "lblGender")
	private WebElement acknowledgementNoGenderText;
	
	@FindBy(id = "ddlGender")
	private WebElement genderDropDown;
	
	@FindBy(id = "lblMotherName")
	private WebElement acknowledgementNoMotherNameText;
	
	@FindBy(id = "txtMother")
	private WebElement motherNameTextField;
	
	
	@FindBy(id = "lblFatherHusName")
	private WebElement acknowledgementNoFatherNameText;
	
	@FindBy(id = "txtFather")
	private WebElement fatherNameTextField;
	
	@FindBy(id = "btnGetDetails")
	private WebElement acknowledgementNoGetDetailsButton;
	
	@FindBy(xpath = "//table[@class='footer']")
	private WebElement footerLinkOfAcknowledgementNoPage;
	
	@FindBy(id = "lblPleaseSelectBirthOrDeathRecord")
	private WebElement selectBirthOrDeathRecordText;
	
	@FindBy(xpath = "(//input[contains(@id,'gvBirthDeathDetail_checkbox')])[1]")
	private WebElement checkBoxInAcknowledgementNumber;
	
	@FindBy(id = "btnSubmit")
	private WebElement submitButtonInAcknowledgementPage;
	
	@FindBy(id = "lblApplicantDetails")
	private WebElement applicantDetailsText;
	
	@FindBy(id = "lblApplicationNumber")
	private WebElement oldApplicationNoText;
	
	@FindBy(id = "txtApplicationNumber")
	private WebElement oldApplicationNoValueText;
	
	@FindBy(id = "lblAcknowldgeNo")
	private WebElement acknowledgementNoInApplicantDetailsText;
	
	@FindBy(id = "lblResultAckNo")
	private WebElement acknowledgementNoValueInApplicationDetailsText;
	
	@FindBy(id = "lblRegistrationNumber")
	private WebElement registrationNoText;
	
	@FindBy(id = "lblRegNo")
	private WebElement registrationNoValueText;
	
	@FindBy(id = "lblEventName")
	private WebElement childNameText;
	
	@FindBy(id = "lblResultEventName")
	private WebElement childNameValueText;
	
	@FindBy(id = "lblEventDate")
	private WebElement dateOfBirthText;
	
	@FindBy(id = "lblResultEventDate")
	private WebElement applicantDateOfBirthValueText;
	
	@FindBy(id = "lblGender")
	private WebElement genderNameText;
	
	@FindBy(id = "lblResultGender")
	private WebElement genderValueText;
	
	@FindBy(id = "lblCircle")
	private WebElement circleNameText;
	
	@FindBy(id = "lblResultCircle")
	private WebElement circleNameValueText;
	
	@FindBy(id = "lblWardLocality")
	private WebElement wardNameText;
	
	@FindBy(id = "lblWard")
	private WebElement wardNameValueText;
	
	@FindBy(id = "lblApplicantLocality")
	private WebElement localityNameText;
	
	@FindBy(id = "lblLocality")
	private WebElement localityNameValueText;
	
	@FindBy(id = "lblForHName")
	private WebElement fatherNameText;
	
	@FindBy(id = "lblResultForHName")
	private WebElement fatherNameValueText;
	
	@FindBy(id = "Label1")
	private WebElement motherNameText;
	
	@FindBy(id = "lblResultMotherName")
	private WebElement motherNameValueText;
	
	@FindBy(id = "lblResAddr")
	private WebElement residenceAddressText;
	
	@FindBy(id = "lblResultResAddr")
	private WebElement residenceAddressValueText;
	
	@FindBy(id = "lblPAddr")
	private WebElement permanenetAddressText;
	
	
	@FindBy(id = "lblResultPAddr")
	private WebElement permanentAddressValueText;
	
	@FindBy(id = "lblRegDate")
	private WebElement registrationDateText;
	
	@FindBy(id = "lblResultRegDate")
	private WebElement registrationDateValueText;
	
	@FindBy(id = "lblPlaceOfEvent")
	private WebElement placeOfBirthText;
	
	@FindBy(id = "lblResultPlaceOfEvent")
	private WebElement placeOfBirthValueText;
	
	@FindBy(id = "lblApplicantRemarks")
	private WebElement remarksText;
	
	@FindBy(id = "lblRemarks")
	private WebElement remarksValueText;
	
	@FindBy(id = "lblInformantDetails")
	private WebElement informantDetailsText;
	
	@FindBy(id = "lblInformantName")
	private WebElement informantNameText;
	
	@FindBy(id = "txtApplicantName")
	private WebElement informantNameTextField;
	
	@FindBy(id = "lblInformantRelation")
	private WebElement informantRelationshipText;
	
	@FindBy(id = "ddlRelation")
	private WebElement informantRelationshipTextField;
	
	@FindBy(id = "lblInformantAddress")
	private WebElement informantAddressText;
	
	@FindBy(id = "txtInfAddress")
	private WebElement informantAddressTextField;
	
	@FindBy(id = "lblMobileNo")
	private WebElement mobileNoText;
	
	@FindBy(id = "txtMobileNumber")
	private WebElement mobileNoTextField;
	
	@FindBy(id = "lblAadhaarCardNo")
	private WebElement aadhaarNOtext;
	
	@FindBy(id = "txtAadharNo")
	private WebElement aadhaarNoTextField;
	
	@FindBy(id = "lblRationCardNO")
	private WebElement rationCardNoText;
	
	@FindBy(id = "txtRationCard")
	private WebElement rationcardNoTextField;
	
	@FindBy(id = "lblEmailID")
	private WebElement emailIdText;
	
	@FindBy(id = "txtInformantEmailID")
	private WebElement emailIdTextField;
	
	@FindBy(id = "lblInformantRemarks")
	private WebElement informantRemarksText;
	
	@FindBy(id = "txtInformantRemarks")
	private WebElement informantRemarksTextField;
	
	@FindBy(id = "lblPincode")
	private WebElement pincodeText;
	
	@FindBy(id = "txtPinCode")
	private WebElement pincodeTextField;
	
	@FindBy(id = "lblDeliveryType")
	private WebElement deliveryTypeText;
	
	@FindBy(id = "ddlDelivery")
	private WebElement deliveryTypeDropDown;
	
	@FindBy(id = "lblPurposeOfTheCertificate")
	private WebElement purposeText;
	
	@FindBy(id = "txtPurpose")
	private WebElement purposeTextField;
	
	@FindBy(id = "lblNoOfCopies")
	private WebElement noOfCopiesText;
	
	@FindBy(id = "txtNoofCopies1")
	private WebElement noOfCopiesTextField;
	
	@FindBy(id = "lblDocumentList")
	private WebElement documentListText;
	
	@FindBy(id = "lblApplicationFormFormat")
	private WebElement documentListNoteText;
	
	@FindBy(id = "chkApp_0")
	private WebElement applicationFormCheckBox;
	
	@FindBy(xpath = "//input[@id='chkApp_0']/following-sibling::label")
	private WebElement applicationFormText;
	
	@FindBy(id = "fileApp")
	private WebElement applicationFormFileUpload;
	
	@FindBy(id = "btnShowPayment")
	private WebElement showPaymentButton;
	
	@FindBy(xpath = "//table[@class='footer']")
	private WebElement birthAndDeathDetailsPageFooterLinksAndText;
	
	@FindBy(id = "search")
	private WebElement searchAcknowledgementNoLink;

	public WebElement getSearchAcknowledgementNoLink() {
		return searchAcknowledgementNoLink;
	}
	
	public WebElement getSearchDetailPage() {
		return searchDetailPage;
	}

	@FindBy(xpath = "//span[@id='lblSearchBirthOrDeathDetails']/parent::td")
	private WebElement searchDetailPage;
	
	@FindBy(id = "lblReceivePayment")
	private WebElement receiveAmountText;
	
	@FindBy(id = "lblChallanAmount")
	private WebElement challanAmountText;
	
	@FindBy(id = "txtCertCharges")
	private WebElement challanAmountReadOnlyField;
	
	@FindBy(id = "lblUserCharges")
	private WebElement userChargesText;
	
	@FindBy(id = "txtUserCharges")
	private WebElement uerChargesReadOnlyField;
	
	@FindBy(id = "lblCourierCharges")
	private WebElement courierChargesText;
	
	@FindBy(id = "txtCourier")
	private WebElement courierChargesReadOnlyField;
	
	@FindBy(id = "lblStationaryCharges")
	private WebElement stationeryChargesText;
	
	@FindBy(id = "txtPrintCharges")
	private WebElement stationeryChargesReadOnlyField;
	
	@FindBy(id = "lblTotalAmount")
	private WebElement totalAmountText;
	
	@FindBy(id = "txtTotalAmount")
	private WebElement totalAmountReadOnlyField;
	
	@FindBy(id = "btnConfirmPayment")
	private WebElement confirmPaymentButton;
	
	@FindBy(xpath = "//td[contains(text(),'PAYMENT OPTIONS')]")
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
	
	@FindBy(xpath = "//span[contains(text(),'GHMC - Birth Certificate Receipt')]/parent::td")
	private WebElement birthCertificateReceiptText;
	
	@FindBy(id = "btnPrint")
	private WebElement printReceiptButton;
	
	@FindBy(id = "btnIntegratedCertificate")
	private WebElement birthOrDeathCertificateRequestApplicationButton;
	
	@FindBy(id = "btnPrintIntegratedCertificate")
	private WebElement printCertificateButton;
	
	@FindBy(id = "lblEnterStationarySerialNo")
	private WebElement stationaryNoText;
	
	@FindBy(id = "txtffc")
	private WebElement stationartNoValueTextField;
	
	@FindBy(id = "txtmidno")
	private WebElement midNoValueTextField;
	
	@FindBy(id = "txtlastno")
	private WebElement lastNovalueTextField;
	
	@FindBy(id = "btnserialnosubmit")
	private WebElement serialNoSubmitButton;
	
	@FindBy(id = "btncancel1")
	private WebElement serialNoCancelButton;

	public WebElement getReceiveAmountText() {
		return receiveAmountText;
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

	public WebElement getUerChargesReadOnlyField() {
		return uerChargesReadOnlyField;
	}

	public WebElement getCourierChargesText() {
		return courierChargesText;
	}

	public WebElement getCourierChargesReadOnlyField() {
		return courierChargesReadOnlyField;
	}

	public WebElement getStationeryChargesText() {
		return stationeryChargesText;
	}

	public WebElement getStationeryChargesReadOnlyField() {
		return stationeryChargesReadOnlyField;
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

	public WebElement getBirthCertificateReceiptText() {
		return birthCertificateReceiptText;
	}

	public WebElement getPrintReceiptButton() {
		return printReceiptButton;
	}

	public WebElement getBirthOrDeathCertificateRequestApplicationButton() {
		return birthOrDeathCertificateRequestApplicationButton;
	}

	public WebElement getPrintCertificateButton() {
		return printCertificateButton;
	}

	public WebElement getStationaryNoText() {
		return stationaryNoText;
	}

	public WebElement getStationartNoValueTextField() {
		return stationartNoValueTextField;
	}

	public WebElement getMidNoValueTextField() {
		return midNoValueTextField;
	}

	public WebElement getLastNovalueTextField() {
		return lastNovalueTextField;
	}

	public WebElement getSerialNoSubmitButton() {
		return serialNoSubmitButton;
	}

	public WebElement getSerialNoCancelButton() {
		return serialNoCancelButton;
	}

}
