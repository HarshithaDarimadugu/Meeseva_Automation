package webdriver_utility;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import file_utility.PropertiesUtility;
import json_utility.Json_Utility;

/**
 * THIS CLASS WILL PROVIDE THE UTILITIES,
 * 	1.TO TAKE SCREENSHOT
 *  2.TO HANDLE CHILD WINDOWS
 *  3.TO HANDLE FRAME
 *  4.TO HANDLE ALERT
 *  5.TO HANDLE DROPDOWN
 *  6.TO HANDLE MOUSE ACTIONS
 *  7.TO PERFORM SCROLLING
 *  8.TO HANDLE TABLES
 *  
 *  @author Vijay
 */
public class Webdriver_Utility {
	// to take screenshot
	/**
	 * @param driver reference
	 * @throws IOException 
	 * @author Vijay
	 */
	public void getScreenshot(WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File perm = new File("");
		FileHandler.copy(temp, perm);
	}

	// switch to a childwindow based on url
	
	/**
	 * @param driver reference
	 * @param partialUrl 
	 * @author Vijay
	 */
	public void switchToWindowByUrl(WebDriver driver, String partialUrl) {
		Set<String> allWids = driver.getWindowHandles();
		for (String wid : allWids) {
			driver.switchTo().window(wid);
			String actualUrl = driver.getCurrentUrl();
			if (actualUrl.contains(partialUrl)) {
				break;
			}
		}
	}

	// switch to a childwindow based on title
	/**
	 * @param driver reference
	 * @param partialTitle 
	 * @author Vijay
	 */
	public void switchToWindowByTitle(WebDriver driver, String partialTitle) {
		Set<String> allWids = driver.getWindowHandles();
		for (String wid : allWids) {
			driver.switchTo().window(wid);
			String actualTitle = driver.getTitle();
			if (actualTitle.contains(partialTitle)) {
				break;
			}
		}
	}

	// switch to frame by index
	/**
	 * @param driver reference
	 * @param index of frame
	 * @author Vijay
	 */
	public void switchToFrame(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}

	// switch to frame by name or id value
	/**
	 * @param driver reference
	 * @param idValue of frame
	 * @author Vijay
	 */
	public void switchToFrame(WebDriver driver, String idValue) {
		driver.switchTo().frame(idValue);
	}

	// switch to frame by webelement
	/**
	 * @param driver reference
	 * @param element reference
	 * @author Vijay
	 */
	public void switchToFrame(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}
	
	//switch to parent frame
	/**
	 * @param driver reference
	 * @author Vijay
	 */
	public void switchToParentFrame(WebDriver driver)
	{
		driver.switchTo().parentFrame();
	}
	
	//switch to source frame
	/**
	 * @param driver reference
	 * @author Vijay
	 */
	public void switchToSourceFrame(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	
	// switch to alert and accept
	/**
	 * @param driver reference
	 * @author Vijay
	 */
	public void switchToAlertAndAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

	// switch to alert and dismiss
	/**
	 * @param driver reference
	 * @author Vijay
	 */
	public void switchToAlertAndDismiss(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}

	// switch to alert and passdata
	/**
	 * @param driver reference
	 * @param data to be entered
	 * @author Vijay
	 */
	public void switchToAlertAndPassdata(WebDriver driver, String data) {
		Alert alt = driver.switchTo().alert();
		alt.sendKeys(data);
		alt.accept();
	}

	// switch to alert and passdata
	/**
	 * @param driver reference
	 * @return the alert message in String format
	 * @author Vijay
	 */
	public String switchToAlertAndFetchMessage(WebDriver driver) {
		String message = driver.switchTo().alert().getText();
		return message;
	}

	// select by index
	/**
	 * @param element reference
	 * @param index of the option
	 * @author Vijay
	 */
	public void select(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}

	// select by visible text
	/**
	 * @param element reference
	 * @param text
	 * @author Vijay
	 */
	public void select(WebElement element, String text) {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}
	
	/**
	 * select by attribute value
	 * @param element
	 * @param attValue
	 */
	public void selectByAttribute(WebElement element, String attValue) {
		Select sel = new Select(element);
		sel.selectByValue(attValue);
	}
	
	public void selectAllOptions(WebElement element) {
		Select sel = new Select(element);
		List<WebElement> allOptions = sel.getOptions();
		for (WebElement option : allOptions) {
			String text = option.getAttribute("value");
			sel.selectByVisibleText(text);
		}
	}
	// get all the options
	/**
	 * @param element reference
	 * @return all the options present in the dropdown in String format
	 * @author Vijay
	 */
	public List<WebElement> getAllOption(WebElement element) {
		Select sel = new Select(element);
		List<WebElement> allOptions = sel.getOptions();
		List<String> allText = new ArrayList<String>();
		for (WebElement option : allOptions) {
			String visibleText = option.getText();
			allText.add(visibleText);
		}
		return allOptions;
	}
	
	public WebElement getSelectedOption(WebElement element)
	{
		Select sel=new Select(element);
		WebElement selectedOption = sel.getAllSelectedOptions().get(0);
		return selectedOption;
	}

	// mouse hover
	/**
	 * @param driver reference
	 * @param element reference
	 * @author Vijay
	 */
	public void mouseHoverOnElement(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}

	// right click on element
	/**
	 * @param driver reference
	 * @param element reference
	 * @author Vijay
	 */
	public void rightClickOnElement(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.contextClick(element).perform();
	}

	// right click on webpage
	/**
	 * @param driver reference
	 * @author Vijay
	 */
	public void rightClickOnPage(WebDriver driver) {
		Actions act = new Actions(driver);
		act.contextClick().perform();
	}

	// scroll to element
	/**
	 * @param driver reference
	 * @param element reference
	 * @author Vijay
	 */
	public void scroll(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.scrollToElement(element).perform();
	}

	public void click(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.moveToElement(element).click().perform();
	}
	// screenshot based on element visibility
	/**
	 * @param driver reference
	 * @param element reference
	 * @throws Throwable
	 * @author Vijay
	 */
	public void screenshotOnVisible(WebDriver driver, WebElement element) throws Throwable {
		if (element.isDisplayed()) {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File temp = ts.getScreenshotAs(OutputType.FILE);
			File perm = new File("./Screenshot/ss.png");
			FileHandler.copy(temp, perm);
		} else {
			System.out.println("==>SCREENSOT NOT TAKEN//ELEMENT IS NOT DISPLAYED<==");
		}
	}

	// table Headers
	/**
	 * @param table reference
	 * @return all the values present in header of the table in List<String> format
	 * @author Vijay
	 */
	public List<String> tableHeaders(WebElement table) {
		// Locate headers
		List<WebElement> headers = table.findElements(By.tagName("th"));
		List<String> headValues = new ArrayList<String>();
		for (WebElement header : headers) {
			System.out.print(header.getText() + " ");
			String value = header.getText();
			headValues.add(value);
		}
		System.out.println();
		return headValues;
	}

	// table contents
	/**
	 * @param table reference
	 * @return all the values present in body of the table in List<String> format
	 * @author Vijay
	 */
	public List<String> tableContents(WebElement table) {
		// Locate rows
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		List<String> cellValues = new ArrayList<String>();
		// Iterate through rows and columns
		for (WebElement row : rows) {
			List<WebElement> columns = row.findElements(By.tagName("td"));
			for (WebElement column : columns) {
				System.out.print(column.getText() + " ");
				String value = column.getText();
				cellValues.add(value);
			}
			System.out.println();
		}
		return cellValues;
	}
	/**
	 * @param howmanyTimes
	 * @throws Throwable
	 */
	public void scrollDownByKey(int howmanyTimes) throws Throwable
	{
		for (int i = 1; i <= howmanyTimes; i++) {
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_PAGE_DOWN);
			r.keyRelease(KeyEvent.VK_PAGE_DOWN);
			Thread.sleep(1000);
		}
	}
	/**
	 * @param howmanyTimes
	 * @throws Throwable
	 */
	public void scrollUpByKey(int howmanyTimes) throws Throwable
	{
		for (int i = 1; i <= howmanyTimes; i++) {
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_PAGE_UP);
			r.keyRelease(KeyEvent.VK_PAGE_UP);	
			Thread.sleep(1000);
		}
	}
	public void deleteByKey(int howManyTimes) throws AWTException, Throwable
	{
		for (int i = 1; i <= howManyTimes; i++) {
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_BACK_SPACE);
			r.keyRelease(KeyEvent.VK_BACK_SPACE);	
		}
	}
	
	/**
	 * @param sourceElement
	 * @throws Throwable
	 */
	public void copy(WebElement sourceElement) throws Throwable
	{
		if (sourceElement.isDisplayed()) {
			//copy
			sourceElement.click();
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_A);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_A);
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_C);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_C);
		} else {
			System.out.println("source element is not displayed");
		}
	}
	/**
	 * @param targetElement
	 * @throws Throwable
	 */
	public void paste(WebElement targetElement) throws Throwable
	{
		if (targetElement.isDisplayed()) {
			targetElement.click();
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
		} else {
			System.out.println("Target webelement is not displayed");
		}
	}
	
	/**
	 * This method is used to perform click operation using java script
	 * @param driver
	 * @param element
	 */
	public void clickByJavaScript(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}
	
	public void enterDataUsingJavaScript(WebDriver driver,WebElement element,String data)
	{
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='"+data+"'", element);
	}
	
	public void highlightElementBorder_RED(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		 js.executeScript("arguments[0].style.border='3px solid red'",element);
	}
	
	public void highlightElementBorder_GREEN(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		 js.executeScript("arguments[0].style.border='3px solid green'",element);
	}
	
	public void waitForElementInvisible(WebDriver driver,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(70));
		wait.until(ExpectedConditions.invisibilityOf(element));
	}
	/**
	 * this method is used to upload file using robot class
	 * @param filePath
	 * @throws Exception 
	 */
	//file upload using robot
	public  void uploadFile(String filePath) {
        try {
            // Copy the file path to the clipboard
            StringSelection stringSelection = new StringSelection(filePath);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, null);

            // Create a Robot instance
            Robot robot = new Robot();
            robot.delay(10000); // Wait for a moment

            // Simulate pressing Ctrl+V to paste the file path
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);

            // Press Enter to confirm the file selection
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

        } catch (AWTException e) {
            e.printStackTrace();
        }
      
	}
	
	/**
	 * USED TO VERIFY THE UI TEXT WITH EXPECTED TEXT
	 * @param ele
	 * @param ExpectedText
	 */
	  public void verifyByText(WebElement ele,String ExpectedText)
      {
      	String text = ele.getText();
      	if (text.contains(ExpectedText)) {
			Reporter.log("TEXT MATCHED",true);
		} else {
			Reporter.log("TEXT UN-MATCHED",true);
		}
      }
	  
	  
	  
	  
	  
	  
	  
	  /**
	   * USED TO VERIFY THE VALUE PRESENT IN UI WITH EXPECTED VALUE
	   * @param ele
	   * @param ExpectedAttValue
	   */
	  public void verifyByAttributeValue(WebElement ele,String ExpectedAttValue)
	  {
		  String attValue = ele.getAttribute("value");
		  if (attValue.contains(ExpectedAttValue)) {
			  Reporter.log("VALUE MATCHED",true);
		} else {
			Reporter.log("VALUE UN-MATCHED",true);
		}
	  }
	  
	  /**
	   * USED TO VERIFY THE ELEMENT IS READ-ONLY OR NOT
	   * @param ele
	   */
	  public void verifyReadOnly(WebElement ele)
	  {
		  String read = ele.getAttribute("readonly");
		  
		  if (read != null) {
			Reporter.log("ELEMENT IS READ-ONLY",true);
		} else {
			Reporter.log("ELEMENT IS NOT READ-ONLY",true);
		}
	  }
	  
//	  public  void renameFile(String oldFilePath) {
//	        File oldFile = new File(oldFilePath);
//	        
//	        // Generate a random number for the new file name
//	        int randomNumber = new Random().nextInt(10000);  
//	        String newFilePath = "C:\\Users\\Vijay\\Desktop\\NPPMS\\src\\test\\resources\\documents\\" + randomNumber + ".pdf";
//	        
//	        File newFile = new File(newFilePath);
//	        
//	        if (oldFile.renameTo(newFile)) {
//	            System.out.println("File renamed successfully to " + newFile.getName());
//	        } else {
//	            System.out.println("File renaming failed.");
//	        }
//	    }
	  
	  public void renameFile(String key) throws Throwable
	  {
		 PropertiesUtility p=new PropertiesUtility();
		 String oldFilePath = p.readProperty(key);
		 File oldFile = new File(oldFilePath);
		 
		 //Generate a random number for the new file name
	      int randomNumber = new Random().nextInt(1000000);  
	      String newFilePath = "C:\\Users\\Vijay\\Desktop\\NPPMS\\src\\test\\resources\\documents\\" + randomNumber + ".pdf";
	      
	      File newFile = new File(newFilePath);
	      
	      if (oldFile.renameTo(newFile)) 
	      {
			System.out.println("File renamed successfully to " + newFile.getName());
			p.storeData(key, newFilePath);
		  } else 
		  {
			System.out.println("File renaming failed.");
		  }
	  }
	  
	  public void emSigner() throws Throwable
	  {
		  Robot robot = new Robot();
	        robot.delay(3000);
 
	        // Move mouse to the location of the "Register" button and click
	        robot.mouseMove(769, 440);
	        //robot.mouseMove(800, 400);
//	        robot.mouseMove(1000, 480);
	        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	        Thread.sleep(2000);
	        robot.keyPress(KeyEvent.VK_ENTER);
	        robot.keyRelease(KeyEvent.VK_ENTER);
	        Thread.sleep(2000);
	        
	        robot.mouseMove(1000, 580);
	        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	        Thread.sleep(2000);
	        robot.keyPress(KeyEvent.VK_ENTER);
	        robot.keyRelease(KeyEvent.VK_ENTER);
	  }
}
