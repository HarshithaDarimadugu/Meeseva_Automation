package validate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

/**
 * THIS CLASS WILL GIVE THE UTILITIES FOR THE VALIDATION BY THE DIFFERENT
 * PARAMETERS 1.VALIDATE BY TITLE 2.VALIDATE BY CURRENT URL 3.VALIDATE BY
 * WEBELEMENT 4.VALIDATE BY MESSAGE
 * 
 * @author Vijay
 */

public class AssertUtility {
	/**
	 * @param driver        reference
	 * @param expectedTitle
	 * @author Vijay
	 */
	public void assertByTitle(WebDriver driver, String expectedTitle) {
		String actualTitle = driver.getTitle();
		if (actualTitle.contains(expectedTitle)) {
			Assert.assertTrue(true, "==>VALIDATION SUCCESSFUL<==");
			Reporter.log("==>VALIDATION SUCCESSFUL//TITLE VERIFIED<==", true);
		} else {
			Assert.assertFalse(false, "==>VALIDATION FAIL<==");
			Reporter.log("==>VALIDATION FAIL//TITLE NOT MATCHED<==", true);
		}
	}

	/**
	 * @param driver             reference
	 * @param expectedCurrentUrl
	 * @author Vijay
	 */
	public void assertByCurrentUrl(WebDriver driver, String expectedCurrentUrl) {
		String actualCurrentUrl = driver.getCurrentUrl();
		if (actualCurrentUrl.contains(expectedCurrentUrl)) {
			Assert.assertTrue(true, "==>VALIDATION SUCCESSFUL<==");
			// System.out.println("==>VALIODATION SUCCESSFUL<==");
			Reporter.log("==>VALIDATION SUCCESSFUL//URL VERIFIED<==", true);
		} else {
			Assert.assertFalse(false, "==>VALIDATION FAIL<==");
			// System.out.println("==>VALIDATION FAIL<==");
			Reporter.log("==>VALIDATION FAIL//URL NOT MATCHED<==", true);
		}
	}

	/**
	 * @param element reference
	 * @author Vijay
	 */
	public void assertByWebelementVisibility(WebElement element) {
		if (element.isDisplayed()) {
			Assert.assertTrue(true, "==>VALIDATION SUCCESSFUL<==");
			// System.out.println("==>VALIDATION SUCCESSFUL<==");
			Reporter.log("==>VALIDATION SUCCESSFUL//ELEMENT IS VISIBLE<==", true);
		} else {
			Assert.assertFalse(false, "==>VALIDATION FAIL<==");
			// System.out.println("==>VALIDATION FAIL<==");
			Reporter.log("==>VALIDATION FAIL//ELEMENT IS NOT VISIBLE<==", true);
		}
	}

	/**
	 * @param element         reference
	 * @param expectedMessage
	 * @author Vijay
	 */
	public void assertByMessage(WebElement element, String expectedMessage) {
		String actualMessage = element.getText();
		if (actualMessage.contains(expectedMessage)) {
			Assert.assertTrue(true, "==>VALIDATION SUCCESSFUL<==");
			// System.out.println("==>VALIDATION SUCCESSFUL<==");
			Reporter.log("==>VALIDATION SUCCESSFUL//MESSAGE VERIFIED<==", true);
		} else {
			Assert.assertFalse(false, "==>VALIDATION FAIL<==");
			// System.out.println("==>VALIDATION FAIL<==");
			Reporter.log("==>VALIDATION FAIL//MESSAGE NOT MATCHED<==", true);
		}
	}
	
	/**
	 * @param element reference
	 * @author Vijay
	 */
	public void assertByEnabled(WebElement element)
	{
		if (element.isEnabled()) {
			Assert.assertTrue(true, "==>VALIDATION SUCCESSFUL<==");
			Reporter.log("==>VALIDATION SUCCESSFUL//ELEMENT IS ENABLED <==", true);
		} else {
			Assert.assertFalse(false, "==>VALIDATION FAIL<==");
			Reporter.log("==>VALIDATION SUCCESSFUL//ELEMENT IS DISABLED <==", true);
		}
	}
//	public void assertByIsSelected(WebElement element) {
//		if (element.isSelected()) {
//			Assert.assertTrue(true, "==>VALIDATION SUCCESSFUL<==");
//			Reporter.log("==>VALIDATION SUCCESSFUL<==", true);
//		} else {
//			Assert.assertFalse(false, "==>VALIDATION FAIL<==");
//			// System.out.println("==>VALIDATION FAIL<==");
//			Reporter.log("==>VALIDATION FAIL<==", true);
//		}
//	}
//
//	public void assertByIsSelected(WebElement element, int index) {
//		Select sel = new Select(element);
//		if (sel.getAllSelectedOptions().get(index).isSelected()) {
//			Assert.assertTrue(true, "==>VALIDATION SUCCESSFUL<==");
//			Reporter.log("==>VALIDATION SUCCESSFUL<==", true);
//			Reporter.log(sel.getAllSelectedOptions().get(index).getText()+"IS SELECTED", true);
//		} else {
//			Assert.assertFalse(false, "==>VALIDATION FAIL<==");
//			// System.out.println("==>VALIDATION FAIL<==");
//			Reporter.log("==>VALIDATION FAIL<==", true);
//			Reporter.log(sel.getAllSelectedOptions().get(index).getText()+"IS NOT SELECTED", true);
//		}
//	}
}
