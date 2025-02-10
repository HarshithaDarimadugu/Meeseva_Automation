package pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ADB_MRO_ResidenceC_Details_Page {
	
	public ADB_MRO_ResidenceC_Details_Page (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "/html/body/table[1]")
	private WebElement headerImage;
	
	@FindBy(xpath = "//a[text()='HOME']")
	private WebElement homeButton;
	
	@FindBy(xpath = "//a[text()='LOGOUT']")
	private WebElement logoutButton;
	
	@FindBy(id = "lblrevenueHeader")
	private WebElement revenueDepartmentNameText;
	
	@FindBy(id = "lblTahsildarProcessingResidenceCertificate")
	private WebElement residenceCertificateNameText;
	
	@FindBy(id = "lblDetails")
	private WebElement detailsText;
	
	@FindBy(id = "lblCL1UserID")
	private WebElement userIdText;
	
	@FindBy(id = "lblUserId")
	private WebElement userIdNameText;
	
	@FindBy(id = "lblPortalUserName")
	private WebElement portalUserNameText;
	
	@FindBy(id = "lblChannelName")
	private WebElement portalUserNameValueText;
	
	@FindBy(id = "Operatordetails_lbl1")
	private WebElement operatorNameText;
	
	@FindBy(id = "Operatordetails_lblOperatorname")
	private WebElement operatorNameValueText;
	
	@FindBy(id = "Operatordetails_Label1")
	private WebElement mobileNoText;
	
	@FindBy(id = "Operatordetails_lblMobileNo")
	private WebElement mobileNoValueText;
	
	@FindBy(id = "lblResidenceApplicantDetails")
	private WebElement residenceApplicantDetails;
	
	@FindBy(id = "lblApplicationNo")
	private WebElement applicationNoText;
	
	@FindBy(id = "lblAppNo")
	private WebElement applicationNoValueText;
	
	@FindBy(id = "lblApplicantName")
	private WebElement applicantNameText;
	
	@FindBy(id = "txtAppName")
	private WebElement applicantNameTextField;
	
	@FindBy(id = "lblRCDFatherName")
	private WebElement fatherNameText;
	
	@FindBy(id = "txtFatherName")
	private WebElement fatherNameTextField;
	
	@FindBy(id = "lblRCDGender")
	private WebElement genderText;
	
	@FindBy(id = "lblGender")
	private WebElement genderValueText;
	
	@FindBy(id = "lblDateOfBirth")
	private WebElement dateOfBirthText;
	
	@FindBy(id = "txtDateofBirth1")
	private WebElement dateOfBirthTextField;
	
	@FindBy(id = "lblApplicationDate")
	private WebElement applicationDateText;
	
	@FindBy(id = "lblDate")
	private WebElement applicationDateValueText;
	
	@FindBy(id = "lblRCDAmount")
	private WebElement amountText;
	
	@FindBy(id = "lblAmount")
	private WebElement amountValueText;
	
	@FindBy(id = "lblRCDDeliveryType")
	private WebElement deliveryTypeText;
	
	@FindBy(id = "lblDeliveryType")
	private WebElement deliveryTypeValueText;
	
	@FindBy(id = "lblApplicantagreetogivespeedposttofamilymember")
	private WebElement applicantAgreeToGiveSpeedPostText;
	
	@FindBy(id = "lblSpeedPostFlag")
	private WebElement applicantAgreeToGiveSpeedPostValueText;
	
	@FindBy(id = "lblCertificateDetails")
	private WebElement certificateDetailsText;
	
	@FindBy(id = "lblResidingSince")
	private WebElement residingSinceText;
	
	@FindBy(id = "lblSinceResidence")
	private WebElement residingSinceValueTextField;
	
	@FindBy(id = "lblRCDPurpose")
	private WebElement purposeText;
	
	@FindBy(id = "lblPurpose")
	private WebElement purposeValueText;
	
	@FindBy(id = "lblRCDStatus")
	private WebElement statusText;
	
	@FindBy(id = "lblstatus")
	private WebElement statusValueText;
	
	@FindBy(id = "lblPermanentAddress")
	private WebElement permanentAdddressText;
	
	@FindBy(id = "lblRCD1DoorNo")
	private WebElement doorNoText;
	
	@FindBy(id = "txtPerDoorNo")
	private WebElement doorNoValueTextField;
	
	@FindBy(id = "lblNCDLocalityOrLandmark")
	private WebElement localityOrLandmarkText;
	
	@FindBy(id = "txtPerLocality")
	private WebElement localityOrLandmarkValueTextField;
	
	@FindBy(id = "lblRCDDistrict")
	private WebElement districtText;
	
	@FindBy(id = "ddlDistrict")
	private WebElement districtReadOnlyField;
	
	@FindBy(id = "lblNCDMandal")
	private WebElement mandalText;
	
	@FindBy(id = "ddlmandal")
	private WebElement mandalReadOnlyField;
	
	@FindBy(id = "lblNCDVillageOrWard")
	private WebElement villageOrWardText;
	
	@FindBy(id = "ddlVillage")
	private WebElement villageOrWardDropDown;
	
	@FindBy(id = "lblNCDPincode")
	private WebElement pincodeText;
	
	@FindBy(id = "lblPerPincode")
	private WebElement pincodeValueText;
	
	@FindBy(id = "lblPostalAddress")
	private WebElement postalAddressText;
	
	@FindBy(id = "lblRCDDoorNo")
	private WebElement doorNoPostalText;
	
	@FindBy(id = "lblDoorNo")
	private WebElement doorNoPostalValueText;
	
	@FindBy(id = "lblCLL2LocalityOrLandmark")
	private WebElement localityOrLandmarkPostalText;
	
	@FindBy(id = "lblLocality")
	private WebElement localityOrLandmarkPostalValueText;
	
	@FindBy(id = "lblCL2State")
	private WebElement statePostalText;
	
	@FindBy(id = "lblState")
	private WebElement statePostalValueText;
	
	@FindBy(id = "lblCo1Mandal")
	private WebElement mandalPostalText;
	
	@FindBy(id = "lblMandal")
	private WebElement mandalPostalValueText;
	
	@FindBy(id = "lblCo1VillageOrWard")
	private WebElement villageOrWardPostalText;
	
	@FindBy(id = "lblVillage")
	private WebElement villageOrWardPostalValueText;
	
	@FindBy(id = "lblCo1Pincode")
	private WebElement pincodePostalText;
	
	@FindBy(id = "lblPincode")
	private WebElement pincodePostalValueText;
	
	@FindBy(id = "lblCo1District")
	private WebElement districtPostalText;
	
	@FindBy(id = "lblDistrict")
	private WebElement districtPostalValueText;
	
	@FindBy(id = "lblMobile")
	private WebElement mobileNoPostalText;
	
	@FindBy(id = "lblMobileNo")
	private WebElement mobileNoPostalValueText;
	
	@FindBy(id = "lblPhone")
	private WebElement phoneNoPostalText;
	
	@FindBy(id = "lblPhoneNo")
	private WebElement phoneNoPostalValueText;
	
	@FindBy(id = "lblEmail")
	private WebElement emailIdPostalText;
	
	@FindBy(id = "lblEmailId")
	private WebElement emailIdPostalValueText;
	
	@FindBy(id = "lblRCDAadharNo")
	private WebElement aadhaarNoText;
	
	@FindBy(id = "lblAadharNo")
	private WebElement aadhaarNoValueText;
	
	@FindBy(id = "lblDocumentsAttached")
	private WebElement documentAttachedText;
	
	@FindBy(id = "dgDocuments_lnkDocumentName_0")
	private WebElement applicationFormDocUploadedLink;
	
	@FindBy(id = "dgDocuments_lnkDocumentName_1")
	private WebElement passportSizeUploadedLink;
	
	@FindBy(id = "lblVerificationOrProceeedingDocuments")
	private WebElement verificationOrProceedingDocumentsText;
	
	@FindBy(id = "lblCheckList")
	private WebElement checkListLink;
	
	@FindBy(id = "lblRCDCheckList")
	private WebElement checkListText;
	
	@FindBy(id = "fupChecklist")
	private WebElement checkListFileUpload;
	
	@FindBy(id = "lblRCDActionTaken")
	private WebElement actionTakenText;
	
	@FindBy(id = "rblActionTaken_0")
	private WebElement approveActionRadioButton;
	
	@FindBy(xpath = "//input[@id='rblActionTaken_0']/following-sibling::label")
	private WebElement approveActionText;
	
	@FindBy(id = "rblActionTaken_1")
	private WebElement rejectActionRadioButton;
	
	@FindBy(xpath = "//input[@id='rblActionTaken_1']/following-sibling::label")
	private WebElement rejectActionText;
	
	@FindBy(id = "rblActionTaken_2")
	private WebElement applicationTransferToOtherMandalRadioButton;
	
	@FindBy(xpath = "//input[@id='rblActionTaken_2']/following-sibling::label")
	private WebElement applicationTransferToOtherMandalText;
	
	@FindBy(id = "rblActionTaken_3")
	private WebElement sendSmsToApplicantRadioButton;
	
	@FindBy(xpath = "//input[@id='rblActionTaken_3']/following-sibling::label")
	private WebElement sendSmsToApplicantText;
	
	@FindBy(id = "rblActionTaken_4")
	private WebElement toBeReviewedRadioButton;
	
	@FindBy(xpath = "//input[@id='rblActionTaken_4']/following-sibling::label")
	private WebElement toBeReviewedText;
	
	@FindBy(id = "txtRemarks")
	private WebElement remarksTextField;
	
	@FindBy(id = "btnSubmit")
	private WebElement submitButton;
	
	@FindBy(id = "btnBack")
	private WebElement backButton;
	
	public WebElement getHeaderImage() {
		return headerImage;
	}

	public WebElement getHomeButton() {
		return homeButton;
	}

	public WebElement getLogoutButton() {
		return logoutButton;
	}

	public WebElement getRevenueDepartmentNameText() {
		return revenueDepartmentNameText;
	}

	public WebElement getResidenceCertificateNameText() {
		return residenceCertificateNameText;
	}

	public WebElement getDetailsText() {
		return detailsText;
	}

	public WebElement getUserIdText() {
		return userIdText;
	}

	public WebElement getUserIdNameText() {
		return userIdNameText;
	}

	public WebElement getPortalUserNameText() {
		return portalUserNameText;
	}

	public WebElement getPortalUserNameValueText() {
		return portalUserNameValueText;
	}

	public WebElement getOperatorNameText() {
		return operatorNameText;
	}

	public WebElement getOperatorNameValueText() {
		return operatorNameValueText;
	}

	public WebElement getMobileNoText() {
		return mobileNoText;
	}

	public WebElement getMobileNoValueText() {
		return mobileNoValueText;
	}

	public WebElement getResidenceApplicantDetails() {
		return residenceApplicantDetails;
	}

	public WebElement getApplicationNoText() {
		return applicationNoText;
	}

	public WebElement getApplicationNoValueText() {
		return applicationNoValueText;
	}

	public WebElement getApplicantNameText() {
		return applicantNameText;
	}

	public WebElement getApplicantNameTextField() {
		return applicantNameTextField;
	}

	public WebElement getFatherNameText() {
		return fatherNameText;
	}

	public WebElement getFatherNameTextField() {
		return fatherNameTextField;
	}

	public WebElement getGenderText() {
		return genderText;
	}

	public WebElement getGenderValueText() {
		return genderValueText;
	}


	public WebElement getApplicationDateText() {
		return applicationDateText;
	}

	public WebElement getApplicationDateValueText() {
		return applicationDateValueText;
	}

	public WebElement getAmountText() {
		return amountText;
	}

	public WebElement getAmountValueText() {
		return amountValueText;
	}

	public WebElement getDeliveryTypeText() {
		return deliveryTypeText;
	}

	public WebElement getDeliveryTypeValueText() {
		return deliveryTypeValueText;
	}

	public WebElement getApplicantAgreeToGiveSpeedPostValueText() {
		return applicantAgreeToGiveSpeedPostValueText;
	}

	public WebElement getCertificateDetailsText() {
		return certificateDetailsText;
	}

	public WebElement getResidingSinceText() {
		return residingSinceText;
	}

	public WebElement getResidingSinceValueTextField() {
		return residingSinceValueTextField;
	}

	public WebElement getPurposeText() {
		return purposeText;
	}

	public WebElement getPurposeValueText() {
		return purposeValueText;
	}

	public WebElement getStatusText() {
		return statusText;
	}

	public WebElement getStatusValueText() {
		return statusValueText;
	}

	public WebElement getPermanentAdddressText() {
		return permanentAdddressText;
	}

	public WebElement getDoorNoText() {
		return doorNoText;
	}

	public WebElement getDoorNoValueTextField() {
		return doorNoValueTextField;
	}

	public WebElement getLocalityOrLandmarkText() {
		return localityOrLandmarkText;
	}

	public WebElement getLocalityOrLandmarkValueTextField() {
		return localityOrLandmarkValueTextField;
	}

	public WebElement getDistrictText() {
		return districtText;
	}

	public WebElement getDistrictReadOnlyField() {
		return districtReadOnlyField;
	}

	public WebElement getMandalText() {
		return mandalText;
	}

	public WebElement getMandalReadOnlyField() {
		return mandalReadOnlyField;
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

	public WebElement getPincodeValueText() {
		return pincodeValueText;
	}

	public WebElement getPostalAddressText() {
		return postalAddressText;
	}

	public WebElement getDoorNoPostalText() {
		return doorNoPostalText;
	}

	public WebElement getDoorNoPostalValueText() {
		return doorNoPostalValueText;
	}

	public WebElement getLocalityOrLandmarkPostalText() {
		return localityOrLandmarkPostalText;
	}

	public WebElement getLocalityOrLandmarkPostalValueText() {
		return localityOrLandmarkPostalValueText;
	}

	public WebElement getStatePostalText() {
		return statePostalText;
	}

	public WebElement getStatePostalValueText() {
		return statePostalValueText;
	}

	public WebElement getMandalPostalText() {
		return mandalPostalText;
	}

	public WebElement getMandalPostalValueText() {
		return mandalPostalValueText;
	}

	public WebElement getVillageOrWardPostalText() {
		return villageOrWardPostalText;
	}

	public WebElement getVillageOrWardPostalValueText() {
		return villageOrWardPostalValueText;
	}

	public WebElement getPincodePostalText() {
		return pincodePostalText;
	}

	public WebElement getPincodePostalValueText() {
		return pincodePostalValueText;
	}

	public WebElement getDistrictPostalText() {
		return districtPostalText;
	}

	public WebElement getDistrictPostalValueText() {
		return districtPostalValueText;
	}

	public WebElement getMobileNoPostalText() {
		return mobileNoPostalText;
	}

	public WebElement getMobileNoPostalValueText() {
		return mobileNoPostalValueText;
	}

	public WebElement getPhoneNoPostalText() {
		return phoneNoPostalText;
	}

	public WebElement getPhoneNoPostalValueText() {
		return phoneNoPostalValueText;
	}

	public WebElement getEmailIdPostalText() {
		return emailIdPostalText;
	}

	public WebElement getEmailIdPostalValueText() {
		return emailIdPostalValueText;
	}

	public WebElement getAadhaarNoText() {
		return aadhaarNoText;
	}

	public WebElement getAadhaarNoValueText() {
		return aadhaarNoValueText;
	}

	public WebElement getDocumentAttachedText() {
		return documentAttachedText;
	}

	public WebElement getApplicationFormDocUploadedLink() {
		return applicationFormDocUploadedLink;
	}

	public WebElement getPassportSizeUploadedLink() {
		return passportSizeUploadedLink;
	}

	public WebElement getVerificationOrProceedingDocumentsText() {
		return verificationOrProceedingDocumentsText;
	}

	public WebElement getCheckListLink() {
		return checkListLink;
	}

	public WebElement getCheckListText() {
		return checkListText;
	}

	public WebElement getCheckListFileUpload() {
		return checkListFileUpload;
	}

	public WebElement getActionTakenText() {
		return actionTakenText;
	}

	public WebElement getApproveActionRadioButton() {
		return approveActionRadioButton;
	}

	public WebElement getApproveActionText() {
		return approveActionText;
	}

	public WebElement getRejectActionRadioButton() {
		return rejectActionRadioButton;
	}

	public WebElement getRejectActionText() {
		return rejectActionText;
	}

	public WebElement getApplicationTransferToOtherMandalRadioButton() {
		return applicationTransferToOtherMandalRadioButton;
	}

	public WebElement getApplicationTransferToOtherMandalText() {
		return applicationTransferToOtherMandalText;
	}

	public WebElement getSendSmsToApplicantRadioButton() {
		return sendSmsToApplicantRadioButton;
	}

	public WebElement getSendSmsToApplicantText() {
		return sendSmsToApplicantText;
	}

	public WebElement getToBeReviewedRadioButton() {
		return toBeReviewedRadioButton;
	}

	public WebElement getToBeReviewedText() {
		return toBeReviewedText;
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

	public WebElement getRemarksText() {
		return remarksText;
	}

	public WebElement getFormSignUserIdText() {
		return formSignUserIdText;
	}

	public WebElement getFormSignApplicationNoText() {
		return formSignApplicationNoText;
	}

	public WebElement getFormSignServiceNameText() {
		return formSignServiceNameText;
	}

	public WebElement getFormSignButton() {
		return formSignButton;
	}

	public WebElement getViewPdfButton() {
		return viewPdfButton;
	}


	@FindBy(xpath = "//table[@class='footer']")
	private WebElement footerText;
	
	@FindBy(id = "lblRemarks")
	private WebElement remarksText;
	
	@FindBy(xpath = "//form[@name='authcationform']/child::p[1]")
	private WebElement formSignUserIdText;
	
	@FindBy(xpath = "//form[@name='authcationform']/child::p[2]")
	private WebElement formSignApplicationNoText;
	
	@FindBy(xpath = "//form[@name='authcationform']/child::p[3]")
	private WebElement formSignServiceNameText;
	
	@FindBy(xpath = "//input[@value='FormSign']")
	private WebElement formSignButton;
	
	@FindBy(id = "pdf")
	private WebElement viewPdfButton;

	public WebElement getDateOfBirthText() {
		return dateOfBirthText;
	}

	public WebElement getDateOfBirthTextField() {
		return dateOfBirthTextField;
	}

	public WebElement getApplicantAgreeToGiveSpeedPostText() {
		return applicantAgreeToGiveSpeedPostText;
	}
	
	@FindBy(xpath = "//u[text()='RESIDENCE CERTIFICATE']")
	private WebElement residenceCertificateTextInDocument;
	
	@FindBy(id = "lblName")
	private WebElement applicantNameTextInDocument;
	
	@FindBy(id = "lblDoughterof")
	private WebElement relationshipNameTextInDocument;
	
	@FindBy(id = "lblVillage")
	private WebElement villageNameTextInDocument;
	
	@FindBy(id = "lblDoorNo")
	private WebElement doorNoTextInDocument;
	
	@FindBy(id = "lblMamdal")
	private WebElement mandalNameTextInDocument;
	
	public WebElement getResidenceCertificateTextInDocument() {
		return residenceCertificateTextInDocument;
	}

	public WebElement getApplicantNameTextInDocument() {
		return applicantNameTextInDocument;
	}

	public WebElement getRelationshipNameTextInDocument() {
		return relationshipNameTextInDocument;
	}

	public WebElement getVillageNameTextInDocument() {
		return villageNameTextInDocument;
	}

	public WebElement getDoorNoTextInDocument() {
		return doorNoTextInDocument;
	}

	public WebElement getMandalNameTextInDocument() {
		return mandalNameTextInDocument;
	}

	public WebElement getDistrictNameTextInDocument() {
		return districtNameTextInDocument;
	}

	public WebElement getStateNameTextInDocument() {
		return stateNameTextInDocument;
	}

	public WebElement getResidingSinceInYearsTextInDocument() {
		return residingSinceInYearsTextInDocument;
	}

	public WebElement getBackButtonInDocument() {
		return backButtonInDocument;
	}

	public WebElement getHomeButtonInDocument() {
		return homeButtonInDocument;
	}


	@FindBy(id = "lblDistrict")
	private WebElement districtNameTextInDocument;
	
	@FindBy(id = "lblstate")
	private WebElement stateNameTextInDocument;
	
	@FindBy(id = "lblResidingSince")
	private WebElement residingSinceInYearsTextInDocument;
	
	@FindBy(id = "btnHome")
	private WebElement backButtonInDocument;
	
	@FindBy(id = "btnHome0")
	private WebElement homeButtonInDocument;
	

}
