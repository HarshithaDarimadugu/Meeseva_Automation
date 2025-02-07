package pom_classes;

import java.security.Identity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ADB_DYMRO_IncomeC_Details_Page {

	public ADB_DYMRO_IncomeC_Details_Page (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//body/table[1]")
	private WebElement headerImage;
	
	@FindBy(xpath = "//a[contains(text(),'HOME')]")
	private WebElement homeLink;
	
	@FindBy(xpath = "//a[contains(text(),'LOGOUT')]")
	private WebElement logoutLink;
	
	@FindBy(xpath = "//td[contains(@class,'tab-hd')]")
	private WebElement serviceNameWithDepartmentText;
	
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
	
	@FindBy(id = "lblIncomeApplicantDetails")
	private WebElement incomeApplicantDetailsText;
	
	@FindBy(id = "lblApplicationNo")
	private WebElement applicationNoText;
	
	@FindBy(id = "lblAppNo")
	private WebElement applicationNoValueText;
		
	@FindBy(id = "lblTransactionID")
	private WebElement transactionIdText;
	
	@FindBy(id = "lblTranId") //not fetch the id value
	private WebElement transactionIdValueText;
	
	@FindBy(id = "lblApplicantName")
	private WebElement applicantNameText;
	
	@FindBy(id = "txtAppName") //not change the value
	private WebElement applicantNameValueTextField;
	
	@FindBy(id = "lblRCDFatherName")
	private WebElement fatherNameText;
	
	@FindBy(id = "txtFatherName") //not change the value
	private WebElement fatherNameValueTextField;
	
	@FindBy(id = "lblICDGender")
	private WebElement genderText;
	
	@FindBy(id = "lblGender")
	private WebElement genderValueText;
	
	@FindBy(id = "lblDateOfBirth")
	private WebElement dateOfBirthText;
	
	@FindBy(id = "txtDateofBirth1") //not has value -- in application form the field is not at present
	private WebElement dateOfBirthValueTextField;
	
	@FindBy(id = "lblApplicationDate")
	private WebElement applicationDateText;
	
	@FindBy(id = "lblDate")
	private WebElement applicationDateValueText;
	
	@FindBy(id = "lblRCDAmount")
	private WebElement amountText;
	
	@FindBy(id = "lblAmount")
	private WebElement amountValueText;
	
	@FindBy(id = "lblICDDeliveryType")
	private WebElement deliveryTypeText;
	
	@FindBy(id = "lblDeliveryType")
	private WebElement deliveryTypeValueText;
	
	@FindBy(id = "lblApplicantagreetogivespeedposttofamilymember")
	private WebElement applicantAgreeToGiveSpeedPostToFamilyMemberText;
	
	@FindBy(id = "//span[contains(text(),'Applicant agree')]/ancestor::td[@class='formbg1']/following-sibling::td")
	private WebElement applicantAgreeToGiveSpeedPostToFamilyMemberValueText; //not has value
	
	@FindBy(id = "lblIncomeCertificateDetails")
	private WebElement incomeCertificateDetailsText;
	
	@FindBy(id = "lblIncomeonLands")
	private WebElement incomeOnLandsText;
		
	@FindBy(id = "txtLand") //not change
	private WebElement incomeOnLandTextField;
		
	@FindBy(id = "lblIncomeonBuildings")
	private WebElement incomeOnBuildingsText;
	
	@FindBy(id = "txtBuilding") //not change
	private WebElement incomeOnBuildingsTextField;
	
	@FindBy(id = "lblIncomeonBusiness")
	private WebElement incomeOnBusinessText;
	
	@FindBy(id = "txtBusiness") //not change
	private WebElement incomeOnBusinessTextField;
	
	@FindBy(id = "lblSalaryofbothWifeandHusbandifbothareemployed")
	private WebElement incomeFromSalaryText;
	
	@FindBy(id = "txtSalary") //not change
	private WebElement incomeFromSalaryTextField;
	
	@FindBy(id = "lblIncomeonLabour")
	private WebElement incomeOnLabourText;
	
	@FindBy(id = "txtLabour")//not change
	private WebElement incomeOnLabourTextField;
	
	@FindBy(id = "lblIncomeonOtherSources")
	private WebElement incomeOnOtherSourcesText;
	
	@FindBy(id = "txtOther")//not change
	private WebElement incomeOnOtherSourcesTextField;
	
	@FindBy(id = "lblTotalIncome")
	private WebElement totalIncomeText;
	
	@FindBy(id = "txtTotal")
	private WebElement totalIncomeReadOnlyValue;
	
	@FindBy(id = "lblICDPurpose")
	private WebElement purposeText;
	
	@FindBy(id = "lblPurpose")
	private WebElement purposeValueText;
	
	@FindBy(id = "lblICDStatus")
	private WebElement statusText;
	
	@FindBy(id = "lblStatus")
	private WebElement statusValueInDepartmentText;
	
	@FindBy(id = "lblPermanentAddress")
	private WebElement permanentAddressText;
	
	@FindBy(id = "lblRCD1DoorNo")
	private WebElement doorNoText;
	
	@FindBy(id = "txtPerDoorNo") //not change
	private WebElement doorNoValueTextField;
	
	@FindBy(id = "lblNCDLocalityOrLandmark")
	private WebElement localityOrLandmarkText;
	
	@FindBy(id = "txtPerLocality") //not change
	private WebElement localityValueTextField;
	
	@FindBy(id = "lblRCDDistrict")
	private WebElement districtText;
	
	@FindBy(id = "ddlDistrict")
	private WebElement districtValueDisabledField;
	
	@FindBy(id = "lblNCDMandal")
	private WebElement mandalText;
	
	@FindBy(id = "ddlmandal")
	private WebElement mandalValueDisabledField;
	
	@FindBy(id = "lblNCDVillageOrWard")
	private WebElement villageOrWardText;
	
	@FindBy(id = "ddlVillage") //not change
	private WebElement villageOrWardValueDropDown;
	
	@FindBy(id = "lblNCDPincode")
	private WebElement pincodeText;
	
	@FindBy(id = "lblPerPincode") //field is present in form but not displaying the value in permanent address section
	private WebElement pincodeValueText;
	
	@FindBy(id = "lblPostalAddress")
	private WebElement postalAddressText;
	
	@FindBy(id = "lblRCDDoorNo")
	private WebElement doorNoPostalText;
	
	@FindBy(id = "lblDoorNo") //shows only when postal is selected
	private WebElement doorNoPostalValueText;
	
	@FindBy(id = "lblCLL2LocalityOrLandmark")
	private WebElement localityOrLandmarkPostalText;
	
	@FindBy(id = "lblLocality") //shows only when postal is selected
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
	private WebElement aadhaarNoPostalText;
	
	@FindBy(id = "lblAadharNo")
	private WebElement aadhaarNoPostalValueText;
	
	@FindBy(xpath = "//span[contains(text(),'Supporting Documents Viewer')]")
	private WebElement supportingDocumentsViewerText;
	
	@FindBy(id = "EmPreViewPdf0")
	private WebElement uploadedDocumentViewer;
	
	@FindBy(id = "Img1")
	private WebElement uploadedImageViewer;
	
	@FindBy(id = "lblVerificationOrProceeedingDocuments")
	private WebElement verificationOrProceedingDocumentsText;
	
	
	@FindBy(id = "lblICDCheckList")
	private WebElement checkListLink;
	
	@FindBy(id = "lblCheckList")
	private WebElement checkListText;
	
	@FindBy(id = "fupChecklist")
	private WebElement checkListFileUpload;
	
	@FindBy(id = "lblRCDActionTaken")
	private WebElement actionTakenText;
	
	@FindBy(xpath = "//input[contains(@id,'rblActionTaken_0')]")
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
	
	@FindBy(id = "lblRemarks")
	private WebElement remarksText;
	
	@FindBy(id = "txtRemarks")
	private WebElement remarksTextField;
	
	@FindBy(id = "btnSubmit")
	private WebElement submitButton;
	
	public WebElement getHeaderImage() {
		return headerImage;
	}

	public WebElement getHomeLink() {
		return homeLink;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public WebElement getServiceNameWithDepartmentText() {
		return serviceNameWithDepartmentText;
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

	public WebElement getIncomeApplicantDetailsText() {
		return incomeApplicantDetailsText;
	}

	public WebElement getApplicationNoText() {
		return applicationNoText;
	}

	public WebElement getApplicationNoValueText() {
		return applicationNoValueText;
	}

	public WebElement getTransactionIdText() {
		return transactionIdText;
	}

	public WebElement getTransactionIdValueText() {
		return transactionIdValueText;
	}

	public WebElement getApplicantNameText() {
		return applicantNameText;
	}

	public WebElement getApplicantNameValueTextField() {
		return applicantNameValueTextField;
	}

	public WebElement getFatherNameText() {
		return fatherNameText;
	}

	public WebElement getFatherNameValueTextField() {
		return fatherNameValueTextField;
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

	public WebElement getDateOfBirthValueTextField() {
		return dateOfBirthValueTextField;
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

	public WebElement getApplicantAgreeToGiveSpeedPostToFamilyMemberText() {
		return applicantAgreeToGiveSpeedPostToFamilyMemberText;
	}

	public WebElement getApplicantAgreeToGiveSpeedPostToFamilyMemberValueText() {
		return applicantAgreeToGiveSpeedPostToFamilyMemberValueText;
	}

	public WebElement getIncomeCertificateDetailsText() {
		return incomeCertificateDetailsText;
	}

	public WebElement getIncomeOnLandsText() {
		return incomeOnLandsText;
	}

	public WebElement getIncomeOnLandTextField() {
		return incomeOnLandTextField;
	}

	public WebElement getIncomeOnBuildingsText() {
		return incomeOnBuildingsText;
	}

	public WebElement getIncomeOnBuildingsTextField() {
		return incomeOnBuildingsTextField;
	}

	public WebElement getIncomeOnBusinessText() {
		return incomeOnBusinessText;
	}

	public WebElement getIncomeOnBusinessTextField() {
		return incomeOnBusinessTextField;
	}

	public WebElement getIncomeFromSalaryText() {
		return incomeFromSalaryText;
	}

	public WebElement getIncomeFromSalaryTextField() {
		return incomeFromSalaryTextField;
	}

	public WebElement getIncomeOnLabourText() {
		return incomeOnLabourText;
	}

	public WebElement getIncomeOnLabourTextField() {
		return incomeOnLabourTextField;
	}

	public WebElement getIncomeOnOtherSourcesText() {
		return incomeOnOtherSourcesText;
	}

	public WebElement getIncomeOnOtherSourcesTextField() {
		return incomeOnOtherSourcesTextField;
	}

	public WebElement getTotalIncomeText() {
		return totalIncomeText;
	}

	public WebElement getTotalIncomeReadOnlyValue() {
		return totalIncomeReadOnlyValue;
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

	public WebElement getStatusValueInDepartmentText() {
		return statusValueInDepartmentText;
	}

	public WebElement getPermanentAddressText() {
		return permanentAddressText;
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

	public WebElement getLocalityValueTextField() {
		return localityValueTextField;
	}

	public WebElement getDistrictText() {
		return districtText;
	}

	public WebElement getDistrictValueDisabledField() {
		return districtValueDisabledField;
	}

	public WebElement getMandalText() {
		return mandalText;
	}

	public WebElement getMandalValueDisabledField() {
		return mandalValueDisabledField;
	}

	public WebElement getVillageOrWardText() {
		return villageOrWardText;
	}

	public WebElement getVillageOrWardValueDropDown() {
		return villageOrWardValueDropDown;
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

	public WebElement getAadhaarNoPostalText() {
		return aadhaarNoPostalText;
	}

	public WebElement getAadhaarNoPostalValueText() {
		return aadhaarNoPostalValueText;
	}

	public WebElement getSupportingDocumentsViewerText() {
		return supportingDocumentsViewerText;
	}

	public WebElement getUploadedDocumentViewer() {
		return uploadedDocumentViewer;
	}

	public WebElement getUploadedImageViewer() {
		return uploadedImageViewer;
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

	@FindBy(id = "btnBack")
	private WebElement backButton;
	
	@FindBy(id = "footer")
	private WebElement footerText;
	

}
