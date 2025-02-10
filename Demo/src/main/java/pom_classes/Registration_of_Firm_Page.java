package pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration_of_Firm_Page {
	
	public Registration_of_Firm_Page (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "/html/body/header")
	private WebElement headerImage;
	
	@FindBy(xpath = "//div[contains(text(),'IGRS - Registration of Firms (Under Section: 58)')]")
	private WebElement registrationOfFirmsHeadingText;
	
	@FindBy(xpath = "//a[text()='MY APPLICATIONS']")
	private WebElement myApplicationsLink;
	
	@FindBy(xpath = "//a[contains(text(),'Note & Instructions')]")
	private WebElement noteAndInstructionsText;
	
	@FindBy(xpath = "//div[contains(text(),'Applicant Details')]")
	private WebElement applicantDetailsText;
	
	@FindBy(id = "appFirstNameId")
	private WebElement applicantFirstNameText;
	
	@FindBy(id = "appfirstName")
	private WebElement applicantFirstNameTextField;
	
	@FindBy(id = "appLastNameId")
	private WebElement applicantSurnameText;
	
	@FindBy(id = "applicatInfolastName")
	private WebElement applicantSurnameTextField;
	
	@FindBy(xpath = "//label[contains(text(),'Gender')]")
	private WebElement applicantGenderText;
	
	@FindBy(id = "gender")
	private WebElement applicantGenderDropDown;
	
	@FindBy(xpath = "//label[contains(text(),'UID (Aadhaar):')]")
	private WebElement applicantAadhaarNoText;
	
	@FindBy(xpath = "//label[contains(text(),'UID (Aadhaar):')]")
	private WebElement applicantAadhaarNoTextField;
	
	@FindBy(xpath = "(//div[contains(text(),'Address')])[1]")
	private WebElement applicantAddressText;
	
	@FindBy(xpath = "//label[contains(text(),'Delivery Type')]")
	private WebElement applicantDeliveryTypeText;
	
	@FindBy(id = "deliveryTypeSel")
	private WebElement applicantDeliveryTypeDropDown;
	
	@FindBy(xpath = "(//label[contains(text(),'Door No')])[1]")
	private WebElement applicantDoorNoText;
	
	@FindBy(id = "appdoorNo")
	private WebElement applicantDoorNoTextField;
	
	@FindBy(xpath = "(//label[contains(text(),'Street: ')])[1]")
	private WebElement applicantStreetText;
	
	@FindBy(id = "appstreet")
	private WebElement applicantStreetTextField;
	
	@FindBy(xpath = "(//label[contains(text(),'Village / City')])[1]")
	private WebElement applicantVillageOrCityText;
	
	@FindBy(id = "appcity")
	private WebElement applicantVillageOrCityTextField;
	
	@FindBy(xpath = "(//label[contains(text(),'Country ')])[1]")
	private WebElement applicantCountryText;
	
	@FindBy(id = "appcountryName")
	private WebElement applicantCountryDropDown;
	
	@FindBy(xpath = "(//label[contains(text(),'State')])[1]")
	private WebElement applicantStateText;
	
	@FindBy(id = "stateName")
	private WebElement applicantStateDropDown;
	
	@FindBy(xpath = "(//label[contains(text(),'District')])[1]")
	private WebElement applicantDistrictText;
	
	@FindBy(id = "districtName")
	private WebElement applicantDistrictDropDown;
	
	@FindBy(xpath = "(//label[contains(text(),'Mandal')])[1]")
	private WebElement applicantMandalText;
	
	@FindBy(id = "mandalName")
	private WebElement applicantMandalDropDown;
	
	@FindBy(xpath = "(//label[contains(text(),'Pin Code')])[1]")
	private WebElement applicantPincodeText;
	
	@FindBy(id = "pincode")
	private WebElement applicantPincodeTextField;
	
	@FindBy(xpath = "//div[contains(text(),'Contact Details')]")
	private WebElement applicantContactDetailsText;
	
	@FindBy(xpath = "//label[contains(text(),'Landline Phone No :')]")
	private WebElement applicantPhoneNoText;
	
	@FindBy(id = "phoneNumber")
	private WebElement applicantPhoneNoTextField;
	
	@FindBy(xpath = "//label[contains(text(),'Mobile No')]")
	private WebElement applicantMobileNoText;
	
	@FindBy(id = "mobileNumber")
	private WebElement applicantMobileNoTextField;
	
	@FindBy(xpath = "//label[contains(text(),'Fax No :')]")
	private WebElement applicantFaxNoText;
	
	@FindBy(id = "faxNumber")
	private WebElement applicantFaxNoTextField;
	
	@FindBy(xpath = "//label[contains(text(),'E-mail Address:')]")
	private WebElement applicantEmailIdText;
	
	@FindBy(id = "emailId")
	private WebElement applicantEmailIdTextField;
	
	@FindBy(xpath = "//div[contains(text(),'Firm Details')]")
	private WebElement firmDetailsText;
	
	@FindBy(xpath = "//label[contains(text(),'Firm Name')] ")
	private WebElement firmNameText;
	
	@FindBy(id = "firmName")
	private WebElement firmNameTextField;
	
	@FindBy(xpath = "//label[contains(text(),'Firm Duration From')] ")
	private WebElement firmDurationFromText;
	
	@FindBy(id = "firmStartDate")
	private WebElement firmDurationFromDateSelect;
	
	@FindBy(xpath = "//label[contains(text(),'Indefinite')]")
	private WebElement firmIndefiniteText;
	
	@FindBy(id = "indefiniteYN")
	private WebElement firmIndefiniteDurationCheckBox;
	
	@FindBy(xpath = "//label[contains(text(),'Firm Duration To')]")
	private WebElement firmDurationToText;
	
	@FindBy(id = "firmEndDate")
	private WebElement firmDurationToDateSelect;
	
	@FindBy(xpath = "//label[contains(text(),'Industry Type')]")
	private WebElement firmIndustryTypeText;
	
	@FindBy(id = "industryType")
	private WebElement firmIndustryTypeDropDown;
	
	@FindBy(xpath = "//label[contains(text(),'Business Type')]")
	private WebElement firmBusinessTypeText;
	
	@FindBy(id = "businessType")
	private WebElement firmBusinessTypeDropDown;
	
	@FindBy(xpath = "//label[contains(text(),'Premises Type')]")
	private WebElement firmPremisesTypeText;
	
	@FindBy(id = "premisesType")
	private WebElement firmPremisesTypeDropDown;
	
	@FindBy(xpath = "//div[contains(text(),'Principal Place of Business')]")
	private WebElement principalPlaceOfBusinessText;
	
	@FindBy(xpath = "(//label[contains(text(),'Door No')])[2]")
	private WebElement principalDoorNoText;
	
	@FindBy(id = "principalDoorNo")
	private WebElement principalDoorNoTextField;
	
	@FindBy(xpath = "(//label[contains(text(),'Street: ')])[2]")
	private WebElement principalStreetText;
	
	@FindBy(id = "principalStreet")
	private WebElement principalStreetTextField;
	
	@FindBy(xpath = "(//label[contains(text(),'Village / City ')])[2]")
	private WebElement principalVillageOrCityText;
	
	@FindBy(id = "principalCity")
	private WebElement principalVillageOrCityTextField;
	
	@FindBy(xpath = "(//label[contains(text(),'State')])[3]")
	private WebElement principalStateText;
	
	@FindBy(id = "firmRegistrationDetails.principalAddress.stateName")
	private WebElement principalStateReadOnlyField;
	
	@FindBy(xpath = "(//label[contains(text(),'District')])[2]")
	private WebElement principalDistrictText;
	
	@FindBy(id = "principalDistrictName")
	private WebElement principalDistrictDropDown;
	
	@FindBy(xpath = "(//label[contains(text(),'Mandal')])[2]")
	private WebElement principalMandalText;
	
	@FindBy(id = "principalMandal")
	private WebElement principalMandalDropDown;
	
	@FindBy(xpath = "//label[contains(text(),'Registration District ')]")
	private WebElement registrationDistrictNameText;
	
	@FindBy(id = "registrationDistrictName")
	private WebElement registrationDistrictNameDropDown;
	
	@FindBy(xpath = "(//label[contains(text(),'Pin Code')])[2]")
	private WebElement principalPincodeText;
	
	@FindBy(id = "principalPinCode")
	private WebElement principalPincodeTextField;
	
	@FindBy(id = "otherAddressYN")
	private WebElement otherAddressCheckBox;
	
	@FindBy(xpath = "//span[text()='Please add Other Place of Business (If any)']")
	private WebElement otherAddressText;
	
	@FindBy(xpath = "(//label[contains(text(),'Door No')])[3]")
	private WebElement otherAddressDoorNoText;
	
	@FindBy(id = "otherAddressDoorNo")
	private WebElement otherAddressDoorNoTextField;
	
	@FindBy(xpath = "(//label[contains(text(),'Street')])[3]")
	private WebElement otherAddressStreetText;
	
	@FindBy(id = "otherAddressStreet")
	private WebElement otherAddressStreetTextField;
	
	@FindBy(xpath = "(//label[contains(text(),'Village / City')])[3]")
	private WebElement otherAddressVillageOrCityText;
	
	@FindBy(id = "otherAddressCity")
	private WebElement otherAddressVillageOrCityTextField;
	
	@FindBy(xpath = "(//label[contains(text(),'State')])[5]")
	private WebElement otherAddressStateText;
	
	@FindBy(id = "otherAddressState")
	private WebElement otherAddressStateDropDown;
	
	@FindBy(xpath = "(//label[contains(text(),'District')])[4]")
	private WebElement otherAddressDistrictText;
	
	@FindBy(id = "otherAddressDistrictName")
	private WebElement otherAddressDistrictDropDown;
	
	@FindBy(xpath = "(//label[contains(text(),'Mandal')])[3]")
	private WebElement otherAddressMandalText;
	
	@FindBy(id = "otherAddressMandal")
	private WebElement otherAddressMandalDropDown;
	
	@FindBy(xpath = "(//label[contains(text(),'Pin Code')])[3]")
	private WebElement otherAddressPincodeText;
	
	@FindBy(id = "otherAddressPinCode")
	private WebElement otherAddressPincodeTextField;
	
	@FindBy(id = "btnId")
	private WebElement checkFirmNameAvailabilityButton;
	
	@FindBy(id = "btnAddOther")
	private WebElement addOtherAddressDetailsButton;
	
	@FindBy(xpath = "(//div[contains(text(),'Partner Details')])[1]")
	private WebElement partnerDetailsText;
	
	@FindBy(xpath = "(//label[contains(text(),'Partner Name')])[1]")
	private WebElement partnerFirstNameText;
	
	@FindBy(id = "partnerfirstName")
	private WebElement partnerFirstNameTextField;
	
	@FindBy(xpath = "(//label[contains(text(),'Partner Surname')])[1]")
	private WebElement partnerSurnameText;
	
	@FindBy(id = "surName")
	private WebElement partnerSurnameTextField;
	
	@FindBy(xpath = "(//label[contains(text(),'Age')])[1]")
	private WebElement partnerAgeText;
	
	@FindBy(id = "age")
	private WebElement partnerAgeTextField;
	
	@FindBy(xpath = "(//label[contains(text(),'UID (Aadhaar) ')])[1]")
	private WebElement partnerAadhaarNoText;
	
	@FindBy(id = "uidAadharNo")
	private WebElement partnerAadhaarNoTextField;
	
	@FindBy(xpath = "(//label[contains(text(),'Joining Date')])[1]")
	private WebElement partnerJoiningDateText;
	
	@FindBy(id = "joiningDate")
	private WebElement partnerJoiningDateTextField;
	
	@FindBy(xpath = "(//span[@class='input-group-addon'])[3]")
	private WebElement partnerJoiningDateIcon;
	
	@FindBy(xpath = "(//div[contains(text(),'Address')])[2]")
	private WebElement partnerAddressText;
	
	@FindBy(xpath = "(//label[contains(text(),'Door No ')])[4]")
	private WebElement partnerDoorNoText;
	
	@FindBy(id = "doorNo")
	private WebElement partnerDoorNoTextField;
	
	@FindBy(xpath = "(//label[contains(text(),'Street:')])[3]")
	private WebElement partnerStreetText;
	
	@FindBy(id = "street")
	private WebElement partnerStreetTextField;
	
	@FindBy(xpath = "(//label[contains(text(),'Village / City ')])[4]")
	private WebElement partnerVillageOrCityText;
	
	@FindBy(id = "partnercity")
	private WebElement partnerVillageOrCityTextField;
	
	@FindBy(xpath = "(//label[contains(text(),'Country')])[4]")
	private WebElement partnerCountryText;
	
	@FindBy(id = "countryName")
	private WebElement partnerCountryDropDown;
	
	@FindBy(xpath = "(//label[contains(text(),'State ')])[6]")
	private WebElement partnerStateText;
	
	@FindBy(id = "partnerStateName")
	private WebElement partnerStateDropDown;
	
	@FindBy(xpath = "(//label[contains(text(),'District')])[6]")
	private WebElement partnerDistrictText;
	
	@FindBy(id = "partnerDistrictName")
	private WebElement partnerDistrictDropDown;
	
	@FindBy(xpath = "(//label[contains(text(),'Mandal ')])[2]")
	private WebElement partnerMandalText;
	
	@FindBy(id = "partnerMandalName")
	private WebElement partnerMandalDropDown;
	
	@FindBy(xpath = "(//label[contains(text(),'Pin Code')])[4]")
	private WebElement partnerPincodeText;
	
	@FindBy(id = "partnerPincode")
	private WebElement partnerPincodeTextField;
	
	@FindBy(id = "btnAddPartnerDetails")
	private WebElement addPartnerDetailsButton;
	
	@FindBy(id = "tblPartners")
	private WebElement partnerAddressDetailsTable;
	
	@FindBy(id = "tblPartners1")
	private WebElement otherAddressDetailsTable;
	
	@FindBy(xpath = "//div[contains(text(),'Upload Firm Related Documents')]")
	private WebElement uploadFirmRelatedDocumentsText;
	
	@FindBy(xpath = "//b[contains(text(),'Note')]/parent::div")
	private WebElement firmRealtedDocumentsNoteText;
	
	@FindBy(xpath = "(//label[contains(text(),'Document Type')])[1]")
	private WebElement documentTypeText;
	
	@FindBy(id = "docTypeId")
	private WebElement documentTypeDropDown;
	
	@FindBy(xpath = "(//label[contains(text(),'Document Name')])[1]")
	private WebElement documentNameText;
	
	@FindBy(id = "docName")
	private WebElement documentNameTextField;
	
	@FindBy(xpath = "(//label[contains(text(),'Upload Document')])[1]")
	private WebElement uploadDocumentText;
	
	@FindBy(id = "fileupload")
	private WebElement documentFileUpload;
	
	@FindBy(xpath = "//button[contains(text(),'Add Document')]")
	private WebElement addDocumentButton;
	
	@FindBy(id = "tblDocument")
	private WebElement documentDetailsTable;
	
	@FindBy(xpath = "//button[contains(text(),'Show Payment')]")
	private WebElement showPaymentButton;
	
	@FindBy(xpath = "//button[contains(text(),'Save as Draft')]")
	private WebElement saveAsDraftButton;
	
	public WebElement getHeaderImage() {
		return headerImage;
	}

	public WebElement getRegistrationOfFirmsHeadingText() {
		return registrationOfFirmsHeadingText;
	}

	public WebElement getMyApplicationsLink() {
		return myApplicationsLink;
	}

	public WebElement getNoteAndInstructionsText() {
		return noteAndInstructionsText;
	}

	public WebElement getApplicantDetailsText() {
		return applicantDetailsText;
	}

	public WebElement getApplicantFirstNameText() {
		return applicantFirstNameText;
	}

	public WebElement getApplicantFirstNameTextField() {
		return applicantFirstNameTextField;
	}

	public WebElement getApplicantSurnameText() {
		return applicantSurnameText;
	}

	public WebElement getApplicantSurnameTextField() {
		return applicantSurnameTextField;
	}

	public WebElement getApplicantGenderText() {
		return applicantGenderText;
	}

	public WebElement getApplicantGenderDropDown() {
		return applicantGenderDropDown;
	}

	public WebElement getApplicantAadhaarNoText() {
		return applicantAadhaarNoText;
	}

	public WebElement getApplicantAadhaarNoTextField() {
		return applicantAadhaarNoTextField;
	}

	public WebElement getApplicantAddressText() {
		return applicantAddressText;
	}

	public WebElement getApplicantDeliveryTypeText() {
		return applicantDeliveryTypeText;
	}

	public WebElement getApplicantDeliveryTypeDropDown() {
		return applicantDeliveryTypeDropDown;
	}

	public WebElement getApplicantDoorNoText() {
		return applicantDoorNoText;
	}

	public WebElement getApplicantDoorNoTextField() {
		return applicantDoorNoTextField;
	}

	public WebElement getApplicantStreetText() {
		return applicantStreetText;
	}

	public WebElement getApplicantStreetTextField() {
		return applicantStreetTextField;
	}


	public WebElement getApplicantCountryText() {
		return applicantCountryText;
	}

	public WebElement getApplicantCountryDropDown() {
		return applicantCountryDropDown;
	}

	public WebElement getApplicantStateText() {
		return applicantStateText;
	}

	public WebElement getApplicantStateDropDown() {
		return applicantStateDropDown;
	}

	public WebElement getApplicantDistrictText() {
		return applicantDistrictText;
	}

	public WebElement getApplicantDistrictDropDown() {
		return applicantDistrictDropDown;
	}

	public WebElement getApplicantMandalText() {
		return applicantMandalText;
	}

	public WebElement getApplicantMandalDropDown() {
		return applicantMandalDropDown;
	}

	public WebElement getApplicantPincodeText() {
		return applicantPincodeText;
	}

	public WebElement getApplicantPincodeTextField() {
		return applicantPincodeTextField;
	}

	public WebElement getApplicantContactDetailsText() {
		return applicantContactDetailsText;
	}

	public WebElement getApplicantPhoneNoText() {
		return applicantPhoneNoText;
	}

	public WebElement getApplicantPhoneNoTextField() {
		return applicantPhoneNoTextField;
	}

	public WebElement getApplicantMobileNoText() {
		return applicantMobileNoText;
	}

	public WebElement getApplicantMobileNoTextField() {
		return applicantMobileNoTextField;
	}

	public WebElement getApplicantFaxNoText() {
		return applicantFaxNoText;
	}

	public WebElement getApplicantFaxNoTextField() {
		return applicantFaxNoTextField;
	}

	public WebElement getApplicantEmailIdText() {
		return applicantEmailIdText;
	}

	public WebElement getApplicantEmailIdTextField() {
		return applicantEmailIdTextField;
	}

	public WebElement getFirmDetailsText() {
		return firmDetailsText;
	}

	public WebElement getFirmNameText() {
		return firmNameText;
	}

	public WebElement getFirmNameTextField() {
		return firmNameTextField;
	}

	public WebElement getFirmDurationFromText() {
		return firmDurationFromText;
	}

	public WebElement getFirmDurationFromDateSelect() {
		return firmDurationFromDateSelect;
	}

	public WebElement getFirmIndefiniteText() {
		return firmIndefiniteText;
	}

	public WebElement getFirmIndefiniteDurationCheckBox() {
		return firmIndefiniteDurationCheckBox;
	}

	public WebElement getFirmDurationToText() {
		return firmDurationToText;
	}

	public WebElement getFirmDurationToDateSelect() {
		return firmDurationToDateSelect;
	}

	public WebElement getFirmIndustryTypeText() {
		return firmIndustryTypeText;
	}

	public WebElement getFirmIndustryTypeDropDown() {
		return firmIndustryTypeDropDown;
	}

	public WebElement getFirmBusinessTypeText() {
		return firmBusinessTypeText;
	}

	public WebElement getFirmBusinessTypeDropDown() {
		return firmBusinessTypeDropDown;
	}

	public WebElement getFirmPremisesTypeText() {
		return firmPremisesTypeText;
	}

	public WebElement getFirmPremisesTypeDropDown() {
		return firmPremisesTypeDropDown;
	}

	public WebElement getPrincipalPlaceOfBusinessText() {
		return principalPlaceOfBusinessText;
	}

	public WebElement getPrincipalDoorNoText() {
		return principalDoorNoText;
	}

	public WebElement getPrincipalDoorNoTextField() {
		return principalDoorNoTextField;
	}

	public WebElement getPrincipalStreetText() {
		return principalStreetText;
	}

	public WebElement getPrincipalStreetTextField() {
		return principalStreetTextField;
	}

	public WebElement getPrincipalStateText() {
		return principalStateText;
	}


	public WebElement getPrincipalStateReadOnlyField() {
		return principalStateReadOnlyField;
	}

	public WebElement getPrincipalDistrictText() {
		return principalDistrictText;
	}

	public WebElement getPrincipalDistrictDropDown() {
		return principalDistrictDropDown;
	}

	public WebElement getPrincipalMandalText() {
		return principalMandalText;
	}

	public WebElement getPrincipalMandalDropDown() {
		return principalMandalDropDown;
	}

	public WebElement getRegistrationDistrictNameText() {
		return registrationDistrictNameText;
	}

	public WebElement getRegistrationDistrictNameDropDown() {
		return registrationDistrictNameDropDown;
	}

	public WebElement getPrincipalPincodeText() {
		return principalPincodeText;
	}

	public WebElement getPrincipalPincodeTextField() {
		return principalPincodeTextField;
	}

	public WebElement getOtherAddressCheckBox() {
		return otherAddressCheckBox;
	}

	public WebElement getOtherAddressText() {
		return otherAddressText;
	}

	public WebElement getOtherAddressDoorNoText() {
		return otherAddressDoorNoText;
	}

	public WebElement getOtherAddressDoorNoTextField() {
		return otherAddressDoorNoTextField;
	}

	public WebElement getOtherAddressStreetText() {
		return otherAddressStreetText;
	}

	public WebElement getOtherAddressStreetTextField() {
		return otherAddressStreetTextField;
	}


	public WebElement getOtherAddressStateText() {
		return otherAddressStateText;
	}

	public WebElement getOtherAddressStateDropDown() {
		return otherAddressStateDropDown;
	}

	public WebElement getOtherAddressDistrictText() {
		return otherAddressDistrictText;
	}

	public WebElement getOtherAddressDistrictDropDown() {
		return otherAddressDistrictDropDown;
	}

	public WebElement getOtherAddressMandalText() {
		return otherAddressMandalText;
	}

	public WebElement getOtherAddressMandalDropDown() {
		return otherAddressMandalDropDown;
	}

	public WebElement getOtherAddressPincodeText() {
		return otherAddressPincodeText;
	}

	public WebElement getOtherAddressPincodeTextField() {
		return otherAddressPincodeTextField;
	}

	public WebElement getCheckFirmNameAvailabilityButton() {
		return checkFirmNameAvailabilityButton;
	}

	public WebElement getAddOtherAddressDetailsButton() {
		return addOtherAddressDetailsButton;
	}

	public WebElement getPartnerDetailsText() {
		return partnerDetailsText;
	}

	public WebElement getPartnerFirstNameText() {
		return partnerFirstNameText;
	}

	public WebElement getPartnerFirstNameTextField() {
		return partnerFirstNameTextField;
	}

	public WebElement getPartnerSurnameText() {
		return partnerSurnameText;
	}

	public WebElement getPartnerSurnameTextField() {
		return partnerSurnameTextField;
	}

	public WebElement getPartnerAgeText() {
		return partnerAgeText;
	}

	public WebElement getPartnerAgeTextField() {
		return partnerAgeTextField;
	}

	public WebElement getPartnerAadhaarNoText() {
		return partnerAadhaarNoText;
	}

	public WebElement getPartnerAadhaarNoTextField() {
		return partnerAadhaarNoTextField;
	}

	public WebElement getPartnerJoiningDateText() {
		return partnerJoiningDateText;
	}

	public WebElement getPartnerJoiningDateTextField() {
		return partnerJoiningDateTextField;
	}

	public WebElement getPartnerJoiningDateIcon() {
		return partnerJoiningDateIcon;
	}

	public WebElement getPartnerAddressText() {
		return partnerAddressText;
	}

	public WebElement getPartnerDoorNoText() {
		return partnerDoorNoText;
	}

	public WebElement getPartnerDoorNoTextField() {
		return partnerDoorNoTextField;
	}

	public WebElement getPartnerStreetText() {
		return partnerStreetText;
	}

	public WebElement getPartnerStreetTextField() {
		return partnerStreetTextField;
	}

	public WebElement getApplicantVillageOrCityText() {
		return applicantVillageOrCityText;
	}

	public WebElement getApplicantVillageOrCityTextField() {
		return applicantVillageOrCityTextField;
	}

	public WebElement getPrincipalVillageOrCityText() {
		return principalVillageOrCityText;
	}

	public WebElement getPrincipalVillageOrCityTextField() {
		return principalVillageOrCityTextField;
	}

	public WebElement getOtherAddressVillageOrCityText() {
		return otherAddressVillageOrCityText;
	}

	public WebElement getOtherAddressVillageOrCityTextField() {
		return otherAddressVillageOrCityTextField;
	}

	public WebElement getPartnerVillageOrCityText() {
		return partnerVillageOrCityText;
	}

	public WebElement getPartnerVillageOrCityTextField() {
		return partnerVillageOrCityTextField;
	}

	public WebElement getPartnerCountryText() {
		return partnerCountryText;
	}

	public WebElement getPartnerCountryDropDown() {
		return partnerCountryDropDown;
	}

	public WebElement getPartnerStateText() {
		return partnerStateText;
	}

	public WebElement getPartnerStateDropDown() {
		return partnerStateDropDown;
	}

	public WebElement getPartnerDistrictText() {
		return partnerDistrictText;
	}

	public WebElement getPartnerDistrictDropDown() {
		return partnerDistrictDropDown;
	}

	public WebElement getPartnerMandalText() {
		return partnerMandalText;
	}

	public WebElement getPartnerMandalDropDown() {
		return partnerMandalDropDown;
	}

	public WebElement getPartnerPincodeText() {
		return partnerPincodeText;
	}

	public WebElement getPartnerPincodeTextField() {
		return partnerPincodeTextField;
	}

	public WebElement getAddPartnerDetailsButton() {
		return addPartnerDetailsButton;
	}

	public WebElement getPartnerAddressDetailsTable() {
		return partnerAddressDetailsTable;
	}

	public WebElement getOtherAddressDetailsTable() {
		return otherAddressDetailsTable;
	}

	public WebElement getUploadFirmRelatedDocumentsText() {
		return uploadFirmRelatedDocumentsText;
	}

	public WebElement getFirmRealtedDocumentsNoteText() {
		return firmRealtedDocumentsNoteText;
	}

	public WebElement getDocumentTypeText() {
		return documentTypeText;
	}

	public WebElement getDocumentTypeDropDown() {
		return documentTypeDropDown;
	}

	public WebElement getDocumentNameText() {
		return documentNameText;
	}

	public WebElement getDocumentNameTextField() {
		return documentNameTextField;
	}

	public WebElement getUploadDocumentText() {
		return uploadDocumentText;
	}

	public WebElement getDocumentFileUpload() {
		return documentFileUpload;
	}

	public WebElement getAddDocumentButton() {
		return addDocumentButton;
	}

	public WebElement getDocumentDetailsTable() {
		return documentDetailsTable;
	}

	public WebElement getShowPaymentButton() {
		return showPaymentButton;
	}

	public WebElement getSaveAsDraftButton() {
		return saveAsDraftButton;
	}

	public WebElement getFirmDurationToDateIcon() {
		return firmDurationToDateIcon;
	}

	public WebElement getFirmDurationFromDateIcon() {
		return firmDurationFromDateIcon;
	}

	public WebElement getSelfSignedDocumentLink() {
		return selfSignedDocumentLink;
	}

	@FindBy(id = "(//span[@class='input-group-addon'])[2]")
	private WebElement firmDurationToDateIcon;
	
	@FindAll({@FindBy(id = "dateHide"), @FindBy(xpath = "(//span[@class='input-group-addon'])[1]")})
	private WebElement firmDurationFromDateIcon;
	
	@FindBy(xpath = "//a[text()='Download Self Signed Declaration Document.']")
	private WebElement selfSignedDocumentLink;
	
	@FindBy(xpath = "//div[contains(text(),'Payment Details')]")
	private WebElement paymentDetailsText;
	
	@FindBy(xpath = "//label[text()='Statutory Fee:']")
	private WebElement statutoryFeeText;
	
	@FindBy(id = "serviceCharge")
	private WebElement statutoryFeeReadOnlyField;
	
	@FindBy(xpath = "//label[text()='Service Tax:']")
	private WebElement serviceTaxText;
	
	@FindBy(id = "serviceTax")
	private WebElement serviceTaxReadOnlyField;
	
	@FindBy(xpath = "//label[text()='User Charge:']")
	private WebElement userChargesText;
	
	@FindBy(id = "userCharge")
	private WebElement userChargesReadOnlyField;
	
	@FindBy(xpath = "//label[text()='Postal Charges: ']")
	private WebElement postalChargesText;
	
	@FindBy(id = "postalCharge")
	private WebElement postalChargeReadOnlyField;
	
	@FindBy(xpath = "//label[text()='Total Amount: ']")
	private WebElement totalAmountText;
	
	@FindBy(id = "totalAmount")
	private WebElement totalAmountReadOnlyField;
	
	@FindBy(id = "save")
	private WebElement payAndContinueButton;
	
	@FindBy(id = "cancelId")
	private WebElement cancelButton;
	
	@FindBy(xpath = "//footer[@class='footerBg']")
	private WebElement footerTextAndLinks;
	
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
	
	@FindBy(id = "//div[@id='PrintContent']/child::div")
	private WebElement registrationOfFirmNameTextInReceipt;
	
	@FindBy(id = "//span[text()='Acknowledgement Number']")
	private WebElement acknowledgementNumberText;
	
	@FindBy(id = "//span[text()='Acknowledgement Number']/parent::td/following-sibling::td")
	private WebElement acknowledgementNumberInReceipt;

	public WebElement getPaymentDetailsText() {
		return paymentDetailsText;
	}

	public WebElement getStatutoryFeeText() {
		return statutoryFeeText;
	}

	public WebElement getStatutoryFeeReadOnlyField() {
		return statutoryFeeReadOnlyField;
	}

	public WebElement getServiceTaxText() {
		return serviceTaxText;
	}

	public WebElement getServiceTaxReadOnlyField() {
		return serviceTaxReadOnlyField;
	}

	public WebElement getUserChargesText() {
		return userChargesText;
	}

	public WebElement getUserChargesReadOnlyField() {
		return userChargesReadOnlyField;
	}

	public WebElement getPostalChargesText() {
		return postalChargesText;
	}

	public WebElement getPostalChargeReadOnlyField() {
		return postalChargeReadOnlyField;
	}

	public WebElement getTotalAmountText() {
		return totalAmountText;
	}

	public WebElement getTotalAmountReadOnlyField() {
		return totalAmountReadOnlyField;
	}

	public WebElement getPayAndContinueButton() {
		return payAndContinueButton;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}

	public WebElement getFooterTextAndLinks() {
		return footerTextAndLinks;
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

	public WebElement getRegistrationOfFirmNameTextInReceipt() {
		return registrationOfFirmNameTextInReceipt;
	}

	public WebElement getAcknowledgementNumberText() {
		return acknowledgementNumberText;
	}

	public WebElement getAcknowledgementNumberInReceipt() {
		return acknowledgementNumberInReceipt;
	}
	
	

}
