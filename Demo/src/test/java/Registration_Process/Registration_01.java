package Registration_Process;


import java.io.IOException;

import org.testng.annotations.Test;

import base_test.BaseClass;
import pom_classes.Access_Page;
import pom_classes.Community_and_DOB_Page;
import pom_classes.Home_Page;
import pom_classes.Revenue_Dept_Details_Page;

public class Registration_01 extends BaseClass{
	
	@Test
	public void validateRegProcess() throws Throwable
	{
		start_Report(excel.readExcelData("MEE_REG_01", 6, 0), excel.readExcelData("MEE_REG_01", 6, 1), excel.readExcelData("MEE_REG_01", 6, 2));
		
		Thread.sleep(3000);
		Access_Page access = new Access_Page(driver);
		access.getRevenueDepartmentLink().click();
		Thread.sleep(3000);
		while_Run();
		
		Revenue_Dept_Details_Page rev = new Revenue_Dept_Details_Page(driver);
		rev.getCommunityAndDOBCertificateServiceLink().click();
		while_Run();
		
		Community_and_DOB_Page cdob = new Community_and_DOB_Page(driver);
		Thread.sleep(3000);
		wUtility.switchToWindowByTitle(driver, "COMMUNITY AND DATE OF BIRTH CERTIFICATE");
		Thread.sleep(3000);
//		wUtility.select(cdob.getSelectServiceDropDown(), 2);
//		cdob.getAadharNoTextField().sendKeys(excel.readExcelData("sheet1", 1, 1));
//		cdob.getApplicantNameTextField().sendKeys(excel.readExcelData("sheet1", 0, 1));
//		Thread.sleep(3000);
//		end_Report(cdob.getApplicantNameTextField(), excel.readExcelData("MEE_REG_01", 6, 0));
	}

}
