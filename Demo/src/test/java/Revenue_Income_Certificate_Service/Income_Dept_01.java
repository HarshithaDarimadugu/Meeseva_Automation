package Revenue_Income_Certificate_Service;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import base_test.BaseClass;
import pom_classes.ADB_DYMRO_Dashboard_Page;
import pom_classes.ADB_DYMRO_IncomeC_Details_Page;
import pom_classes.ADB_DYMRO_Income_Request_Page;
import pom_classes.ADB_DYMRO_Services_Page;

public class Income_Dept_01 extends BaseClass {
	
	@Test
	public void validate_income_dept() throws Throwable, Exception, Throwable {
		
		start_Report(excel.readExcelData("MEE_INCOME_SERVICE", 8, 0), excel.readExcelData("MEE_INCOME_SERVICE", 8, 1), excel.readExcelData("MEE_INCOME_SERVICE", 8, 2));
		
		ADB_DYMRO_Dashboard_Page dashboard = new ADB_DYMRO_Dashboard_Page(driver);
		
		//validating dashboard link
		System.out.println("dashboard page");
		assertValidate.assertByWebelementVisibility(dashboard.getDashboardLink());
		while_Run();
		Thread.sleep(3000);
		dashboard.getApplicationProcessingLink().click();
		
		Thread.sleep(2000);
		//validating service page
		ADB_DYMRO_Services_Page service = new ADB_DYMRO_Services_Page(driver);
		//validating search bar
		System.out.println("meeseva header in service page");
		assertValidate.assertByWebelementVisibility(service.getMeesevaHeaderText());
		while_Run();
		service.getIncomeCertificateRequestsLink().click();
		Thread.sleep(2000);
		
		//validating income request page
		System.out.println("income requests page");
		ADB_DYMRO_Income_Request_Page request = new ADB_DYMRO_Income_Request_Page(driver);
		assertValidate.assertByWebelementVisibility(request.getSubHeaderText());
		while_Run();
		//request.getApplicationNoSearchTextField().sendKeys(excel.readExcelData("Income_data", 11, 1));
		request.getApplicationNoSearchTextField().sendKeys(property.readProperty("Application_Number"));
		Thread.sleep(2000);
		request.getSubmitButton().click();
		Thread.sleep(2000);
		
		//validating fields in application form at dept side
		System.out.println("application request at dept side");
		ADB_DYMRO_IncomeC_Details_Page details = new ADB_DYMRO_IncomeC_Details_Page(driver);
		
		assertValidate.assertByWebelementVisibility(details.getServiceNameWithDepartmentText());
		while_Run();
		
		//fields checking
			//dept user details
		System.out.println("department user details");
		System.out.println("user id");
		assertValidate.assertByWebelementVisibility(details.getUserIdText());
		assertValidate.assertByEnabled(details.getUserIdText());
		
		System.out.println("user id name");
		assertValidate.assertByWebelementVisibility(details.getUserIdNameText());
		assertValidate.assertByEnabled(details.getUserIdNameText());
		
		System.out.println(details.getUserIdText().getText()+ " : "+ details.getUserIdNameText().getText());
		
		System.out.println("portal user");
		assertValidate.assertByWebelementVisibility(details.getPortalUserNameText());
		assertValidate.assertByEnabled(details.getPortalUserNameText());
		
		System.out.println("portal user name");
		assertValidate.assertByWebelementVisibility(details.getPortalUserNameValueText());
		assertValidate.assertByEnabled(details.getPortalUserNameValueText());
		
		System.out.println(details.getPortalUserNameText().getText()+ " : "+ details.getPortalUserNameValueText().getText());
		
		System.out.println("operator");
		assertValidate.assertByWebelementVisibility(details.getOperatorNameText());
		assertValidate.assertByEnabled(details.getOperatorNameText());
		
		System.out.println("operator name");
		assertValidate.assertByWebelementVisibility(details.getOperatorNameValueText());
		assertValidate.assertByEnabled(details.getOperatorNameValueText());
		
		System.out.println(details.getOperatorNameText().getText()+ " : "+ details.getOperatorNameValueText().getText());
		
		System.out.println("mobile");
		assertValidate.assertByWebelementVisibility(details.getMobileNoText());
		assertValidate.assertByEnabled(details.getMobileNoText());
		
		System.out.println("mobile no");
		assertValidate.assertByWebelementVisibility(details.getMobileNoValueText());
		assertValidate.assertByEnabled(details.getMobileNoValueText());
		
		System.out.println(details.getMobileNoText().getText()+ " : "+ details.getMobileNoValueText().getText());
		
		//income applicant details
		
		System.out.println("application no");
		System.out.println(property.readProperty("Application_Number"));
		assertValidate.assertByWebelementVisibility(details.getApplicationNoText());
		assertValidate.assertByWebelementVisibility(details.getApplicationNoValueText());
		assertValidate.assertByEnabled(details.getApplicationNoValueText());
	
		if(details.getApplicationNoValueText().getText().equals(property.readProperty("Application_Number"))) {
			System.out.println("application number is matched");
		}
		else {
			System.out.println("application number is not matched");
		}
		
		
		System.out.println("transaction id");
		assertValidate.assertByWebelementVisibility(details.getTransactionIdText());
		assertValidate.assertByWebelementVisibility(details.getTransactionIdValueText());
		assertValidate.assertByEnabled(details.getTransactionIdValueText());
		
		if(details.getTransactionIdValueText().getText().isEmpty()) {
			System.out.println("transaction id value is empty");
		}
		else {
			System.out.println("transaction id value is not empty");
		}
		
		System.out.println("applicant name");
		assertValidate.assertByWebelementVisibility(details.getApplicantNameText());
		assertValidate.assertByWebelementVisibility(details.getApplicantNameValueTextField());
		assertValidate.assertByEnabled(details.getApplicantNameValueTextField());
	
		if(details.getApplicantNameValueTextField().getText().equals(excel.readExcelData("Income_data", 2, 1))) {
			System.out.println("applicant name is matched");
		}
		else {
			System.out.println("applicant name is not matched");
		}
		
		System.out.println("father name");
		assertValidate.assertByWebelementVisibility(details.getFatherNameText());
		assertValidate.assertByWebelementVisibility(details.getFatherNameValueTextField());
		assertValidate.assertByEnabled(details.getFatherNameValueTextField());
	
		if(details.getFatherNameValueTextField().getText().equals(excel.readExcelData("Income_data", 3, 1))) {
			System.out.println("father name is matched");
		}
		else {
			System.out.println("father name is not matched");
		}
		
		System.out.println("gender");
		assertValidate.assertByWebelementVisibility(details.getGenderText());
		assertValidate.assertByWebelementVisibility(details.getGenderValueText());
		assertValidate.assertByEnabled(details.getGenderValueText());
		
		System.out.println(details.getGenderValueText().getText());
		
		System.out.println("date of birth");
		assertValidate.assertByWebelementVisibility(details.getDateOfBirthText());
		assertValidate.assertByWebelementVisibility(details.getDateOfBirthValueTextField());
		assertValidate.assertByEnabled(details.getDateOfBirthValueTextField());
		
		if(details.getDateOfBirthValueTextField().getText().isEmpty()) {
			System.out.println("DOB is empty");
		}
		else {
			System.out.println("DOB is not empty");
		}
		
		System.out.println("applicant date");
		assertValidate.assertByWebelementVisibility(details.getApplicationDateText());
		assertValidate.assertByWebelementVisibility(details.getApplicationDateValueText());
		assertValidate.assertByEnabled(details.getApplicationDateValueText());
		
		System.out.println(details.getApplicationDateValueText().getText());
		
		System.out.println("amount");
		assertValidate.assertByWebelementVisibility(details.getAmountText());
		assertValidate.assertByWebelementVisibility(details.getAmountValueText());
		assertValidate.assertByEnabled(details.getAmountValueText());
		
		System.out.println(details.getAmountValueText().getText());
		
		System.out.println("delivery type");
		assertValidate.assertByWebelementVisibility(details.getDeliveryTypeText());
		assertValidate.assertByWebelementVisibility(details.getDeliveryTypeValueText());
		assertValidate.assertByEnabled(details.getDeliveryTypeValueText());
		
		System.out.println(details.getDeliveryTypeValueText().getText());
		
		System.out.println("speed post");
		assertValidate.assertByWebelementVisibility(details.getApplicantAgreeToGiveSpeedPostToFamilyMemberText());
//		assertValidate.assertByWebelementVisibility(details.getApplicantAgreeToGiveSpeedPostToFamilyMemberValueText());
//		assertValidate.assertByEnabled(details.getApplicantAgreeToGiveSpeedPostToFamilyMemberValueText());
//		
//		if(details.getApplicantAgreeToGiveSpeedPostToFamilyMemberValueText().getText().isEmpty()) {
//			System.out.println("speed post agreement value is empty");
//		}
//		else {
//			System.out.println("speed post agreement value is not empty");
//		}
		
		//income certificate details
		System.out.println("income on lands");
		assertValidate.assertByWebelementVisibility(details.getIncomeOnLandsText());
		assertValidate.assertByWebelementVisibility(details.getIncomeOnLandTextField());
		assertValidate.assertByEnabled(details.getIncomeOnLandTextField());
		
		System.out.println(details.getIncomeOnLandTextField().getText());
		
		System.out.println("income on buildings");
		assertValidate.assertByWebelementVisibility(details.getIncomeOnBuildingsText());
		assertValidate.assertByWebelementVisibility(details.getIncomeOnBuildingsTextField());
		assertValidate.assertByEnabled(details.getIncomeOnBuildingsTextField());
		
		System.out.println(details.getIncomeOnBuildingsTextField().getText());
		
		System.out.println("income on business");
		assertValidate.assertByWebelementVisibility(details.getIncomeOnBusinessText());
		assertValidate.assertByWebelementVisibility(details.getIncomeOnBusinessTextField());
		assertValidate.assertByEnabled(details.getIncomeOnBusinessTextField());
		
		System.out.println(details.getIncomeOnBusinessTextField().getText());
		
		System.out.println("income on labour");
		assertValidate.assertByWebelementVisibility(details.getIncomeOnLabourText());
		assertValidate.assertByWebelementVisibility(details.getIncomeOnLabourTextField());
		assertValidate.assertByEnabled(details.getIncomeOnLabourTextField());
		
		System.out.println(details.getIncomeOnLabourTextField().getText());
		
		System.out.println("income on other sources");
		assertValidate.assertByWebelementVisibility(details.getIncomeOnOtherSourcesText());
		assertValidate.assertByWebelementVisibility(details.getIncomeOnOtherSourcesTextField());
		assertValidate.assertByEnabled(details.getIncomeOnOtherSourcesTextField());
		
		System.out.println(details.getIncomeOnOtherSourcesTextField().getText());
		
		System.out.println("income from salary");
		assertValidate.assertByWebelementVisibility(details.getIncomeFromSalaryText());
		assertValidate.assertByWebelementVisibility(details.getIncomeFromSalaryTextField());
		assertValidate.assertByEnabled(details.getIncomeFromSalaryTextField());
	
		if(details.getIncomeFromSalaryTextField().getText().equals(excel.readExcelData("Income_data", 10, 1))) {
			System.out.println("income is matched");
		}
		else {
			System.out.println("income is not matched");
		}
		
		System.out.println("total income");
		assertValidate.assertByWebelementVisibility(details.getTotalIncomeText());
		assertValidate.assertByWebelementVisibility(details.getTotalIncomeReadOnlyValue());
		assertValidate.assertByEnabled(details.getTotalIncomeReadOnlyValue());
		
		System.out.println(details.getTotalIncomeReadOnlyValue().getAttribute("value"));
		
		System.out.println("purpose");
		assertValidate.assertByWebelementVisibility(details.getPurposeText());
		assertValidate.assertByWebelementVisibility(details.getPurposeValueText());
		assertValidate.assertByEnabled(details.getPurposeValueText());
		
		System.out.println(details.getPurposeValueText().getText());
		
		System.out.println("status");
		assertValidate.assertByWebelementVisibility(details.getStatusText());
		assertValidate.assertByWebelementVisibility(details.getStatusValueInDepartmentText());
		assertValidate.assertByEnabled(details.getStatusValueInDepartmentText());
		
		System.out.println(details.getStatusValueInDepartmentText().getText());
		
		//permanent address
		
		System.out.println("door no");
		assertValidate.assertByWebelementVisibility(details.getDoorNoText());
		assertValidate.assertByWebelementVisibility(details.getDoorNoValueTextField());
		assertValidate.assertByEnabled(details.getDoorNoValueTextField());
	
		if(details.getDoorNoValueTextField().getText().equals(excel.readExcelData("Income_data", 6, 1))) {
			System.out.println("door no is matched");
		}
		else {
			System.out.println("door no is not matched");
		}
		
		System.out.println("locality");
		assertValidate.assertByWebelementVisibility(details.getLocalityOrLandmarkText());
		assertValidate.assertByWebelementVisibility(details.getLocalityValueTextField());
		assertValidate.assertByEnabled(details.getLocalityValueTextField());
	
		if(details.getLocalityValueTextField().getText().equals(excel.readExcelData("Income_data", 7, 1))) {
			System.out.println("locality is matched");
		}
		else {
			System.out.println("locality is not matched");
		}
		
		System.out.println("pincode");
		assertValidate.assertByWebelementVisibility(details.getPincodeText());
		assertValidate.assertByWebelementVisibility(details.getPincodeValueText());
		assertValidate.assertByEnabled(details.getPincodeValueText());
	
		if(details.getPincodeValueText().getText().equals(excel.readExcelData("Income_data", 8, 1))) {
			System.out.println("pincode is matched");
		}
		else {
			System.out.println("pincode is not matched");
			
		}
		
		System.out.println("district");
		assertValidate.assertByWebelementVisibility(details.getDistrictText());
		assertValidate.assertByWebelementVisibility(details.getDistrictValueDisabledField());
		assertValidate.assertByEnabled(details.getDistrictValueDisabledField());
		
		System.out.println(details.getDistrictValueDisabledField().getText());
		
		System.out.println("mandal");
		assertValidate.assertByWebelementVisibility(details.getMandalText());
		assertValidate.assertByWebelementVisibility(details.getMandalValueDisabledField());
		assertValidate.assertByEnabled(details.getMandalValueDisabledField());
		
		System.out.println(details.getMandalValueDisabledField().getText());
		
		System.out.println("village");
		assertValidate.assertByWebelementVisibility(details.getVillageOrWardText());
		assertValidate.assertByWebelementVisibility(details.getVillageOrWardValueDropDown());
		assertValidate.assertByEnabled(details.getVillageOrWardValueDropDown());
		
		System.out.println(details.getVillageOrWardValueDropDown().getText());
		
		//postal address
		
		wUtility.scrollDownByKey(2);
		Thread.sleep(2000);
		while_Run();
		wUtility.scrollDownByKey(5);
		while_Run();
		System.out.println("aadhaar no");
		assertValidate.assertByWebelementVisibility(details.getAadhaarNoPostalText());
		assertValidate.assertByWebelementVisibility(details.getAadhaarNoPostalValueText());
		assertValidate.assertByEnabled(details.getAadhaarNoPostalValueText());
	
		if(details.getAadhaarNoPostalValueText().getText().equals(excel.readExcelData("Income_data", 1, 1))) {
			System.out.println("aadhaar no is matched");
		}
		else {
			System.out.println("aadhaar no is not matched");
		}
		
		System.out.println("mobile no");
		assertValidate.assertByWebelementVisibility(details.getMobileNoPostalText());
		assertValidate.assertByWebelementVisibility(details.getMobileNoPostalValueText());
		assertValidate.assertByEnabled(details.getMobileNoPostalValueText());
	
		if(details.getMobileNoPostalValueText().getText().equals(excel.readExcelData("Income_data", 9, 1))) {
			System.out.println("mobile number is matched");
		}
		else {
			System.out.println("mobile number is not matched");
		}
		
		System.out.println("postal door no");
		assertValidate.assertByWebelementVisibility(details.getDoorNoPostalText());
		assertValidate.assertByWebelementVisibility(details.getDoorNoPostalValueText());
		assertValidate.assertByEnabled(details.getDoorNoPostalValueText());
		
		if(details.getDoorNoPostalValueText().getText().isEmpty()) {
			System.out.println("postal door no value is empty");
		}
		else {
			System.out.println("postal door no value is not empty");
		}
		
		System.out.println("postal locality");
		assertValidate.assertByWebelementVisibility(details.getLocalityOrLandmarkPostalText());
		assertValidate.assertByWebelementVisibility(details.getLocalityOrLandmarkPostalValueText());
		assertValidate.assertByEnabled(details.getLocalityOrLandmarkPostalValueText());
		
		if(details.getLocalityOrLandmarkPostalValueText().getText().isEmpty()) {
			System.out.println("postal locality value is empty");
		}
		else {
			System.out.println("postal locality value is not empty");
		}
		System.out.println("postal pincode");
		assertValidate.assertByWebelementVisibility(details.getPincodePostalText());
		assertValidate.assertByWebelementVisibility(details.getPincodePostalValueText());
		assertValidate.assertByEnabled(details.getPincodePostalValueText());
		
		if(details.getPincodePostalValueText().getText().isEmpty()) {
			System.out.println("postal pincode value is empty");
		}
		else {
			System.out.println("postal pincode value is not empty");
		}
		
		System.out.println("postal phone no");
		assertValidate.assertByWebelementVisibility(details.getPhoneNoPostalText());
		assertValidate.assertByWebelementVisibility(details.getPhoneNoPostalValueText());
		assertValidate.assertByEnabled(details.getPhoneNoPostalValueText());
		
		if(details.getPhoneNoPostalValueText().getText().isEmpty()) {
			System.out.println("postal phone no is empty");
		}
		else {
			System.out.println("postal phone no is not empty");
		}
		
		System.out.println("postal email");
		assertValidate.assertByWebelementVisibility(details.getEmailIdPostalText());
		assertValidate.assertByWebelementVisibility(details.getEmailIdPostalValueText());
		assertValidate.assertByEnabled(details.getEmailIdPostalValueText());
		
		if(details.getEmailIdPostalValueText().getText().isEmpty()) {
			System.out.println("postal email is empty");
		}
		else {
			System.out.println("postal email is not empty");
		}
		
		System.out.println("postal state");
		assertValidate.assertByWebelementVisibility(details.getStatePostalText());
		assertValidate.assertByWebelementVisibility(details.getStatePostalValueText());
		assertValidate.assertByEnabled(details.getStatePostalValueText());
		
		System.out.println(details.getStatePostalValueText().getText());
		System.out.println("postal district");
		assertValidate.assertByWebelementVisibility(details.getDistrictPostalText());
		assertValidate.assertByWebelementVisibility(details.getDistrictPostalValueText());
		assertValidate.assertByEnabled(details.getDistrictPostalValueText());
		
		System.out.println(details.getDistrictPostalValueText().getText());
		
		System.out.println("postal mandal");
		assertValidate.assertByWebelementVisibility(details.getMandalPostalText());
		assertValidate.assertByWebelementVisibility(details.getMandalPostalValueText());
		assertValidate.assertByEnabled(details.getMandalPostalValueText());
		System.out.println(details.getMandalPostalValueText().getText());
		
		wUtility.scrollDownByKey(8);
		Thread.sleep(2000);
		
		System.out.println("postal village");
		assertValidate.assertByWebelementVisibility(details.getVillageOrWardPostalText());
		assertValidate.assertByWebelementVisibility(details.getVillageOrWardPostalValueText());
		assertValidate.assertByEnabled(details.getVillageOrWardPostalValueText());
		
		System.out.println(details.getVillageOrWardPostalValueText().getText());
		
		//documents viewer
		System.out.println("documents viewer");
		
		assertValidate.assertByWebelementVisibility(details.getSupportingDocumentsViewerText());
		
		wUtility.scrollDownByKey(5);
		Thread.sleep(2000);
		while_Run();
		
		//checklist
		System.out.println("checklist");
		assertValidate.assertByWebelementVisibility(details.getCheckListText());
		
		System.out.println("checklist link");
		assertValidate.assertByWebelementVisibility(details.getCheckListLink());
		
		System.out.println("checklist file upload");
		assertValidate.assertByWebelementVisibility(details.getCheckListFileUpload());
		
		//action and remarks section
		System.out.println("action section");
		System.out.println("approve");
		assertValidate.assertByWebelementVisibility(details.getApproveActionText());
		
		System.out.println("reject");
		assertValidate.assertByWebelementVisibility(details.getRejectActionText());
		
		System.out.println("transfer to other manadal");
		assertValidate.assertByWebelementVisibility(details.getApplicationTransferToOtherMandalText());
		
		System.out.println("send sms");
		assertValidate.assertByWebelementVisibility(details.getSendSmsToApplicantText());
		
		System.out.println("reviewed");
		assertValidate.assertByWebelementVisibility(details.getToBeReviewedText());
	
		Thread.sleep(2000);
		wUtility.scrollDownByKey(20);
		details.getApproveActionRadioButton().click();
		Thread.sleep(3000);
		while_Run();
		
		System.out.println("remarks section text : "+ details.getRemarksTextField().getText());
		
		while_Run();
		details.getSubmitButton().click();
		wUtility.switchToAlertAndDismiss(driver);
		Thread.sleep(2000);
		wUtility.switchToAlertAndAccept(driver);
		Thread.sleep(2000);
		while_Run();

		String status = "03(Beyond SLA)";
//		wUtility.scrollUpByKey(10);
		if(details.getStatusValueInDepartmentText().getText().equals(status)) {
			System.out.println("approval process is failed");
			excel.writeData("MEE_INCOME_SERVICE", 8, 3, "Fail");
		}
		else {
			excel.writeData("MEE_INCOME_SERVICE", 8, 3, "Pass");
		}
		
		Thread.sleep(2000);
		wUtility.scrollDownByKey(8);
		details.getBackButton().click();
		Thread.sleep(2000);
		while_Run();
		
		System.out.println("completed");
		Thread.sleep(2000);
		//end_Report(request.getSubHeaderText(), excel.readExcelData("MEE_INCOME_SERVICE", 8, 0));
		endReport(false, excel.readExcelData("MEE_INCOME_SERVICE", 8, 0));
	
	}

}
