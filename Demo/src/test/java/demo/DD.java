package demo;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base_test.BaseClass;
import file_utility.PropertiesUtility;
import pom_classes.Registration_Page;

public class DD extends BaseClass{
	
	
	@Test
	
	
	public void demo() throws IOException
	{
//		System.out.println(property.readProperty("password"));
//		
//		System.out.println(excel.readExcelData("Sheet1", 0, 0));
//		System.out.println(excel.readExcelData("Sheet1", 0, 1));
		
		Registration_Page reg=new Registration_Page(driver);
//		reg.getConfirmPasswordTextField().sendKeys(property.readProperty("key"));
//		
//		reg.getDesiredLoginIdTextfield().sendKeys(excel.readExcelData("sheetname", 0, 0));
		
		
		
		
		//store data
		property.storeData("My_name", "Vijay");
		
		//in excel
		excel.writeData("Sheet1", 0, 2, reg.getContactInformationText().getText());
	}
	
	

}
