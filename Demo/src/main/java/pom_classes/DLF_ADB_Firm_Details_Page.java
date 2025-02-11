package pom_classes;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DLF_ADB_Firm_Details_Page {
	
	public DLF_ADB_Firm_Details_Page (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "/html/body/header")
	private WebElement headerImage;
	
	@FindBy(xpath = "//a[text()='DashBoard']")
	private WebElement dashboardLink;
	
	@FindBy(xpath = "//a[text()='My Pending request']")
	private WebElement myPendingRequestLink;
	
	@FindBy(xpath = "//a[text()='Change Password']")
	private WebElement changePasswordLink;
	
	@FindBy(xpath = "//li[text()='Logged in User : DLF-AS-ADI-ADMIN']")
	private WebElement dlfUserIdText;
	
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logoutLink;
	
	@FindBy(xpath = "//div[contains(text(),'Registration of Firms (Under Section: 58)')]")
	private WebElement registrationOfFirmHeadingText;
	
	@FindBy(xpath = "//label[text()='Documents Received Date ']")
	private WebElement documentsReceivedDateText;

	@FindBy(id = "docRecivedDate")
	private WebElement documentDateTextField;
	
	@FindBy(xpath = "//span[@class='input-group-addon']")
	private WebElement updateDateIcon;
	
	@FindBy(id = "updateBtnId")
	private WebElement updateDateButton;
	
	@FindBy(xpath = "//div[contains(text(),'Applicant Details')]")
	private WebElement applicantDetailsText;
	
	@FindBy(xpath = "//label[text()='FirstName']")
	private WebElement applicantFirstnameText;
	
	@FindBy(xpath = "//label[text()='FirstName']/following-sibling::div")
	private WebElement applicantFirstnameValueText;
	
	@FindBy(xpath = "//label[text()='Surname']")
	private WebElement applicantSurnameText;
	
	@FindBy(xpath = "//label[text()='Surname']/following-sibling::div")
	private WebElement applicantSurnameValueText;
	
	@FindBy(xpath = "//label[text()='Gender ']")
	private WebElement applicantGenderText;
	
	@FindBy(xpath = "//label[text()='Gender ']/following-sibling::div/label")
	private WebElement applicantGenderValueText;
	
	@FindBy(xpath = "//label[text()='Adhaar No']")
	private WebElement applicantAadhaarNoText;
	
	@FindBy(xpath = "//label[text()='Adhaar No']/following-sibling::div/label")
	private WebElement applicantAadhaarNoValueText;
	
	@FindBy(xpath = "//div[contains(text(),'Address')]")
	private WebElement applicantAddressText;
	
	@FindBy(xpath = "//label[contains(text(),'Door No')]")
	private WebElement applicantDoorNoText;
	
	@FindBy(xpath = "//label[contains(text(),'Door No')]/following-sibling::div/label")
	private WebElement applicantDoorNoValueText;
	
	@FindBy(xpath = "(//label[contains(text(),'Street')])[1]")
	private WebElement applicantStreetText;
	
	@FindBy(xpath = "(//label[contains(text(),'Street')]/following-sibling::div/label)[1] ")
	private WebElement applicantStreetValueText;
	
	@FindBy(xpath = "(//label[contains(text(),'Village/City')])[1] ")
	private WebElement applicantVillageOrCityText;
	
	@FindBy(xpath = "(//label[contains(text(),'Village/City')]/following-sibling::div/label)[1]")
	private WebElement applicantVillageOrCityValueText;
	
	@FindBy(xpath = "(//label[contains(text(),'Country')])[1]")
	private WebElement applicantCountryText;
	
	@FindBy(xpath = "(//label[contains(text(),'Country')]/following-sibling::div/label)[1]")
	private WebElement applicantCountryValueText;
	
	@FindBy(xpath = "(//label[contains(text(),'State')])[1]")
	private WebElement applicantStateText;
	
	@FindBy(xpath = "(//label[contains(text(),'State')]/following-sibling::div/label)[1]")
	private WebElement applicantStateValueText;
	
	@FindBy(xpath = "(//label[contains(text(),'District')])[1]")
	private WebElement applicantDistrictText;
	
	@FindBy(xpath = "(//label[contains(text(),'District')]/following-sibling::div/label)[1]")
	private WebElement applicantDistrictValueText;
	
	@FindBy(xpath = "(//label[contains(text(),'Mandal')])[1]")
	private WebElement applicantMandalText;
	
	@FindBy(xpath = "(//label[contains(text(),'Mandal')]/following-sibling::div/label)[1]")
	private WebElement applicantMandalValueText;
	
	@FindBy(xpath = "(//label[contains(text(),'Mandal')])[1]")
	private WebElement applicantPincodeText;
	
	@FindBy(xpath = "(//label[contains(text(),'PIN')]/following-sibling::div/label)[1]")
	private WebElement applicantPincodeValueText;
	
	@FindBy(xpath = "//label[contains(text(),'Other Country Detals')]")
	private WebElement applicantOtherCountryDetailsText;
	
	@FindBy(xpath = "//label[contains(text(),'Other Country Detals')]/following-sibling::div/label")
	private WebElement applicantOtherCountryDetailsValueText;
	
	@FindBy(xpath = "//div[contains(text(),'Contact Details')]")
	private WebElement applicantContactDetailsText;
	
	@FindBy(xpath = "//label[contains(text(),'Mobile No')]")
	private WebElement applicantMobileNoText;
	
	@FindBy(xpath = "//label[contains(text(),'Mobile No')]/following-sibling::div/label")
	private WebElement applicantMobileNoValueText;
	
	@FindBy(xpath = "//label[contains(text(),'Landline Phone No')]")
	private WebElement applicantLandlineNoText;
	
	@FindBy(xpath = "//label[contains(text(),'Landline Phone No')]/following-sibling::div/label")
	private WebElement applicantLandlineNoValueText;
	
	@FindBy(xpath = "//label[contains(text(),'Fax No')]")
	private WebElement applicantFaxNoText;
	
	@FindBy(xpath = "//label[contains(text(),'Fax No')]/following-sibling::div/label")
	private WebElement applicantFaxNoValueText;
	
	@FindBy(xpath = "//label[contains(text(),'E-mail Address')]")
	private WebElement applicantEmailAddressText;
	
	@FindBy(xpath = "//label[contains(text(),'E-mail Address')]/following-sibling::div/label")
	private WebElement applicantEmailAddressValueText;
	
	@FindBy(xpath = "//div[contains(text(),'Details of Firm')]")
	private WebElement detailsOfFirmText;
	
	@FindBy(xpath = "//label[contains(text(),'Firm Name')]")
	private WebElement firmNameText;
	
	@FindBy(xpath = "//label[contains(text(),'Firm Name')]/following-sibling::div/label")
	private WebElement firmNameValueText;
	
	@FindBy(xpath = "//label[contains(text(),'Firm Duration From')]")
	private WebElement firmDurationFromText;
	
	@FindBy(xpath = "//label[contains(text(),'Firm Duration From')]/following-sibling::div/label")
	private WebElement firmDurationFromDateValueText;
	
	@FindBy(xpath = "//label[contains(text(),'Indefinite')]")
	private WebElement indefiniteText;
	
	@FindBy(xpath = "//label[contains(text(),'Indefinite')]/following-sibling::div/label")
	private WebElement indefiniteValueText;
	
	@FindBy(xpath = "//label[contains(text(),'Firm Duration To')]")
	private WebElement firmDurationToText;
	
	@FindBy(xpath = "//label[contains(text(),'Firm Duration To')]/following-sibling::div/label")
	private WebElement firmDurationToDateValueText;
	
	@FindBy(xpath = "//label[contains(text(),'Industry Type')]")
	private WebElement industryTypeText;
	
	@FindBy(xpath = "//label[contains(text(),'Industry Type')]/following-sibling::div/label")
	private WebElement industryTypeValueText;
	
	@FindBy(xpath = "//label[contains(text(),'Name of registration district')]")
	private WebElement registrationDistrictText;
	
	@FindBy(xpath = "//label[contains(text(),'Name of registration district')]/following-sibling::div/label")
	private WebElement registrationDistrictValueText;
	
	@FindBy(xpath = "//label[contains(text(),'BusinessType')]")
	private WebElement businessTypeText;
	
	@FindBy(xpath = "//label[contains(text(),'BusinessType')]/following-sibling::div/label")
	private WebElement businessTypeValueText;
	
	@FindBy(xpath = "//label[contains(text(),'PremisesType Category of society')]")
	private WebElement premisesTypeText;
	
	@FindBy(xpath = "//label[contains(text(),'PremisesType Category of society')]/following-sibling::div/label")
	private WebElement premisesTypeValueText;
	
	@FindBy(xpath = "//label[contains(text(),'Unique Application ID :')]")
	private WebElement uniqueApplicationIdText;
	
	@FindBy(xpath = "//label[contains(text(),'Unique Application ID :')]/following-sibling::div/label")
	private WebElement uniqueApplicationIdValueText;
	
	@FindBy(xpath = "//div[contains(text(),'Principal Place of Business')]")
	private WebElement principalPlaceOfBusinessText;
	
	@FindBy(xpath = "(//label[contains(text(),'Door No')])[2]")
	private WebElement principalDoorNoText;
	
	@FindBy(xpath = "(//label[contains(text(),'Door No')]/following-sibling::div/label)[2]")
	private WebElement principalDoorNoValueText;
	
	@FindBy(xpath = "(//label[contains(text(),'Street')])[2]")
	private WebElement principalStreetText;
	
	@FindBy(xpath = "(//label[contains(text(),'Street')]/following-sibling::div/label)[2]")
	private WebElement principalStreetValueText;
	
	@FindBy(xpath = "(//label[contains(text(),'Village/City')])[2]")
	private WebElement principalVillageOrCityText;
	
	@FindBy(xpath = "(//label[contains(text(),'Village/City')]/following-sibling::div/label)[2]")
	private WebElement principalVillageOrCityValueText;
	
	@FindBy(xpath = "(//label[contains(text(),'State')])[2]")
	private WebElement principalStateText;
	
	@FindBy(xpath = "(//label[contains(text(),'State')]/following-sibling::div/label)[2]")
	private WebElement principalStateValueText;
	
	@FindBy(xpath = "(//label[contains(text(),'District')])[2]")
	private WebElement principalDistrictText;
	
	@FindBy(xpath = "(//label[contains(text(),'District')]/following-sibling::div/label)[2]")
	private WebElement principalDistrictValueText;
	
	@FindBy(xpath = "(//label[contains(text(),'Mandal')])[2]")
	private WebElement principalMandalText;
	
	@FindBy(xpath = "(//label[contains(text(),'Mandal')]/following-sibling::div/label)[2]")
	private WebElement principalMandalValueText;
	
	@FindBy(xpath = "(//label[contains(text(),'PIN')])[2]")
	private WebElement principalPincodeText;
	
	@FindBy(xpath = "(//label[contains(text(),'PIN')]/following-sibling::div/label)[2]")
	private WebElement principalPincodeValueText;
	
	@FindBy(xpath = "//div[contains(text(),'Partner Details')]")
	private WebElement partnerDetailsText;
	
	@FindBy(id = "tblPartners")
	private WebElement partnerDetailsTable;
	
	@FindBy(xpath = "(//table[@id='tblPartners']/tbody/tr/td[4]/input)[1]")
	private WebElement partner1ViewDetailsButton;
	
	@FindBy(xpath = "(//table[@id='tblPartners']/tbody/tr/td[4]/input)[2]")
	private WebElement partner2ViewDetailsButton;
	
	@FindBy(xpath = "//label[contains(text(),'First Name :')]")
	private WebElement partnerFirstnameText;
	
	@FindBy(xpath = "//label[contains(text(),'First Name :')]/following-sibling::div/label")
	private WebElement partnerFirstnameValueText;
	
	@FindBy(xpath = "//label[contains(text(),'Last Name :')]")
	private WebElement partnerLastnameText;
	
	@FindBy(xpath = "//label[contains(text(),'Last Name :')]/following-sibling::div/label")
	private WebElement partnerLastnameValueText;
	
	@FindBy(xpath = "//label[contains(text(),'Joining Date :')]")
	private WebElement partnerJoiningDateText;
	
	@FindBy(xpath = "//label[contains(text(),'Joining Date :')]/following-sibling::div/label")
	private WebElement partnerJoiningDateValueText;
	
	@FindBy(id = "bootstrap-data-table")
	private WebElement partnerAddressDetailsTable;
	
	@FindBy(name = "btnClose")
	private WebElement partnerDetailsCloseButton;
	
	@FindBy(xpath = "//div[contains(text(),'Uploaded Documents')]")
	private WebElement uploadedDocumentText;
	
	@FindBy(id = "tblDocument")
	private WebElement uploadedDocumentDetailsTable;
	
	@FindBy(xpath = "//div[contains(text(),'User Payment Details')]")
	private WebElement userPaymentDetailsText;
	
	@FindBy(xpath = "//label[contains(text(),'Statutory Fee')]")
	private WebElement statutoryFeeText;
	
	@FindBy(xpath = "//label[contains(text(),'Statutory Fee')]/following-sibling::div/label")
	private WebElement statutoryFeeValueText;
	
	@FindBy(xpath = "//label[contains(text(),'Service Tax')]")
	private WebElement serviceTaxText;
	
	@FindBy(xpath = "//label[contains(text(),'Service Tax')]/following-sibling::div/label")
	private WebElement serviceTaxValueText;
	
	@FindBy(xpath = "//label[contains(text(),'User Charge')]")
	private WebElement userChargesText;
	
	@FindBy(xpath = "//label[contains(text(),'User Charge')]/following-sibling::div/label")
	private WebElement userChargesValueText;
	
	@FindBy(xpath = "//label[contains(text(),'Total Amount')]")
	private WebElement totalAmountText;
	
	@FindBy(xpath = "//label[contains(text(),'Total Amount')]/following-sibling::div/label")
	private WebElement totalAmountValueText;
	
	@FindBy(id = "changeJurisdiction")
	private WebElement changeJurisdictionCheckBox;
	
	@FindBy(xpath = "//input[@id='changeJurisdiction']/following-sibling::label")
	private WebElement changeJurisdictionNoteText;
	
	@FindBy(xpath = "//a[text()='Check Name Availability']")
	private WebElement checkNameAvailabilityLink;
	
	@FindBy(id = "save")
	private WebElement submitButtonInFirmDetailsPage;
	
	@FindBy(id = "cancelId")
	private WebElement cancelButtonInFirmDetailsPage;
	
	@FindBy(xpath = " //label[contains(text(),'Decision:')]")
	private WebElement decisionLabelText;
	
	@FindBy(id = "itemforward")
	private WebElement forwardRadioButton;
		
	@FindBy(id = "item21")
	private WebElement returnToKioskRadiobutton;
	
	@FindBy(xpath = " //label[contains(text(),' Comments:')]")
	private WebElement commentsText;
	
	@FindBy(id = "sComments")
	private WebElement commentsTextField;
	
	@FindBy(id = "submitId")
	private WebElement submitButtonInDecisionPage;
	
	@FindBy(id = "cancelId")
	private WebElement cancelButtonInDecisionPage;
	
	@FindBy(id = "backId")
	private WebElement backButtonInDecisionPage;
	
	@FindBy(xpath = " //div[contains(text(),'History')]")
	private WebElement historyText;
	
	@FindBy(xpath = "//table[@class='table grid-table grid-table1']")
	private WebElement commentsHistoryTable;
	
	@FindBy(xpath = "//label[contains(text(),'Select User:')]")
	private WebElement selectUserText;
	
	@FindBy(id = "staffUserInfoId")
	private WebElement selectUserDropDown;
	
	@FindBy(xpath = "//div[contains(text(),'Decision')]")
	private WebElement decisionHeadingPageText;
	
	@FindBy(name = "buttonId")
	private WebElement closeButtonAfterRequestActionCompleted;

	public WebElement getHeaderImage() {
		return headerImage;
	}

	public WebElement getDashboardLink() {
		return dashboardLink;
	}

	public WebElement getMyPendingRequestLink() {
		return myPendingRequestLink;
	}

	public WebElement getChangePasswordLink() {
		return changePasswordLink;
	}

	public WebElement getDlfUserIdText() {
		return dlfUserIdText;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public WebElement getRegistrationOfFirmHeadingText() {
		return registrationOfFirmHeadingText;
	}

	public WebElement getDocumentsReceivedDateText() {
		return documentsReceivedDateText;
	}

	public WebElement getDocumentDateTextField() {
		return documentDateTextField;
	}

	public WebElement getUpdateDateIcon() {
		return updateDateIcon;
	}

	public WebElement getUpdateDateButton() {
		return updateDateButton;
	}

	public WebElement getApplicantDetailsText() {
		return applicantDetailsText;
	}

	public WebElement getApplicantFirstnameText() {
		return applicantFirstnameText;
	}

	public WebElement getApplicantFirstnameValueText() {
		return applicantFirstnameValueText;
	}

	public WebElement getApplicantSurnameText() {
		return applicantSurnameText;
	}

	public WebElement getApplicantSurnameValueText() {
		return applicantSurnameValueText;
	}

	public WebElement getApplicantGenderText() {
		return applicantGenderText;
	}

	public WebElement getApplicantGenderValueText() {
		return applicantGenderValueText;
	}

	public WebElement getApplicantAadhaarNoText() {
		return applicantAadhaarNoText;
	}

	public WebElement getApplicantAadhaarNoValueText() {
		return applicantAadhaarNoValueText;
	}

	public WebElement getApplicantAddressText() {
		return applicantAddressText;
	}

	public WebElement getApplicantDoorNoText() {
		return applicantDoorNoText;
	}

	public WebElement getApplicantDoorNoValueText() {
		return applicantDoorNoValueText;
	}

	public WebElement getApplicantStreetText() {
		return applicantStreetText;
	}

	public WebElement getApplicantStreetValueText() {
		return applicantStreetValueText;
	}

	public WebElement getApplicantVillageOrCityText() {
		return applicantVillageOrCityText;
	}

	public WebElement getApplicantVillageOrCityValueText() {
		return applicantVillageOrCityValueText;
	}

	public WebElement getApplicantCountryText() {
		return applicantCountryText;
	}

	public WebElement getApplicantCountryValueText() {
		return applicantCountryValueText;
	}

	public WebElement getApplicantStateText() {
		return applicantStateText;
	}

	public WebElement getApplicantStateValueText() {
		return applicantStateValueText;
	}

	public WebElement getApplicantDistrictText() {
		return applicantDistrictText;
	}

	public WebElement getApplicantDistrictValueText() {
		return applicantDistrictValueText;
	}

	public WebElement getApplicantMandalText() {
		return applicantMandalText;
	}

	public WebElement getApplicantMandalValueText() {
		return applicantMandalValueText;
	}

	public WebElement getApplicantPincodeText() {
		return applicantPincodeText;
	}

	public WebElement getApplicantPincodeValueText() {
		return applicantPincodeValueText;
	}

	public WebElement getApplicantOtherCountryDetailsText() {
		return applicantOtherCountryDetailsText;
	}

	public WebElement getApplicantOtherCountryDetailsValueText() {
		return applicantOtherCountryDetailsValueText;
	}

	public WebElement getApplicantContactDetailsText() {
		return applicantContactDetailsText;
	}

	public WebElement getApplicantMobileNoText() {
		return applicantMobileNoText;
	}

	public WebElement getApplicantMobileNoValueText() {
		return applicantMobileNoValueText;
	}

	public WebElement getApplicantLandlineNoText() {
		return applicantLandlineNoText;
	}

	public WebElement getApplicantLandlineNoValueText() {
		return applicantLandlineNoValueText;
	}

	public WebElement getApplicantFaxNoText() {
		return applicantFaxNoText;
	}

	public WebElement getApplicantFaxNoValueText() {
		return applicantFaxNoValueText;
	}

	public WebElement getApplicantEmailAddressText() {
		return applicantEmailAddressText;
	}

	public WebElement getApplicantEmailAddressValueText() {
		return applicantEmailAddressValueText;
	}

	public WebElement getDetailsOfFirmText() {
		return detailsOfFirmText;
	}

	public WebElement getFirmNameText() {
		return firmNameText;
	}

	public WebElement getFirmNameValueText() {
		return firmNameValueText;
	}

	public WebElement getFirmDurationFromText() {
		return firmDurationFromText;
	}

	public WebElement getFirmDurationFromDateValueText() {
		return firmDurationFromDateValueText;
	}

	public WebElement getIndefiniteText() {
		return indefiniteText;
	}

	public WebElement getIndefiniteValueText() {
		return indefiniteValueText;
	}

	public WebElement getFirmDurationToText() {
		return firmDurationToText;
	}

	public WebElement getFirmDurationToDateValueText() {
		return firmDurationToDateValueText;
	}

	public WebElement getIndustryTypeText() {
		return industryTypeText;
	}

	public WebElement getIndustryTypeValueText() {
		return industryTypeValueText;
	}

	public WebElement getRegistrationDistrictText() {
		return registrationDistrictText;
	}

	public WebElement getRegistrationDistrictValueText() {
		return registrationDistrictValueText;
	}

	public WebElement getBusinessTypeText() {
		return businessTypeText;
	}

	public WebElement getBusinessTypeValueText() {
		return businessTypeValueText;
	}

	public WebElement getPremisesTypeText() {
		return premisesTypeText;
	}

	public WebElement getPremisesTypeValueText() {
		return premisesTypeValueText;
	}

	public WebElement getUniqueApplicationIdText() {
		return uniqueApplicationIdText;
	}

	public WebElement getUniqueApplicationIdValueText() {
		return uniqueApplicationIdValueText;
	}

	public WebElement getPrincipalPlaceOfBusinessText() {
		return principalPlaceOfBusinessText;
	}

	public WebElement getPrincipalDoorNoText() {
		return principalDoorNoText;
	}

	public WebElement getPrincipalDoorNoValueText() {
		return principalDoorNoValueText;
	}

	public WebElement getPrincipalStreetText() {
		return principalStreetText;
	}

	public WebElement getPrincipalStreetValueText() {
		return principalStreetValueText;
	}

	public WebElement getPrincipalVillageOrCityText() {
		return principalVillageOrCityText;
	}

	public WebElement getPrincipalVillageOrCityValueText() {
		return principalVillageOrCityValueText;
	}

	public WebElement getPrincipalStateText() {
		return principalStateText;
	}

	public WebElement getPrincipalStateValueText() {
		return principalStateValueText;
	}

	public WebElement getPrincipalDistrictText() {
		return principalDistrictText;
	}

	public WebElement getPrincipalDistrictValueText() {
		return principalDistrictValueText;
	}

	public WebElement getPrincipalMandalText() {
		return principalMandalText;
	}

	public WebElement getPrincipalMandalValueText() {
		return principalMandalValueText;
	}

	public WebElement getPrincipalPincodeText() {
		return principalPincodeText;
	}

	public WebElement getPrincipalPincodeValueText() {
		return principalPincodeValueText;
	}

	public WebElement getPartnerDetailsText() {
		return partnerDetailsText;
	}

	public WebElement getPartnerDetailsTable() {
		return partnerDetailsTable;
	}

	public WebElement getPartner1ViewDetailsButton() {
		return partner1ViewDetailsButton;
	}

	public WebElement getPartner2ViewDetailsButton() {
		return partner2ViewDetailsButton;
	}

	public WebElement getPartnerFirstnameText() {
		return partnerFirstnameText;
	}

	public WebElement getPartnerFirstnameValueText() {
		return partnerFirstnameValueText;
	}

	public WebElement getPartnerLastnameText() {
		return partnerLastnameText;
	}

	public WebElement getPartnerLastnameValueText() {
		return partnerLastnameValueText;
	}

	public WebElement getPartnerJoiningDateText() {
		return partnerJoiningDateText;
	}

	public WebElement getPartnerJoiningDateValueText() {
		return partnerJoiningDateValueText;
	}

	public WebElement getPartnerAddressDetailsTable() {
		return partnerAddressDetailsTable;
	}

	public WebElement getPartnerDetailsCloseButton() {
		return partnerDetailsCloseButton;
	}

	public WebElement getUploadedDocumentText() {
		return uploadedDocumentText;
	}

	public WebElement getUploadedDocumentDetailsTable() {
		return uploadedDocumentDetailsTable;
	}

	public WebElement getUserPaymentDetailsText() {
		return userPaymentDetailsText;
	}

	public WebElement getStatutoryFeeText() {
		return statutoryFeeText;
	}

	public WebElement getStatutoryFeeValueText() {
		return statutoryFeeValueText;
	}

	public WebElement getServiceTaxText() {
		return serviceTaxText;
	}

	public WebElement getServiceTaxValueText() {
		return serviceTaxValueText;
	}

	public WebElement getUserChargesText() {
		return userChargesText;
	}

	public WebElement getUserChargesValueText() {
		return userChargesValueText;
	}

	public WebElement getTotalAmountText() {
		return totalAmountText;
	}

	public WebElement getTotalAmountValueText() {
		return totalAmountValueText;
	}

	public WebElement getChangeJurisdictionCheckBox() {
		return changeJurisdictionCheckBox;
	}

	public WebElement getChangeJurisdictionNoteText() {
		return changeJurisdictionNoteText;
	}

	public WebElement getCheckNameAvailabilityLink() {
		return checkNameAvailabilityLink;
	}

	public WebElement getSubmitButtonInFirmDetailsPage() {
		return submitButtonInFirmDetailsPage;
	}

	public WebElement getCancelButtonInFirmDetailsPage() {
		return cancelButtonInFirmDetailsPage;
	}

	public WebElement getDecisionLabelText() {
		return decisionLabelText;
	}

	public WebElement getForwardRadioButton() {
		return forwardRadioButton;
	}

	public WebElement getReturnToKioskRadiobutton() {
		return returnToKioskRadiobutton;
	}

	public WebElement getCommentsText() {
		return commentsText;
	}

	public WebElement getCommentsTextField() {
		return commentsTextField;
	}

	public WebElement getSubmitButtonInDecisionPage() {
		return submitButtonInDecisionPage;
	}

	public WebElement getCancelButtonInDecisionPage() {
		return cancelButtonInDecisionPage;
	}

	public WebElement getBackButtonInDecisionPage() {
		return backButtonInDecisionPage;
	}

	public WebElement getHistoryText() {
		return historyText;
	}

	public WebElement getCommentsHistoryTable() {
		return commentsHistoryTable;
	}

	public WebElement getSelectUserText() {
		return selectUserText;
	}

	public WebElement getSelectUserDropDown() {
		return selectUserDropDown;
	}

	public WebElement getDecisionHeadingPageText() {
		return decisionHeadingPageText;
	}

	public WebElement getCloseButtonAfterRequestActionCompleted() {
		return closeButtonAfterRequestActionCompleted;
	}
	
	@FindBy(xpath = "//table[@id='tblPartners']/tbody/tr")
	private WebElement rowsInPartnerTable;
	
	@FindBy(xpath = "//table[@id='tblPartners']/tbody/tr[1]/td")
	private WebElement columnsInPartnerTable;
	
	@FindBy(xpath = "//input[@value='VIEW']")
	private List<WebElement> viewButtons ;

	public List<WebElement> getViewButtons() {
		return viewButtons;
	}

	public WebElement getRowsInPartnerTable() {
		return rowsInPartnerTable;
	}

	public WebElement getColumnsInPartnerTable() {
		return columnsInPartnerTable;
	}
	
	@FindBy(xpath = "//div[contains(text(),'Name Availability')]")
	private WebElement nameAvailabilityPageText;
	
	@FindBy(xpath = "//label[contains(text(),'Enter Society/Firm Name:')]")
	private WebElement enterSocietyOrFirmNameText;
	
	@FindBy(id = "search")
	private WebElement nameAvailabilitySearchButton;
	
	@FindBy(xpath = "//span[contains(text(),'No Name found with the given search')]")
	private WebElement noFoundErrorTextInNameAvailability;

	public WebElement getNameAvailabilityPageText() {
		return nameAvailabilityPageText;
	}

	public WebElement getEnterSocietyOrFirmNameText() {
		return enterSocietyOrFirmNameText;
	}

	public WebElement getNameAvailabilitySearchButton() {
		return nameAvailabilitySearchButton;
	}

	public WebElement getNoFoundErrorTextInNameAvailability() {
		return noFoundErrorTextInNameAvailability;
	}
	
	@FindBy(id = "firmName")
	private WebElement firmNameInNameAvailabilityCheckingTextField;

	public WebElement getFirmNameInNameAvailabilityCheckingTextField() {
		return firmNameInNameAvailabilityCheckingTextField;
	}
	
	@FindBy(xpath = "//h2[text()='Successfully Submitted']")
	private WebElement successfulSubmissionText;

	public WebElement getSuccessfulSubmissionText() {
		return successfulSubmissionText;
	}
	
	
}
