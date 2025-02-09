package pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GHMC_Dept_Details_Page {
	
	public GHMC_Dept_Details_Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@data-original-title='BIRTH AND DEATH CERTIFICATE  GHMC']/parent::div")
	private WebElement birthAndDeathCertificateGhmcLink;

	public WebElement getBirthAndDeathCertificateGhmcLink() {
		return birthAndDeathCertificateGhmcLink;
	}

}
