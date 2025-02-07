package base_test;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import file_utility.ExcelUtilityForSingleData;
import file_utility.PropertiesUtility;
import java_utility.Java_Utility;
import pom_classes.Home_Page;
import validate.AssertUtility;
import webdriver_utility.Webdriver_Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPageEventHelper;
import com.itextpdf.text.pdf.PdfWriter;

import database_utility.DataBase_Utility;
public class BaseClass {

	// ALL OBJECTS
	public static WebDriver sdriver;
	public static Document document;
	public static PdfWriter writer;
	// public static String module = "Commercial Documents";
	public static String module = null;
	public WebDriver driver = null;
	public PropertiesUtility property = new PropertiesUtility();
	public ExcelUtilityForSingleData excel = new ExcelUtilityForSingleData();
	public AssertUtility assertValidate = new AssertUtility();
	public Webdriver_Utility wUtility = new Webdriver_Utility();
	public Java_Utility java=new Java_Utility();
	//public DataBase_Utility db=new DataBase_Utility();
	
	private static int testCounter = 0;//new

	@BeforeSuite
	public void configBeforeSuite() throws SQLException {
		System.out.println("==>DB CONNECTION // REPORT CONFIG<==");
	}

	@AfterSuite
	public void configAfterSuite() throws SQLException {
		System.out.println("==>DB DISCONNECTION // REPORT BACKUP<==");
	}

	@BeforeTest
	public void beforeTest() throws IOException, DocumentException {
		module = getClass().getPackage().getName().replace("_", " ");
		String path = "./Reports/" + module + ".pdf";
		document = new Document();
		document.setMargins(35, 35, 150, 35);
		writer = PdfWriter.getInstance(document, new FileOutputStream(path));
		writer.setPageEvent(new HeaderFooter1());
		document.open();
	}

	@AfterTest
	public void afterTest() throws IOException, InterruptedException {
		// writer.close();
		document.close();
	}

	@BeforeClass
	public void configBeforeClass() throws Throwable {
//		ChromeOptions options=new ChromeOptions();
//		EdgeOptions opt=new EdgeOptions();
//		opt.addArguments("headless");
//		options.addArguments("--headless");
		System.out.println("==>BROWSER LAUNCH AND CONFIG<==");
		String browser = property.readProperty("browser");
		if (browser.equalsIgnoreCase("chrome")) {
			sdriver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			sdriver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			sdriver = new FirefoxDriver();
		} else {
			sdriver = new ChromeDriver();
		}
		driver = sdriver;
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
	}

	@AfterClass
	public void configAfterClass() {
		System.out.println("==>BROWSER QUIT<==");
		driver.manage().window().minimize();
		driver.quit();
	}

	@BeforeMethod
	public void configBeforeMethod() throws Throwable {
		// Increment the test counter
        testCounter++;

        // Apply configuration only if it's not the first test
        if (testCounter > 1) {
            document.newPage();
        }

        //access url
        
        
        driver.get(property.readProperty("url"));
        Home_Page login = new Home_Page(driver);
        if (this.getClass().getName().contains("Income_01")) {
        	//enter loginid
			assertValidate.assertByWebelementVisibility(login.getLoginIdTextField());
			assertValidate.assertByEnabled(login.getLoginIdTextField());
			login.getLoginIdTextField().click();
			login.getLoginIdTextField().sendKeys(property.readProperty("loginid"));
			
			//enter password
			login.getPasswordTextField().click();
			login.getPasswordTextField().sendKeys(property.readProperty("password"));
		} else if(this.getClass().getName().contains("Income_Dept_01")) {
			//enter loginid
			assertValidate.assertByWebelementVisibility(login.getLoginIdTextField());
			assertValidate.assertByEnabled(login.getLoginIdTextField());
			login.getLoginIdTextField().click();
			login.getLoginIdTextField().sendKeys(property.readProperty("loginid1"));
			
			//enter password
			login.getPasswordTextField().click();
			login.getPasswordTextField().sendKeys(property.readProperty("password"));
		}
		else if(this.getClass().getName().contains("Obc_Dept_01")) {
			//enter loginid
			assertValidate.assertByWebelementVisibility(login.getLoginIdTextField());
			assertValidate.assertByEnabled(login.getLoginIdTextField());
			login.getLoginIdTextField().click();
			login.getLoginIdTextField().sendKeys(property.readProperty("loginid2"));
			
			//enter password
			login.getPasswordTextField().click();
			login.getPasswordTextField().sendKeys(property.readProperty("password"));
		}
		else if (this.getClass().getName().contains("obc_application_01")) {
        	//enter loginid
			assertValidate.assertByWebelementVisibility(login.getLoginIdTextField());
			assertValidate.assertByEnabled(login.getLoginIdTextField());
			login.getLoginIdTextField().click();
			login.getLoginIdTextField().sendKeys(property.readProperty("loginid"));
			
			//enter password
			login.getPasswordTextField().click();
			login.getPasswordTextField().sendKeys(property.readProperty("password"));
		}
		//click on login button
		login.getLoginButton().click();
	}

	@AfterMethod
	public void configAfterMethod() {
		System.out.println("==>LOGOUT<==");
	}

	// report utilities
	public void start_Report(String scenario, String description, String testData) throws Throwable {
		table(scenario, description, testData);
		imageCell();
		paragraph1("==>ON START<==");
	}

	public void while_Run() throws Throwable {
		imageCell();
		paragraph1("==>WHILE EXECUTION<==");
	}

	public void end_Report(WebElement elm, String scenario) throws Exception {
//		imageCell();
//		paragraph1("==>ON FINISH<==");
		try {
			if (elm.isDisplayed()) {
				imageCell();
				paragraph1("==>ON FINISH<==");
				pass1(scenario);
			}
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			imageCell();
			paragraph1("==>ON FINISH<==");
			fail1(scenario);
			Assert.fail();
		}
//		if (elm.isDisplayed()) {
//			imageCell();
//			paragraph1("==>ON FINISH<==");
//			pass1(scenario);
//		} else {
//			imageCell();
//			paragraph1("==>ON FINISH<==");
//			fail1(scenario);
//		}
		//document.newPage();
	}
	
	public void end_Report(WebElement ele,String ex_Message,String scenario) throws Exception
	{
		try {
			if (ele.getText().contains(ex_Message)) {
				imageCell();
				paragraph1("==>ON FINISH<==");
				pass1(scenario);
			}
			else
			{
				imageCell();
				paragraph1("==>ON FINISH<==");
				fail1(scenario);
				Assert.fail();
			}
		} catch (Exception e) {
			e.printStackTrace();
			imageCell();
			paragraph1("==>ON FINISH<==");
			fail1(scenario);
			Assert.fail();
		}
	}

	public void endReport(boolean boo,String scenario) throws Throwable {
		try {
		if (boo==true) {
			imageCell();
			paragraph1("==>ON FINISH<==");
			pass1(scenario);
		} else if (boo==false) {
			imageCell();
			paragraph1("==>ON FINISH<==");
			fail1(scenario);
			Assert.fail();
		}
		}catch (Exception e) {
			e.printStackTrace();
			imageCell();
			paragraph1("==>ON FINISH<==");
			fail1(scenario);
			Assert.fail();
		}
	}
	
	
//	public void status(WebElement elm, String scenario) throws Exception {
//		if (elm.isDisplayed()) {
//			imageCell();
//			paragraph1("Screenshot of after the script execution ");
//			pass1(scenario);
//		} else {
//			imageCell();
//			paragraph1("Screenshot of after the script execution ");
//			fail1(scenario);
//		}
//	}

	public static void pass1(String testCase) throws DocumentException, InterruptedException {
		String[] text = testCase.split(":");
		Font font = FontFactory.getFont("Arial", 11, new BaseColor(50, 50, 50));
		Font fontGreen = FontFactory.getFont("Arial", 11, Font.BOLD, new BaseColor(55, 169, 106));
		Phrase firstPhrase = new Phrase();
		firstPhrase.add(new Chunk(text[1].trim(), font));
		Phrase secondPhrase = new Phrase();
		secondPhrase.add(new Chunk("PASS", fontGreen));
		PdfPTable table = new PdfPTable(1);
		PdfPCell paragraphCell1 = new PdfPCell();
		paragraphCell1.setBorderWidth(0);
		paragraphCell1.setPaddingLeft(-40f); // Left indentation
		paragraphCell1.setPaddingRight(-40f); // Right indentation
		paragraphCell1.setPaddingTop(3f); // Top padding
		paragraphCell1.setPaddingBottom(3f); // Bottom padding
		paragraphCell1.setLeading(1, (float) 1.3);
		paragraphCell1.setUseVariableBorders(true);
		Paragraph para = new Paragraph();
		para.add(firstPhrase);
		para.add(new Chunk(" : "));
		para.add(secondPhrase);
		paragraphCell1.addElement(para);
		table.addCell(paragraphCell1);
		document.add(table);

	}

	public static void fail1(String testCase) throws DocumentException, InterruptedException {
		String[] text = testCase.split(":");
		Font font = FontFactory.getFont("Arial", 11, new BaseColor(50, 50, 50));
		Font fontRed = FontFactory.getFont("Arial", 11, Font.BOLD, new BaseColor(250, 19, 3));
		Phrase firstPhrase = new Phrase();
		firstPhrase.add(new Chunk(text[1].trim(), font));
		Phrase secondPhrase = new Phrase();
		secondPhrase.add(new Chunk("FAIL", fontRed));
		PdfPTable table = new PdfPTable(1);
		PdfPCell paragraphCell1 = new PdfPCell();
		paragraphCell1.setBorderWidth(0);
		paragraphCell1.setPaddingLeft(-40f); // Left indentation
		paragraphCell1.setPaddingRight(-40f); // Right indentation
		paragraphCell1.setPaddingTop(3f); // Top padding
		paragraphCell1.setPaddingBottom(3f); // Bottom padding
		paragraphCell1.setLeading(1, (float) 1.3);
		paragraphCell1.setUseVariableBorders(true);
		Paragraph para = new Paragraph();
		para.add(firstPhrase);
		para.add(new Chunk(" : "));
		para.add(secondPhrase);
		paragraphCell1.addElement(para);
		table.addCell(paragraphCell1);
		document.add(table);

	}

	public static PdfPCell paragraph1(String text) throws DocumentException {
		PdfPTable table = new PdfPTable(1);
		PdfPCell paragraphCell1 = new PdfPCell(
				new Phrase(text, FontFactory.getFont("Arial", 11, new BaseColor(50, 50, 50))));
		paragraphCell1.setBorderWidth(0);
		paragraphCell1.setPaddingLeft(-40f); // Left indentation
		paragraphCell1.setPaddingRight(-40f);
		paragraphCell1.setPaddingBottom(3f);
		paragraphCell1.setLeading(1, (float) 1.3);
		paragraphCell1.setUseVariableBorders(true);
		table.addCell(paragraphCell1);
		document.add(table);
		return paragraphCell1;
	}

	public static Paragraph paragraph(String text) throws DocumentException {
		Paragraph preface = new Paragraph(text, FontFactory.getFont("Arial", 11, new BaseColor(50, 50, 50)));
		preface.setSpacingAfter(7);
		preface.setAlignment(Element.ALIGN_LEFT);
		preface.setIndentationLeft(7);
		preface.setIndentationRight(7);
		document.add(preface);
		return preface;
	}

	public static PdfPCell imageCell() throws Exception {
		PdfPTable table = new PdfPTable(1);
		synchronization(4000);
		byte[] input = ((TakesScreenshot) sdriver).getScreenshotAs(OutputType.BYTES);
		Image image1 = Image.getInstance(input);
		PdfPCell imageCell1 = new PdfPCell(image1, true);
		imageCell1.setBorderWidth(0);
		imageCell1.setPaddingLeft(-40f);
		imageCell1.setPaddingRight(-40f);
		imageCell1.setPaddingTop(7f);
		imageCell1.setUseVariableBorders(true);
		table.addCell(imageCell1);
		document.add(table);
		return imageCell1;
	}

	public static Paragraph font(String text) throws DocumentException {
		Font font = FontFactory.getFont("Arial", 11, new BaseColor(50, 50, 50));
		Paragraph para = new Paragraph(text, font);
		para.setIndentationLeft(7);
		para.setSpacingAfter(7);
		document.add(para);
		return para;
	}

	public static Paragraph font1(String text) throws DocumentException {
		Font font = FontFactory.getFont("Arial", 11, Font.BOLD);
		Paragraph para = new Paragraph(text, font);
		para.setIndentationLeft(7);
		para.setSpacingAfter(7);
		document.add(para);
		return para;
	}

	static class HeaderFooter1 extends PdfPageEventHelper {
		private boolean isFirstPage = true;

		@Override
		public void onStartPage(PdfWriter writer, Document document) {

			float titleY = document.top(); // -50
			PdfContentByte canvas = writer.getDirectContent();
			canvas.setColorStroke(new BaseColor(128, 128, 128));
			float left = document.left();
			float right = document.right();
			float top = document.top();
			float bottom = document.bottom() - 10;
			if (isFirstPage) {
				// Left line
				canvas.moveTo(left, bottom);
				canvas.lineTo(left, top);
				canvas.stroke();

				// Right line
				canvas.moveTo(right, bottom);
				canvas.lineTo(right, top);
				canvas.stroke();

				// Top line
				canvas.moveTo(left, top);
				canvas.lineTo(right, top);
				canvas.stroke();

				// Bottom line
				canvas.moveTo(left, bottom);
				canvas.lineTo(right, bottom);
				canvas.stroke();

				// inner line
				canvas.moveTo(document.left(), titleY + 115); // Start of upper line
				canvas.lineTo(document.right(), titleY + 115); // End of upper line
				canvas.moveTo(document.left(), titleY + 10); // Start of lower line
				canvas.lineTo(document.right(), titleY + 10); // End of lower line

				canvas.moveTo(document.left(), titleY + 115); // Start of upper line
				canvas.lineTo(document.left(), titleY + 10); // End of upper line
				canvas.moveTo(document.right(), titleY + 115); // Start of lower line
				canvas.lineTo(document.right(), titleY + 10);

				// outer line
				canvas.moveTo(document.left() - 5, titleY + 120); // Start of upper line
				canvas.lineTo(document.right() + 5, titleY + 120); // End of upper line
				canvas.moveTo(document.left() - 5, titleY - 673); // Start of lower line
				canvas.lineTo(document.right() + 5, titleY - 673); // End of lower line

				canvas.moveTo(document.left() - 5, titleY + 120); // Start of upper line
				canvas.lineTo(document.left() - 5, titleY - 673); // End of upper line
				canvas.moveTo(document.right() + 5, titleY + 120); // Start of lower line
				canvas.lineTo(document.right() + 5, titleY - 673);

				canvas.stroke();
				canvas.resetRGBColorStroke();
			} else { // Left line
				canvas.moveTo(left, bottom);
				canvas.lineTo(left, top);
				canvas.stroke();

				// Right line
				canvas.moveTo(right, bottom);
				canvas.lineTo(right, top);
				canvas.stroke();

				// Top line
				canvas.moveTo(left, top);
				canvas.lineTo(right, top);
				canvas.stroke();

				// Bottom line
				canvas.moveTo(left, bottom);
				canvas.lineTo(right, bottom);
				canvas.stroke();

				// inner line
				canvas.moveTo(document.left(), titleY + 115); // Start of upper line
				canvas.lineTo(document.right(), titleY + 115); // End of upper line
				canvas.moveTo(document.left(), titleY + 10); // Start of lower line
				canvas.lineTo(document.right(), titleY + 10); // End of lower line

				canvas.moveTo(document.left(), titleY + 115); // Start of upper line
				canvas.lineTo(document.left(), titleY + 10); // End of upper line
				canvas.moveTo(document.right(), titleY + 115); // Start of lower line
				canvas.lineTo(document.right(), titleY + 10);

				// outer line
				canvas.moveTo(document.left() - 5, titleY + 120); // Start of upper line
				canvas.lineTo(document.right() + 5, titleY + 120); // End of upper line
				canvas.moveTo(document.left() - 5, titleY - 673); // Start of lower line
				canvas.lineTo(document.right() + 5, titleY - 673); // End of lower line

				canvas.moveTo(document.left() - 5, titleY + 120); // Start of upper line
				canvas.lineTo(document.left() - 5, titleY - 673); // End of upper line
				canvas.moveTo(document.right() + 5, titleY + 120); // Start of lower line
				canvas.lineTo(document.right() + 5, titleY - 673);

				canvas.stroke();
				canvas.resetRGBColorStroke();
			}

			if (isFirstPage) {
				try {
					headers(162);
					PdfContentByte cb = writer.getDirectContent();
					Image imgSoc = Image.getInstance("./src/test/resources/image/Selenium2.png");
					imgSoc.scaleToFit(90, 90);
					imgSoc.setAbsolutePosition(42, 709);
					cb.addImage(imgSoc);
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else {
				try {
					headers(157);
					PdfContentByte cb = writer.getDirectContent();
					Image imgSoc = Image.getInstance("./src/test/resources/image/Selenium2.png");
					imgSoc.scaleToFit(90, 90);
					imgSoc.setAbsolutePosition(52, 709);
					cb.addImage(imgSoc);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			isFirstPage = false;
		}

	}

	public static void headers(int i) {
		Font font = FontFactory.getFont("Arial", 11, new BaseColor(50, 50, 50));
		ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_LEFT,
				new Phrase("Selenium 4.20.0 Version System Generated Report", font),
				(document.right() - document.left()) / 2 + document.leftMargin() - i, document.top() + 100, 0);
		try {
			ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_LEFT,
					titleTexts("URL : https://tsstaging.meeseva.telangana.gov.in/meesevastaging/"),
					(document.right() - document.left()) / 2 + document.leftMargin() - i, document.top() + 80, 0);
		} catch (DocumentException | InterruptedException e) {
			e.printStackTrace();
		}
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss ");
		Date currentDate = new Date();
		String formattedDateTime = dateFormat.format(currentDate);
		try {
			ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_LEFT,
					titleTexts("Date : " + formattedDateTime + "| IST"),
					(document.right() - document.left()) / 2 + document.leftMargin() - i, document.top() + 60, 0);
		} catch (DocumentException | InterruptedException e) {
			e.printStackTrace();
		}
		try {
			ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_LEFT, titleTexts("Module : " + module),
					(document.right() - document.left()) / 2 + document.leftMargin() - i, document.top() + 20, 0);
		} catch (DocumentException | InterruptedException e) {
			e.printStackTrace();
		}

		try {
			ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_LEFT, titleTexts("Project : MEESEVA"),
					(document.right() - document.left()) / 2 + document.leftMargin() - i, document.top() + 40, 0);
		} catch (DocumentException | InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static Phrase titleTexts(String title) throws DocumentException, InterruptedException {
		String[] title1 = title.split(": ");
		Font font = FontFactory.getFont("Arial", 11, new BaseColor(50, 50, 50));
		Font fontBold = FontFactory.getFont("Arial", 11, Font.BOLD);
		Phrase firstPhrase = new Phrase();
		firstPhrase.add(new Chunk(title1[0], fontBold));
		Phrase secondPhrase = new Phrase();
		secondPhrase.add(new Chunk(title1[1], font));
		Paragraph pass = new Paragraph();
		pass.add(firstPhrase);
		pass.add(new Chunk(" : "));
		pass.add(secondPhrase);
		pass.setSpacingBefore(15);
		return pass;

	}

	public static void pass(String testCase) throws DocumentException, InterruptedException {
		String[] text = testCase.split(":");
		Font font = FontFactory.getFont("Arial", 11, new BaseColor(50, 50, 50));
		Font fontGreen = FontFactory.getFont("Arial", 11, Font.BOLD, new BaseColor(55, 169, 106));
		Phrase firstPhrase = new Phrase();
		firstPhrase.add(new Chunk(text[1].trim(), font));
		Phrase secondPhrase = new Phrase();
		secondPhrase.add(new Chunk("PASS", fontGreen));
		Paragraph pass = new Paragraph();
		pass.setIndentationLeft(8); // Left Padding
		pass.setIndentationRight(7);
		pass.add(firstPhrase);
		pass.add(new Chunk(" : "));
		pass.add(secondPhrase);
		pass.setSpacingAfter(7);
		document.add(pass);
	}

	public static void fail(String testCase) throws DocumentException, InterruptedException {
		String[] text = testCase.split(":");
		Font font = FontFactory.getFont("Arial", 11, new BaseColor(50, 50, 50));
		Font fontRed = FontFactory.getFont("Arial", 11, Font.BOLD, new BaseColor(250, 19, 3));
		Phrase firstPhrase = new Phrase();
		firstPhrase.add(new Chunk(text[1].trim(), font));
		Phrase secondPhrase = new Phrase();
		secondPhrase.add(new Chunk("FAIL", fontRed));
		Paragraph pass = new Paragraph();
		pass.setIndentationLeft(7); // Left Padding
		pass.setIndentationRight(7);
		pass.add(firstPhrase);
		pass.add(new Chunk(" : "));
		pass.add(secondPhrase);
		pass.setSpacingAfter(7);
		document.add(pass);
	}

	public static void table(String scenario, String description, String testData) throws DocumentException {
		String[] text1 = scenario.split(":");
		PdfPTable table = new PdfPTable(2);
		Font font = FontFactory.getFont("Arial", 11, new BaseColor(50, 50, 50));
		Font fontBold = FontFactory.getFont("Arial", 11, Font.BOLD);
		document.setMargins(45, 35, 150, 35);
		float top = document.left() + 10;
		table.setSpacingAfter(7);
		table.setWidthPercentage(100);
		table.setWidths(new float[] { 1, 3 });
		PdfPCell cell1 = new PdfPCell(new Paragraph("Test case ID", fontBold));
		cell1.setBorderColor(new BaseColor(128, 128, 128));
		cell1.setPadding(4);
		cell1.setHorizontalAlignment(Element.ALIGN_LEFT);
		cell1.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell1.setMinimumHeight(25);
		cell1.setLeading(1, (float) 0.6);
		PdfPCell cell2 = new PdfPCell(new Paragraph(text1[0].trim(), font));
		cell2.setBorderColor(new BaseColor(128, 128, 128));
		cell2.setPadding(4);
		cell2.setHorizontalAlignment(Element.ALIGN_LEFT);
		cell2.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell2.setMinimumHeight(25);
		cell2.setLeading(1, (float) 1.4);
		cell2.setExtraParagraphSpace(7);
		PdfPCell cell3 = new PdfPCell(new Paragraph("Test case", fontBold));
		cell3.setBorderColor(new BaseColor(128, 128, 128));
		cell3.setPadding(4);
		cell3.setHorizontalAlignment(Element.ALIGN_LEFT);
		cell3.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell3.setMinimumHeight(25);
		cell3.setLeading(1, (float) 0.6);
		PdfPCell cell4 = new PdfPCell();
		cell4.setBorderColor(new BaseColor(128, 128, 128));
		cell4.setHorizontalAlignment(Element.ALIGN_LEFT);
		cell4.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell4.setPhrase(new Phrase(text1[1].trim(), font));
		cell4.setPadding(4);
		cell4.setLeading(1, (float) 1.4);
		cell4.setExtraParagraphSpace(7);
		PdfPCell cell5 = new PdfPCell(new Paragraph("Description ", fontBold));
		cell5.setBorderColor(new BaseColor(128, 128, 128));
		cell5.setPadding(4);
		cell5.setHorizontalAlignment(Element.ALIGN_LEFT);
		cell5.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell5.setLeading(1, (float) 0.6);
		PdfPCell cell6 = new PdfPCell();
		cell6.setBorderColor(new BaseColor(128, 128, 128));
		cell6.setHorizontalAlignment(Element.ALIGN_LEFT);
		cell6.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell6.setPhrase(new Phrase(description, font));
		cell6.setPadding(4);
		cell6.setLeading(1, (float) 1.4);
		cell6.setExtraParagraphSpace(7);
		PdfPCell cell7 = new PdfPCell(new Paragraph("Test data  ", fontBold));
		cell7.setBorderColor(new BaseColor(128, 128, 128));
		cell7.setPadding(4);
		cell7.setHorizontalAlignment(Element.ALIGN_LEFT);
		cell7.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell7.setLeading(1, (float) 0.6);
		PdfPCell cell8 = new PdfPCell();
		cell8.setBorderColor(new BaseColor(128, 128, 128));
		cell8.setHorizontalAlignment(Element.ALIGN_LEFT);
		cell8.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell8.setPhrase(new Phrase(testData, font));
		cell8.setPadding(4);
		cell8.setLeading(1, (float) 1.4);
		cell8.setExtraParagraphSpace(7);
		table.addCell(cell1);
		table.addCell(cell2);
		table.addCell(cell3);
		table.addCell(cell4);
		table.addCell(cell5);
		table.addCell(cell6);
		table.addCell(cell7);
		table.addCell(cell8);
		document.add(table);
	}

	public static void imageCapturing()
			throws DocumentException, MalformedURLException, IOException, InterruptedException {
		Thread.sleep(3000);
		byte[] input = ((TakesScreenshot) sdriver).getScreenshotAs(OutputType.BYTES);
		Image im = Image.getInstance(input);
		im.setIndentationLeft(10);
		im.scaleAbsolute(503, 230);
		im.setSpacingAfter(7);
		// im.setSpacingBefore(10);
		im.setIndentationRight(10);
		document.add(im);
		paragraph("Screenshot Before Script Execution");
		System.out.println("1st Image");

	}

	public static void imageCapturing4()
			throws DocumentException, MalformedURLException, IOException, InterruptedException {
		Thread.sleep(3000);
		byte[] input = ((TakesScreenshot) sdriver).getScreenshotAs(OutputType.BYTES);
		Image im = Image.getInstance(input);
		im.setIndentationLeft(10);
		im.scaleAbsolute(495, 230);
		im.setSpacingAfter(7);
		// im.setSpacingBefore(10);
		im.setIndentationRight(10);
		document.add(im);
		paragraph("Screenshot Before Script Execution");
		System.out.println("1st Image");

	}

	public static void imageCapturing2()
			throws DocumentException, MalformedURLException, IOException, InterruptedException {
		Thread.sleep(3000);
		byte[] input = ((TakesScreenshot) sdriver).getScreenshotAs(OutputType.BYTES);
		Image im = Image.getInstance(input);
		im.setIndentationLeft(10);
		im.scaleAbsolute(495, 230);
		im.setSpacingAfter(7);
		// im.setSpacingBefore(10);
		im.setIndentationRight(10);
		document.add(im);
		paragraph("Screenshot at Script Execution");
		System.out.println("1st Image");
	}

	public static void imageCapturing3()
			throws DocumentException, MalformedURLException, IOException, InterruptedException {
		Thread.sleep(3000);
		byte[] input = ((TakesScreenshot) sdriver).getScreenshotAs(OutputType.BYTES);
		Image im = Image.getInstance(input);
		im.setIndentationLeft(10);
		im.scaleAbsolute(495, 230);
		im.setSpacingAfter(7);
		// im.setSpacingBefore(10);
		im.setIndentationRight(10);
		document.add(im);
		paragraph("After executing the script, capture a screenshot.");
		System.out.println("1st Image");
	}

//	public static String takesScreenshot1(ITestNGMethod iTestNGMethod) throws IOException {
//	File srcpath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//	FileInputStream in = new FileInputStream(srcpath);
//	byte[] imageBytes = IOUtils.toByteArray(in);
//	String base64 = Base64.encodeBase64String(imageBytes);
//	return base64;
//
//	}

//	public static String takesScreenshot(String validation) throws IOException {
//	File srcpath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//	FileInputStream in = new FileInputStream(srcpath);
//	byte[] imageBytes = IOUtils.toByteArray(in);
//	String base64 = Base64.encodeBase64String(imageBytes);
//	return base64;
//
//	}

	public static ThreadLocal<WebDriver> getDriver() {
		ThreadLocal<WebDriver> tdriver = new ThreadLocal<WebDriver>();
		tdriver.set(sdriver);
		return tdriver;

	}

	public static synchronized ThreadLocal<WebDriver> getDriver1() {
		return getDriver();
	}

	public static Paragraph header(String text) throws DocumentException {
		Font font = new Font(FontFamily.COURIER, 25.0f, Font.NORMAL, BaseColor.GREEN);
		Paragraph para = new Paragraph(text, font);
		para.setSpacingBefore(50);
		para.setAlignment(Element.ALIGN_CENTER);
		document.add(para);
		return para;
	}

	public static Paragraph firstParagraph(String text) throws DocumentException {
		Paragraph preface = new Paragraph(text);
		preface.setLeading(90);
		document.add(preface);
		return preface;
	}

	public static void synchronization(int i) throws InterruptedException {
		Thread.sleep(i);
	}

	
}
