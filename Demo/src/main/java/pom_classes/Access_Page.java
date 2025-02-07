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

}
