package Revenue_Income_Certificate_Service;

import java.util.List;

import org.testng.annotations.Test;

import base_test.BaseClass;
import pom_classes.Access_Page;
import pom_classes.Income_Certificate_Page;
import pom_classes.Receipt_Page;
import pom_classes.Revenue_Dept_Details_Page;

public class Income_01 extends BaseClass {
	
	@Test
	public void income_Certificate_Process() throws Throwable{
		
		start_Report(excel.readExcelData("MEE_INCOME_SERVICE", 7, 0), excel.readExcelData("MEE_INCOME_SERVICE", 7, 1), excel.readExcelData("MEE_INCOME_SERVICE", 7, 2));
		
		Access_Page access = new Access_Page(driver);
		
		
		//clicking on Revenue Department
		System.out.println("revenue department section");
		Thread.sleep(2000);
		assertValidate.assertByWebelementVisibility(access.getRevenueDepartmentLink());
		assertValidate.assertByEnabled(access.getRevenueDepartmentLink());
		while_Run();
		access.getRevenueDepartmentLink().click();
		while_Run();
		//selecting the income service in revenue dept
		Revenue_Dept_Details_Page rev = new Revenue_Dept_Details_Page(driver);
		Thread.sleep(2000);
		System.out.println("identifying the search bar");
		assertValidate.assertByWebelementVisibility(rev.getSearchServiceTextField());
		
		rev.getIncomeCertificateServiceLink().click();
		Thread.sleep(2000);
		while_Run();
		//switching the browser to income application form
		wUtility.switchToWindowByTitle(driver, "INCOME CERTIFICATE");
		Thread.sleep(2000);

		Income_Certificate_Page inc = new Income_Certificate_Page(driver);
		System.out.println("loaded to income application");
		assertValidate.assertByWebelementVisibility(inc.getIncomeCertificateServiceText());
		while_Run();
		
		//validating application no
		System.out.println("application no");
		assertValidate.assertByWebelementVisibility(inc.getApplicationNumberTextField());
		System.out.println(inc.getApplicationNumberTextField().getAttribute("value"));
		
		//entering aadhaar no
		System.out.println("aadhaar no");
		assertValidate.assertByWebelementVisibility(inc.getAadhaarNoTextField());
		assertValidate.assertByEnabled(inc.getAadhaarNoTextField());
		System.out.println("length of aadhaar field : " +inc.getAadhaarNoTextField().getAttribute("maxlength"));
		inc.getAadhaarNoTextField().sendKeys(excel.readExcelData("Income_data", 1, 1));
		
		//entering applicant name
		System.out.println("applicant name");
		assertValidate.assertByWebelementVisibility(inc.getApplicantNameTextField());
		assertValidate.assertByEnabled(inc.getApplicantNameTextField());
		inc.getApplicantNameTextField().sendKeys(excel.readExcelData("Income_data", 2, 1));
		
		//entering father name
		System.out.println("father name");
		assertValidate.assertByWebelementVisibility(inc.getFatherOrHusbandOrGuardianNameTextField());
		assertValidate.assertByEnabled(inc.getFatherOrHusbandOrGuardianNameTextField());
		inc.getFatherOrHusbandOrGuardianNameTextField().sendKeys(excel.readExcelData("Income_data", 3, 1));
		
		//validating father uid
		System.out.println("father uid");
		assertValidate.assertByWebelementVisibility(inc.getFatherUidTextField());
		assertValidate.assertByEnabled(inc.getFatherUidTextField());
		
		//entering mother name
		System.out.println("mother name");
		assertValidate.assertByWebelementVisibility(inc.getMotherNameTextField());
		assertValidate.assertByEnabled(inc.getMotherNameTextField());
		inc.getMotherNameTextField().sendKeys(excel.readExcelData("Income_data", 4, 1));
		
		//validating mother uid
		System.out.println("mother uid");
		assertValidate.assertByWebelementVisibility(inc.getMotherUidTextField());
		assertValidate.assertByEnabled(inc.getMotherUidTextField());
		
		//entering ration card no
		System.out.println("ration card");
		assertValidate.assertByWebelementVisibility(inc.getRationCardNoTextField());
		assertValidate.assertByEnabled(inc.getRationCardNoTextField());
		System.out.println("length of ration card : "+inc.getRationCardNoTextField().getAttribute("maxlength"));
//		inc.getRationCardNoTextField().sendKeys(excel.readExcelData("Income_data", 5, 1));
		
		//selecting gender
		System.out.println("gender");
		assertValidate.assertByWebelementVisibility(inc.getGenderDropDown());
		assertValidate.assertByEnabled(inc.getGenderDropDown());
		System.out.println(wUtility.getAllOption(inc.getGenderDropDown()));
		wUtility.select(inc.getGenderDropDown(), 1);
		
		//validating email id
		System.out.println("email");
		assertValidate.assertByWebelementVisibility(inc.getEmailIdTextField());
		assertValidate.assertByEnabled(inc.getEmailIdTextField());
		
		//entering door no
		System.out.println("door no");
		assertValidate.assertByWebelementVisibility(inc.getDoorNoTextField());
		assertValidate.assertByEnabled(inc.getDoorNoTextField());
		inc.getDoorNoTextField().sendKeys(excel.readExcelData("Income_data", 6, 1));
		
		//entering locality
		System.out.println("locality");
		assertValidate.assertByWebelementVisibility(inc.getLocalityOrLandmarkTextField());
		assertValidate.assertByEnabled(inc.getLocalityOrLandmarkTextField());
		inc.getLocalityOrLandmarkTextField().sendKeys(excel.readExcelData("Income_data", 7, 1));
		
		//selecting district
		System.out.println("district");
		assertValidate.assertByWebelementVisibility(inc.getDistrictDropDown());
		assertValidate.assertByEnabled(inc.getDistrictDropDown());
		System.out.println(wUtility.getAllOption(inc.getDistrictDropDown()));
		wUtility.select(inc.getDistrictDropDown(), 1);
		Thread.sleep(5000);
		
		//selecting mandal
		System.out.println("mandal");
		assertValidate.assertByWebelementVisibility(inc.getMandalDropDown());
		assertValidate.assertByEnabled(inc.getMandalDropDown());
		System.out.println(wUtility.getAllOption(inc.getMandalDropDown()));
		wUtility.selectByAttribute(inc.getMandalDropDown(), "81");
		Thread.sleep(3000);
		
		//selecting village
		System.out.println("village");
		assertValidate.assertByWebelementVisibility(inc.getVillageOrWardDropDown());
		assertValidate.assertByEnabled(inc.getVillageOrWardDropDown());
		System.out.println(wUtility.getAllOption(inc.getVillageOrWardDropDown()));
		wUtility.select(inc.getVillageOrWardDropDown(), 1);
		Thread.sleep(2000);
		
		//entering pincode
		System.out.println("pincode");
		assertValidate.assertByWebelementVisibility(inc.getPincodeTextField());
		assertValidate.assertByEnabled(inc.getPincodeTextField());
		System.out.println("length of pincode : " + inc.getPincodeTextField().getAttribute("maxlength"));
		inc.getPincodeTextField().sendKeys(excel.readExcelData("Income_data", 8, 1));
		
		//entering mobile no from test data
		System.out.println("mobile no");
		assertValidate.assertByWebelementVisibility(inc.getMobileNoTextField());
		assertValidate.assertByEnabled(inc.getMobileNoTextField());
		System.out.println("length of mobile no : " + inc.getMobileNoTextField().getAttribute("maxlength"));
		inc.getMobileNoTextField().sendKeys(excel.readExcelData("Income_data", 9, 1));
		
		//entering random mobile no
//		inc.getMobileNoTextField().sendKeys(java.randomPhoneNumber());
		
		//selecting delivery type
		System.out.println("delivery type");
		assertValidate.assertByWebelementVisibility(inc.getDeliveryOptionsDropDown());
		assertValidate.assertByEnabled(inc.getDeliveryOptionsDropDown());
		System.out.println(wUtility.getAllOption(inc.getDeliveryOptionsDropDown()));
		wUtility.select(inc.getDeliveryOptionsDropDown(), 1);
		
		Thread.sleep(2000);
		
		// accepting alert
		wUtility.switchToAlertAndAccept(driver);
		
		Thread.sleep(2000);
		
		//validating income on lands/buildings
		System.out.println("income on lands/buildings");
		assertValidate.assertByWebelementVisibility(inc.getIncomeOnLandOrBuildingsTextField());
		assertValidate.assertByEnabled(inc.getIncomeOnLandOrBuildingsTextField());
		
		//validating income on business
		System.out.println("income on business");
		assertValidate.assertByWebelementVisibility(inc.getIncomeOnBusinessTextField());
		assertValidate.assertByEnabled(inc.getIncomeOnBusinessTextField());
		
		//validating income on labour
		System.out.println("income on labour");
		assertValidate.assertByWebelementVisibility(inc.getIncomeOnLabourTextField());
		assertValidate.assertByEnabled(inc.getIncomeOnLabourTextField());
		
		//entering income from salary
		System.out.println("income from salary");
		assertValidate.assertByWebelementVisibility(inc.getIncomeFromSalaryTextField());
		assertValidate.assertByEnabled(inc.getIncomeFromSalaryTextField());
		inc.getIncomeFromSalaryTextField().click();
		wUtility.deleteByKey(1);
		inc.getIncomeFromSalaryTextField().click();
		inc.getIncomeFromSalaryTextField().sendKeys(excel.readExcelData("Income_data", 10, 1));
		
		//validating income on other sources
		System.out.println("income on other sources");
		assertValidate.assertByWebelementVisibility(inc.getIncomeOnOtherSourcesTextField());
		assertValidate.assertByEnabled(inc.getIncomeOnOtherSourcesTextField());
		
		//validating total income
		System.out.println("total income");
		assertValidate.assertByWebelementVisibility(inc.getTotalIncomeReadOnlyField());
		assertValidate.assertByEnabled(inc.getTotalIncomeReadOnlyField());
		wUtility.verifyReadOnly(inc.getTotalIncomeReadOnlyField());
		
		//selecting purpose
		System.out.println("purpose");
		assertValidate.assertByWebelementVisibility(inc.getPurposeDropDown());
		assertValidate.assertByEnabled(inc.getPurposeDropDown());
		System.out.println(wUtility.getAllOption(inc.getPurposeDropDown()));
		wUtility.select(inc.getPurposeDropDown(), 1);
		
//		int index = 1;
//		
//		if (index==1){
//			
//		}
		
		
//		String[] a = {"dfdg","df","f","dfr"};
//		for (String gh : a) {
//			System.out.println(gh);	
//		}
//		
		//clicking supporting docs checkbox
		System.out.println("supporting docs checkbox");
		assertValidate.assertByWebelementVisibility(inc.getSupportingDocumentsCheckBox());
		assertValidate.assertByEnabled(inc.getSupportingDocumentsCheckBox());
		inc.getSupportingDocumentsCheckBox().click();
		
		Thread.sleep(2000);
		//uploading supporting docs
		System.out.println("uploading support docs");
		assertValidate.assertByWebelementVisibility(inc.getSupportingDocumentFileUpload());
		assertValidate.assertByEnabled(inc.getSupportingDocumentFileUpload());
		wUtility.click(driver, inc.getSupportingDocumentFileUpload());
		wUtility.uploadFile("C:\\Users\\Harshitha\\Downloads\\Demo\\Demo\\src\\test\\resources\\image\\demo.pdf");
		
		Thread.sleep(2000);
		wUtility.switchToAlertAndAccept(driver);
		
		Thread.sleep(2000);
		//clicking photo checkbox
		System.out.println("photo checkbox");
		assertValidate.assertByWebelementVisibility(inc.getApplicantPassportSizePhotoCheckBox());
		assertValidate.assertByEnabled(inc.getApplicantPassportSizePhotoCheckBox());
		inc.getApplicantPassportSizePhotoCheckBox().click();
		
		Thread.sleep(2000);
		//uploading photo
		System.out.println("photo upload");
		assertValidate.assertByWebelementVisibility(inc.getApplicantPassportSizePhotoFileUpload());
		assertValidate.assertByEnabled(inc.getApplicantPassportSizePhotoFileUpload());
		wUtility.click(driver,inc.getApplicantPassportSizePhotoFileUpload() );
		wUtility.uploadFile("C:\\Users\\Harshitha\\Downloads\\Demo\\Demo\\src\\test\\resources\\image\\image2.jpg");
		
		Thread.sleep(2000);
		
		//click on show payment button
		assertValidate.assertByWebelementVisibility(inc.getShowPaymentButton());
		Thread.sleep(2000);
//		inc.getDraftCloseButton().click();
		wUtility.scrollDownByKey(2);
		Thread.sleep(2000);
		while_Run();
		inc.getShowPaymentButton().click();
		
		wUtility.switchToAlertAndAccept(driver);
		Thread.sleep(3000);
		while_Run();
		
		//total amount section
		//validating receive payment text
		System.out.println("receive payment section");
		assertValidate.assertByWebelementVisibility(inc.getReceivePaymentText());
		
		//validating challan amount
		System.out.println("challan amount");
		assertValidate.assertByWebelementVisibility(inc.getChallanAmountReadOnlyField());
		assertValidate.assertByEnabled(inc.getChallanAmountReadOnlyField());
		System.out.println("challan amount : "+inc.getChallanAmountReadOnlyField().getAttribute("value"));
		
		//validating usercharges
		System.out.println("user charges");
		assertValidate.assertByWebelementVisibility(inc.getUserChargesReadOnlyField());
		assertValidate.assertByEnabled(inc.getUserChargesReadOnlyField());
		System.out.println("user charges : "+inc.getUserChargesReadOnlyField().getAttribute("value"));
		
		//validating courier charges
		System.out.println("courier charges");
		assertValidate.assertByWebelementVisibility(inc.getCourierChargesReadOnlyField());
		assertValidate.assertByEnabled(inc.getCourierChargesReadOnlyField());
		System.out.println("courier charges : "+inc.getCourierChargesReadOnlyField().getAttribute("value"));
		
		//validating total amount
		System.out.println("total amount");
		assertValidate.assertByWebelementVisibility(inc.getTotalAmountReadOnlyField());
		assertValidate.assertByEnabled(inc.getTotalAmountReadOnlyField());
		System.out.println("total amount : "+inc.getTotalAmountReadOnlyField().getAttribute("value"));
		
		while_Run();
		
		wUtility.scrollDownByKey(2);
		//clicking on confirm payment button
		System.out.println("confirm payment");
		assertValidate.assertByWebelementVisibility(inc.getConfirmPaymentButton());
		inc.getConfirmPaymentButton().click();
		
		Thread.sleep(3000);
		
		while_Run();
		//validating whether the page is loaded to payment section
		System.out.println("payment gateway -- payment options");
		assertValidate.assertByWebelementVisibility(inc.getPaymentOptionsText());
		
		//clicking on cash mode
		System.out.println("cash mode");
		assertValidate.assertByWebelementVisibility(inc.getCashOptionLink());
		inc.getCashOptionLink().click();
		
		//validating the amount which is displayed on payment gateway
		assertValidate.assertByWebelementVisibility(inc.getCashAmountReadOnlyField());
		System.out.println("cash amount : "+inc.getCashAmountReadOnlyField().getAttribute("value"));
		while_Run();
		
		//clicking on make payment button
		System.out.println("make payment");
		assertValidate.assertByWebelementVisibility(inc.getMakePaymentButton());
		inc.getMakePaymentButton().click();
		Thread.sleep(5000);
		
		while_Run();
		
		//validating receipt
		System.out.println("payment receipt");
		assertValidate.assertByWebelementVisibility(inc.getIncomePaymentReceiptText());
		while_Run();
		
		Receipt_Page receipt = new Receipt_Page(driver);
		Thread.sleep(2000);
		System.out.println(receipt.getApplicationNoText().getText());	
		Thread.sleep(2000);
		property.storeData("Application_Number", receipt.getApplicationNoText().getText());
		
		if(inc.getIncomePaymentReceiptText().isDisplayed()) {
			excel.writeData("MEE_INCOME_SERVICE", 7, 3, "PASS");
		}
		else {
			excel.writeData("MEE_INCOME_SERVICE", 7, 3, "FAIL");
		}
		Thread.sleep(2000);
		end_Report(inc.getIncomePaymentReceiptText(), excel.readExcelData("MEE_INCOME_SERVICE", 7, 0));
			
	}
}
