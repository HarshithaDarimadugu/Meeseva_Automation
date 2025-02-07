package file_utility;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

/**
 * THIS CLASS WILL PROVIDE THE UTILITY TO READ ALL THE DATA PRESENT IN AN EXCEL
 * BY THE HELP OF DATA-PROVIDER HERE DYNAMICALLY WE CAN READ FROM DIFFERENT
 * WORKBOOK AND SHEETS
 * 
 * @author Vijay
 */

public class ExcelUtilityForMultipleData {
	/**
	 * @param path of excel file
	 * @param sheetName
	 * @return the data which is present in excel in String format
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 * @author Vijay
	 */
	@DataProvider(name = "exceldata")
	public Object[][] readExcel(String path, String sheetName) throws EncryptedDocumentException, IOException {
		String excelPath = path;
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetName);
		int rowCount = sheet.getPhysicalNumberOfRows();
		int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
		Object[][] data = new Object[rowCount - 1][cellCount];

		for (int i = 1; i < rowCount; i++) {
			for (int j = 0; j < cellCount; j++) {
				data[i - 1][j] = sheet.getRow(i).getCell(j).toString();
			}
		}

		return data;
	}

}
