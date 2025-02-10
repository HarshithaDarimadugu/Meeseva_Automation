package pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Access_Page {
	
	public Access_Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(), 'REVENUE')]")
	private WebElement revenueDepartmentLink;

	public WebElement getRevenueDepartmentLink() {
		return revenueDepartmentLink;
	}
	
	@FindBy(xpath = "//img[@alt='ghmc']/parent::a")
	private WebElement ghmcDepartmentLink;

	public WebElement getGhmcDepartmentLink() {
		return ghmcDepartmentLink;
	}
	
	public WebElement getSearchBarTextField() {
		return searchBarTextField;
	}

	public WebElement getRegistrationOfFirmLink() {
		return registrationOfFirmLink;
	}

	@FindBy(id = "autocomplete")
	private WebElement searchBarTextField;
	
	@FindBy(xpath = " //h1[contains(text(),'REGISTRATION OF FIRMS')]/ancestor::div[@class='flip_box text-center']")
	private WebElement registrationOfFirmLink;
	
	@FindBy(xpath = "//a[text()='Close']")
	private WebElement importantNoticeAlertCloseButton;

	public WebElement getImportantNoticeAlertCloseButton() {
		return importantNoticeAlertCloseButton;
	}

}
