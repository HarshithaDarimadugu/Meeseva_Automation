package IGRS_Registration_of_Firm_Service;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base_test.BaseClass;
import pom_classes.DLF_ADB_Firm_Dashboard_Page;
import pom_classes.DLF_ADB_Firm_Details_Page;
import pom_classes.DLF_ADB_Firm_Pending_Requests_Page;

public class DLF_Action_In_Firm_Page extends BaseClass {

	@Test
	public void DLF_process() throws Throwable, IOException, Throwable {

		start_Report(excel.readExcelData("MEE_REG_OF_FIRM", 7, 0), excel.readExcelData("MEE_REG_OF_FIRM", 7, 1),
				excel.readExcelData("MEE_REG_OF_FIRM", 7, 2));

		// dlf dashboard page
		DLF_ADB_Firm_Dashboard_Page dashboard = new DLF_ADB_Firm_Dashboard_Page(driver);
		while_Run();
		// validating user id
		assertValidate.assertByWebelementVisibility(dashboard.getDlfUserIdText());
		System.out.println(dashboard.getDlfUserIdText().getText());

		// clicking on pending applications link in firm
		assertValidate.assertByWebelementVisibility(dashboard.getApplicationsPendingInFirmLink());
		while_Run();
		dashboard.getApplicationsPendingInFirmLink().click();
		Thread.sleep(2000);
		while_Run();

		// again validating the user id
		DLF_ADB_Firm_Pending_Requests_Page request = new DLF_ADB_Firm_Pending_Requests_Page(driver);

		assertValidate.assertByWebelementVisibility(request.getDlfUserIdText());
		System.out.println(request.getDlfUserIdText().getText());
		while_Run();
		// validating request text
		System.out.println("requests page");
		assertValidate.assertByWebelementVisibility(request.getMyRequestsText());

		// validating search bar
		System.out.println("search bar");
		assertValidate.assertByWebelementVisibility(request.getSearchBarTextField());
		assertValidate.assertByEnabled(request.getSearchBarTextField());
		Thread.sleep(2000);
		request.getSearchBarTextField().sendKeys(property.readProperty("Firm_Acknowledgement_No"));

		while_Run();

		// clicking on respective application action button
		System.out.println("action button");
		assertValidate.assertByWebelementVisibility(request.getApplicationActionLink());
		assertValidate.assertByEnabled(request.getApplicationActionLink());

		request.getApplicationActionLink().click();
		wUtility.switchToAlertAndAccept(driver);
		// navigating to details page
		DLF_ADB_Firm_Details_Page details = new DLF_ADB_Firm_Details_Page(driver);

		Thread.sleep(2000);
		while_Run();

		// select service name
		System.out.println("service name");
		assertValidate.assertByWebelementVisibility(details.getRegistrationOfFirmHeadingText());
		System.out.println(details.getRegistrationOfFirmHeadingText().getText());

		// selecting document date
		System.out.println("document date text");
		assertValidate.assertByWebelementVisibility(details.getDocumentsReceivedDateText());
		System.out.println("document date text field");
		assertValidate.assertByWebelementVisibility(details.getDocumentDateTextField());
		assertValidate.assertByEnabled(details.getDocumentDateTextField());
		System.out.println("document date icon");
		assertValidate.assertByWebelementVisibility(details.getUpdateDateIcon());
		assertValidate.assertByEnabled(details.getUpdateDateIcon());

		wUtility.enterDataUsingJavaScript(driver, details.getDocumentDateTextField(), "11/02/2025");
		Thread.sleep(5000);

		// clicking on update document date button
		System.out.println("update document date");
		assertValidate.assertByWebelementVisibility(details.getUpdateDateButton());
		assertValidate.assertByEnabled(details.getUpdateDateButton());

		details.getUpdateDateButton().click();
		Thread.sleep(3000);
		wUtility.switchToAlertAndAccept(driver);
		Thread.sleep(2000);

		while_Run();
		// applicant details
		System.out.println("applicant details");
		assertValidate.assertByWebelementVisibility(details.getApplicantDetailsText());

		// firstname
		System.out.println("applicant first name");
		assertValidate.assertByWebelementVisibility(details.getApplicantFirstnameText());
		assertValidate.assertByWebelementVisibility(details.getApplicantFirstnameValueText());
		assertValidate.assertByEnabled(details.getApplicantFirstnameValueText());

		if (details.getApplicantFirstnameValueText().getText().equals(excel.readExcelData("Firm_User_Data", 1, 1))) {

			System.out.println("applicant first name is matched");
		} else {
			System.out.println("applicant first name is not matched");
		}

		// surname
		System.out.println("applicant surname");
		assertValidate.assertByWebelementVisibility(details.getApplicantSurnameText());
		assertValidate.assertByWebelementVisibility(details.getApplicantSurnameValueText());
		assertValidate.assertByEnabled(details.getApplicantSurnameValueText());

		if (details.getApplicantSurnameValueText().getText().equals(excel.readExcelData("Firm_User_Data", 2, 1))) {

			System.out.println("applicant surname is matched");
		} else {
			System.out.println("applicant surname is not matched");
		}

		// gender
		System.out.println("applicant gender");
		assertValidate.assertByWebelementVisibility(details.getApplicantGenderText());
		assertValidate.assertByWebelementVisibility(details.getApplicantGenderValueText());
		assertValidate.assertByEnabled(details.getApplicantGenderValueText());

		System.out.println(details.getApplicantGenderValueText().getText());

		// aadhaar no
		System.out.println("applicant aadhaar no");
		assertValidate.assertByWebelementVisibility(details.getApplicantAadhaarNoText());
		assertValidate.assertByWebelementVisibility(details.getApplicantAadhaarNoValueText());
		assertValidate.assertByEnabled(details.getApplicantAadhaarNoValueText());

		if (details.getApplicantAadhaarNoValueText().getText().isEmpty()) {

			System.out.println("applicant aadhaar no is empty");
		} else {
			System.out.println("applicant aadhaar no is not empty");
		}

		while_Run();

		// applicant address
		System.out.println("applicant address");
		assertValidate.assertByWebelementVisibility(details.getApplicantAddressText());

		// applicant door no
		System.out.println("applicant door no");
		assertValidate.assertByWebelementVisibility(details.getApplicantDoorNoText());
		assertValidate.assertByWebelementVisibility(details.getApplicantDoorNoValueText());
		assertValidate.assertByEnabled(details.getApplicantDoorNoValueText());

		if (details.getApplicantDoorNoValueText().getText().equals(excel.readExcelData("Firm_User_Data", 3, 1))) {

			System.out.println("applicant door no is matched");
		} else {
			System.out.println("applicant door no is not matched");
		}

		// applicant street
		System.out.println("applicant street");
		assertValidate.assertByWebelementVisibility(details.getApplicantStreetText());
		assertValidate.assertByWebelementVisibility(details.getApplicantStreetValueText());
		assertValidate.assertByEnabled(details.getApplicantStreetValueText());

		if (details.getApplicantStreetValueText().getText().equals(excel.readExcelData("Firm_User_Data", 4, 1))) {

			System.out.println("applicant street is matched");
		} else {
			System.out.println("applicant street is not matched");
		}

		// applicant village
		System.out.println("applicant village");
		assertValidate.assertByWebelementVisibility(details.getApplicantVillageOrCityText());
		assertValidate.assertByWebelementVisibility(details.getApplicantVillageOrCityValueText());
		assertValidate.assertByEnabled(details.getApplicantVillageOrCityValueText());

		if (details.getApplicantVillageOrCityValueText().getText()
				.equals(excel.readExcelData("Firm_User_Data", 5, 1))) {

			System.out.println("applicant village is matched");
		} else {
			System.out.println("applicant village is not matched");
		}

		// applicant country
		System.out.println("applicant country");
		assertValidate.assertByWebelementVisibility(details.getApplicantCountryText());
		assertValidate.assertByWebelementVisibility(details.getApplicantCountryValueText());
		assertValidate.assertByEnabled(details.getApplicantCountryValueText());

		System.out.println(details.getApplicantCountryValueText().getText());

		// applicant state
		System.out.println("applicant state");
		assertValidate.assertByWebelementVisibility(details.getApplicantStateText());
		assertValidate.assertByWebelementVisibility(details.getApplicantStateValueText());
		assertValidate.assertByEnabled(details.getApplicantStateValueText());

		System.out.println(details.getApplicantStateValueText().getText());

		// applicant district
		System.out.println("applicant district");
		assertValidate.assertByWebelementVisibility(details.getApplicantDistrictText());
		assertValidate.assertByWebelementVisibility(details.getApplicantDistrictValueText());
		assertValidate.assertByEnabled(details.getApplicantDistrictValueText());

		System.out.println(details.getApplicantDistrictValueText().getText());

		// applicant mandal
		System.out.println("applicant mandal");
		assertValidate.assertByWebelementVisibility(details.getApplicantMandalText());
		assertValidate.assertByWebelementVisibility(details.getApplicantMandalValueText());
		assertValidate.assertByEnabled(details.getApplicantMandalValueText());

		System.out.println(details.getApplicantMandalValueText().getText());

		// applicant pincode
		System.out.println("applicant pincode");
		assertValidate.assertByWebelementVisibility(details.getApplicantPincodeText());
		assertValidate.assertByWebelementVisibility(details.getApplicantPincodeValueText());
		assertValidate.assertByEnabled(details.getApplicantPincodeValueText());

		if (details.getApplicantPincodeValueText().getText().equals(excel.readExcelData("Firm_User_Data", 6, 1))) {

			System.out.println("applicant pincode is matched");
		} else {
			System.out.println("applicant pincode is not matched");
		}

		// other country
		System.out.println("applicant other country");
		assertValidate.assertByWebelementVisibility(details.getApplicantOtherCountryDetailsText());
		assertValidate.assertByWebelementVisibility(details.getApplicantOtherCountryDetailsValueText());
		assertValidate.assertByEnabled(details.getApplicantOtherCountryDetailsValueText());

		if (details.getApplicantOtherCountryDetailsValueText().getText().isEmpty()) {

			System.out.println("applicant other country details are empty");
		} else {
			System.out.println("applicant other country details are not empty");
		}

		while_Run();

		// contact details
		System.out.println("contact details");
		assertValidate.assertByWebelementVisibility(details.getApplicantContactDetailsText());
		wUtility.scrollDownByKey(2);

		// applicant landline phone no
		System.out.println("applicant landline phone no");
		assertValidate.assertByWebelementVisibility(details.getApplicantLandlineNoText());
		assertValidate.assertByWebelementVisibility(details.getApplicantLandlineNoValueText());
		assertValidate.assertByEnabled(details.getApplicantLandlineNoValueText());

		if (details.getApplicantLandlineNoValueText().getText().isEmpty()) {

			System.out.println("applicant landline phone no is empty");
		} else {
			System.out.println("applicant landline phone no is not empty");
		}

		// applicant mobile no
		System.out.println("applicant mobile no");
		assertValidate.assertByWebelementVisibility(details.getApplicantMobileNoText());
		assertValidate.assertByWebelementVisibility(details.getApplicantMobileNoValueText());
		assertValidate.assertByEnabled(details.getApplicantMobileNoValueText());

		if (details.getApplicantMobileNoValueText().getText().equals(excel.readExcelData("Firm_User_Data", 7, 1))) {

			System.out.println("applicant mobile no is matched");
		} else {
			System.out.println("applicant mobile no is not matched");
		}

		// applicant fax no
		System.out.println("applicant fax no");
		assertValidate.assertByWebelementVisibility(details.getApplicantFaxNoText());
		assertValidate.assertByWebelementVisibility(details.getApplicantFaxNoValueText());
		assertValidate.assertByEnabled(details.getApplicantFaxNoValueText());

		if (details.getApplicantFaxNoValueText().getText().isEmpty()) {

			System.out.println("applicant fax no details are empty");
		} else {
			System.out.println("applicant fax no details are not empty");
		}

		// applicant email address
		System.out.println("applicant email address");
		assertValidate.assertByWebelementVisibility(details.getApplicantEmailAddressText());
		assertValidate.assertByWebelementVisibility(details.getApplicantEmailAddressValueText());
		assertValidate.assertByEnabled(details.getApplicantEmailAddressValueText());

		if (details.getApplicantEmailAddressValueText().getText().isEmpty()) {

			System.out.println("applicant email address is empty");
		} else {
			System.out.println("applicant email address is not empty");
		}

		while_Run();

		// details of firm
		System.out.println("details of firm");
		assertValidate.assertByWebelementVisibility(details.getDetailsOfFirmText());

		// firm name
		System.out.println("firm name");
		assertValidate.assertByWebelementVisibility(details.getFirmNameText());
		assertValidate.assertByWebelementVisibility(details.getFirmNameValueText());
		assertValidate.assertByEnabled(details.getFirmNameValueText());

		if (details.getFirmNameValueText().getText().equals(excel.readExcelData("Firm_User_Data", 8, 1))) {

			System.out.println("firm name is matched");
		} else {
			System.out.println("firm name is not matched");
		}
		wUtility.scrollDownByKey(2);
		// firm duration from
		System.out.println("firm duration from");
		assertValidate.assertByWebelementVisibility(details.getFirmDurationFromText());
		assertValidate.assertByWebelementVisibility(details.getFirmDurationFromDateValueText());
		assertValidate.assertByEnabled(details.getFirmDurationFromDateValueText());

		if (details.getFirmDurationFromDateValueText().getText().equals(excel.readExcelData("Firm_User_Data", 9, 1))) {

			System.out.println("firm duration from date is matched");
		} else {
			System.out.println("firm duration from date is not matched");
		}

		// indefinite
		System.out.println("indefinite");
		assertValidate.assertByWebelementVisibility(details.getIndefiniteText());
		assertValidate.assertByWebelementVisibility(details.getIndefiniteValueText());
		assertValidate.assertByEnabled(details.getIndefiniteValueText());

		System.out.println(details.getIndefiniteValueText().getText());

		// firm duration to
//		System.out.println("firm duration to");
//		assertValidate.assertByWebelementVisibility(details.getFirmDurationToText());
//		assertValidate.assertByWebelementVisibility(details.getFirmDurationToDateValueText());
//		assertValidate.assertByEnabled(details.getFirmDurationToDateValueText());
//		
//		if(details.getFirmDurationToDateValueText().getText().equals(excel.readExcelData("Firm_User_Data", 9, 1))){
//			
//			System.out.println("firm duration to date is matched");
//		}
//		else {
//			System.out.println("firm duration to date is not matched");
//		}

		// industry type
		System.out.println("industry type");
		assertValidate.assertByWebelementVisibility(details.getIndustryTypeText());
		assertValidate.assertByWebelementVisibility(details.getIndustryTypeValueText());
		assertValidate.assertByEnabled(details.getIndustryTypeValueText());

		System.out.println(details.getIndustryTypeValueText().getText());
		wUtility.scrollDownByKey(2);

		// registration district
		System.out.println("registration district");
		assertValidate.assertByWebelementVisibility(details.getRegistrationDistrictText());
		assertValidate.assertByWebelementVisibility(details.getRegistrationDistrictValueText());
		assertValidate.assertByEnabled(details.getRegistrationDistrictValueText());

		System.out.println(details.getRegistrationDistrictValueText().getText());

		// businesss type
		System.out.println("businesss type");
		assertValidate.assertByWebelementVisibility(details.getBusinessTypeText());
		assertValidate.assertByWebelementVisibility(details.getBusinessTypeValueText());
		assertValidate.assertByEnabled(details.getBusinessTypeValueText());

		System.out.println(details.getBusinessTypeValueText().getText());

		// premises type
		System.out.println("premises type");
		assertValidate.assertByWebelementVisibility(details.getPremisesTypeText());
		assertValidate.assertByWebelementVisibility(details.getPremisesTypeValueText());
		assertValidate.assertByEnabled(details.getPremisesTypeValueText());

		System.out.println(details.getPremisesTypeValueText().getText());

		wUtility.scrollDownByKey(2);
		// unique application id
		System.out.println("unique application id");
		assertValidate.assertByWebelementVisibility(details.getUniqueApplicationIdText());
		assertValidate.assertByWebelementVisibility(details.getUniqueApplicationIdValueText());
		assertValidate.assertByEnabled(details.getUniqueApplicationIdValueText());

		if (details.getUniqueApplicationIdValueText().getText()
				.equals(property.readProperty("Firm_Acknowledgement_No"))) {

			System.out.println("unique application id is matched with firm acknowledgement number");
		} else {
			System.out.println("unique application id is not matched with firm acknowledgement number");
		}
		while_Run();

		// principal address
		System.out.println("principal address");
		assertValidate.assertByWebelementVisibility(details.getPrincipalPlaceOfBusinessText());

		// principal door no
		System.out.println("principal door no");
		assertValidate.assertByWebelementVisibility(details.getPrincipalDoorNoText());
		assertValidate.assertByWebelementVisibility(details.getPrincipalDoorNoValueText());
		assertValidate.assertByEnabled(details.getPrincipalDoorNoValueText());

		if (details.getPrincipalDoorNoValueText().getText().equals(excel.readExcelData("Firm_User_Data", 12, 1))) {

			System.out.println("principal door no is matched");
		} else {
			System.out.println("principal door no is not matched");
		}

		// principal street
		System.out.println("principal street");
		assertValidate.assertByWebelementVisibility(details.getPrincipalStreetText());
		assertValidate.assertByWebelementVisibility(details.getPrincipalStreetValueText());
		assertValidate.assertByEnabled(details.getPrincipalStreetValueText());

		if (details.getPrincipalStreetValueText().getText().equals(excel.readExcelData("Firm_User_Data", 13, 1))) {

			System.out.println("principal street is matched");
		} else {
			System.out.println("principal street is not matched");
		}

		// principal village
		System.out.println("principal village");
		assertValidate.assertByWebelementVisibility(details.getPrincipalVillageOrCityText());
		assertValidate.assertByWebelementVisibility(details.getPrincipalVillageOrCityValueText());
		assertValidate.assertByEnabled(details.getPrincipalVillageOrCityValueText());

		if (details.getPrincipalVillageOrCityValueText().getText().equals(excel.readExcelData("Firm_User_Data", 14, 1))) {

			System.out.println("principal village is matched");
		} else {
			System.out.println("principal village is not matched");
		}

		// principal state
		System.out.println("principal state");
		assertValidate.assertByWebelementVisibility(details.getPrincipalStateText());
		assertValidate.assertByWebelementVisibility(details.getPrincipalStateValueText());
		assertValidate.assertByEnabled(details.getPrincipalStateValueText());

		System.out.println(details.getPrincipalStateValueText().getText());

		// principal district
		System.out.println("principal district");
		assertValidate.assertByWebelementVisibility(details.getPrincipalDistrictText());
		assertValidate.assertByWebelementVisibility(details.getPrincipalDistrictValueText());
		assertValidate.assertByEnabled(details.getPrincipalDistrictValueText());

		System.out.println(details.getPrincipalDistrictValueText().getText());

		// principal mandal
		System.out.println("principal mandal");
		assertValidate.assertByWebelementVisibility(details.getPrincipalMandalText());
		assertValidate.assertByWebelementVisibility(details.getPrincipalMandalValueText());
		assertValidate.assertByEnabled(details.getPrincipalMandalValueText());

		System.out.println(details.getPrincipalMandalValueText().getText());

		// principal pincode
		System.out.println("principal pincode");
		assertValidate.assertByWebelementVisibility(details.getPrincipalPincodeText());
		assertValidate.assertByWebelementVisibility(details.getPrincipalPincodeValueText());
		assertValidate.assertByEnabled(details.getPrincipalPincodeValueText());

		if (details.getPrincipalPincodeValueText().getText().equals(excel.readExcelData("Firm_User_Data", 15, 1))) {

			System.out.println("principal pincode is matched");
		} else {
			System.out.println("principal pincode is not matched");
		}

//		// other address
//
//		// other address door no
//		System.out.println("firm duration from");
//		assertValidate.assertByWebelementVisibility(details.getFirmDurationFromText());
//		assertValidate.assertByWebelementVisibility(details.getFirmDurationFromDateValueText());
//		assertValidate.assertByEnabled(details.getFirmDurationFromDateValueText());
//
//		if (details.getFirmDurationFromDateValueText().getText().equals(excel.readExcelData("Firm_User_Data", 9, 1))) {
//
//			System.out.println("firm duration from date is matched");
//		} else {
//			System.out.println("firm duration from date is not matched");
//		}
//
//		// other address street
//		System.out.println("firm duration from");
//		assertValidate.assertByWebelementVisibility(details.getFirmDurationFromText());
//		assertValidate.assertByWebelementVisibility(details.getFirmDurationFromDateValueText());
//		assertValidate.assertByEnabled(details.getFirmDurationFromDateValueText());
//
//		if (details.getFirmDurationFromDateValueText().getText().equals(excel.readExcelData("Firm_User_Data", 9, 1))) {
//
//			System.out.println("firm duration from date is matched");
//		} else {
//			System.out.println("firm duration from date is not matched");
//		}
//
//		// other address village
//		System.out.println("firm duration from");
//		assertValidate.assertByWebelementVisibility(details.getFirmDurationFromText());
//		assertValidate.assertByWebelementVisibility(details.getFirmDurationFromDateValueText());
//		assertValidate.assertByEnabled(details.getFirmDurationFromDateValueText());
//
//		if (details.getFirmDurationFromDateValueText().getText().equals(excel.readExcelData("Firm_User_Data", 9, 1))) {
//
//			System.out.println("firm duration from date is matched");
//		} else {
//			System.out.println("firm duration from date is not matched");
//		}
//
//		// other address state
//		System.out.println("premises type");
//		assertValidate.assertByWebelementVisibility(details.getPremisesTypeText());
//		assertValidate.assertByWebelementVisibility(details.getPremisesTypeValueText());
//		assertValidate.assertByEnabled(details.getPremisesTypeValueText());
//
//		System.out.println(details.getPremisesTypeValueText().getText());
//
//		// other address district
//		System.out.println("premises type");
//		assertValidate.assertByWebelementVisibility(details.getPremisesTypeText());
//		assertValidate.assertByWebelementVisibility(details.getPremisesTypeValueText());
//		assertValidate.assertByEnabled(details.getPremisesTypeValueText());
//
//		System.out.println(details.getPremisesTypeValueText().getText());
//
//		// other address mandal
//		System.out.println("premises type");
//		assertValidate.assertByWebelementVisibility(details.getPremisesTypeText());
//		assertValidate.assertByWebelementVisibility(details.getPremisesTypeValueText());
//		assertValidate.assertByEnabled(details.getPremisesTypeValueText());
//
//		System.out.println(details.getPremisesTypeValueText().getText());
//
//		// other address pincode
//		System.out.println("firm duration from");
//		assertValidate.assertByWebelementVisibility(details.getFirmDurationFromText());
//		assertValidate.assertByWebelementVisibility(details.getFirmDurationFromDateValueText());
//		assertValidate.assertByEnabled(details.getFirmDurationFromDateValueText());
//
//		if (details.getFirmDurationFromDateValueText().getText().equals(excel.readExcelData("Firm_User_Data", 9, 1))) {
//
//			System.out.println("firm duration from date is matched");
//		} else {
//			System.out.println("firm duration from date is not matched");
//		}

		while_Run();
		wUtility.scrollDownByKey(3);
		//partner details
		System.out.println("partner details");
		assertValidate.assertByWebelementVisibility(details.getPartnerDetailsText());
		
		//partner table data
		System.out.println("partners data in the table list");
		assertValidate.assertByWebelementVisibility(details.getPartnerDetailsTable());
		assertValidate.assertByEnabled(details.getPartnerDetailsTable());
		System.out.println(wUtility.tableHeaders(details.getPartnerDetailsTable()));
		System.out.println(wUtility.tableContents(details.getPartnerDetailsTable()));
		
		for (int i = 0; i < details.getViewButtons().size(); i++) {
			details.getViewButtons().get(i).click();
			//script
			//switch to partner details page
			wUtility.switchToWindowByUrl(driver, "https://tsstaging.meeseva.telangana.gov.in/ssdgigrsdept/viewPopupRegistrationDetails.htm");
			driver.manage().window().maximize();
			while_Run();
			
			//partner firstname
			System.out.println("partner firstname");
			assertValidate.assertByWebelementVisibility(details.getPartnerFirstnameText());
			assertValidate.assertByWebelementVisibility(details.getPartnerFirstnameValueText());
			assertValidate.assertByEnabled(details.getPartnerFirstnameValueText());

			System.out.println(details.getPartnerFirstnameValueText().getText());
			
			//partner surname
			System.out.println("partner surname");
			assertValidate.assertByWebelementVisibility(details.getPartnerLastnameText());
			assertValidate.assertByWebelementVisibility(details.getPartnerLastnameValueText());
			assertValidate.assertByEnabled(details.getPartnerLastnameValueText());

			System.out.println(details.getPartnerLastnameValueText().getText());
			
			//partner joining date
			System.out.println("partner joining date");
			assertValidate.assertByWebelementVisibility(details.getPartnerJoiningDateText());
			assertValidate.assertByWebelementVisibility(details.getPartnerJoiningDateValueText());
			assertValidate.assertByEnabled(details.getPartnerJoiningDateValueText());

			System.out.println(details.getPartnerJoiningDateValueText().getText());
			
			//partner address table
			System.out.println("partner address table");
			assertValidate.assertByWebelementVisibility(details.getPartnerAddressDetailsTable());
			System.out.println(wUtility.tableHeaders(details.getPartnerAddressDetailsTable()));
			Thread.sleep(3000);
			System.out.println(wUtility.tableContents(details.getPartnerAddressDetailsTable()));
			while_Run();
			
			//clicking on close button
			System.out.println("close button");
			assertValidate.assertByWebelementVisibility(details.getPartnerDetailsCloseButton());
			details.getPartnerDetailsCloseButton().click();
			//wait
			Thread.sleep(5000);
			wUtility.switchToWindowByUrl(driver, "https://tsstaging.meeseva.telangana.gov.in/ssdgigrsdept/printApprovedCertificate.htm");
			while_Run();
			Thread.sleep(2000);
		}
		
		//documents upload
		System.out.println("documents upload");
		assertValidate.assertByWebelementVisibility(details.getUploadedDocumentDetailsTable());
		System.out.println("headers");
		wUtility.tableHeaders(details.getUploadedDocumentDetailsTable());
		System.out.println("data");
		wUtility.tableContents(details.getUploadedDocumentDetailsTable());
		Thread.sleep(2000);
		
		//user payment details
		System.out.println("user payment details");
		assertValidate.assertByWebelementVisibility(details.getUserPaymentDetailsText());
		
		//validating statutory fee
		System.out.println("statutory fee");
		assertValidate.assertByWebelementVisibility(details.getStatutoryFeeText());
		assertValidate.assertByWebelementVisibility(details.getStatutoryFeeValueText());
		assertValidate.assertByEnabled(details.getStatutoryFeeValueText());
		
		System.out.println(details.getStatutoryFeeText().getText() + ":"+details.getStatutoryFeeValueText().getText())
		;
		
		//service tax
		System.out.println("service tax");
		assertValidate.assertByWebelementVisibility(details.getServiceTaxText());
		assertValidate.assertByWebelementVisibility(details.getServiceTaxValueText());
		assertValidate.assertByEnabled(details.getServiceTaxValueText());
		
		System.out.println(details.getServiceTaxText().getText() + ":"+details.getServiceTaxValueText().getText());
		
		//user charges
		System.out.println("user charges");
		assertValidate.assertByWebelementVisibility(details.getUserChargesText());
		assertValidate.assertByWebelementVisibility(details.getUserChargesValueText());
		assertValidate.assertByEnabled(details.getUserChargesValueText());
		
		System.out.println(details.getUserChargesText().getText() + ":"+details.getUserChargesValueText().getText());
		
		//total amount
		System.out.println("total amount");
		assertValidate.assertByWebelementVisibility(details.getTotalAmountText());
		assertValidate.assertByWebelementVisibility(details.getTotalAmountValueText());
		assertValidate.assertByEnabled(details.getTotalAmountValueText());
		
		System.out.println(details.getTotalAmountText().getText() + ":"+details.getTotalAmountValueText().getText());
		
		//validating jurisdiction check box and text
		System.out.println("jurisdiction check box");
		assertValidate.assertByWebelementVisibility(details.getChangeJurisdictionCheckBox());
		
		if(details.getChangeJurisdictionCheckBox().isSelected()) {
			
			System.out.println("jurisdiction check box is selected");
			details.getChangeJurisdictionCheckBox().click();
		}
		else {
			System.out.println("jurisdiction check box is not selected");
		}
		
		System.out.println(details.getChangeJurisdictionNoteText().getText());
		
		//check name availability
		System.out.println("check firm name availability");
		
		assertValidate.assertByWebelementVisibility(details.getCheckNameAvailabilityLink());
		
		details.getCheckNameAvailabilityLink().click();
		
		wUtility.switchToWindowByUrl(driver, "https://tsstaging.meeseva.telangana.gov.in/ssdgigrsdept/searchNameList.htm");
		driver.manage().window().maximize();
		while_Run();
		Thread.sleep(3000);
		//validating name availability page
		System.out.println("name availability page");
		assertValidate.assertByWebelementVisibility(details.getNameAvailabilityPageText());
	
		//validate label of search society or firm name
		System.out.println("search label");
		assertValidate.assertByWebelementVisibility(details.getEnterSocietyOrFirmNameText());
		
		//entering firm or society registration name
		System.out.println("registration name");
		assertValidate.assertByWebelementVisibility(details.getFirmNameInNameAvailabilityCheckingTextField());
		Thread.sleep(3000);
		details.getFirmNameInNameAvailabilityCheckingTextField().click();
		details.getFirmNameInNameAvailabilityCheckingTextField().sendKeys(details.getFirmNameValueText().getText());
		Thread.sleep(3000);
		//clicking on search button
		System.out.println("search button in name availability page");
		assertValidate.assertByWebelementVisibility(details.getNameAvailabilitySearchButton());
		
		details.getNameAvailabilitySearchButton().click();
		
		if(details.getNoFoundErrorTextInNameAvailability().isDisplayed()) {
			
			System.out.println(details.getNoFoundErrorTextInNameAvailability().getText());
			while_Run();
			driver.close();
		}
		else
		{
			System.out.println(details.getNoFoundErrorTextInNameAvailability().getText());
			while_Run();
			driver.close();
		}
		
		Thread.sleep(2000);
		wUtility.switchToWindowByUrl(driver, "https://tsstaging.meeseva.telangana.gov.in/ssdgigrsdept/printApprovedCertificate.htm");
		while_Run();
		Thread.sleep(2000);
		
		//clicking on continue button
		System.out.println("continue button");
		assertValidate.assertByWebelementVisibility(details.getSubmitButtonInFirmDetailsPage());
		
		details.getSubmitButtonInFirmDetailsPage().click();
		Thread.sleep(3000);
		while_Run();
		
		//validating decision page
		System.out.println("decision page");
		assertValidate.assertByWebelementVisibility(details.getDecisionHeadingPageText());
		System.out.println(details.getDecisionHeadingPageText().getText());
		
		//validating decision label and clicking on forward radio button
		System.out.println("decision");
		assertValidate.assertByWebelementVisibility(details.getDecisionLabelText());
		
		System.out.println("forward radio button");
		assertValidate.assertByWebelementVisibility(details.getForwardRadioButton());
		assertValidate.assertByEnabled(details.getForwardRadioButton());
		
		details.getForwardRadioButton().click();
		
		//entering comments
		System.out.println("comments");
		assertValidate.assertByWebelementVisibility(details.getCommentsText());
		assertValidate.assertByWebelementVisibility(details.getCommentsTextField());
		assertValidate.assertByEnabled(details.getCommentsTextField());
		
		details.getCommentsTextField().sendKeys("Application is Forwarded to DR");
		Thread.sleep(3000);
		//selecting user
		System.out.println("selecting user");
		assertValidate.assertByWebelementVisibility(details.getSelectUserText());
		assertValidate.assertByWebelementVisibility(details.getSelectUserDropDown());
		assertValidate.assertByEnabled(details.getSelectUserDropDown());
		
		wUtility.select(details.getSelectUserDropDown(), 0);
		
		//comments table
		System.out.println("comments table");
		assertValidate.assertByWebelementVisibility(details.getCommentsHistoryTable());
		wUtility.tableHeaders(details.getCommentsHistoryTable());
		wUtility.tableContents(details.getCommentsHistoryTable());
		
		while_Run();
		
		//clicking on submit button
		System.out.println("decision submit button");
		assertValidate.assertByWebelementVisibility(details.getSubmitButtonInDecisionPage());
		
		details.getSubmitButtonInDecisionPage().click();
		Thread.sleep(3000);
		
		while_Run();
		
		//validating successful submission text
		System.out.println("successful submission text");
		assertValidate.assertByWebelementVisibility(details.getSuccessfulSubmissionText());
		System.out.println(details.getSuccessfulSubmissionText().getText());
		Thread.sleep(2000);
		
		if(details.getSuccessfulSubmissionText().isDisplayed()) {
			
			excel.writeData("MEE_REG_OF_FIRM", 7, 3, "PASS");
		}
		else {
			excel.writeData("MEE_REG_OF_FIRM", 7, 3, "FAIL");
		}
		
		end_Report(details.getSuccessfulSubmissionText(), excel.readExcelData("MEE_REG_OF_FIRM", 7, 0));
		
	}

}
