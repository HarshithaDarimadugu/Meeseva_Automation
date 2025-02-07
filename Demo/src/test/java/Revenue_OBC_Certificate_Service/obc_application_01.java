package Revenue_OBC_Certificate_Service;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import base_test.BaseClass;
import pom_classes.Access_Page;
import pom_classes.OBC_Certificate_Page;
import pom_classes.Receipt_Page;
import pom_classes.Revenue_Dept_Details_Page;

public class obc_application_01 extends BaseClass {

	/**
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 * @throws Throwable
	 */
	@Test
	public void obc_application_process() throws EncryptedDocumentException, IOException, Throwable {

		start_Report(excel.readExcelData("MEE_OBC_SERVICE", 6, 0), excel.readExcelData("MEE_OBC_SERVICE", 6, 1),
				excel.readExcelData("MEE_OBC_SERVICE", 6, 2));

		// dashboard
		Access_Page access = new Access_Page(driver);
		while_Run();

		// redirecting to revenue department
		access.getRevenueDepartmentLink().click();
		while_Run();

		// validating the fields and clicking on the service of OBC
		Revenue_Dept_Details_Page details = new Revenue_Dept_Details_Page(driver);

		System.out.println("search bar");
		assertValidate.assertByWebelementVisibility(details.getSearchServiceTextField());

		details.getObcCertificateServiceLink().click();
		Thread.sleep(2000);
		while_Run();

		wUtility.switchToWindowByTitle(driver, "OBC CERTIFICATE");
		Thread.sleep(2000);

		// validating the service name
		OBC_Certificate_Page obc = new OBC_Certificate_Page(driver);
		System.out.println("service name");
		assertValidate.assertByWebelementVisibility(obc.getDepartmentWithServiceNameText());
		System.out.println(obc.getDepartmentWithServiceNameText().getText());

		// validating application no
		System.out.println("application no");
		assertValidate.assertByWebelementVisibility(obc.getApplicationNumberText());
		assertValidate.assertByWebelementVisibility(obc.getApplicationNoTextField());
		assertValidate.assertByEnabled(obc.getApplicationNoTextField());

		System.out.println(obc.getApplicationNoTextField().getText());
//		driver.navigate().refresh();
//		Thread.sleep(2000);
		// entering aadhaar no
		System.out.println("aadhaar no");
		assertValidate.assertByWebelementVisibility(obc.getAadhaarNoText());
		assertValidate.assertByWebelementVisibility(obc.getAadhaarNoTextField());
		assertValidate.assertByEnabled(obc.getAadhaarNoTextField());

		obc.getAadhaarNoTextField().sendKeys(excel.readExcelData("OBC_USER_DATA", 1, 1));

		// entering applicant name
		System.out.println("applicant name");
		assertValidate.assertByWebelementVisibility(obc.getApplicantNameText());
		assertValidate.assertByWebelementVisibility(obc.getApplicantNameTextField());
		assertValidate.assertByEnabled(obc.getApplicantNameTextField());

		obc.getApplicantNameTextField().sendKeys(excel.readExcelData("OBC_USER_DATA", 2, 1));

		// selecting gender
		System.out.println("gender");
		assertValidate.assertByWebelementVisibility(obc.getGenderText());
		assertValidate.assertByWebelementVisibility(obc.getGenderDropDown());
		assertValidate.assertByEnabled(obc.getGenderDropDown());

		wUtility.select(obc.getGenderDropDown(), 0);

		// entering relationship details
		System.out.println("relationship text");
		assertValidate.assertByWebelementVisibility(obc.getRelationshipText());
		System.out.println("relationship category");
		assertValidate.assertByWebelementVisibility(obc.getRelationshipCategoryDropDown());
		assertValidate.assertByEnabled(obc.getRelationshipCategoryDropDown());

		wUtility.select(obc.getRelationshipCategoryDropDown(), 2);
		System.out.println("relation person name");
		assertValidate.assertByWebelementVisibility(obc.getRelationshipWithPersonNameTextField());
		assertValidate.assertByEnabled(obc.getRelationshipWithPersonNameTextField());

		obc.getRelationshipWithPersonNameTextField().sendKeys(excel.readExcelData("OBC_USER_DATA", 3, 1));

		// entering door no
		System.out.println("door no");
		assertValidate.assertByWebelementVisibility(obc.getDoorNoText());
		assertValidate.assertByWebelementVisibility(obc.getDoorNoTextField());
		assertValidate.assertByEnabled(obc.getDoorNoTextField());

		obc.getDoorNoTextField().sendKeys(excel.readExcelData("OBC_USER_DATA", 4, 1));

		// entering locality
		System.out.println("locality");
		assertValidate.assertByWebelementVisibility(obc.getLocalityOrLandmarkText());
		assertValidate.assertByWebelementVisibility(obc.getLocalityOrLandmarkTextField());
		assertValidate.assertByEnabled(obc.getLocalityOrLandmarkTextField());

		obc.getLocalityOrLandmarkTextField().sendKeys(excel.readExcelData("OBC_USER_DATA", 5, 1));

//		driver.navigate().refresh();
		// selecting district
		System.out.println("district");
		assertValidate.assertByWebelementVisibility(obc.getDistrictText());
		assertValidate.assertByWebelementVisibility(obc.getDistrictDropDown());
		assertValidate.assertByEnabled(obc.getDistrictDropDown());
		wUtility.getAllOption(obc.getDistrictDropDown());
		wUtility.select(obc.getDistrictDropDown(), 1);
		
		Thread.sleep(10000);
		// selecting mandal
		System.out.println("mandal");
		assertValidate.assertByWebelementVisibility(obc.getMandalText());
		assertValidate.assertByWebelementVisibility(obc.getMandalDropDown());
		assertValidate.assertByEnabled(obc.getMandalDropDown());
		wUtility.getAllOption(obc.getMandalDropDown());
		wUtility.select(obc.getMandalDropDown(), 1);
		
		Thread.sleep(10000);
		// selecting village
		System.out.println("village");
		assertValidate.assertByWebelementVisibility(obc.getVillageOrWardText());
		assertValidate.assertByWebelementVisibility(obc.getVillageOrWardDropDown());
		assertValidate.assertByEnabled(obc.getVillageOrWardDropDown());
		wUtility.getAllOption(obc.getVillageOrWardDropDown());
		wUtility.select(obc.getVillageOrWardDropDown(), 1);

		Thread.sleep(2000);
		// entering pincode
		System.out.println("pincode");
		assertValidate.assertByWebelementVisibility(obc.getPincodeText());
		assertValidate.assertByWebelementVisibility(obc.getPincodeTextField());
		assertValidate.assertByEnabled(obc.getPincodeTextField());
		obc.getPincodeTextField().sendKeys(excel.readExcelData("OBC_USER_DATA", 6, 1));

		// entering mobile no
		System.out.println("mobile no");
		assertValidate.assertByWebelementVisibility(obc.getMobileNoText());
		assertValidate.assertByWebelementVisibility(obc.getMobileNoTextField());
		assertValidate.assertByEnabled(obc.getMobileNoTextField());

		obc.getMobileNoTextField().sendKeys(excel.readExcelData("OBC_USER_DATA", 7, 1));

		// selecting delivery type
		System.out.println("delivery type");
		assertValidate.assertByWebelementVisibility(obc.getDeliveryTypeText());
		assertValidate.assertByWebelementVisibility(obc.getDeliveryTypeDropDown());
		assertValidate.assertByEnabled(obc.getDeliveryTypeDropDown());
		wUtility.getAllOption(obc.getDeliveryTypeDropDown());
		wUtility.select(obc.getDeliveryTypeDropDown(), 1);

		wUtility.switchToAlertAndAccept(driver);
		Thread.sleep(2000);

//		wUtility.scrollDownByKey(2);
		// selecting state
		System.out.println("state");
		assertValidate.assertByWebelementVisibility(obc.getStateText());
		assertValidate.assertByWebelementVisibility(obc.getStateDropDown());
		assertValidate.assertByEnabled(obc.getStateDropDown());
		wUtility.getAllOption(obc.getStateDropDown());
		wUtility.selectByAttribute(obc.getStateDropDown(), "31");

		Thread.sleep(2000);
		// issued certificate in past
		System.out.println("issued certiicate");
		assertValidate.assertByWebelementVisibility(obc.getIssuedCasteCertificateInPastText());
		assertValidate.assertByWebelementVisibility(obc.getIssuedCasteCertificateInPastDropDown());
		assertValidate.assertByEnabled(obc.getIssuedCasteCertificateInPastDropDown());
		wUtility.getAllOption(obc.getIssuedCasteCertificateInPastDropDown());
		wUtility.select(obc.getIssuedCasteCertificateInPastDropDown(), 1);
		
		Thread.sleep(2000);
		// caste category
		System.out.println("caste category");
		assertValidate.assertByWebelementVisibility(obc.getCasteCategoryText());
		assertValidate.assertByWebelementVisibility(obc.getCasteCategoryReadOnlyField());
		assertValidate.assertByEnabled(obc.getCasteCategoryReadOnlyField());
		wUtility.getAllOption(obc.getStateDropDown());
		System.out.println(obc.getCasteCategoryReadOnlyField().getText());
		
		
		Thread.sleep(2000);
		// education certificate contains caste
		System.out.println("Education certificate contains caste");
		assertValidate.assertByWebelementVisibility(obc.getEducationCertificateContainsCasteText());
		assertValidate.assertByWebelementVisibility(obc.getEducationCertificateContainsCasteDropDown());
		assertValidate.assertByEnabled(obc.getEducationCertificateContainsCasteDropDown());
		wUtility.getAllOption(obc.getEducationCertificateContainsCasteDropDown());
		wUtility.select(obc.getEducationCertificateContainsCasteDropDown(), 1);

		Thread.sleep(2000);
		// purpose
		System.out.println("purpose");
		assertValidate.assertByWebelementVisibility(obc.getPurposeOfCasteCertificateText());
		assertValidate.assertByWebelementVisibility(obc.getPurposeOfCasteCertificateDropDown());
		assertValidate.assertByEnabled(obc.getPurposeOfCasteCertificateDropDown());
		wUtility.getAllOption(obc.getPurposeOfCasteCertificateDropDown());
		wUtility.select(obc.getPurposeOfCasteCertificateDropDown(), 2);

		Thread.sleep(2000);
		// religion
		System.out.println("religion");
		assertValidate.assertByWebelementVisibility(obc.getReligionText());
		assertValidate.assertByWebelementVisibility(obc.getReligionDropDown());
		assertValidate.assertByEnabled(obc.getReligionDropDown());
		wUtility.getAllOption(obc.getReligionDropDown());
		wUtility.selectByAttribute(obc.getReligionDropDown(), "01");
		
		Thread.sleep(2000);
		//family income
		System.out.println("family income");
		assertValidate.assertByWebelementVisibility(obc.getFamilyIncomeText());
		assertValidate.assertByWebelementVisibility(obc.getFamilyIncomeText());
		assertValidate.assertByEnabled(obc.getFamilyIncomeTextField());
		
		obc.getFamilyIncomeTextField().sendKeys(excel.readExcelData("OBC_USER_DATA", 8, 1));
		wUtility.scrollDownByKey(2);
		Thread.sleep(2000);
		// application form checkbox
		System.out.println("application form checkbox");
		assertValidate.assertByWebelementVisibility(obc.getApplicationFormText());
		assertValidate.assertByWebelementVisibility(obc.getApplicationFormCheckBox());
		assertValidate.assertByEnabled(obc.getApplicationFormCheckBox());

		obc.getApplicationFormCheckBox().click();
		Thread.sleep(2000);
		
		// application form file upload
		System.out.println("file upload");
		assertValidate.assertByWebelementVisibility(obc.getApplicationFormFileUpload());

		wUtility.click(driver, obc.getApplicationFormFileUpload());
		wUtility.uploadFile("C:\\Users\\Harshitha\\Downloads\\Demo\\Demo\\src\\test\\resources\\image\\demo.pdf");

		Thread.sleep(5000);
		// caste claimed
		System.out.println("caste claimed");
		assertValidate.assertByWebelementVisibility(obc.getCasteClaimedText());
		assertValidate.assertByWebelementVisibility(obc.getCasteClaimedDropDown());
		assertValidate.assertByEnabled(obc.getCasteClaimedDropDown());

		wUtility.selectByAttribute(obc.getCasteClaimedDropDown(), "Mudiraj");

		// disclaimer
		System.out.println("disclaimer");
		assertValidate.assertByWebelementVisibility(obc.getDeclarationCheckBox());
		Thread.sleep(2000);
		obc.getDeclarationCheckBox().click();
		System.out.println(obc.getDeclarationText().getText());

		// clicking on show payment
		System.out.println("show payment");
		assertValidate.assertByWebelementVisibility(obc.getShowPaymentButton());	
		
		while_Run();
		obc.getShowPaymentButton().click();
		wUtility.switchToAlertAndAccept(driver);
		Thread.sleep(2000);

		while_Run();
		wUtility.scrollDownByKey(2);
		while_Run();

		// receive payment
		// total amount section
		// validating receive payment text
		System.out.println("receive payment section");
		assertValidate.assertByWebelementVisibility(obc.getReceivePaymentText());

		// validating challan amount
		System.out.println("challan amount");
		assertValidate.assertByWebelementVisibility(obc.getChallanAmountText());
		assertValidate.assertByWebelementVisibility(obc.getChallanAmountReadOnlyField());
		assertValidate.assertByEnabled(obc.getChallanAmountReadOnlyField());
		System.out.println("challan amount : " + obc.getChallanAmountReadOnlyField().getAttribute("value"));

		// validating usercharges
		System.out.println("user charges");
		assertValidate.assertByWebelementVisibility(obc.getUserChargesText());
		assertValidate.assertByWebelementVisibility(obc.getUserChargesReadOnlyField());
		assertValidate.assertByEnabled(obc.getUserChargesReadOnlyField());
		System.out.println("user charges : " + obc.getUserChargesReadOnlyField().getAttribute("value"));

		// validating courier charges
		System.out.println("courier charges");
		assertValidate.assertByWebelementVisibility(obc.getCourierChargesText());
		assertValidate.assertByWebelementVisibility(obc.getCourierChargesReadOnlyField());
		assertValidate.assertByEnabled(obc.getCourierChargesReadOnlyField());
		System.out.println("courier charges : " + obc.getCourierChargesReadOnlyField().getAttribute("value"));

		// validating total amount
		System.out.println("total amount");
		assertValidate.assertByWebelementVisibility(obc.getTotalAmountText());
		assertValidate.assertByWebelementVisibility(obc.getTotalAmountReadOnlyField());
		assertValidate.assertByEnabled(obc.getTotalAmountReadOnlyField());
		System.out.println("total amount : " + obc.getTotalAmountReadOnlyField().getAttribute("value"));

		// clicking on confirm payment button
		System.out.println("confirm payment");
		assertValidate.assertByWebelementVisibility(obc.getConfirmPaymentButton());
		obc.getConfirmPaymentButton().click();

		Thread.sleep(3000);

		// payment options section

		while_Run();
		// cash
		System.out.println("cash");
		assertValidate.assertByWebelementVisibility(obc.getCashPaymentOptionLink());

		// twallet pg
		System.out.println("twallet pg");
		assertValidate.assertByWebelementVisibility(obc.getTwalletPgPaymentOptionLink());

		// twallet
		System.out.println("twallet");
		assertValidate.assertByWebelementVisibility(obc.getTwalletPaymentOptionLink());

		// hdfc pg
		System.out.println("hdfc pg");
		assertValidate.assertByWebelementVisibility(obc.getHdfcPGPaymentOptionLink());

		// DD
		System.out.println("DD");
		assertValidate.assertByWebelementVisibility(obc.getDdPaymentOptionLink());

		// SBIePay
		System.out.println("SBIePay");
		assertValidate.assertByWebelementVisibility(obc.getSbiepayPaymentOptionLink());

		// Banks
		System.out.println("Banks");
		assertValidate.assertByWebelementVisibility(obc.getBanksPaymentOptionLink());

		// QR code
		System.out.println("QR code");
		assertValidate.assertByWebelementVisibility(obc.getQrcodePaymentOptionLink());
		
		obc.getCashPaymentOptionLink().click();
		while_Run();
		
		Thread.sleep(2000);
		
		//make payment
		System.out.println("make payment");
		assertValidate.assertByWebelementVisibility(obc.getMakePaymentButton());
		
		obc.getMakePaymentButton().click();
		Thread.sleep(3000);
		while_Run();
		while_Run();
		Receipt_Page receipt = new Receipt_Page(driver);
	
		//validation application no
		assertValidate.assertByWebelementVisibility(receipt.getApplicationNoText());
		System.out.println(receipt.getApplicationNoText().getText());
		
		property.storeData("ApplicationNoOBC", receipt.getApplicationNoText().getText());
		
		if(receipt.getDepartmentWithServiceNamesText()
				.getText().equals("Revenue - OBC CERTIFICATE RECEIPT")){
			System.out.println("OBC application applied successfully");
			excel.writeData("MEE_OBC_SERVICE", 6, 3, "PASS");
		}else {
			excel.writeData("MEE_OBC_SERVICE", 6, 3, "FAIL");
		}
		
		end_Report(receipt.getDepartmentWithServiceNamesText(), excel.readExcelData("MEE_OBC_SERVICE", 6, 0));

	}

}
