package Revenue_Residence_Certificate_Service;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import base_test.BaseClass;
import pom_classes.Access_Page;
import pom_classes.Receipt_Page;
import pom_classes.Residence_Certificate_Page;
import pom_classes.Revenue_Dept_Details_Page;

public class residence_application_01 extends BaseClass {

	@Test
	public void residence_process_01() throws Throwable, IOException, Throwable {

		start_Report(excel.readExcelData("MEE_RESIDENCE_SERVICE", 6, 0),
				excel.readExcelData("MEE_RESIDENCE_SERVICE", 6, 1), excel.readExcelData("MEE_RESIDENCE_SERVICE", 6, 2));

		while_Run();
		// navigating to access page
		Access_Page access = new Access_Page(driver);

		// clicking on revenue department
		access.getRevenueDepartmentLink().click();
		Thread.sleep(2000);
		while_Run();
//		wUtility.scrollDownByKey(2);
//		while_Run();

		// navigating to revenue dept
		Revenue_Dept_Details_Page rev = new Revenue_Dept_Details_Page(driver);
		// clicking on residence certificate link
		System.out.println("residence service");
		assertValidate.assertByWebelementVisibility(rev.getResidenceCertificateServiceLink());
		rev.getResidenceCertificateServiceLink().click();
		Thread.sleep(2000);

		// navigated to residence application form

		wUtility.switchToWindowByTitle(driver, "RESIDENCE CERTIFICATE");
		Thread.sleep(2000);
		Residence_Certificate_Page res = new Residence_Certificate_Page(driver);

		driver.navigate().refresh();
		// validating dept with service name
		System.out.println("dept with service name");
		assertValidate.assertByWebelementVisibility(res.getDepartmentNameText());
		assertValidate.assertByWebelementVisibility(res.getServiceNameText());
		System.out.println("dept with service name : " + res.getDepartmentNameText().getText() + ":"
				+ res.getServiceNameText().getText());

		// applicant details
		System.out.println("applicant details");
		assertValidate.assertByWebelementVisibility(res.getApplicantDetailsText());

		// fetching application no
		System.out.println("application no");
		assertValidate.assertByWebelementVisibility(res.getApplicationNumberText());
		assertValidate.assertByWebelementVisibility(res.getApplicationNumberTextField());
		assertValidate.assertByEnabled(res.getApplicationNumberTextField());

		System.out.println("application no : " + res.getApplicationNumberTextField().getAttribute("value"));

		// entering aadhaar no
		System.out.println("aadhaar no");
		assertValidate.assertByWebelementVisibility(res.getAadhaarNoText());
		assertValidate.assertByWebelementVisibility(res.getAadhaarNoTextField());
		assertValidate.assertByEnabled(res.getAadhaarNoTextField());

		res.getAadhaarNoTextField().sendKeys(excel.readExcelData("Residence_User_Data", 1, 1));

		// entering applicant name
		System.out.println("applicant name");
		assertValidate.assertByWebelementVisibility(res.getApplicantNameText());
		assertValidate.assertByWebelementVisibility(res.getApplicantNameTextField());
		assertValidate.assertByEnabled(res.getApplicantNameTextField());

		res.getApplicantNameTextField().sendKeys(excel.readExcelData("Residence_User_Data", 2, 1));

		// entering father/husband/mother/guardian name
		System.out.println("father/husband/mother/guardian name");
		assertValidate.assertByWebelementVisibility(res.getFatherOrHusbandOrMotherOrGuardianNameText());
		assertValidate.assertByWebelementVisibility(res.getFatherOrHusbandOrMotherOrGuardianNameTextField());
		assertValidate.assertByEnabled(res.getFatherOrHusbandOrMotherOrGuardianNameTextField());

		res.getFatherOrHusbandOrMotherOrGuardianNameTextField()
				.sendKeys(excel.readExcelData("Residence_User_Data", 3, 1));

		// selecting gender
		System.out.println("gender");
		assertValidate.assertByWebelementVisibility(res.getGenderText());
		assertValidate.assertByWebelementVisibility(res.getGenderDropDown());
		assertValidate.assertByEnabled(res.getGenderDropDown());

		wUtility.select(res.getGenderDropDown(), 1);

		// selecting dob
		System.out.println("date of birth");
		assertValidate.assertByWebelementVisibility(res.getDateOfBirthText());
		assertValidate.assertByWebelementVisibility(res.getDateOfBirthTextField());
		assertValidate.assertByEnabled(res.getDateOfBirthTextField());

		wUtility.enterDataUsingJavaScript(driver, res.getDateOfBirthTextField(),
				excel.readExcelData("Residence_User_Data", 9, 1));

		// permanent address
		System.out.println("permanent address secction");
		assertValidate.assertByWebelementVisibility(res.getPermanentAddressText());

		// entering door no
		System.out.println("door no");
		assertValidate.assertByWebelementVisibility(res.getDoorNoText());
		assertValidate.assertByWebelementVisibility(res.getDoorNoTextField());
		assertValidate.assertByEnabled(res.getDoorNoTextField());

		res.getDoorNoTextField().sendKeys(excel.readExcelData("Residence_User_Data", 4, 1));

		Thread.sleep(2000);

		Thread.sleep(2000);
		// selecting district
		System.out.println("district");
		assertValidate.assertByWebelementVisibility(res.getDistrictText());
		assertValidate.assertByWebelementVisibility(res.getDistrictDropDown());
		assertValidate.assertByEnabled(res.getDistrictDropDown());

		wUtility.select(res.getDistrictDropDown(), 1);

		Thread.sleep(10000);
		// selecting mandal
		System.out.println("mandal");
		assertValidate.assertByWebelementVisibility(res.getMandalText());
		assertValidate.assertByWebelementVisibility(res.getMandalDropDown());
		assertValidate.assertByEnabled(res.getMandalDropDown());

		wUtility.select(res.getMandalDropDown(), 1);
		while_Run();

		Thread.sleep(10000);
		// selecting village
		System.out.println("village");
		assertValidate.assertByWebelementVisibility(res.getVillageOrWardText());
		assertValidate.assertByWebelementVisibility(res.getVillageOrWardDropDown());
		assertValidate.assertByEnabled(res.getVillageOrWardDropDown());

		wUtility.select(res.getVillageOrWardDropDown(), 1);

		// pincode
		System.out.println("pincode");
		assertValidate.assertByWebelementVisibility(res.getPincodeText());
		assertValidate.assertByWebelementVisibility(res.getPincodeTextField());
		assertValidate.assertByEnabled(res.getPincodeTextField());

		res.getPincodeTextField().sendKeys(excel.readExcelData("Residence_User_Data", 6, 1));

		// entering locality
//		System.out.println("locality");
//		assertValidate.assertByWebelementVisibility(res.getLocalityOrLandmarkText());
//		assertValidate.assertByWebelementVisibility(res.getLocalityOrLandmarkTextField());
//		assertValidate.assertByEnabled(res.getLocalityOrLandmarkTextField());
//		res.getLocalityOrLandmarkTextField().sendKeys(excel.readExcelData("Residence_User_Data", 5, 1));

		// mobile no
		System.out.println("mobile no");
		assertValidate.assertByWebelementVisibility(res.getMobileNoText());
		assertValidate.assertByWebelementVisibility(res.getMobileNoTextField());
		assertValidate.assertByEnabled(res.getMobileNoTextField());

		res.getMobileNoTextField().sendKeys(excel.readExcelData("Residence_User_Data", 7, 1));

		// delivery type
		System.out.println("delivery type");
		assertValidate.assertByWebelementVisibility(res.getDeliveryTypeText());
		assertValidate.assertByWebelementVisibility(res.getDeliveryTypeDropDown());
		assertValidate.assertByEnabled(res.getDeliveryTypeDropDown());

		wUtility.select(res.getDeliveryTypeDropDown(), 1);

		wUtility.switchToAlertAndAccept(driver);
		Thread.sleep(2000);

		// residence certificate details
		System.out.println("residence certificate details");
		assertValidate.assertByWebelementVisibility(res.getResidenceCertificateDetailstText());

		// purpose
		System.out.println("purpose");
		assertValidate.assertByWebelementVisibility(res.getPurposeText());
		assertValidate.assertByWebelementVisibility(res.getPurposeDropDown());
		assertValidate.assertByEnabled(res.getPurposeDropDown());

		wUtility.select(res.getPurposeDropDown(), 1);

		// residing since
		System.out.println("residing since");
		assertValidate.assertByWebelementVisibility(res.getResidingSinceInYearsText());
		assertValidate.assertByWebelementVisibility(res.getResidingSinceTextField());
		assertValidate.assertByEnabled(res.getResidingSinceTextField());
		res.getResidingSinceTextField().click();
		wUtility.deleteByKey(1);
		res.getResidingSinceTextField().sendKeys(excel.readExcelData("Residence_User_Data", 8, 1));

		while_Run();

		// clicking supporting docs checkbox
		System.out.println("supporting docs checkbox");
		assertValidate.assertByWebelementVisibility(res.getSupportingDocumentsText());
		assertValidate.assertByWebelementVisibility(res.getSupportingDocumentsCheckBox());
		assertValidate.assertByEnabled(res.getSupportingDocumentsCheckBox());
		res.getSupportingDocumentsCheckBox().click();

		Thread.sleep(2000);
		// uploading supporting docs
		System.out.println("uploading support docs");

		assertValidate.assertByWebelementVisibility(res.getSupportingDocumentsFileUpload());
		assertValidate.assertByEnabled(res.getSupportingDocumentsFileUpload());
		wUtility.click(driver, res.getSupportingDocumentsFileUpload());
		wUtility.uploadFile("C:\\Users\\Harshitha\\Downloads\\Demo\\Demo\\src\\test\\resources\\image\\demo.pdf");

		Thread.sleep(2000);
		wUtility.switchToAlertAndAccept(driver);

		Thread.sleep(2000);
		// clicking photo checkbox
		System.out.println("photo checkbox");
		assertValidate.assertByWebelementVisibility(res.getPassportSizePhotoText());
		assertValidate.assertByWebelementVisibility(res.getPassportSizePhotoCheckBox());
		assertValidate.assertByEnabled(res.getPassportSizePhotoCheckBox());
		res.getPassportSizePhotoCheckBox().click();

		Thread.sleep(2000);
		// uploading photo
		System.out.println("photo upload");
		assertValidate.assertByWebelementVisibility(res.getPhotoFileUpload());
		assertValidate.assertByEnabled(res.getPhotoFileUpload());
		wUtility.click(driver, res.getPhotoFileUpload());
		wUtility.uploadFile("C:\\Users\\Harshitha\\Downloads\\Demo\\Demo\\src\\test\\resources\\image\\image2.jpg");

		Thread.sleep(2000);
		res.getLocalityOrLandmarkTextField().sendKeys(excel.readExcelData("Residence_User_Data", 5, 1));
		Thread.sleep(2000);
		while_Run();

		// show payment button
		System.out.println("show payment button");
		res.getShowPaymentButton().click();

		wUtility.switchToAlertAndAccept(driver);
		Thread.sleep(2000);

		while_Run();

		// total amount section
		// validating receive payment text
		System.out.println("receive payment section");
		assertValidate.assertByWebelementVisibility(res.getReceivePaymentText());

		// validating challan amount
		System.out.println("challan amount");
		assertValidate.assertByWebelementVisibility(res.getChallanAmountReadOnlyField());
		assertValidate.assertByEnabled(res.getChallanAmountReadOnlyField());
		System.out.println("challan amount : " + res.getChallanAmountReadOnlyField().getAttribute("value"));

		// validating usercharges
		System.out.println("user charges");
		assertValidate.assertByWebelementVisibility(res.getUserChargesReadOnlyField());
		assertValidate.assertByEnabled(res.getUserChargesReadOnlyField());
		System.out.println("user charges : " + res.getUserChargesReadOnlyField().getAttribute("value"));

		// validating courier charges
		System.out.println("courier charges");
		assertValidate.assertByWebelementVisibility(res.getCourierChargesReadOnlyField());
		assertValidate.assertByEnabled(res.getCourierChargesReadOnlyField());
		System.out.println("courier charges : " + res.getCourierChargesReadOnlyField().getAttribute("value"));

		// validating total amount
		System.out.println("total amount");
		assertValidate.assertByWebelementVisibility(res.getTotalAmountReadOnlyField());
		assertValidate.assertByEnabled(res.getTotalAmountReadOnlyField());
		System.out.println("total amount : " + res.getTotalAmountReadOnlyField().getAttribute("value"));

		while_Run();

//		wUtility.scrollDownByKey(2);
		// clicking on confirm payment button
		System.out.println("confirm payment");
		assertValidate.assertByWebelementVisibility(res.getConfirmPaymentButton());
		res.getConfirmPaymentButton().click();

		Thread.sleep(3000);

		while_Run();

		// cash
		System.out.println("cash");
		assertValidate.assertByWebelementVisibility(res.getCashPaymentOptionLink());

		// twallet pg
		System.out.println("twallet pg");
		assertValidate.assertByWebelementVisibility(res.getTwalletPgPaymentOptionLink());

		// twallet
		System.out.println("twallet");
		assertValidate.assertByWebelementVisibility(res.getTwalletPaymentOptionLink());

		// hdfc pg
		System.out.println("hdfc pg");
		assertValidate.assertByWebelementVisibility(res.getHdfcPGPaymentOptionLink());

		// DD
		System.out.println("DD");
		assertValidate.assertByWebelementVisibility(res.getDdPaymentOptionLink());

		// SBIePay
		System.out.println("SBIePay");
		assertValidate.assertByWebelementVisibility(res.getSbiepayPaymentOptionLink());

		// Banks
		System.out.println("Banks");
		assertValidate.assertByWebelementVisibility(res.getBanksPaymentOptionLink());

		// QR code
		System.out.println("QR code");
		assertValidate.assertByWebelementVisibility(res.getQrcodePaymentOptionLink());

		res.getCashPaymentOptionLink().click();
		while_Run();

		Thread.sleep(2000);

		// make payment
		assertValidate.assertByWebelementVisibility(res.getMakePaymentButton());

		res.getMakePaymentButton().click();
		Thread.sleep(3000);
		while_Run();

		// storing the application no in properties
		Receipt_Page receipt = new Receipt_Page(driver);

		property.storeData("ApplicationNoResidence", receipt.getApplicationNoText().getText());

		if (receipt.getDepartmentWithServiceNamesText().getText().contains("Residence Certiicate")) {

			System.out.println(receipt.getDepartmentWithServiceNamesText().getText());
			excel.writeData("MEE_RESIDENCE_SERVICE", 6, 3, "PASS");
		} else {
			excel.writeData("MEE_RESIDENCE_SERVICE", 6, 3, "FAIL");
		}

		end_Report(receipt.getDepartmentWithServiceNamesText(), excel.readExcelData("MEE_RESIDENCE_SERVICE", 6, 0));

	}

}
