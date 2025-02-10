package Revenue_Residence_Certificate_Service;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import base_test.BaseClass;
import pom_classes.ADB_MRO_Dashboard_Page;
import pom_classes.ADB_MRO_Need_Basis_Page;
import pom_classes.ADB_MRO_OBC_Request_Page;
import pom_classes.ADB_MRO_ResidenceC_Details_Page;
import pom_classes.ADB_MRO_Residence_Request_Page;
import pom_classes.ADB_MRO_Service_Page;
import pom_classes.Access_Page;

public class residence_Dept_01 extends BaseClass {

	@Test
	public void residence_dept_process_01() throws Throwable, IOException, Throwable {

		start_Report(excel.readExcelData("MEE_RESIDENCE_SERVICE", 7, 0),
				excel.readExcelData("MEE_RESIDENCE_SERVICE", 7, 1), excel.readExcelData("MEE_RESIDENCE_SERVICE", 7, 2));

		while_Run();

		ADB_MRO_Dashboard_Page dashboard = new ADB_MRO_Dashboard_Page(driver);

		// mro dashboard
		System.out.println("mro dashboard");
		while_Run();
		assertValidate.assertByWebelementVisibility(dashboard.getDashboardLink());

		dashboard.getApplicationProcessingLink().click();
		Thread.sleep(2000);

		while_Run();

		ADB_MRO_Service_Page service = new ADB_MRO_Service_Page(driver);

		// validating search bar in mro services page
		System.out.println("mro services page");
		assertValidate.assertByWebelementVisibility(service.getSearchBarTextField());

		while_Run();
		wUtility.scrollDownByKey(20);

		service.getResidenceCertificateRequestLink().click();
		Thread.sleep(2000);
		while_Run();

		// residence request page
		System.out.println("residence request page");
		while_Run();

		ADB_MRO_Residence_Request_Page request = new ADB_MRO_Residence_Request_Page(driver);
		Thread.sleep(2000);

		while_Run();
		// closing javascript alert
		assertValidate.assertByWebelementVisibility(request.getAlertCloseButton());
		Thread.sleep(2000);
		request.getAlertCloseButton().click();
		Thread.sleep(2000);
		while_Run();

		System.out.println("validating the residence application request");
		assertValidate.assertByWebelementVisibility(request.getResidenceServiceHeadingText());
		System.out.println(request.getResidenceServiceHeadingText().getText());

		// searching the application using from and to date
		System.out.println("from date");
		assertValidate.assertByWebelementVisibility(request.getFromDateText());
		assertValidate.assertByWebelementVisibility(request.getFromDateSelect());
		assertValidate.assertByEnabled(request.getFromDateSelect());

		// entering the from date through jsexecutor
//		wUtility.enterDataUsingJavaScript(driver, request.getFromDateSelect(), "06/02/2025");
//		Thread.sleep(2000);

		System.out.println("to date");
		assertValidate.assertByWebelementVisibility(request.getToDateText());
		assertValidate.assertByWebelementVisibility(request.getToDateSelect());
		assertValidate.assertByEnabled(request.getToDateSelect());

		// entering the to date through jsexecutor
//		wUtility.enterDataUsingJavaScript(driver, request.getToDateSelect(), "06/02/2025");
//		Thread.sleep(2000);

		System.out.println("request status");
		assertValidate.assertByWebelementVisibility(request.getRequestStautsText());
		assertValidate.assertByWebelementVisibility(request.getRequestStatusDropDown());
		assertValidate.assertByEnabled(request.getRequestStatusDropDown());

		wUtility.select(request.getRequestStatusDropDown(), 1);
		Thread.sleep(2000);

		while_Run();
		System.out.println("get details button");
		assertValidate.assertByWebelementVisibility(request.getGetDetailsButton());

		request.getGetDetailsButton().click();
		while_Run();
		Thread.sleep(2000);

		wUtility.scrollDownByKey(3);

		// selecting last application no's link
		assertValidate.assertByWebelementVisibility(request.getLastApplicationNumbersListLink());

		request.getLastApplicationNumbersListLink().click();
		Thread.sleep(2000);
		while_Run();
		Thread.sleep(2000);

		// clicking on the residence application no of either radio button or
		// application no link

		try {
			request.getNeedBasicRadioButton(driver, property.readProperty("ApplicationNoResidence")).click();
			Thread.sleep(3000);
			// validating need basis page
			ADB_MRO_Need_Basis_Page needb = new ADB_MRO_Need_Basis_Page(driver);

			System.out.println("need basis");
			assertValidate.assertByWebelementVisibility(needb.getNeedBasisText());
			System.out.println(needb.getApplicationNoTextField().getAttribute("value"));
			if (needb.getApplicationNoTextField().getAttribute("value")
					.equals(property.readProperty("ApplicationNoResidence"))) {

				System.out.println(wUtility.tableHeaders(needb.getApplicationNoDataTable()));
				System.out.println(wUtility.tableContents(needb.getApplicationNoDataTable()));
				System.out.println("matched");

			} else {
				System.out.println("not matched application no");
			}
			assertValidate.assertByWebelementVisibility(needb.getRemarksText());
			assertValidate.assertByWebelementVisibility(needb.getRemarksTextField());
			assertValidate.assertByEnabled(needb.getRemarksTextField());

			wUtility.copy(needb.getApplicationNoTextField());
			wUtility.paste(needb.getRemarksTextField());
			wUtility.paste(needb.getRemarksTextField());
			wUtility.paste(needb.getRemarksTextField());
			wUtility.paste(needb.getRemarksTextField());
			while_Run();
			needb.getSubmitButton().click();
			while_Run();
			Thread.sleep(2000);

		} catch (Exception e) {
			System.out.println(e);
			request.getNoNeedBasisRadioButton(driver, property.readProperty("ApplicationNoResidence")).click();
			Thread.sleep(3000);
		}

		// validating the service name in certificate details

		ADB_MRO_ResidenceC_Details_Page details = new ADB_MRO_ResidenceC_Details_Page(driver);

		System.out.println("service name");
		assertValidate.assertByWebelementVisibility(details.getResidenceCertificateNameText());

		System.out.println(details.getResidenceCertificateNameText().getText());

		// department user details

		System.out.println("department user details");
		System.out.println("user id");
		assertValidate.assertByWebelementVisibility(details.getUserIdText());
		assertValidate.assertByEnabled(details.getUserIdText());

		System.out.println("user id name");
		assertValidate.assertByWebelementVisibility(details.getUserIdNameText());
		assertValidate.assertByEnabled(details.getUserIdNameText());

		System.out.println(details.getUserIdText().getText() + " : " + details.getUserIdNameText().getText());

		System.out.println("portal user");
		assertValidate.assertByWebelementVisibility(details.getPortalUserNameText());
		assertValidate.assertByEnabled(details.getPortalUserNameText());

		System.out.println("portal user name");
		assertValidate.assertByWebelementVisibility(details.getPortalUserNameValueText());
		assertValidate.assertByEnabled(details.getPortalUserNameValueText());

		System.out.println(
				details.getPortalUserNameText().getText() + " : " + details.getPortalUserNameValueText().getText());

		System.out.println("operator");
		assertValidate.assertByWebelementVisibility(details.getOperatorNameText());
		assertValidate.assertByEnabled(details.getOperatorNameText());

		System.out.println("operator name");
		assertValidate.assertByWebelementVisibility(details.getOperatorNameValueText());
		assertValidate.assertByEnabled(details.getOperatorNameValueText());

		System.out.println(
				details.getOperatorNameText().getText() + " : " + details.getOperatorNameValueText().getText());

		System.out.println("mobile");
		assertValidate.assertByWebelementVisibility(details.getMobileNoText());
		assertValidate.assertByEnabled(details.getMobileNoText());

		System.out.println("mobile no");
		assertValidate.assertByWebelementVisibility(details.getMobileNoValueText());
		assertValidate.assertByEnabled(details.getMobileNoValueText());

		System.out.println(details.getMobileNoText().getText() + " : " + details.getMobileNoValueText().getText());
		Thread.sleep(2000);

		// applicant details

		// application no
		System.out.println("applicant details section");
		assertValidate.assertByWebelementVisibility(details.getResidenceApplicantDetails());

		System.out.println("application no");
		assertValidate.assertByWebelementVisibility(details.getApplicationNoText());
		assertValidate.assertByWebelementVisibility(details.getApplicationNoValueText());
		assertValidate.assertByEnabled(details.getApplicationNoValueText());
		if (details.getApplicationNoValueText().getText().equals(property.readProperty("ApplicationNoResidence"))) {

			System.out.println("application no is matched");
		} else {
			System.out.println("applocation no is not matched");
		}

		// applicant name
		System.out.println("applicant name");
		assertValidate.assertByWebelementVisibility(details.getApplicantNameText());
		assertValidate.assertByWebelementVisibility(details.getApplicantNameTextField());
		assertValidate.assertByEnabled(details.getApplicantNameTextField());
		System.out.println("applicant name : " + details.getApplicantNameTextField().getAttribute("value"));
		if (details.getApplicantNameTextField().getAttribute("value")
				.equals(excel.readExcelData("Residence_User_Data", 2, 1))) {
			System.out.println("applicant name is matched");
		} else {
			System.out.println("applicant name is not matched");
		}

		// father name
		System.out.println("father name");
		assertValidate.assertByWebelementVisibility(details.getFatherNameText());
		assertValidate.assertByWebelementVisibility(details.getFatherNameTextField());
		assertValidate.assertByEnabled(details.getFatherNameTextField());
		System.out.println("father name : " + details.getFatherNameTextField().getAttribute("value"));
		if (details.getFatherNameTextField().getAttribute("value")
				.equals(excel.readExcelData("Residence_User_Data", 3, 1))) {
			System.out.println("father name is matched");
		} else {
			System.out.println("father name is not matched");
		}

		// gender
		System.out.println("gender");
		assertValidate.assertByWebelementVisibility(details.getGenderText());
		assertValidate.assertByWebelementVisibility(details.getGenderValueText());
		assertValidate.assertByEnabled(details.getGenderValueText());
		System.out.println("gendr : " + details.getGenderValueText().getText());

		// date of birth
		System.out.println("date of birth");
		assertValidate.assertByWebelementVisibility(details.getDateOfBirthText());
		assertValidate.assertByWebelementVisibility(details.getDateOfBirthTextField());
		assertValidate.assertByEnabled(details.getDateOfBirthTextField());

		if (details.getDateOfBirthTextField().getAttribute("value")
				.equals(excel.readExcelData("Residence_User_Data", 9, 1))) {
			System.out.println("DOB is empty");
		} else {
			System.out.println("DOB is not empty");
		}

		// application date
		System.out.println("applicant date");
		assertValidate.assertByWebelementVisibility(details.getApplicationDateText());
		assertValidate.assertByWebelementVisibility(details.getApplicationDateValueText());
		assertValidate.assertByEnabled(details.getApplicationDateValueText());

		System.out.println(details.getApplicationDateValueText().getText());

		// amount
		System.out.println("amount");
		assertValidate.assertByWebelementVisibility(details.getAmountText());
		assertValidate.assertByWebelementVisibility(details.getAmountValueText());
		assertValidate.assertByEnabled(details.getAmountValueText());

		System.out.println(details.getAmountValueText().getText());

		// delivery type
		System.out.println("delivery type");
		assertValidate.assertByWebelementVisibility(details.getDeliveryTypeText());
		assertValidate.assertByWebelementVisibility(details.getDeliveryTypeValueText());
		assertValidate.assertByEnabled(details.getDeliveryTypeValueText());

		System.out.println(details.getDeliveryTypeValueText().getText());

		// speed post
		System.out.println("speed post");
		assertValidate.assertByWebelementVisibility(details.getApplicantAgreeToGiveSpeedPostText());
		assertValidate.assertByWebelementVisibility(details.getApplicantAgreeToGiveSpeedPostValueText());
		assertValidate.assertByEnabled(details.getApplicantAgreeToGiveSpeedPostValueText());

		System.out.println(details.getApplicantAgreeToGiveSpeedPostValueText().getText());

		// certificate details

		System.out.println("certificate details");
		assertValidate.assertByWebelementVisibility(details.getCertificateDetailsText());

		// residing since
		System.out.println("residing since");
		assertValidate.assertByWebelementVisibility(details.getResidingSinceText());
		assertValidate.assertByWebelementVisibility(details.getResidingSinceValueTextField());
		assertValidate.assertByEnabled(details.getResidingSinceValueTextField());
		System.out.println("father name : " + details.getResidingSinceValueTextField().getAttribute("value"));
		if (details.getResidingSinceValueTextField().getAttribute("value")
				.equals(excel.readExcelData("Residence_User_Data", 8, 1))) {
			System.out.println("residing since years is matched");
		} else {
			System.out.println("residing since years is not matched");
		}

		// purpose
		System.out.println("purpose");
		assertValidate.assertByWebelementVisibility(details.getPurposeText());
		assertValidate.assertByWebelementVisibility(details.getPurposeValueText());
		assertValidate.assertByEnabled(details.getPurposeValueText());

		System.out.println(details.getPurposeValueText().getText());

		// status
		System.out.println("status");
		assertValidate.assertByWebelementVisibility(details.getStatusText());
		assertValidate.assertByWebelementVisibility(details.getStatusValueText());
		assertValidate.assertByEnabled(details.getStatePostalValueText());
		System.out.println("department status : " + details.getStatusValueText().getText());

		// permanent address details

		System.out.println("door no");
		assertValidate.assertByWebelementVisibility(details.getDoorNoText());
		assertValidate.assertByWebelementVisibility(details.getDoorNoValueTextField());
		assertValidate.assertByEnabled(details.getDoorNoValueTextField());

		if (details.getDoorNoValueTextField().getText().equals(excel.readExcelData("Residence_User_Data", 4, 1))) {
			System.out.println("door no is matched");
		} else {
			System.out.println("door no is not matched");
		}

		System.out.println("locality");
		assertValidate.assertByWebelementVisibility(details.getLocalityOrLandmarkText());
		assertValidate.assertByWebelementVisibility(details.getLocalityOrLandmarkValueTextField());
		assertValidate.assertByEnabled(details.getLocalityOrLandmarkValueTextField());

		if (details.getLocalityOrLandmarkValueTextField().getText()
				.equals(excel.readExcelData("Residence_User_Data", 5, 1))) {
			System.out.println("locality is matched");
		} else {
			System.out.println("locality is not matched");
		}

		System.out.println("pincode");
		assertValidate.assertByWebelementVisibility(details.getPincodeText());
		assertValidate.assertByWebelementVisibility(details.getPincodeValueText());
		assertValidate.assertByEnabled(details.getPincodeValueText());

		if (details.getPincodeValueText().getText().equals(excel.readExcelData("Residence_User_Data", 6, 1))) {
			System.out.println("pincode is matched");
		} else {
			System.out.println("pincode is not matched");

		}

		System.out.println("district");
		assertValidate.assertByWebelementVisibility(details.getDistrictText());
		assertValidate.assertByWebelementVisibility(details.getDistrictReadOnlyField());
		assertValidate.assertByEnabled(details.getDistrictReadOnlyField());

		System.out.println(details.getDistrictReadOnlyField().getText());

		System.out.println("mandal");
		assertValidate.assertByWebelementVisibility(details.getMandalText());
		assertValidate.assertByWebelementVisibility(details.getMandalReadOnlyField());
		assertValidate.assertByEnabled(details.getMandalReadOnlyField());

		System.out.println(details.getMandalReadOnlyField().getText());

		System.out.println("village");
		assertValidate.assertByWebelementVisibility(details.getVillageOrWardText());
		assertValidate.assertByWebelementVisibility(details.getVillageOrWardDropDown());
		assertValidate.assertByEnabled(details.getVillageOrWardDropDown());

		System.out.println(details.getVillageOrWardDropDown().getText());

		// postal address

		wUtility.scroll(driver, details.getAadhaarNoText());
		Thread.sleep(2000);
		while_Run();
		System.out.println("aadhaar no");
		assertValidate.assertByWebelementVisibility(details.getAadhaarNoText());
		assertValidate.assertByWebelementVisibility(details.getAadhaarNoValueText());
		assertValidate.assertByEnabled(details.getAadhaarNoValueText());

		if (details.getAadhaarNoValueText().getText().equals(excel.readExcelData("Residence_User_Data", 1, 1))) {
			System.out.println("aadhaar no is matched");
		} else {
			System.out.println("aadhaar no is not matched");
		}

		System.out.println("mobile no");
		assertValidate.assertByWebelementVisibility(details.getMobileNoPostalText());
		assertValidate.assertByWebelementVisibility(details.getMobileNoPostalValueText());
		assertValidate.assertByEnabled(details.getMobileNoPostalValueText());

		if (details.getMobileNoPostalValueText().getText().equals(excel.readExcelData("Residence_User_Data", 7, 1))) {
			System.out.println("mobile number is matched");
		} else {
			System.out.println("mobile number is not matched");
		}

		System.out.println("postal door no");
		assertValidate.assertByWebelementVisibility(details.getDoorNoPostalText());
		assertValidate.assertByWebelementVisibility(details.getDoorNoPostalValueText());
		assertValidate.assertByEnabled(details.getDoorNoPostalValueText());

		if (details.getDoorNoPostalValueText().getText().isEmpty()) {
			System.out.println("postal door no value is empty");
		} else {
			System.out.println("postal door no value is not empty");
		}

		System.out.println("postal locality");
		assertValidate.assertByWebelementVisibility(details.getLocalityOrLandmarkPostalText());
		assertValidate.assertByWebelementVisibility(details.getLocalityOrLandmarkPostalValueText());
		assertValidate.assertByEnabled(details.getLocalityOrLandmarkPostalValueText());

		if (details.getLocalityOrLandmarkPostalValueText().getText().isEmpty()) {
			System.out.println("postal locality value is empty");
		} else {
			System.out.println("postal locality value is not empty");
		}
		System.out.println("postal pincode");
		assertValidate.assertByWebelementVisibility(details.getPincodePostalText());
		assertValidate.assertByWebelementVisibility(details.getPincodePostalValueText());
		assertValidate.assertByEnabled(details.getPincodePostalValueText());

		if (details.getPincodePostalValueText().getText().isEmpty()) {
			System.out.println("postal pincode value is empty");
		} else {
			System.out.println("postal pincode value is not empty");
		}

		System.out.println("postal phone no");
		assertValidate.assertByWebelementVisibility(details.getPhoneNoPostalText());
		assertValidate.assertByWebelementVisibility(details.getPhoneNoPostalValueText());
		assertValidate.assertByEnabled(details.getPhoneNoPostalValueText());

		if (details.getPhoneNoPostalValueText().getText().isEmpty()) {
			System.out.println("postal phone no is empty");
		} else {
			System.out.println("postal phone no is not empty");
		}

		System.out.println("postal email");
		assertValidate.assertByWebelementVisibility(details.getEmailIdPostalText());
		assertValidate.assertByWebelementVisibility(details.getEmailIdPostalValueText());
		assertValidate.assertByEnabled(details.getEmailIdPostalValueText());

		if (details.getEmailIdPostalValueText().getText().isEmpty()) {
			System.out.println("postal email is empty");
		} else {
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

		Thread.sleep(2000);

		System.out.println("postal village");
		assertValidate.assertByWebelementVisibility(details.getVillageOrWardPostalText());
		assertValidate.assertByWebelementVisibility(details.getVillageOrWardPostalValueText());
		assertValidate.assertByEnabled(details.getVillageOrWardPostalValueText());

		System.out.println(details.getVillageOrWardPostalValueText().getText());

		wUtility.scroll(driver, details.getDocumentAttachedText());
		Thread.sleep(2000);
		while_Run();

		// uploaded documents
		System.out.println("documents attached");
		assertValidate.assertByWebelementVisibility(details.getDocumentAttachedText());
		assertValidate.assertByWebelementVisibility(details.getApplicationFormDocUploadedLink());
		assertValidate.assertByWebelementVisibility(details.getPassportSizeUploadedLink());

		// checklist
		System.out.println("verification docs section");
		assertValidate.assertByWebelementVisibility(details.getVerificationOrProceedingDocumentsText());
		System.out.println("checklist");
		assertValidate.assertByWebelementVisibility(details.getCheckListText());

		System.out.println("checklist link");
		assertValidate.assertByWebelementVisibility(details.getCheckListLink());

		System.out.println("checklist file upload");
		assertValidate.assertByWebelementVisibility(details.getCheckListFileUpload());

		wUtility.scroll(driver, details.getSubmitButton());

		// action and remarks section
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
		wUtility.scroll(driver, details.getFooterText());
		details.getApproveActionRadioButton().click();
		Thread.sleep(3000);
		while_Run();

		System.out.println("remarks section text : " + details.getRemarksTextField().getText());

		while_Run();
		wUtility.scroll(driver, details.getFooterText());
		details.getSubmitButton().click();
		wUtility.switchToAlertAndDismiss(driver);
		Thread.sleep(2000);
		wUtility.switchToAlertAndAccept(driver);
		Thread.sleep(2000);
		while_Run();

		// form sign details
		System.out.println("form sign details");

		assertValidate.assertByWebelementVisibility(details.getFormSignUserIdText());
		System.out.println(details.getFormSignUserIdText().getText());

		assertValidate.assertByWebelementVisibility(details.getFormSignApplicationNoText());
		System.out.println(details.getFormSignApplicationNoText().getText());

		assertValidate.assertByWebelementVisibility(details.getFormSignServiceNameText());
		System.out.println(details.getFormSignServiceNameText().getText());
		while_Run();

		// clicking on form sign button
		System.out.println("form sign button");
		assertValidate.assertByWebelementVisibility(details.getFormSignButton());

		details.getFormSignButton().click();
		Thread.sleep(5000);

		//click on sign
		wUtility.emSigner();

		while_Run();
		Thread.sleep(3000);
		
		while_Run();
		wUtility.scroll(driver, details.getBackButtonInDocument());
		while_Run();
		
		//validating residence certificate details
		System.out.println("document name");
		System.out.println(details.getResidenceCertificateTextInDocument().getText());
		//applicant name
		if(details.getApplicantNameTextInDocument().getText().equals(excel.readExcelData("Residence_User_Data", 2, 1)))
		{
			System.out.println("applicant name in document is matched :"+ details.getApplicantNameTextInDocument().getText() );
		}
		else {
			System.out.println("applicant name in document is not matched");
		}
		
		//relation name
		if(details.getRelationshipNameTextInDocument().getText().equals(excel.readExcelData("Residence_User_Data", 3, 1)))
		{
			System.out.println("relation name in document is matched :"+ details.getRelationshipNameTextInDocument().getText() );
		}
		else {
			System.out.println("relation name in document is not matched");
		}
		
		//door no
		if(details.getDoorNoTextInDocument().getText().equals(excel.readExcelData("Residence_User_Data", 4, 1)))
		{
			System.out.println("door no in document is matched :"+ details.getDoorNoTextInDocument().getText() );
		}
		else {
			System.out.println("door no in document is not matched");
		}
		
		//residing since
		if(details.getResidingSinceInYearsTextInDocument().getText().equals(excel.readExcelData("Residence_User_Data", 8, 1)))
		{
			System.out.println("residing since in years in document is matched :"+ details.getResidingSinceInYearsTextInDocument().getText() );
		}
		else {
			System.out.println("residing since in yearsin document is not matched");
		}
		
		//village
		System.out.println("village name in document :"+details.getVillageNameTextInDocument().getText());
		//mandal
		System.out.println("mandal name in document :"+details.getMandalNameTextInDocument().getText());	
		//district
		System.out.println("district name in document :"+details.getDistrictNameTextInDocument().getText());			
	
		
		
		if(details.getResidenceCertificateTextInDocument().getText().equals("RESIDENCE CERTIFICATE")) {
			
			excel.writeData("MEE_RESIDENCE_SERVICE", 7, 3, "PASS");
		}
		else {
			excel.writeData("MEE_RESIDENCE_SERVICE", 7, 3, "FAIL");
		}
		
		end_Report(details.getResidenceCertificateTextInDocument(), excel.readExcelData("MEE_RESIDENCE_SERVICE", 7, 0));
			

	}

}
