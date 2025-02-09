package pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration_of_Firm_Page {
	
	public Registration_of_Firm_Page (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "/html/body/header")
	private WebElement headerImage;
	
	@FindBy(xpath = "//div[contains(text(),'IGRS - Registration of Firms (Under Section: 58)')]")
	private WebElement registrationOfFirmsHeadingText;
	
	@FindBy(xpath = "//a[text()='MY APPLICATIONS']")
	private WebElement myApplicationsLink;
	
	@FindBy(xpath = "//a[contains(text(),'Note & Instructions')]")
	private WebElement noteAndInstructionsText;
	
	@FindBy(xpath = "//div[contains(text(),'Applicant Details')]")
	private WebElement applicantDetailsText;
	
	@FindBy(id = "appFirstNameId")
	private WebElement applicantNameText;
	
	@FindBy(id = "appfirstName")
	private WebElement applicantFirstNameTextField;
	
	@FindBy(id = "appLastNameId")
	private WebElement applicantLastNameText;
	
	@FindBy(id = "applicatInfolastName")
	private WebElement applicantLastNameTextField;
	
	@FindBy(xpath = "//label[contains(text(),'Gender')]")
	private WebElement applicantGenderText;
	
	@FindBy(id = "gender")
	private WebElement applicantGenderTextField;
	
	@FindBy(xpath = "//label[contains(text(),'UID (Aadhaar):')]")
	private WebElement applicantAadhaarNoText;
	
	@FindBy(xpath = "//label[contains(text(),'UID (Aadhaar):')]")
	private WebElement applicantAadhaarNoTextField;
	
	@FindBy(xpath = "(//div[contains(text(),'Address')])[1]")
	private WebElement applicantAddressText;
	
	@FindBy(xpath = "//label[contains(text(),'Delivery Type')]")
	private WebElement applicantDeliveryTypeText;
	
	@FindBy(id = "deliveryTypeSel")
	private WebElement applicantDeliveryTypeDropDown;
	
//	@FindBy(id = "")
//	private WebElement ;
//	
//	@FindBy(id = "")
//	private WebElement ;
//	
//	@FindBy(id = "")
//	private WebElement ;
//	
//	@FindBy(id = "")
//	private WebElement ;
//	
//	@FindBy(id = "")
//	private WebElement ;
//	
//	@FindBy(id = "")
//	private WebElement ;
//	
//	@FindBy(id = "")
//	private WebElement ;
//	
//	@FindBy(id = "")
//	private WebElement ;
//	
//	@FindBy(id = "")
//	private WebElement ;
//	
//	@FindBy(id = "")
//	private WebElement ;
//	
//	@FindBy(id = "")
//	private WebElement ;
//	
//	@FindBy(id = "")
//	private WebElement ;
//	
//	@FindBy(id = "")
//	private WebElement ;
	
	

}
