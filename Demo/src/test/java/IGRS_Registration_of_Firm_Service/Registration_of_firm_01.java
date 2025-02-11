package IGRS_Registration_of_Firm_Service;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base_test.BaseClass;
import pom_classes.Access_Page;
import pom_classes.Receipt_Page;
import pom_classes.Registration_of_Firm_Page;

public class Registration_of_firm_01 extends BaseClass {

	@Test
	public void firm_process() throws Throwable {

		start_Report(excel.readExcelData("MEE_REG_OF_FIRM", 6, 0), excel.readExcelData("MEE_REG_OF_FIRM", 6, 1),
				excel.readExcelData("MEE_REG_OF_FIRM", 6, 2));

		// access page
		// searching for firm in search bar
		Access_Page access = new Access_Page(driver);

		// validating search bar field
		System.out.println("search bar");
		while_Run();
		assertValidate.assertByWebelementVisibility(access.getSearchBarTextField());
		assertValidate.assertByEnabled(access.getSearchBarTextField());

		// important notice alert
		System.out.println("important notice popup");
		assertValidate.assertByWebelementVisibility(access.getImportantNoticeAlertCloseButton());

		access.getImportantNoticeAlertCloseButton().click();
		Thread.sleep(2000);
		while_Run();
		access.getSearchBarTextField().sendKeys(excel.readExcelData("Firm_User_Data", 30, 1));
		Thread.sleep(2000);
		while_Run();

		// clicking on registration of firm service
		System.out.println("firm service");
		assertValidate.assertByWebelementVisibility(access.getRegistrationOfFirmLink());
		assertValidate.assertByEnabled(access.getRegistrationOfFirmLink());

		access.getRegistrationOfFirmLink().click();
		Thread.sleep(3000);
		while_Run();

		// switching to reg of firm
		wUtility.switchToWindowByTitle(driver, "Registration of Firms (Under Section: 58)");
		// zoom in and zoom out
//		WebElement html = driver.findElement(By.tagName("html"));
////		html.sendKeys(Keys.chord(Keys.CONTROL, Keys.ADD));
//		html.sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
		
//		JavascriptExecutor executor = (JavascriptExecutor)driver;
//		executor.executeScript("document.body.style.zoom = '0.5'");
		
		// validating the service name
		Registration_of_Firm_Page firm = new Registration_of_Firm_Page(driver);

		System.out.println("service name");
		assertValidate.assertByWebelementVisibility(firm.getRegistrationOfFirmsHeadingText());
		System.out.println("service name is : " + firm.getRegistrationOfFirmsHeadingText().getText());

		// validating applicant details
		System.out.println("applicant details");
		assertValidate.assertByWebelementVisibility(firm.getApplicantDetailsText());

		// entering applicant first name
		System.out.println("applicant first name");
		assertValidate.assertByWebelementVisibility(firm.getApplicantFirstNameText());
		assertValidate.assertByWebelementVisibility(firm.getApplicantFirstNameTextField());
		assertValidate.assertByEnabled(firm.getApplicantFirstNameTextField());

		firm.getApplicantFirstNameTextField().sendKeys(excel.readExcelData("Firm_User_Data", 1, 1));

		// entering applicant surname
		System.out.println("applicant surname");
		assertValidate.assertByWebelementVisibility(firm.getApplicantSurnameText());
		assertValidate.assertByWebelementVisibility(firm.getApplicantSurnameTextField());
		assertValidate.assertByEnabled(firm.getApplicantSurnameTextField());

		firm.getApplicantSurnameTextField().sendKeys(excel.readExcelData("Firm_User_Data", 2, 1));

		// selecting applicant gender
		System.out.println("applicant gender");
		assertValidate.assertByWebelementVisibility(firm.getApplicantGenderText());
		assertValidate.assertByWebelementVisibility(firm.getApplicantGenderDropDown());
		assertValidate.assertByEnabled(firm.getApplicantGenderDropDown());

		wUtility.select(firm.getApplicantGenderDropDown(), 1);

		// validating applicant aadhaar no
		System.out.println("applicant aadhaar no");
		assertValidate.assertByWebelementVisibility(firm.getApplicantAadhaarNoText());

		// validating applicant address
		System.out.println("applicant address");
		assertValidate.assertByWebelementVisibility(firm.getApplicantAddressText());

		// selecting delivery type
		System.out.println("delivery type");
		assertValidate.assertByWebelementVisibility(firm.getApplicantDeliveryTypeText());
		assertValidate.assertByWebelementVisibility(firm.getApplicantDeliveryTypeDropDown());
		assertValidate.assertByEnabled(firm.getApplicantDeliveryTypeDropDown());

		wUtility.select(firm.getApplicantDeliveryTypeDropDown(), 1);

		wUtility.switchToAlertAndAccept(driver);
		Thread.sleep(2000);

		// entering applicant door no
		System.out.println("applicant door no");
		assertValidate.assertByWebelementVisibility(firm.getApplicantDoorNoText());
		assertValidate.assertByWebelementVisibility(firm.getApplicantDoorNoTextField());
		assertValidate.assertByEnabled(firm.getApplicantDoorNoTextField());

		firm.getApplicantDoorNoTextField().sendKeys(excel.readExcelData("Firm_User_Data", 3, 1));

		// entering applicant street
		System.out.println("applicant street");
		assertValidate.assertByWebelementVisibility(firm.getApplicantStreetText());
		assertValidate.assertByWebelementVisibility(firm.getApplicantStreetTextField());
		assertValidate.assertByEnabled(firm.getApplicantStreetTextField());

		firm.getApplicantStreetTextField().sendKeys(excel.readExcelData("Firm_User_Data", 4, 1));

		// entering applicant village
		System.out.println("applicant village");
		assertValidate.assertByWebelementVisibility(firm.getApplicantVillageOrCityText());
		assertValidate.assertByWebelementVisibility(firm.getApplicantVillageOrCityTextField());
		assertValidate.assertByEnabled(firm.getApplicantVillageOrCityTextField());

		firm.getApplicantVillageOrCityTextField().sendKeys(excel.readExcelData("Firm_User_Data", 5, 1));

		// validating country
		System.out.println("applicant country");
		assertValidate.assertByWebelementVisibility(firm.getApplicantCountryText());
		assertValidate.assertByWebelementVisibility(firm.getApplicantCountryDropDown());
		assertValidate.assertByEnabled(firm.getApplicantCountryDropDown());

		wUtility.select(firm.getApplicantCountryDropDown(), 0);

		// selecting state
		System.out.println("applicant state");
		assertValidate.assertByWebelementVisibility(firm.getApplicantStateText());
		assertValidate.assertByWebelementVisibility(firm.getApplicantStateDropDown());
		assertValidate.assertByEnabled(firm.getApplicantStateDropDown());

		wUtility.select(firm.getApplicantStateDropDown(), 0);
		Thread.sleep(2000);
		// selecting district
		System.out.println("applicant district");
		assertValidate.assertByWebelementVisibility(firm.getApplicantDistrictText());
		assertValidate.assertByWebelementVisibility(firm.getApplicantDistrictDropDown());
		assertValidate.assertByEnabled(firm.getApplicantDistrictDropDown());

		wUtility.select(firm.getApplicantDistrictDropDown(), 1);
		Thread.sleep(5000);

		// selecting mandal
		System.out.println("applicant mandal");
		assertValidate.assertByWebelementVisibility(firm.getApplicantMandalText());
		assertValidate.assertByWebelementVisibility(firm.getApplicantMandalDropDown());
		assertValidate.assertByEnabled(firm.getApplicantMandalDropDown());

		wUtility.select(firm.getApplicantMandalDropDown(), 1);

		// entering pincode
		System.out.println("applicant pincode");
		assertValidate.assertByWebelementVisibility(firm.getApplicantPincodeText());
		assertValidate.assertByWebelementVisibility(firm.getApplicantPincodeTextField());
		assertValidate.assertByEnabled(firm.getApplicantPincodeTextField());

		firm.getApplicantPincodeTextField().sendKeys(excel.readExcelData("Firm_User_Data", 6, 1));

		// contact details
		System.out.println("contact details");
		assertValidate.assertByWebelementVisibility(firm.getApplicantContactDetailsText());

		// entering applicant mobile no
		System.out.println("applicant mobile no");
		assertValidate.assertByWebelementVisibility(firm.getApplicantMobileNoText());
		assertValidate.assertByWebelementVisibility(firm.getApplicantMobileNoTextField());
		assertValidate.assertByEnabled(firm.getApplicantMobileNoTextField());

		firm.getApplicantMobileNoTextField().sendKeys(excel.readExcelData("Firm_User_Data", 7, 1));
		while_Run();
		wUtility.scrollDownByKey(5);

		// firm details
		System.out.println("firm details");
		assertValidate.assertByWebelementVisibility(firm.getFirmDetailsText());

		// entering firm name
		System.out.println("firm name");
		assertValidate.assertByWebelementVisibility(firm.getFirmNameText());
		assertValidate.assertByWebelementVisibility(firm.getFirmNameTextField());
		assertValidate.assertByEnabled(firm.getFirmNameTextField());

		firm.getFirmNameTextField().sendKeys(excel.readExcelData("Firm_User_Data", 8, 1));
		Thread.sleep(2000);
		// clicking on name availability button
		System.out.println("firm name availability");
		assertValidate.assertByWebelementVisibility(firm.getCheckFirmNameAvailabilityButton());

		firm.getCheckFirmNameAvailabilityButton().click();
		Thread.sleep(7000);
		wUtility.switchToAlertAndAccept(driver);
		Thread.sleep(2000);

		// selecting firm start date
		System.out.println("firm start date");
		assertValidate.assertByWebelementVisibility(firm.getFirmDurationFromText());
		assertValidate.assertByWebelementVisibility(firm.getFirmDurationFromDateSelect());
		assertValidate.assertByEnabled(firm.getFirmDurationFromDateSelect());
		assertValidate.assertByWebelementVisibility(firm.getFirmDurationFromDateIcon());
		assertValidate.assertByEnabled(firm.getFirmDurationFromDateIcon());

		wUtility.enterDataUsingJavaScript(driver, firm.getFirmDurationFromDateSelect(),
				excel.readExcelData("Firm_User_Data", 9, 1));

		Thread.sleep(2000);

		// clicking indefinite check box
		System.out.println("indefinite check box");
		assertValidate.assertByWebelementVisibility(firm.getFirmIndefiniteText());
		assertValidate.assertByWebelementVisibility(firm.getFirmIndefiniteDurationCheckBox());
		assertValidate.assertByEnabled(firm.getFirmIndefiniteDurationCheckBox());

		firm.getFirmIndefiniteDurationCheckBox().click();

		// selecting firm end date (optional)
//		System.out.println("firm end date");
//		assertValidate.assertByWebelementVisibility(firm.getFirmDurationToText());
//		assertValidate.assertByWebelementVisibility(firm.getFirmDurationToDateSelect());
//		assertValidate.assertByEnabled(firm.getFirmDurationToDateSelect());
//		assertValidate.assertByWebelementVisibility(firm.getFirmDurationToDateIcon());
//		assertValidate.assertByEnabled(firm.getFirmDurationToDateIcon());
//		
//		wUtility.enterDataUsingJavaScript(driver, firm.getFirmDurationToDateSelect(), excel.readExcelData("Firm_User_Data", 9, 1));
//		
//		Thread.sleep(2000);

		// selecting industry type
		System.out.println("industry type");
		assertValidate.assertByWebelementVisibility(firm.getFirmIndustryTypeText());
		assertValidate.assertByWebelementVisibility(firm.getFirmIndustryTypeDropDown());
		assertValidate.assertByEnabled(firm.getFirmIndustryTypeDropDown());

		wUtility.selectByAttribute(firm.getFirmIndustryTypeDropDown(), "Real Estate & Housing");

		Thread.sleep(3000);
		// selecting business type
		System.out.println("business type");
		assertValidate.assertByWebelementVisibility(firm.getFirmBusinessTypeText());
		assertValidate.assertByWebelementVisibility(firm.getFirmBusinessTypeDropDown());
		assertValidate.assertByEnabled(firm.getFirmBusinessTypeDropDown());

		wUtility.select(firm.getFirmBusinessTypeDropDown(), 2);

		// selecting premises type
		System.out.println("premises type");
		assertValidate.assertByWebelementVisibility(firm.getFirmPremisesTypeText());
		assertValidate.assertByWebelementVisibility(firm.getFirmPremisesTypeDropDown());
		assertValidate.assertByEnabled(firm.getFirmPremisesTypeDropDown());

		wUtility.select(firm.getFirmPremisesTypeDropDown(), 1);
		Thread.sleep(2000);

		// validating principal place
		System.out.println("principal place");
		assertValidate.assertByWebelementVisibility(firm.getPrincipalPlaceOfBusinessText());

		// entering principal door no
		System.out.println("principal door no");
		assertValidate.assertByWebelementVisibility(firm.getPrincipalDoorNoText());
		assertValidate.assertByWebelementVisibility(firm.getPrincipalDoorNoTextField());
		assertValidate.assertByEnabled(firm.getPrincipalDoorNoTextField());

		firm.getPrincipalDoorNoTextField().sendKeys(excel.readExcelData("Firm_User_Data", 12, 1));
		wUtility.scrollDownByKey(5);
		// entering principal street
		System.out.println("principal street");
		assertValidate.assertByWebelementVisibility(firm.getPrincipalStreetText());
		assertValidate.assertByWebelementVisibility(firm.getPrincipalStreetTextField());
		assertValidate.assertByEnabled(firm.getPrincipalStreetTextField());

		firm.getPrincipalStreetTextField().sendKeys(excel.readExcelData("Firm_User_Data", 13, 1));

		// entering principal village
		System.out.println("principal village");
		assertValidate.assertByWebelementVisibility(firm.getPrincipalVillageOrCityText());
		assertValidate.assertByWebelementVisibility(firm.getPrincipalVillageOrCityTextField());
		assertValidate.assertByEnabled(firm.getPrincipalVillageOrCityTextField());

		firm.getPrincipalVillageOrCityTextField().sendKeys(excel.readExcelData("Firm_User_Data", 14, 1));

		// entering principal pincode
		System.out.println("principal pincode");
		assertValidate.assertByWebelementVisibility(firm.getPrincipalPincodeText());
		assertValidate.assertByWebelementVisibility(firm.getPrincipalPincodeTextField());
		assertValidate.assertByEnabled(firm.getPrincipalPincodeTextField());

		firm.getPrincipalPincodeTextField().sendKeys(excel.readExcelData("Firm_User_Data", 15, 1));

		// selecting principal state
		System.out.println("principal state");
		assertValidate.assertByWebelementVisibility(firm.getPrincipalStateText());
		assertValidate.assertByWebelementVisibility(firm.getPrincipalStateReadOnlyField());
		assertValidate.assertByEnabled(firm.getPrincipalStateReadOnlyField());

		System.out.println("principal state : " + firm.getPrincipalStateReadOnlyField().getText());

		// selecting principal district
		System.out.println("principal district");
		assertValidate.assertByWebelementVisibility(firm.getPrincipalDistrictText());
		assertValidate.assertByWebelementVisibility(firm.getPrincipalDistrictDropDown());
		assertValidate.assertByEnabled(firm.getPrincipalDistrictDropDown());

		wUtility.select(firm.getPrincipalDistrictDropDown(), 1);
		Thread.sleep(3000);

		// selecting principal mandal
		System.out.println("principal mandal");
		assertValidate.assertByWebelementVisibility(firm.getPrincipalMandalText());
		assertValidate.assertByWebelementVisibility(firm.getPrincipalMandalDropDown());
		assertValidate.assertByEnabled(firm.getPrincipalMandalDropDown());

		wUtility.select(firm.getPrincipalMandalDropDown(), 1);
		Thread.sleep(2000);
		// selecting registration district
		System.out.println("registration district");
		assertValidate.assertByWebelementVisibility(firm.getRegistrationDistrictNameText());
		assertValidate.assertByWebelementVisibility(firm.getRegistrationDistrictNameDropDown());
		assertValidate.assertByEnabled(firm.getRegistrationDistrictNameDropDown());

		wUtility.select(firm.getRegistrationDistrictNameDropDown(), 1);
		Thread.sleep(2000);
		while_Run();

		// validating other address
		System.out.println("other address");
		assertValidate.assertByWebelementVisibility(firm.getOtherAddressText());

		// validating and clicking other address checkbox
//		System.out.println("other address check box");
//		assertValidate.assertByWebelementVisibility(firm.getOtherAddressCheckBox());
//		assertValidate.assertByEnabled(firm.getOtherAddressCheckBox());
//		
//		firm.getOtherAddressCheckBox().click();
//		
//		//entering other address door no
//		System.out.println("other address door no");
//		assertValidate.assertByWebelementVisibility(firm.getOtherAddressDoorNoText());
//		assertValidate.assertByWebelementVisibility(firm.getOtherAddressDoorNoTextField());
//		assertValidate.assertByEnabled(firm.getOtherAddressDoorNoTextField());
//		
//		firm.getOtherAddressDoorNoTextField().sendKeys(excel.readExcelData("Firm_User_Data", 12, 1));
//		
//		//entering other address street
//		System.out.println("other address street");
//		assertValidate.assertByWebelementVisibility(firm.getOtherAddressStreetText());
//		assertValidate.assertByWebelementVisibility(firm.getOtherAddressStreetTextField());
//		assertValidate.assertByEnabled(firm.getOtherAddressStreetTextField());
//		
//		firm.getOtherAddressStreetTextField().sendKeys(excel.readExcelData("Firm_User_Data", 13, 1));
//		
//		//entering other address village
//		System.out.println("other address village");
//		assertValidate.assertByWebelementVisibility(firm.getOtherAddressVillageOrCityText());
//		assertValidate.assertByWebelementVisibility(firm.getOtherAddressVillageOrCityTextField());
//		assertValidate.assertByEnabled(firm.getOtherAddressVillageOrCityTextField());
//		
//		firm.getOtherAddressVillageOrCityTextField().sendKeys(excel.readExcelData("Firm_User_Data", 14, 1));
//		
//		//entering other address pincode
//		System.out.println("other address pincode");
//		assertValidate.assertByWebelementVisibility(firm.getOtherAddressPincodeText());
//		assertValidate.assertByWebelementVisibility(firm.getOtherAddressPincodeTextField());
//		assertValidate.assertByEnabled(firm.getOtherAddressPincodeTextField());
//		
//		firm.getOtherAddressPincodeTextField().sendKeys(excel.readExcelData("Firm_User_Data", 15, 1));
//		
//		//selecting other address state
//		System.out.println("other address state");
//		assertValidate.assertByWebelementVisibility(firm.getOtherAddressStateText());
//		assertValidate.assertByWebelementVisibility(firm.getOtherAddressStateDropDown());
//		assertValidate.assertByEnabled(firm.getOtherAddressStateDropDown());
//		
//		wUtility.select(firm.getOtherAddressStateDropDown(), 1);
//		
//		//selecting other address district
//		System.out.println("other address district");
//		assertValidate.assertByWebelementVisibility(firm.getOtherAddressDistrictText());
//		assertValidate.assertByWebelementVisibility(firm.getOtherAddressDistrictDropDown());
//		assertValidate.assertByEnabled(firm.getOtherAddressDistrictDropDown());
//		
//		wUtility.select(firm.getOtherAddressDistrictDropDown(), 1);
//		Thread.sleep(3000);
//		
//		//selecting other address mandal
//		System.out.println("other address mandal");
//		assertValidate.assertByWebelementVisibility(firm.getOtherAddressMandalText());
//		assertValidate.assertByWebelementVisibility(firm.getOtherAddressMandalDropDown());
//		assertValidate.assertByEnabled(firm.getOtherAddressMandalDropDown());
//		
//		wUtility.select(firm.getOtherAddressMandalDropDown(), 1);
//		Thread.sleep(2000);
//		
		// clicking on add other address button
//		System.out.println("other address button");
//		assertValidate.assertByWebelementVisibility(firm.getAddOtherAddressDetailsButton());
//		
//		firm.getAddOtherAddressDetailsButton().click();
//		
		wUtility.scrollDownByKey(5);
		// validating partner details
		System.out.println("partner details");
		assertValidate.assertByWebelementVisibility(firm.getPartnerDetailsText());

		// entering partner name
		System.out.println("partner name");
		assertValidate.assertByWebelementVisibility(firm.getPartnerFirstNameText());
		assertValidate.assertByWebelementVisibility(firm.getPartnerFirstNameTextField());
		assertValidate.assertByEnabled(firm.getPartnerFirstNameTextField());

		firm.getPartnerFirstNameTextField().sendKeys(excel.readExcelData("Firm_User_Data", 17, 1));

		// entering partner surname
		System.out.println("partner surname");
		assertValidate.assertByWebelementVisibility(firm.getPartnerSurnameText());
		assertValidate.assertByWebelementVisibility(firm.getPartnerSurnameTextField());
		assertValidate.assertByEnabled(firm.getPartnerSurnameTextField());

		firm.getPartnerSurnameTextField().sendKeys(excel.readExcelData("Firm_User_Data", 18, 1));

		// entering partner age
		System.out.println("partner age");
		assertValidate.assertByWebelementVisibility(firm.getPartnerAgeText());
		assertValidate.assertByWebelementVisibility(firm.getPartnerAgeTextField());
		assertValidate.assertByEnabled(firm.getPartnerAgeTextField());

		firm.getPartnerAgeTextField().sendKeys(excel.readExcelData("Firm_User_Data", 19, 1));

		// validating partner aadhaar no
		System.out.println("partner aadhaar no");
		assertValidate.assertByWebelementVisibility(firm.getPartnerAadhaarNoText());
		assertValidate.assertByWebelementVisibility(firm.getPartnerAadhaarNoTextField());
		assertValidate.assertByEnabled(firm.getPartnerAadhaarNoTextField());

		// selecting partner joining date
		System.out.println("partner joining date");
		assertValidate.assertByWebelementVisibility(firm.getPartnerJoiningDateText());
		assertValidate.assertByWebelementVisibility(firm.getPartnerJoiningDateTextField());
		assertValidate.assertByEnabled(firm.getPartnerJoiningDateTextField());
		assertValidate.assertByWebelementVisibility(firm.getPartnerJoiningDateIcon());
		assertValidate.assertByEnabled(firm.getPartnerJoiningDateIcon());

		wUtility.enterDataUsingJavaScript(driver, firm.getPartnerJoiningDateTextField(),
				excel.readExcelData("Firm_User_Data", 20, 1));

		// partner address
		System.out.println("partner address");
		assertValidate.assertByWebelementVisibility(firm.getPartnerAddressText());

		// entering partner door no
		System.out.println("partner door no");
		assertValidate.assertByWebelementVisibility(firm.getPartnerDoorNoText());
		assertValidate.assertByWebelementVisibility(firm.getPartnerDoorNoTextField());
		assertValidate.assertByEnabled(firm.getPartnerDoorNoTextField());

		firm.getPartnerDoorNoTextField().sendKeys(excel.readExcelData("Firm_User_Data", 21, 1));

		// entering partner street
		System.out.println("partner street");
		assertValidate.assertByWebelementVisibility(firm.getPartnerStreetText());
		assertValidate.assertByWebelementVisibility(firm.getPartnerStreetTextField());
		assertValidate.assertByEnabled(firm.getPartnerStreetTextField());

		firm.getPartnerStreetTextField().sendKeys(excel.readExcelData("Firm_User_Data", 22, 1));

		// entering partner village
		System.out.println("partner village");
		assertValidate.assertByWebelementVisibility(firm.getPartnerVillageOrCityText());
		assertValidate.assertByWebelementVisibility(firm.getPartnerVillageOrCityTextField());
		assertValidate.assertByEnabled(firm.getPartnerVillageOrCityTextField());

		firm.getPartnerVillageOrCityTextField().sendKeys(excel.readExcelData("Firm_User_Data", 23, 1));

		// entering partner pincode
		System.out.println("partner pincode");
		assertValidate.assertByWebelementVisibility(firm.getPartnerPincodeText());
		assertValidate.assertByWebelementVisibility(firm.getPartnerPincodeTextField());
		assertValidate.assertByEnabled(firm.getPartnerPincodeTextField());

		firm.getPartnerPincodeTextField().sendKeys(excel.readExcelData("Firm_User_Data", 24, 1));

		// selecting partner country
		System.out.println("partner country");
		assertValidate.assertByWebelementVisibility(firm.getPartnerCountryText());
		assertValidate.assertByWebelementVisibility(firm.getPartnerCountryDropDown());
		assertValidate.assertByEnabled(firm.getPartnerCountryDropDown());

		wUtility.select(firm.getPartnerCountryDropDown(), 0);

		// selecting partner state
		System.out.println("partner state");
		assertValidate.assertByWebelementVisibility(firm.getPartnerStateText());
		assertValidate.assertByWebelementVisibility(firm.getPartnerStateDropDown());
		assertValidate.assertByEnabled(firm.getPartnerStateDropDown());

		wUtility.select(firm.getPartnerStateDropDown(), 0);

		// selecting partner district
		System.out.println("partner district");
		assertValidate.assertByWebelementVisibility(firm.getPartnerDistrictText());
		assertValidate.assertByWebelementVisibility(firm.getPartnerDistrictDropDown());
		assertValidate.assertByEnabled(firm.getPartnerDistrictDropDown());

		wUtility.select(firm.getPartnerDistrictDropDown(), 1);
		Thread.sleep(5000);
		// selecting partner mandal
		System.out.println("partner mandal");
		assertValidate.assertByWebelementVisibility(firm.getPartnerMandalText());
		assertValidate.assertByWebelementVisibility(firm.getPartnerMandalDropDown());
		assertValidate.assertByEnabled(firm.getPartnerMandalDropDown());

		wUtility.select(firm.getPartnerMandalDropDown(), 1);
		while_Run();
		// clicking on add partner details button
		System.out.println("add partner details button");
		assertValidate.assertByWebelementVisibility(firm.getAddPartnerDetailsButton());

		firm.getAddPartnerDetailsButton().click();
		Thread.sleep(7000);

		// 2nd partner details

		firm.getPartnerFirstNameTextField().sendKeys(excel.readExcelData("Firm_User_Data", 17, 2));
		firm.getPartnerSurnameTextField().sendKeys(excel.readExcelData("Firm_User_Data", 18, 2));
		firm.getPartnerAgeTextField().sendKeys(excel.readExcelData("Firm_User_Data", 19, 2));
		wUtility.enterDataUsingJavaScript(driver, firm.getPartnerJoiningDateTextField(),
				excel.readExcelData("Firm_User_Data", 20, 2));
		firm.getPartnerDoorNoTextField().sendKeys(excel.readExcelData("Firm_User_Data", 21, 2));
		firm.getPartnerStreetTextField().sendKeys(excel.readExcelData("Firm_User_Data", 22, 2));
		firm.getPartnerVillageOrCityTextField().sendKeys(excel.readExcelData("Firm_User_Data", 23, 2));
		wUtility.select(firm.getPartnerDistrictDropDown(), 1);
		Thread.sleep(3000);
		wUtility.select(firm.getPartnerMandalDropDown(), 1);
		firm.getPartnerPincodeTextField().sendKeys(excel.readExcelData("Firm_User_Data", 24, 2));
		Thread.sleep(2000);
		firm.getAddPartnerDetailsButton().click();
		Thread.sleep(2000);
		while_Run();

		// validating and fetching the data of upload documents note
		System.out.println("upload douments text");
		assertValidate.assertByWebelementVisibility(firm.getUploadDocumentText());

		System.out.println("upload documents note");
		assertValidate.assertByWebelementVisibility(firm.getNoteAndInstructionsText());

		// entering affidavit document type
		System.out.println("document type");
		assertValidate.assertByWebelementVisibility(firm.getDocumentTypeText());
		assertValidate.assertByWebelementVisibility(firm.getDocumentTypeDropDown());
		assertValidate.assertByEnabled(firm.getDocumentTypeDropDown());
		Thread.sleep(2000);
		wUtility.select(firm.getDocumentTypeDropDown(), 1);
		System.out.println("document name");
		assertValidate.assertByWebelementVisibility(firm.getDocumentNameText());
		assertValidate.assertByWebelementVisibility(firm.getDocumentNameTextField());
		assertValidate.assertByEnabled(firm.getDocumentNameTextField());

		firm.getDocumentNameTextField().sendKeys(excel.readExcelData("Firm_User_Data", 26, 1));
		System.out.println("document upload");
		assertValidate.assertByWebelementVisibility(firm.getUploadDocumentText());
		assertValidate.assertByWebelementVisibility(firm.getDocumentFileUpload());
		assertValidate.assertByEnabled(firm.getDocumentFileUpload());
		wUtility.click(driver, firm.getDocumentFileUpload());
		wUtility.uploadFile(
				"C:\\Users\\Harshitha\\Downloads\\Demo\\Demo\\src\\test\\resources\\image\\demo.pdf");

		System.out.println("add document button");
		assertValidate.assertByWebelementVisibility(firm.getAddDocumentButton());
		assertValidate.assertByEnabled(firm.getAddDocumentButton());

		firm.getAddDocumentButton().click();
		Thread.sleep(5000);

		// entering form1
		Thread.sleep(5000);
		wUtility.select(firm.getDocumentTypeDropDown(), 2);
		firm.getDocumentNameTextField().sendKeys(excel.readExcelData("Firm_User_Data", 27, 1));
		wUtility.click(driver, firm.getDocumentFileUpload());
		wUtility.uploadFile(
				"C:\\Users\\Harshitha\\Downloads\\Demo\\Demo\\src\\test\\resources\\image\\demo.pdf");
		Thread.sleep(2000);
		firm.getAddDocumentButton().click();
		Thread.sleep(5000);

		// entering partnership deed
		Thread.sleep(5000);
		wUtility.select(firm.getDocumentTypeDropDown(), 6);
		firm.getDocumentNameTextField().sendKeys(excel.readExcelData("Firm_User_Data", 28, 1));
		wUtility.click(driver, firm.getDocumentFileUpload());
		wUtility.uploadFile(
				"C:\\Users\\Harshitha\\Downloads\\Demo\\Demo\\src\\test\\resources\\image\\demo.pdf");
		Thread.sleep(2000);
		firm.getAddDocumentButton().click();
		Thread.sleep(5000);

		// entering self signed declaration
		Thread.sleep(5000);
		wUtility.select(firm.getDocumentTypeDropDown(), 7);
		firm.getDocumentNameTextField().sendKeys(excel.readExcelData("Firm_User_Data", 29, 1));
		wUtility.click(driver, firm.getDocumentFileUpload());
		wUtility.uploadFile(
				"C:\\Users\\Harshitha\\Downloads\\Demo\\Demo\\src\\test\\resources\\image\\demo.pdf");
		Thread.sleep(2000);
		firm.getAddDocumentButton().click();
		Thread.sleep(5000);

		while_Run();
		Thread.sleep(2000);
		wUtility.scrollUpByKey(10);
		while_Run();
		wUtility.scrollDownByKey(5);
		while_Run();
		wUtility.scrollDownByKey(5);
		while_Run();

		// clicking on show payment button
		System.out.println("show payment button");
		assertValidate.assertByWebelementVisibility(firm.getShowPaymentButton());
		assertValidate.assertByEnabled(firm.getShowPaymentButton());

		firm.getShowPaymentButton().click();
		wUtility.switchToAlertAndAccept(driver);
		Thread.sleep(2000);
		wUtility.switchToAlertAndAccept(driver);
		while_Run();

//		wUtility.scroll(driver, firm.getShowPaymentButton());
//		while_Run();

//		C:\Users\DELL\Documents\Meeseva_Automation\Demo\src\test\resources\image\demo.pdf
		
		
		// payment details
		System.out.println("payment details");
		assertValidate.assertByWebelementVisibility(firm.getPaymentDetailsText());

		// statutory fee
		System.out.println("statutory fee");
		assertValidate.assertByWebelementVisibility(firm.getStatutoryFeeText());
		assertValidate.assertByWebelementVisibility(firm.getStatutoryFeeReadOnlyField());
		assertValidate.assertByEnabled(firm.getStatutoryFeeReadOnlyField());

		System.out.println(firm.getStatutoryFeeText().getText() + ":" + firm.getStatutoryFeeReadOnlyField().getAttribute("value"));

		// service tax
		System.out.println("service tax");
		assertValidate.assertByWebelementVisibility(firm.getServiceTaxText());
		assertValidate.assertByWebelementVisibility(firm.getServiceTaxReadOnlyField());
		assertValidate.assertByEnabled(firm.getServiceTaxReadOnlyField());

		System.out.println(firm.getServiceTaxText().getText() + ":" + firm.getServiceTaxReadOnlyField().getAttribute("value"));

		// user charges
		System.out.println("user charges");
		assertValidate.assertByWebelementVisibility(firm.getUserChargesText());
		assertValidate.assertByWebelementVisibility(firm.getUserChargesReadOnlyField());
		assertValidate.assertByEnabled(firm.getUserChargesReadOnlyField());

		System.out.println(firm.getUserChargesText().getText() + ":" + firm.getUserChargesReadOnlyField().getAttribute("value"));

		// postal charges
		System.out.println("postal charges");
		assertValidate.assertByWebelementVisibility(firm.getPostalChargesText());
		assertValidate.assertByWebelementVisibility(firm.getPostalChargeReadOnlyField());
		assertValidate.assertByEnabled(firm.getPostalChargeReadOnlyField());

		System.out.println(firm.getPostalChargesText().getText() + ":" + firm.getPostalChargeReadOnlyField().getAttribute("value"));

		// total amount
		System.out.println("total amount");
		assertValidate.assertByWebelementVisibility(firm.getTotalAmountText());
		assertValidate.assertByWebelementVisibility(firm.getTotalAmountReadOnlyField());
		assertValidate.assertByEnabled(firm.getTotalAmountReadOnlyField());

		System.out.println(firm.getTotalAmountText().getText() + ":" + firm.getTotalAmountReadOnlyField().getAttribute("value"));

		Thread.sleep(2000);
		

		// pay and continue
		System.out.println("pay and continue");
		wUtility.scrollDownByKey(10);
		assertValidate.assertByWebelementVisibility(firm.getPayAndContinueButton());
		wUtility.scroll(driver, firm.getPayAndContinueButton());
		while_Run();
		firm.getPayAndContinueButton().click();
		Thread.sleep(3000);
		while_Run();

		// cash
		System.out.println("cash");
		assertValidate.assertByWebelementVisibility(firm.getCashPaymentOptionLink());

		// twallet pg
		System.out.println("twallet pg");
		assertValidate.assertByWebelementVisibility(firm.getTwalletPgPaymentOptionLink());

		// twallet
		System.out.println("twallet");
		assertValidate.assertByWebelementVisibility(firm.getTwalletPaymentOptionLink());

		// hdfc pg
		System.out.println("hdfc pg");
		assertValidate.assertByWebelementVisibility(firm.getHdfcPGPaymentOptionLink());

		// DD
		System.out.println("DD");
		assertValidate.assertByWebelementVisibility(firm.getDdPaymentOptionLink());

		// SBIePay
		System.out.println("SBIePay");
		assertValidate.assertByWebelementVisibility(firm.getSbiepayPaymentOptionLink());

		// Banks
		System.out.println("Banks");
		assertValidate.assertByWebelementVisibility(firm.getBanksPaymentOptionLink());

		// QR code
		System.out.println("QR code");
		assertValidate.assertByWebelementVisibility(firm.getQrcodePaymentOptionLink());
		
		wUtility.scrollDownByKey(5);

		firm.getCashPaymentOptionLink().click();
		wUtility.scrollDownByKey(5);
		while_Run();
		Thread.sleep(5000);
		while_Run();
		
		// make payment
		assertValidate.assertByWebelementVisibility(firm.getMakePaymentButton());
		wUtility.scrollDownByKey(5);
		firm.getMakePaymentButton().click();
		Thread.sleep(3000);
		while_Run();

		
		//receipt page
		System.out.println("receipt page");
		
		//igrs service name
		System.out.println("igrs service name");
		assertValidate.assertByWebelementVisibility(firm.getRegistrationOfFirmNameTextInReceipt());
		System.out.println(firm.getRegistrationOfFirmNameTextInReceipt().getText());
		
		//acknowledgement number
		System.out.println("acknowledgement number");
		assertValidate.assertByWebelementVisibility(firm.getAcknowledgementNumberText());
		assertValidate.assertByWebelementVisibility(firm.getAcknowledgementNumberInReceipt());
		System.out.println(firm.getAcknowledgementNumberInReceipt().getText());
		while_Run();
		wUtility.scrollDownByKey(5);
		while_Run();
		Thread.sleep(2000);
		
		property.storeData("Firm_Acknowledgement_No", firm.getAcknowledgementNumberInReceipt().getText());
		
		if(firm.getRegistrationOfFirmNameTextInReceipt().getText().equals("IGRS - Registration of Firms (Under Section: 58) Receipt")) {
			
			System.out.println(firm.getRegistrationOfFirmNameTextInReceipt().getText());
			excel.writeData("MEE_REG_OF_FIRM", 6, 3, "PASS");
		}
		else {
			excel.writeData("MEE_REG_OF_FIRM", 6, 3, "FAIL");
		}
		
		end_Report(firm.getRegistrationOfFirmNameTextInReceipt(), excel.readExcelData("MEE_REG_OF_FIRM", 6, 0));

	}
}
