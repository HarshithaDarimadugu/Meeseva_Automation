package pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ADB_MRO_Dashboard_Page {
	
	public ADB_MRO_Dashboard_Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[contains(@class,'top-header')]")
	private WebElement headerImage;
	
	@FindBy(xpath = "//h1[contains(text(),'Meeseva')]")
	private WebElement headerText;
	
	@FindBy(xpath = "//span[contains(text(),'Home')]/parent::a")
	private WebElement homeLink;
	
	@FindBy(id = "aDboard")
	private WebElement dashboardLink;
	
	@FindBy(id = "autocomplete")
	private WebElement searchBarTextField;
	
	@FindBy(id = "btnSearch")
	private WebElement searchButton;	
	
	@FindBy(xpath = "//span[contains(text(),'MRTS')]/parent::a")
	private WebElement mrtsLink;
	
	@FindBy(xpath = "//span[contains(text(),'User Profile')]/parent::a")
	private WebElement userProfileLink;
	
	public WebElement getHeaderImage() {
		return headerImage;
	}

	public WebElement getHeaderText() {
		return headerText;
	}

	public WebElement getHomeLink() {
		return homeLink;
	}

	public WebElement getDashboardLink() {
		return dashboardLink;
	}

	public WebElement getSearchBarTextField() {
		return searchBarTextField;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getMrtsLink() {
		return mrtsLink;
	}

	public WebElement getUserProfileLink() {
		return userProfileLink;
	}

	public WebElement getSignOutLink() {
		return signOutLink;
	}

	public WebElement getApplicationProcessingLink() {
		return applicationProcessingLink;
	}

	public WebElement getHousingLink() {
		return housingLink;
	}

	public WebElement getUserDetails1Link() {
		return userDetails1Link;
	}

	public WebElement getUserDetails2Link() {
		return userDetails2Link;
	}

	public WebElement getUserDetails3Link() {
		return userDetails3Link;
	}

	public WebElement getFooterText() {
		return footerText;
	}

	@FindBy(xpath = "//span[contains(text(),'Signout')]/parent::a")
	private WebElement signOutLink;
	
	@FindBy(xpath = "//span[contains(text(),'Application Processing')]/parent::div")
	private WebElement applicationProcessingLink;
	
	@FindBy(xpath = "//span[contains(text(),'Housing')]/ancestor::div[@class='flip_box text-center']")
	private WebElement housingLink;
	
	@FindBy(xpath = "//span[contains(text(),'User Details')]/parent::div")
	private WebElement userDetails1Link;
	
	@FindBy(xpath = "//span[contains(text(),'User Details')]/parent::div")
	private WebElement userDetails2Link;
	
	@FindBy(xpath = "//span[contains(text(),'User Details')]/parent::div")
	private WebElement userDetails3Link;
	
	@FindBy(xpath = "//footer[contains(@class,'main-footer animated flipInX')]")
	private WebElement footerText;
	
	

}
