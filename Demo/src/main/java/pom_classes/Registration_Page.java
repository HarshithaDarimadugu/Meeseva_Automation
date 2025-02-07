package pom_classes;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration_Page {
	
	public Registration_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//h1[contains(text(),'REGISTRATION FORM')]")
	private WebElement registrationFormText;

	@FindBy(xpath = "//h5[contains(text(),'Create profile Id')]")
	private WebElement createProfileIdText;
	
	@FindAll({@FindBy(id = "loginid"),@FindBy(xpath = "//input[contains(@id,'loginid')]")})
	private WebElement desiredLoginIdTextfield;
	
	@FindAll({@FindBy(id="password1"), @FindBy(xpath="//input[contains(@id,'password1')]")})
	private WebElement passwordTextField;
	
	@FindAll({@FindBy(id="confirmpassword"), @FindBy(xpath="//input[contains(@id,'confirmpassword')]")})
	private WebElement confirmPasswordTextField;
	
	@FindBy(xpath="//h5[contains(text(),'Contact Information')]")
	private WebElement contactInformationText;
	
	@FindAll({@FindBy(id="mobilenumber"), @FindBy(xpath="//input[contains(@id,'mobilenumber')]")})
	private WebElement mobileNumberTextField;
	
	@FindAll({@FindBy(id="email"), @FindBy(xpath="//input[contains(@id,'email')]")})
	private WebElement emailTextField;
	
	@FindAll({@FindBy(id="firstname"), @FindBy(xpath="//input[contains(@id,'firstname')]")})
	private WebElement fullNameTextField;
	
	@FindAll({@FindBy(id="address"), @FindBy(xpath="//input[contains(@id,'address')]")})
	private WebElement addressTextField;
	
	@FindAll({@FindBy(id="pincode"), @FindBy(xpath="//input[contains(@id,'pincode')]")})
	private WebElement pincodeTextField;
	
	@FindBy(id = "country")
	private WebElement countryDropDown;
	
	@FindBy(id = "state")
	private WebElement stateDropDown;
	
	@FindBy(id = "district")
	private WebElement districtDropDown;
	
	@FindAll({@FindBy(id="submitregi"), @FindBy(xpath="//input[contains(@id,'submitregi')]")})
	private WebElement submitButton;
	
	@FindAll({@FindBy(id="homeBtn"), @FindBy(xpath="//input[contains(@id,'homeBtn')]")})
	private WebElement homeButton;
	
	@FindAll({@FindBy(id = "FooterForm"),@FindBy(xpath="//form[contains(@id,'FooterForm')]")})
	private List<WebElement> footerLinks;
	
	@FindAll({@FindBy(id="navbarSupportedContent"), @FindBy(xpath="//div[contains(@id,'navbarSupportedContent')]")})
	private List<WebElement> navBarLinks;
	
	
	public List<WebElement> getNavBarLinks() {
		return navBarLinks;
	}

	public WebElement getDesiredLoginIdTextfield() {
		return desiredLoginIdTextfield;
	}

	public WebElement getCreateProfileIdText() {
		return createProfileIdText;
	}

	public List<WebElement> getFooterLinks() {
		return footerLinks;
	}
	
	public WebElement getRegistrationFormText() {
		return registrationFormText;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getConfirmPasswordTextField() {
		return confirmPasswordTextField;
	}

	public WebElement getContactInformationText() {
		return contactInformationText;
	}

	public WebElement getMobileNumberTextField() {
		return mobileNumberTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getFullNameTextField() {
		return fullNameTextField;
	}

	public WebElement getAddressTextField() {
		return addressTextField;
	}

	public WebElement getPincodeTextField() {
		return pincodeTextField;
	}

	public WebElement getCountryDropDown() {
		return countryDropDown;
	}

	public WebElement getStateDropDown() {
		return stateDropDown;
	}

	public WebElement getDistrictDropDown() {
		return districtDropDown;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	public WebElement getHomeButton() {
		return homeButton;
	}


}
