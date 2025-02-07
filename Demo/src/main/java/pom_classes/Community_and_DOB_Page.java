package pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Community_and_DOB_Page {
	
	public Community_and_DOB_Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//td[@class='tsDesktop']")
	private WebElement mainHeaderWithLogoImage;
	
	@FindBy(xpath = "{//td[contains(@class,'tab-hd')]")
	private WebElement departmentWithServiceNameText;

	@FindAll({@FindBy(id = "ddlServiceType"), @FindBy(xpath = "//select[contains(@id,'ddlServiceType')]")})
	private WebElement selectServiceDropDown;
	
	@FindBy(id = "lblApplicantDetails")
	private WebElement applicantDetailsText;
	
	@FindBy(id = "btnClear")
	private WebElement clearFieldButton;
	
	@FindBy(id = "btnCitizen")
	private WebElement searchInCitizen360Button;
	
	@FindBy(id ="lblApplicationNumber")
	private WebElement applicationNumberText;
	
	@FindBy(id ="lblAADHARCardNo")
	private WebElement aadhaarNoText;
	
	@FindBy(id ="lblApplicantName")
	private WebElement applicantNameText;
	
	@FindBy(id ="lblGender")
	private WebElement genderText;
	
	@FindBy(id ="lblFatherNameHusbandName")
	private WebElement fatherOrHusbandNameText;
	
	@FindBy(id ="lblMotherName")
	private WebElement motherNameText;
	
	@FindBy(id ="Father Caste Cetificate Number")
	private WebElement fatherCasteCertificateNumberText;
	
	@FindBy(id ="Mother Caste Certificate Number")
	private WebElement motherCasteCertificateNumberText;
	
	@FindBy(id ="lblDateofBirthOrYear")
	private WebElement dateofBirthOrYearText;
	
	@FindBy(id ="lblAge")
	private WebElement ageText;
	
	@FindBy(id ="lblMobile")
	private WebElement mobileNoText;
	
	@FindBy(id ="lblDeliveryType")
	private WebElement deliveryTypeText;
	
	@FindBy(id ="lblEmail")
	private WebElement emailText;
	
	@FindBy(id ="txtApplicationNo")
	private WebElement applicationNoValueReadOnlyField;
	
	@FindBy(id = "txtAppName")
	private WebElement applicantNameTextField;
	
	@FindBy(id = "txtAadharNo")
	private WebElement aadharNoTextField;
	
	@FindBy(id = "rblGender1")
	private WebElement genderDropDown;

	@FindBy(id = "txtfather")
	private WebElement fatherOrHusbandNameTextField;
	
	@FindBy(id = "txtmother")
	private WebElement motherNameTextField;
	
	@FindBy(id = "txtfathercertificate")
	private WebElement fatherCasteCertifcateNumberTextField;
	
	@FindBy(id = "txtmothercertificate")
	private WebElement motherCasteCertificateNumberTextField;
	
	@FindBy(id = "txtDateOfBirth")
	private WebElement dateOfBirthSelectField;
	
	@FindBy(id = "txtage")
	private  WebElement ageTextField;
	
	@FindBy(id = "txtMobile")
	private WebElement mobileTextField;
	
	@FindBy(id = "ddlDelivery")
	private WebElement deliveryTypeDropDown;
	
	@FindBy(id = "txtEmail")
	private WebElement emailIdTextField;
		
	@FindBy(id = "lblPlaceofPermanentResidenceAddress")
	private WebElement placeOfPermanentResidenceAddressText;
	
	@FindBy(id ="lblDoorNumber")
	private WebElement doorNoText;
	
	@FindBy(id ="lblLocalityLandMark")
	private WebElement localityOrLandmarkText;
	
	@FindBy(id ="lblDistrict")
	private WebElement districtText;
	
	@FindBy(id ="lblMandal")
	private WebElement mandalText;
	
	@FindBy(id ="lblVillageWard")
	private WebElement villageOrWardText;
	
	@FindBy(id ="lblPinCode")
	private WebElement pincodeText;
	
	@FindBy(id = "txtPerdoor")
	private WebElement doorNoTextField;
	
	@FindBy(id = "txtPerlocality")
	private WebElement localityOrLandmarkTextField;
	
	@FindBy(id = "ddlPerdistrict")
	private WebElement districtDropDown;
	
	@FindBy(id = "ddlPermandal")
	private WebElement mandalDropDown;
	
	@FindBy(id = "ddlPervillage")
	private WebElement villageOrWardDropDown;
	
	@FindBy(id = "txtPerpin")
	private WebElement pincodeTextField;
	
	@FindBy(id = "CheckBox1")
	private WebElement ordinaryResidenceSameAsPermanentResidenceCheckBox;
	
	@FindBy(id = "CheckBox2")
	private WebElement birthAddressSameAsPermanentResidenceCheckBox;
	
	@FindBy(id = "lblServiceSpecificDetails")
	private WebElement serviceSpecificDetailsText;
	
	@FindBy(id = "lblIssuedCommunityCertificateInPast")
	private WebElement issuedCommunityCertificateInPastText;
	
	@FindBy(id = "ddlIssuedCertificate")
	private WebElement issuedCommunityCertificateInPastDropDown;
	
	@FindBy(id = "lblHouseholdSurveyNo")
	private WebElement householdSurveyNo;
	
	//ST
	
	@FindBy(id = "lblsubtribe")
	private WebElement subtribeText;
	
	@FindBy(id = "ddlCasteClaimed")
	private WebElement subtribeDropDown;
	
	@FindBy(id ="lblApplicantCommunityClaimed")
	private WebElement applicantCommunityClaimedText;
	
	@FindBy(id ="ddlCasteCategory")
	private WebElement applicantCommunityClaimedDropDown;
	
	@FindBy(id ="lblcomfather")
	private WebElement subtribeOfFatherText;
	
	@FindBy(id ="ddlfathercaste")
	private WebElement subtribeOfFatherDropDown;
	
	@FindBy(id ="lblsubtribefather")
	private WebElement communityOfFatherText;
	
	@FindBy(id ="ddlfathersubcaste")
	private WebElement communityOfFatherDropDown;
	
	@FindBy(id ="lblcommother")
	private WebElement subtribeOfMotherText;
	
	@FindBy(id ="ddlmothercaste")
	private WebElement subtribeOfMotherDropDown;
	
	@FindBy(id ="lblsubtribemother")
	private WebElement communityOfMotherText;
	
	@FindBy(id ="ddlmothersubcaste")
	private WebElement communityOfMotherDropDown;
	
	@FindBy(id ="lblWhetherTheApplicantIs")
	private WebElement whetherTheApplicantIsText;
	
	@FindBy(id = "rbnnaturalborn_0")
	private WebElement aNaturalBornSonOrDaughterRadioButton;
	
	@FindBy(id = "rbnnaturalborn_1")
	private WebElement anAdoptedSonOrDaughterRadioButton;
	
	//SC
	
	@FindBy(id ="lblsubtribe")
	private WebElement applicantSubcasteText;
	
	@FindBy(id ="ddlCasteClaimed")
	private WebElement applicantSubcasteDropDown;
	
	@FindBy(id ="lblcomfather")
	private WebElement subcasteOfFatherText;
	
	@FindBy(id ="ddlfathercaste")
	private WebElement subcasteOfFatherDropDown;
	
	@FindBy(id ="lblsubtribefather")
	private WebElement casteOfFatherText;
	
	@FindBy(id ="ddlfathersubcaste")
	private WebElement casteOfFatherDropDown;
	
	@FindBy(id ="lblcommother")
	private WebElement subcasteOfMotherText;
	
	@FindBy(id ="ddlmothercaste")
	private WebElement subcasteOfMotherDropDown;
	
	@FindBy(id ="lblsubtribemother")
	private WebElement casteOfMotherText;
	
	@FindBy(id ="ddlmothersubcaste")
	private WebElement casteOfMotherDropDown;
	
	
	@FindBy(id ="lblReligionProfessedByTheApplicant")
	private WebElement religionByApplicantText;
	
	@FindBy(id = "ddlReligionappl")
	private WebElement religionByApplicantDropDown;
	
	@FindBy(id ="lblReligionprofessedByTheFather")
	private WebElement religionByFatherText;
	
	@FindBy(id = "ddlRegfather")
	private WebElement religionByFatherDropDown;
	
	@FindBy(id ="lblReligionProfessedByTheMother")
	private WebElement religionByMotherText;
	
	@FindBy(id = "ddlRegmother")
	private WebElement religionByMotherDropDrown;
	
	//BC
	
	@FindBy(id ="lblsubtribe")
	private WebElement applicantSubcasteOrSubgroupText;
	
	@FindBy(id = "ddlCasteClaimed")
	private WebElement applicantSubcasteOrSubgroupDropDown;
	
	@FindBy(id ="lblcomfather")
	private WebElement subcasteOrSubgroupOfFatherText;
	
	@FindBy(id = "ddlfathercaste")
	private WebElement subcasteOrSubgroupOfFatherDropDown;
	
	@FindBy(id ="lblcommother")
	private WebElement subcasteOrSubgroupOfMotherText;
	
	@FindBy(id = "ddlmothercaste")
	private WebElement subcasteOrSubgroupOfMotherDropDown;
	
	@FindBy(id = "lblDocumentsList")
	private WebElement documentListText;
	
	@FindBy(id = "lblDocumentsNote")
	private WebElement documentListNoteText;
	
	@FindAll({@FindBy(id = "chkApp_0"), @FindBy(xpath = "//label[contains(text(),'Supporting Documents')]/preceding-sibling::input")})
	private WebElement supportingDocumentsCheckBox;
	
	@FindAll({@FindBy(id = "fileApp"), @FindBy(xpath = "//span[contains(@id,'lblFileBrowse')]/following-sibling::input")})
	private WebElement supportingDocumentFileUpload;
	
	@FindAll({@FindBy(id = "filePhoto"), @FindBy(xpath = "//span[contains(@id,'lblFileBrowsePhoto')]/following-sibling::input")})
	private WebElement applicantPassportSizePhotoFileUpload;
	
	@FindAll({@FindBy(id = "chkPhoto_0"), @FindBy(xpath = "//label[contains(text(),'Applicant Passport Size Photo')]/preceding-sibling::input")})
	private WebElement applicantPassportSizePhotoCheckBox;
	
	@FindBy(id = "lblpdf")
	private WebElement noteOfDocumentsAttachedText;
	
	@FindBy(id = "Label3")
	private WebElement documentListToBeAttachedText;
	
	@FindBy(xpath = "//tr[@id='trinstruction']//child::tr[2]")
	private WebElement importantInstructionListText;
	
	@FindBy(id = "btnSubmit")
	private WebElement showPaymentButton;
	
	@FindBy(xpath = "//table[@class='footer']")
	private WebElement footerText;
	
	@FindBy(id = "lblDocumentsAttached")
	private WebElement documentsAttachedText;
	
	@FindBy(id = "//td[contains(text(),'Supporting Docu')]")
	private WebElement suppotingDocsText;
	
	@FindBy(id = "gvDocuments_lnkDocumentName_0")
	private WebElement supportDocsUploadedFileLink ;
	
	@FindBy(id = "gvDocuments_lnkDocumentName_1")
	private WebElement applicantPassportSizePhotoUploadedImageLink;
	
	
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
	
	@FindBy(id = "//span[contains(text(),'TWALLET')]/parent::a")
	private WebElement twalletPaymentOptionLink;
	
	@FindBy(id = "//span[contains(text(),'QRCODE')]/parent::a")
	private WebElement qrcodePaymentOptionLink;
	
	@FindBy(xpath = "//span[contains(text(),'CASH')]//parent::a")
	private WebElement cashPaymentOptionLink;
	
	@FindBy(xpath =  "//span[contains(text(),'CHEQUE')]//parent::a")
	private WebElement chequePaymentOptionLink;
	
	@FindBy(xpath =  "//span[contains(text(),'CREDIT/DEBIT CARD')]//parent::a")
	private WebElement creditOrDebitCardPaymentOptionLink;
	
	@FindBy(id = "paymentsubmit")
	private WebElement makePaymentButton;
	
	@FindBy(id = "paymentcancel")
	private WebElement cancelPaymentButton;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
