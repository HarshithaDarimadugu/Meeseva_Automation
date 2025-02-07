package pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Revenue_Dept_Details_Page {
	
	public Revenue_Dept_Details_Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getSearchServiceTextField() {
		return searchServiceTextField;
	}

	public WebElement getIncomeCertificateServiceLink() {
		return incomeCertificateServiceLink;
	}

	@FindAll({@FindBy(xpath = "//h1[contains(text(),'COMMUNITY AND DATE OF BIRTH CERTIFICATE')]"), @FindBy(xpath = "//h1[contains(text(),'COMMUNITY AND DATE OF BIRTH CERTIFICATE')]/ancestor::div[@class='flip_box text-center']")})
	private WebElement communityAndDOBCertificateServiceLink;
	
	@FindBy(xpath = "//input[contains(@id,'autocomplete')]")
	private WebElement searchServiceTextField;
	
	@FindBy(xpath = "//h1[text()='INCOME CERTIFICATE']//ancestor::div[@class='flip_box text-center']")
	private WebElement incomeCertificateServiceLink;

	public WebElement getCommunityAndDOBCertificateServiceLink() {
		return communityAndDOBCertificateServiceLink;
	}
	
	public WebElement getObcCertificateServiceLink() {
		return obcCertificateServiceLink;
	}

	@FindBy(xpath = "//h1[contains(text(),'OBC CERTIFICATE')]/ancestor::div[@class='flip_box text-center']")
	private WebElement obcCertificateServiceLink;
	
	@FindBy(xpath = "//h1[text()='RESIDENCE CERTIFICATE']/ancestor::div[@class='flip_box text-center']")
	private WebElement residenceCertificateServiceLink;

	public WebElement getResidenceCertificateServiceLink() {
		return residenceCertificateServiceLink;
	}
	
}
