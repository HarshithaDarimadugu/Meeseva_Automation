package pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Receipt_Page {
	
	public Receipt_Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//td[contains(@class, 'tsDesktop')]")
	private WebElement headerImage;
	
	@FindBy(id = "dateLabel")
	private WebElement dateOfReceiptGeneratedText;
	
	@FindBy(id = "timeLabel")
	private WebElement timeOfReceiptGeneratedText;
	
	@FindBy(xpath = "(//td[contains(@class, 'tab-hd')])[1]")
	private WebElement departmentWithServiceNamesText;
	
	@FindBy(id = "lblpaymentMode")
	private WebElement paymentModeText;
	
	@FindBy(id = "lblBillDate")
	private WebElement dateOfPaymentText;
	
	@FindBy(id = "lblChannelName")
	private WebElement authorizedAgentText;
	
	@FindBy(id = "lblApplnNumber")
	private WebElement applicationNoText;
	
	@FindBy(id = "lblTransactionId")
	private WebElement transactionIdText;
	
	@FindBy(id = "lblCustomerName")
	private WebElement applicantNameText;
	
	@FindBy(id = "lblfathus")
	private WebElement fatherOrHusbandNameText;
	
	@FindBy(id = "lblDistrict")
	private WebElement districtNameText;
	
	@FindBy(id = "lblMandal")
	private WebElement mandalNameText;
	
	@FindBy(id = "lblVillage")
	private WebElement villageNameText;
	
	@FindBy(id = "lblAmount")
	private WebElement amountPaidText;
	
	@FindBy(id = "lblDeliveryType")
	private WebElement deliveryTypeText;
	
	public WebElement getHeaderImage() {
		return headerImage;
	}

	public WebElement getDateOfReceiptGeneratedText() {
		return dateOfReceiptGeneratedText;
	}

	public WebElement getTimeOfReceiptGeneratedText() {
		return timeOfReceiptGeneratedText;
	}

	public WebElement getDepartmentWithServiceNamesText() {
		return departmentWithServiceNamesText;
	}

	public WebElement getPaymentModeText() {
		return paymentModeText;
	}

	public WebElement getDateOfPaymentText() {
		return dateOfPaymentText;
	}

	public WebElement getAuthorizedAgentText() {
		return authorizedAgentText;
	}

	public WebElement getApplicationNoText() {
		return applicationNoText;
	}

	public WebElement getTransactionIdText() {
		return transactionIdText;
	}

	public WebElement getApplicantNameText() {
		return applicantNameText;
	}

	public WebElement getFatherOrHusbandNameText() {
		return fatherOrHusbandNameText;
	}

	public WebElement getDistrictNameText() {
		return districtNameText;
	}

	public WebElement getMandalNameText() {
		return mandalNameText;
	}

	public WebElement getVillageNameText() {
		return villageNameText;
	}

	public WebElement getAmountPaidText() {
		return amountPaidText;
	}

	public WebElement getDeliveryTypeText() {
		return deliveryTypeText;
	}

	public WebElement getDeliveredInText() {
		return deliveredInText;
	}

	public WebElement getCategorySdText() {
		return categorySdText;
	}

	public WebElement getNoteMessageText() {
		return noteMessageText;
	}

	public WebElement getPrintButton() {
		return printButton;
	}

	public WebElement getFooterText() {
		return footerText;
	}

	@FindBy(id = "lblSLA")
	private WebElement deliveredInText;
	
	@FindBy(xpath = "//td[contains(@class, 'category')]")
	private WebElement categorySdText;
	
	@FindBy(id = "lblNoteMessage")
	private WebElement noteMessageText;
	
	@FindBy(id = "btnPrint")
	private WebElement printButton;
	
	@FindBy(id = "//table[contains(@class, 'footer')]")
	private WebElement footerText;
	
}
