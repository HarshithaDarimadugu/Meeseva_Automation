package pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ADB_MRO_OBCC_Details_Page {
	
	public ADB_MRO_OBCC_Details_Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "/html/body/table[1]")
	private WebElement headerImage;
	
	@FindBy(xpath = "//a[contains(text(),'HOME')]")
	private WebElement homeLink;
	
	@FindBy(xpath = "//a[contains(text(),'LOGOUT')]")
	private WebElement logoutLink;
	
	@FindBy(id = "lblrevenueHeader")
	private WebElement departmentWithServiceName;
	
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
	
	@FindBy(id = "lblOBCCertificateApplicantDetails")
	private WebElement obcApplicantDetailsText;
	
	@FindBy(id = "lblApplicationNosno")
	private WebElement applicationNoText;
	
	@FindBy(id = "lblAppNo")
	private WebElement applicantNoValueText;
	
	@FindBy(id = "lblStatus")
	private WebElement statusText;
	
	@FindBy(id = "lblStatusDetails")
	private WebElement statusValueText;
	
	@FindBy(id = "lblApplicantNamere")
	private WebElement applicantNameText;
	
	@FindBy(id = "lblApplicantName")
	private WebElement applicantNameTextField;
	
	@FindBy(id = "lblRCDFatherName")
	private WebElement fatherNameText;
	
	@FindBy(id = "lblFatherName")
	private WebElement fatherNameTextField;
	
	@FindBy(id = "lblRCDGender")
	private WebElement genderText;
	
	@FindBy(id = "lblGender")
	private WebElement genderValueText;
	
	@FindBy(id = "lblDateOfBirth")
	private WebElement dateOfBirthText;
	
	@FindBy(id = "txtDOB")
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
	
	@FindBy(id = "lblOBCPurpose")
	private WebElement purposeText;
	
	@FindBy(id = "ddlpurpose")
	private WebElement purposeDropDown;
	
	@FindBy(id = "lblCasteDetails")
	private WebElement casteDetailsText;
	
	@FindBy(id = "lblCasteClaimed")
	private WebElement casteClaimedText;
	
	@FindBy(id = "ddlCasteName")
	private WebElement casteClaimedValueDropDown;
	
	@FindBy(id = "lblCasteCategory")
	private WebElement casteCategoryText;
	
	@FindBy(id = "lblOBCdas")
	private WebElement casteCategoryValueText;
	
	@FindBy(id = "lblPermanentAddress")
	private WebElement permanentAdddressText;
	
	@FindBy(id = "lblDoorNoPermanent")
	private WebElement doorNoText;
	
	@FindBy(id = "lblPerDoorNo")
	private WebElement doorNoValueText;
	
	@FindBy(id = "lblLocationOrLandMark")
	private WebElement localityOrLandmarkText;
	
	@FindBy(id = "lblPerLocality")
	private WebElement localityOrLandmarkValueText;
	
	@FindBy(id = "lblDistrictDeposit")
	private WebElement districtText;
	
	@FindBy(id = "ddlDistrict")
	private WebElement districtReadOnlyField;
	
	@FindBy(id = "lblMandalDobs")
	private WebElement mandalText;
	
	@FindBy(id = "ddlmandal")
	private WebElement mandalReadOnlyField;
	
	@FindBy(id = "lblVillageOrWardPt")
	private WebElement villageOrWardText;
	
	@FindBy(id = "ddlVillage")
	private WebElement villageOrWardDropDown;
	
	@FindBy(id = "lblPincodeAqqa")
	private WebElement pincodeText;
	
	@FindBy(id = "lblPerPincode")
	private WebElement pincodeTextField;
	
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
	
	@FindBy(id = "lblOBCMobile")
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
	
	@FindBy(id = "lblVerificationOrProceedingDocuments")
	private WebElement verificationOrProceedingDocumentsText;
	
	@FindBy(id = "lblCheckListApp")
	private WebElement checkListLink;
	
	@FindBy(id = "lblCheckListDetails")
	private WebElement checkListText;
	
	@FindBy(id = "fupChecklist")
	private WebElement checkListFileUpload;
	
	@FindBy(id = "chkCreamy")
	private WebElement creamyLayerCheckBox;
	
	@FindBy(id = "chkCertificate")
	private WebElement certificateCheckBox;
	
	@FindBy(xpath = "//input[@id='chkCertificate']/following-sibling::label")
	private WebElement certificateAddressCheckBoxText;
	
	@FindBy(id = "//input[@id='chkCreamy']/following-sibling::label")
	private WebElement creamyLayerCheckBoxText;
	
	@FindBy(id = "lblOBCActionTaken")
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
	
	@FindBy(xpath = "//table[@class='footer']")
	private WebElement footerText;
	
	@FindBy(xpath = "//strong[contains(text(),'Remarks')]")
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

	public WebElement getHeaderImage() {
		return headerImage;
	}

	public WebElement getHomeLink() {
		return homeLink;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public WebElement getDepartmentWithServiceName() {
		return departmentWithServiceName;
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

	public WebElement getObcApplicantDetailsText() {
		return obcApplicantDetailsText;
	}

	public WebElement getApplicationNoText() {
		return applicationNoText;
	}

	public WebElement getApplicantNoValueText() {
		return applicantNoValueText;
	}

	public WebElement getStatusText() {
		return statusText;
	}

	public WebElement getStatusValueText() {
		return statusValueText;
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

	public WebElement getDateOfBirthText() {
		return dateOfBirthText;
	}

	public WebElement getDateOfBirthTextField() {
		return dateOfBirthTextField;
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

	public WebElement getPurposeText() {
		return purposeText;
	}

	public WebElement getPurposeDropDown() {
		return purposeDropDown;
	}

	public WebElement getCasteDetailsText() {
		return casteDetailsText;
	}

	public WebElement getCasteClaimedText() {
		return casteClaimedText;
	}

	public WebElement getCasteClaimedValueDropDown() {
		return casteClaimedValueDropDown;
	}

	public WebElement getCasteCategoryText() {
		return casteCategoryText;
	}

	public WebElement getCasteCategoryValueText() {
		return casteCategoryValueText;
	}

	public WebElement getPermanentAdddressText() {
		return permanentAdddressText;
	}

	public WebElement getDoorNoText() {
		return doorNoText;
	}

	public WebElement getDoorNoValueText() {
		return doorNoValueText;
	}

	public WebElement getLocalityOrLandmarkText() {
		return localityOrLandmarkText;
	}

	
	public WebElement getLocalityOrLandmarkValueText() {
		return localityOrLandmarkValueText;
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

	public WebElement getPincodeTextField() {
		return pincodeTextField;
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

	public WebElement getCreamyLayerCheckBox() {
		return creamyLayerCheckBox;
	}

	public WebElement getCertificateCheckBox() {
		return certificateCheckBox;
	}

	public WebElement getCertificateAddressCheckBoxText() {
		return certificateAddressCheckBoxText;
	}

	public WebElement getCreamyLayerCheckBoxText() {
		return creamyLayerCheckBoxText;
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
	
	
	@FindBy(id = "lblApplicantName")
	private WebElement documentApplicantNameText;
	
	@FindBy(id = "lblRelationName")
	private WebElement documentRelationNameText;
	
	@FindBy(id = "lblMandal")
	private WebElement documentMandalNameText;
	
	@FindBy(id = "lblDistrict")
	private WebElement documentDistrictNameText;
	
	@FindBy(id = "lblCommunity")
	private WebElement documentCommunityText;
	
	@FindBy(id = "lblCaste")
	private WebElement documentCasteText;

	public WebElement getDocumentApplicantNameText() {
		return documentApplicantNameText;
	}

	public WebElement getDocumentRelationNameText() {
		return documentRelationNameText;
	}

	public WebElement getDocumentMandalNameText() {
		return documentMandalNameText;
	}

	public WebElement getDocumentDistrictNameText() {
		return documentDistrictNameText;
	}

	public WebElement getDocumentCommunityText() {
		return documentCommunityText;
	}

	public WebElement getDocumentCasteText() {
		return documentCasteText;
	}
	
	@FindBy(xpath = "//table[@id='tableDetails']/tbody/tr/td//u[contains(text(),'OTHER BACKWARD CLASSES (OBC) CERTIFICATE')]")
	private WebElement documentNameText;

	public WebElement getDocumentNameText() {
		return documentNameText;
	}

	@FindBy(id = "lblVillage")
	private WebElement documentVillageNameText;

	public WebElement getDocumentVillageNameText() {
		return documentVillageNameText;
	}
	
	@FindBy(id = "btnBack")
	private WebElement documentHomeButton;

	public WebElement getDocumentHomeButton() {
		return documentHomeButton;
	}

	
}
