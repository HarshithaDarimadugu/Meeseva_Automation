package GHMC_Birth_Certificate_Service;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.util.SystemOutLogger;
import org.testng.annotations.Test;

import base_test.BaseClass;
import pom_classes.Access_Page;
import pom_classes.Birth_Death_Certificate_GHMC_Page;
import pom_classes.GHMC_Dept_Details_Page;
import pom_classes.Receipt_Page;

public class Birth_Application_01 extends BaseClass {

	@Test
	public void birth_process_01() throws Throwable, IOException, Throwable {

		start_Report(excel.readExcelData("BIRTH_GHMC", 6, 0), excel.readExcelData("BIRTH_GHMC", 6, 1),
				excel.readExcelData("BIRTH_GHMC", 6, 2));

		// access page
		// clicking on ghmc department link

		Access_Page access = new Access_Page(driver);
		while_Run();
		Thread.sleep(2000);
		access.getGhmcDepartmentLink().click();
		Thread.sleep(2000);
		while_Run();

		// clicking on ghmc birth death service
		GHMC_Dept_Details_Page details = new GHMC_Dept_Details_Page(driver);

		details.getBirthAndDeathCertificateGhmcLink().click();
		Thread.sleep(2000);
		while_Run();

		wUtility.switchToWindowByTitle(driver, "BIRTH AND DEATH CERTIFICATE GHMC NEW");
		Thread.sleep(2000);
		while_Run();

		// validating the birth and death ghmc service text
		Birth_Death_Certificate_GHMC_Page birth = new Birth_Death_Certificate_GHMC_Page(driver);

		assertValidate.assertByWebelementVisibility(birth.getDepartmentWithServiceNameText());

		System.out.println(birth.getDepartmentWithServiceNameText().getText());

		// selecting service type
		System.out.println("service type");
		assertValidate.assertByWebelementVisibility(birth.getServiceTypeText());
		assertValidate.assertByWebelementVisibility(birth.getServiceTypeDropDown());
		assertValidate.assertByEnabled(birth.getServiceTypeDropDown());

		wUtility.select(birth.getServiceTypeDropDown(), 1);
		Thread.sleep(2000);
		while_Run();

		// clicking on searchlink
		System.out.println("search link");
		assertValidate.assertByWebelementVisibility(birth.getSearchAcknowledgementNoLink());
		assertValidate.assertByWebelementVisibility(birth.getSearchAcknowledgementNoLink());
		assertValidate.assertByEnabled(birth.getSearchAcknowledgementNoLink());

		birth.getSearchAcknowledgementNoLink().click();

		Thread.sleep(2000);

		// switching to search birth record
		wUtility.switchToWindowByTitle(driver, "Search Birth/Death Record");
		Thread.sleep(7000);
		while_Run();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		// date of birth
		System.out.println("date of birth");
		assertValidate.assertByWebelementVisibility(birth.getAcknowledgementNodateOfBirthText());
		assertValidate.assertByWebelementVisibility(birth.getAcknowledgementNodateOfBirthSelect());
		assertValidate.assertByEnabled(birth.getAcknowledgementNodateOfBirthSelect());

		wUtility.enterDataUsingJavaScript(driver, birth.getAcknowledgementNodateOfBirthSelect(), "01-Feb-2001");
		Thread.sleep(5000);

//		//registration no
//		System.out.println("registration no");
//		assertValidate.assertByWebelementVisibility(birth.getRegistrationDateText());
//		assertValidate.assertByWebelementVisibility(birth.getRegistrationNoTextField());
//		Thread.sleep(5000);
		// circle no
		System.out.println("circle no");
		assertValidate.assertByWebelementVisibility(birth.getCircleNoWithNameText());
		assertValidate.assertByWebelementVisibility(birth.getCircleNoWithNameDropDown());

		wUtility.select(birth.getCircleNoWithNameDropDown(), 1);
		Thread.sleep(5000);
		// gender
		System.out.println("gender");
		assertValidate.assertByWebelementVisibility(birth.getAcknowledgementNoGenderText());
		assertValidate.assertByWebelementVisibility(birth.getGenderDropDown());

		wUtility.select(birth.getGenderDropDown(), 1);
//		Thread.sleep(5000);
//		//mother name
//		System.out.println("mother name");
//		assertValidate.assertByWebelementVisibility(birth.getMotherNameText());
//		assertValidate.assertByWebelementVisibility(birth.getMotherNameTextField());
//		
//		Thread.sleep(5000);
//		//father name
//		System.out.println("father name");
//		assertValidate.assertByWebelementVisibility(birth.getFatherNameText());
//		assertValidate.assertByWebelementVisibility(birth.getFatherNameTextField());

		// get details button
		System.out.println("get details button");
		assertValidate.assertByWebelementVisibility(birth.getAcknowledgementNoGetDetailsButton());
		Thread.sleep(2000);
		birth.getAcknowledgementNoGetDetailsButton().click();

		while_Run();

		Thread.sleep(5000);
		// select record
		System.out.println("select record");
		assertValidate.assertByWebelementVisibility(birth.getSelectBirthOrDeathRecordText());
		Thread.sleep(5000);
		// select checkbox record
		assertValidate.assertByWebelementVisibility(birth.getCheckBoxInAcknowledgementNumber());

		birth.getCheckBoxInAcknowledgementNumber().click();
		while_Run();
		wUtility.scrollDownByKey(7);
		Thread.sleep(2000);

		while_Run();
		// clicking select button
		assertValidate.assertByWebelementVisibility(birth.getSubmitButtonInAcknowledgementPage());

		birth.getSubmitButtonInAcknowledgementPage().click();
		Thread.sleep(5000);

		wUtility.switchToWindowByTitle(driver, "BIRTH AND DEATH CERTIFICATE GHMC NEW");
		while_Run();

		// select getdetails button
		assertValidate.assertByWebelementVisibility(birth.getGetDetailsButton());
		birth.getGetDetailsButton().click();
		Thread.sleep(5000);

		while_Run();
		Thread.sleep(2000);

		// applicant details section
		System.out.println("applicant details");
		assertValidate.assertByWebelementVisibility(birth.getApplicantDetailsText());

		// old application no
		System.out.println("old application no");
		assertValidate.assertByWebelementVisibility(birth.getOldApplicationNoText());
		assertValidate.assertByWebelementVisibility(birth.getOldApplicationNoValueText());
		assertValidate.assertByEnabled(birth.getOldApplicationNoValueText());

		System.out.println(birth.getOldApplicationNoValueText().getAttribute("value"));

		// acknowledgement no
		System.out.println("acknowledgement no ");
		assertValidate.assertByWebelementVisibility(birth.getAcknowledgementNoInApplicantDetailsText());
		assertValidate.assertByWebelementVisibility(birth.getAcknowledgementNoValueInApplicationDetailsText());
		assertValidate.assertByEnabled(birth.getAcknowledgementNoValueInApplicationDetailsText());

		System.out.println(birth.getAcknowledgementNoValueInApplicationDetailsText().getText());

		// registration no
		System.out.println("registration no");
		assertValidate.assertByWebelementVisibility(birth.getRegistrationNoText());
		assertValidate.assertByWebelementVisibility(birth.getRegistrationNoValueText());
		assertValidate.assertByEnabled(birth.getRegistrationNoValueText());

		System.out.println(birth.getRegistrationNoValueText().getText());

		// child name
		System.out.println("child name");
		assertValidate.assertByWebelementVisibility(birth.getChildNameText());
		assertValidate.assertByWebelementVisibility(birth.getChildNameValueText());
		assertValidate.assertByEnabled(birth.getChildNameValueText());

		System.out.println(birth.getChildNameValueText().getText());

		// date of birth
		System.out.println("date of birth");
		assertValidate.assertByWebelementVisibility(birth.getDateOfBirthText());
		assertValidate.assertByWebelementVisibility(birth.getApplicantDateOfBirthValueText());
		assertValidate.assertByEnabled(birth.getApplicantDateOfBirthValueText());

		System.out.println(birth.getApplicantDateOfBirthValueText().getText());

		// gender
		System.out.println("gender");
		assertValidate.assertByWebelementVisibility(birth.getGenderNameText());
		assertValidate.assertByWebelementVisibility(birth.getGenderValueText());
		assertValidate.assertByEnabled(birth.getGenderValueText());

		System.out.println(birth.getGenderValueText().getText());

		// circle
		System.out.println("circle");
		assertValidate.assertByWebelementVisibility(birth.getCircleNameText());
		assertValidate.assertByWebelementVisibility(birth.getCircleNameValueText());
		assertValidate.assertByEnabled(birth.getCircleNameValueText());

		System.out.println(birth.getCircleNameValueText().getText());

		// ward
		System.out.println("ward");
		assertValidate.assertByWebelementVisibility(birth.getWardNameText());
		assertValidate.assertByWebelementVisibility(birth.getWardNameValueText());
		assertValidate.assertByEnabled(birth.getWardNameValueText());

		System.out.println(birth.getWardNameValueText().getText());

		// locality
		System.out.println("locality or landmark");
		assertValidate.assertByWebelementVisibility(birth.getLocalityNameText());
		assertValidate.assertByWebelementVisibility(birth.getLocalityNameValueText());
		assertValidate.assertByEnabled(birth.getLocalityNameValueText());

		System.out.println(birth.getLocalityNameValueText().getText());

		// father name
		System.out.println("father name");
		assertValidate.assertByWebelementVisibility(birth.getFatherNameText());
		assertValidate.assertByWebelementVisibility(birth.getFatherNameValueText());
		assertValidate.assertByEnabled(birth.getFatherNameValueText());

		System.out.println(birth.getFatherNameValueText().getText());

		wUtility.scrollDownByKey(7);
		Thread.sleep(3000);
		// mother name
		System.out.println("mother name");
		assertValidate.assertByWebelementVisibility(birth.getMotherNameText());
		assertValidate.assertByWebelementVisibility(birth.getMotherNameValueText());
		assertValidate.assertByEnabled(birth.getMotherNameValueText());

		System.out.println(birth.getMotherNameValueText().getText());

		// residence address
		System.out.println("residence address");
		assertValidate.assertByWebelementVisibility(birth.getResidenceAddressText());
		assertValidate.assertByWebelementVisibility(birth.getResidenceAddressValueText());
		assertValidate.assertByEnabled(birth.getResidenceAddressValueText());

		System.out.println(birth.getResidenceAddressValueText().getText());

		// permanent address
		System.out.println("permanent address");
		assertValidate.assertByWebelementVisibility(birth.getPermanenetAddressText());
		assertValidate.assertByWebelementVisibility(birth.getPermanentAddressValueText());
		assertValidate.assertByEnabled(birth.getPermanentAddressValueText());

		if (birth.getPermanentAddressValueText().getText().isEmpty()) {
			System.out.println("permanent address of applicant is empty");
		} else {
			System.out.println(birth.getPermanentAddressValueText().getText());
		}

		// registration date
		System.out.println("registration date");
		assertValidate.assertByWebelementVisibility(birth.getRegistrationDateText());
		assertValidate.assertByWebelementVisibility(birth.getRegistrationDateValueText());
		assertValidate.assertByEnabled(birth.getRegistrationDateValueText());

		System.out.println(birth.getRegistrationDateValueText().getText());

		// place of birth
		System.out.println("place of birth");
		assertValidate.assertByWebelementVisibility(birth.getPlaceOfBirthText());
		assertValidate.assertByWebelementVisibility(birth.getPlaceOfBirthValueText());
		assertValidate.assertByEnabled(birth.getPlaceOfBirthValueText());

		System.out.println(birth.getPlaceOfBirthValueText().getText());

		// remarks
		System.out.println("remarks");
		assertValidate.assertByWebelementVisibility(birth.getRemarksText());
		assertValidate.assertByWebelementVisibility(birth.getRemarksValueText());
		assertValidate.assertByEnabled(birth.getRemarksValueText());

		if (birth.getRemarksValueText().getText().isEmpty()) {
			System.out.println("remarks of applicant is empty");
		} else {
			System.out.println(birth.getRemarksValueText().getText());
		}

		Thread.sleep(2000);
		while_Run();
		// informant details

		System.out.println("informant details");
		assertValidate.assertByWebelementVisibility(birth.getInformantDetailsText());
		Thread.sleep(2000);
		// informant name
		System.out.println("informant name");
		assertValidate.assertByWebelementVisibility(birth.getInformantNameText());
		assertValidate.assertByWebelementVisibility(birth.getInformantNameTextField());
		assertValidate.assertByEnabled(birth.getInformantNameTextField());

		birth.getInformantNameTextField().sendKeys(excel.readExcelData("GHMC_Birth_Data", 1, 1));
		Thread.sleep(2000);
		// informant relationship
		System.out.println("informant relationship");
		assertValidate.assertByWebelementVisibility(birth.getInformantRelationshipText());
		assertValidate.assertByWebelementVisibility(birth.getInformantRelationshipTextField());
		assertValidate.assertByEnabled(birth.getInformantRelationshipTextField());

		wUtility.select(birth.getInformantRelationshipTextField(), 1);
		Thread.sleep(2000);
		// informant address
		System.out.println("informant address");
		assertValidate.assertByWebelementVisibility(birth.getInformantAddressText());
		assertValidate.assertByWebelementVisibility(birth.getInformantAddressTextField());
		assertValidate.assertByEnabled(birth.getInformantAddressTextField());

		birth.getInformantAddressTextField().sendKeys(excel.readExcelData("GHMC_Birth_Data", 2, 1));
		Thread.sleep(2000);
		wUtility.scrollDownByKey(5);
		Thread.sleep(2000);
		while_Run();
		// mobile no
		System.out.println("mobile no");
		assertValidate.assertByWebelementVisibility(birth.getMobileNoText());
		assertValidate.assertByWebelementVisibility(birth.getMobileNoTextField());
		assertValidate.assertByEnabled(birth.getMobileNoTextField());

		birth.getMobileNoTextField().sendKeys(excel.readExcelData("GHMC_Birth_Data", 3, 1));
		Thread.sleep(2000);
		// aadhaar no
		System.out.println("aadhaar no");
		assertValidate.assertByWebelementVisibility(birth.getAadhaarNOtext());
		assertValidate.assertByWebelementVisibility(birth.getAadhaarNoTextField());
		assertValidate.assertByEnabled(birth.getAadhaarNoTextField());

		birth.getAadhaarNoTextField().sendKeys(excel.readExcelData("GHMC_Birth_Data", 4, 1));
		Thread.sleep(2000);
		// pincode
		System.out.println("pincode");
		assertValidate.assertByWebelementVisibility(birth.getPincodeText());
		assertValidate.assertByWebelementVisibility(birth.getPincodeTextField());
		assertValidate.assertByEnabled(birth.getPincodeTextField());

		birth.getPincodeTextField().sendKeys(excel.readExcelData("GHMC_Birth_Data", 5, 1));
		Thread.sleep(2000);
		// purpose
		System.out.println("purpose");
		assertValidate.assertByWebelementVisibility(birth.getPurposeText());
		assertValidate.assertByWebelementVisibility(birth.getPurposeTextField());
		assertValidate.assertByEnabled(birth.getPurposeTextField());

		birth.getPurposeTextField().sendKeys(excel.readExcelData("GHMC_Birth_Data", 6, 1));
		Thread.sleep(2000);
		wUtility.scrollDownByKey(5);
		Thread.sleep(2000);
		// no of copies
		System.out.println("no of copies ");
		assertValidate.assertByWebelementVisibility(birth.getNoOfCopiesText());
		assertValidate.assertByWebelementVisibility(birth.getNoOfCopiesTextField());
		assertValidate.assertByEnabled(birth.getNoOfCopiesTextField());

		birth.getNoOfCopiesTextField().sendKeys(excel.readExcelData("GHMC_Birth_Data", 7, 1));
		Thread.sleep(2000);
		while_Run();
		// delivery type
		System.out.println("delivery type");
		assertValidate.assertByWebelementVisibility(birth.getDeliveryTypeText());
		assertValidate.assertByWebelementVisibility(birth.getDeliveryTypeDropDown());
		assertValidate.assertByEnabled(birth.getDeliveryTypeDropDown());

		wUtility.select(birth.getDeliveryTypeDropDown(), 1);
		Thread.sleep(2000);
		wUtility.switchToAlertAndAccept(driver);
		Thread.sleep(2000);

		// documents list
		System.out.println("document list");
		assertValidate.assertByWebelementVisibility(birth.getDocumentListText());
		System.out.println(birth.getDocumentListNoteText().getText());

		// file upload
		System.out.println("file upload");
		assertValidate.assertByWebelementVisibility(birth.getApplicationFormFileUpload());
		assertValidate.assertByEnabled(birth.getApplicationFormFileUpload());
		wUtility.click(driver, birth.getApplicationFormFileUpload());
		wUtility.uploadFile("C:\\Users\\DELL\\Documents\\Meeseva_Automation\\Demo\\src\\test\\resources\\image\\demo.pdf");

		Thread.sleep(2000);

		// application form
		System.out.println("check box");
		assertValidate.assertByWebelementVisibility(birth.getApplicationFormText());
		assertValidate.assertByWebelementVisibility(birth.getApplicationFormCheckBox());
		assertValidate.assertByEnabled(birth.getApplicationFormCheckBox());

		birth.getApplicationFormCheckBox().click();
		Thread.sleep(2000);
		while_Run();

		// show payment button
		System.out.println("show payment button");
		assertValidate.assertByWebelementVisibility(birth.getShowPaymentButton());
		Thread.sleep(2000);
		birth.getShowPaymentButton().click();
		Thread.sleep(2000);

		wUtility.switchToAlertAndAccept(driver);
		Thread.sleep(3000);

		while_Run();
		wUtility.scrollDownByKey(10);

		// total amount section
		// validating receive payment text
		System.out.println("receive payment section");
		assertValidate.assertByWebelementVisibility(birth.getReceiveAmountText());

		// validating challan amount
		System.out.println("challan amount");
		assertValidate.assertByWebelementVisibility(birth.getChallanAmountText());
		assertValidate.assertByEnabled(birth.getChallanAmountReadOnlyField());
		System.out.println("challan amount : " + birth.getChallanAmountReadOnlyField().getAttribute("value"));

		// validating user charges
		System.out.println("user charges");
		assertValidate.assertByWebelementVisibility(birth.getUserChargesText());
		assertValidate.assertByEnabled(birth.getUerChargesReadOnlyField());
		System.out.println("user charges : " + birth.getUerChargesReadOnlyField().getAttribute("value"));

		// validating courier charges
		System.out.println("courier charges");
		assertValidate.assertByWebelementVisibility(birth.getCourierChargesText());
		assertValidate.assertByEnabled(birth.getCourierChargesReadOnlyField());
		System.out.println("courier charges : " + birth.getCourierChargesReadOnlyField().getAttribute("value"));

		// validating stationary charges
		System.out.println("stationary charges");
		assertValidate.assertByWebelementVisibility(birth.getStationeryChargesText());
		assertValidate.assertByEnabled(birth.getStationeryChargesReadOnlyField());
		System.out.println("stationary charges : " + birth.getStationeryChargesReadOnlyField().getAttribute("value"));

		// validating total amount
		System.out.println("total amount");
		assertValidate.assertByWebelementVisibility(birth.getTotalAmountText());
		assertValidate.assertByEnabled(birth.getTotalAmountReadOnlyField());
		System.out.println("total amount : " + birth.getTotalAmountReadOnlyField().getAttribute("value"));

		while_Run();

		wUtility.scrollDownByKey(5);
		while_Run();
		// clicking on confirm payment button
		System.out.println("confirm payment");
		assertValidate.assertByWebelementVisibility(birth.getConfirmPaymentButton());
		birth.getConfirmPaymentButton().click();
		while_Run();
		Thread.sleep(3000);

		while_Run();

		// cash
		System.out.println("cash");
		assertValidate.assertByWebelementVisibility(birth.getCashPaymentOptionLink());

		// twallet pg
		System.out.println("twallet pg");
		assertValidate.assertByWebelementVisibility(birth.getTwalletPgPaymentOptionLink());

		// twallet
		System.out.println("twallet");
		assertValidate.assertByWebelementVisibility(birth.getTwalletPaymentOptionLink());

		// hdfc pg
		System.out.println("hdfc pg");
		assertValidate.assertByWebelementVisibility(birth.getHdfcPGPaymentOptionLink());

		// DD
		System.out.println("DD");
		assertValidate.assertByWebelementVisibility(birth.getDdPaymentOptionLink());

		// SBIePay
		System.out.println("SBIePay");
		assertValidate.assertByWebelementVisibility(birth.getSbiepayPaymentOptionLink());

		// Banks
		System.out.println("Banks");
		assertValidate.assertByWebelementVisibility(birth.getBanksPaymentOptionLink());

		// QR code
		System.out.println("QR code");
		assertValidate.assertByWebelementVisibility(birth.getQrcodePaymentOptionLink());

		birth.getCashPaymentOptionLink().click();
		while_Run();

		Thread.sleep(2000);

		// make payment
		assertValidate.assertByWebelementVisibility(birth.getMakePaymentButton());
		wUtility.scrollDownByKey(5);
		birth.getMakePaymentButton().click();
		Thread.sleep(5000);
		while_Run();

		// receipt page

		System.out.println("receipt page");
		Receipt_Page receipt = new Receipt_Page(driver);

		assertValidate.assertByWebelementVisibility(receipt.getApplicationNoText());
		System.out.println(receipt.getApplicationNoText().getText());

		System.out.println(birth.getBirthCertificateReceiptText().getText());
		Thread.sleep(3000);
		while_Run();

		birth.getPrintCertificateButton().click();
		Thread.sleep(2000);

		// stationary
		System.out.println("stationary serial no");
		assertValidate.assertByWebelementVisibility(birth.getStationaryNoText());
		System.out.println(birth.getStationaryNoText().getText());

		birth.getStationartNoValueTextField().sendKeys("erts12");
		birth.getMidNoValueTextField().sendKeys("1245673");
		birth.getLastNovalueTextField().sendKeys("1");
		Thread.sleep(2000);
		while_Run();

		birth.getSerialNoSubmitButton().click();
		Thread.sleep(5000);

		while_Run();
		Thread.sleep(2000);

		wUtility.switchToWindowByUrl(driver,
				"https://tsstaging.meeseva.telangana.gov.in/TSPortalgchu/UserInterface/Citizen/GHMC/BirthCertificate.");

		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		while_Run();

		wUtility.scrollDownByKey(2);
		while_Run();
		Thread.sleep(2000);

		driver.close();

		wUtility.switchToWindowByTitle(driver, "BIRTH AND DEATH CERTIFICATE GHMC RECEIPT");
		Thread.sleep(2000);
		System.out.println(birth.getBirthCertificateReceiptText().getText());
		while_Run();

		if (birth.getBirthCertificateReceiptText().isDisplayed()) {

			System.out.println("receipt is displayed");
			excel.writeData("BIRTH_GHMC", 6, 3, "PASS");
		} else {
			excel.writeData("BIRTH_GHMC", 6, 3, "FAIL");
		}

		end_Report(birth.getBirthCertificateReceiptText(), excel.readExcelData("BIRTH_GHMC", 6, 0));

	}

}
