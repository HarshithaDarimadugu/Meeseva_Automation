package file_utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

/**
 * THIS CLASS WILL PROVIDE UTILITY TO READ THE DATA FROM EXCEL DYNAMICALLY
 * 
 * @author Vijay
 */
public class ExcelUtilityForSingleData {
	/**
	 * @param sheetname in String
	 * @param row in int
	 * @param cell in int
	 * @return the data which is matched with sheet,row,cell
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 * @author Vijay
	 */
	public String readExcelData(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException
	{
		String path="./src/test/resources/testscript_data/testscript1.xlsx";
		FileInputStream fis=new FileInputStream(path);
		Workbook workbook = WorkbookFactory.create(fis);
		String data = null;
		try {
			data = workbook.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		} catch (IllegalStateException e) {
			//data= workbook.getSheet(sheetname).getRow(row).getCell(cell).getNumericCellValue();
		}
		return data;
	}
	
	public int getNoOfRows(String sheetname) throws EncryptedDocumentException, IOException
	{
		String path="./src/test/resources/testscript_data/testscript1.xlsx";
		FileInputStream fis=new FileInputStream(path);
		Workbook workbook = WorkbookFactory.create(fis);
		int noOfRows = workbook.getSheet(sheetname).getPhysicalNumberOfRows();
		return noOfRows;
	}
	
	public void writeData(String sheetName,int rowNo,int cellNo,String value)
	{
		 String filePath = "./src/test/resources/testscript_data/testscript1.xlsx";
	        try (FileInputStream fis = new FileInputStream(filePath);
	             Workbook workbook = WorkbookFactory.create(fis)) {

	            // Get the sheet from the workbook
	            Sheet sheet = workbook.getSheet(sheetName);

	            // Write data to a specific cell
	            Cell cell = sheet.getRow(rowNo).createCell(cellNo);
	            cell.setCellValue(value);

	            // Write the changes to the file
	            try (FileOutputStream fos = new FileOutputStream(filePath)) {
	                workbook.write(fos);
	            }

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}
	
//	public static void main(String[] args) {
//		ExcelUtilityForSingleData excel=new ExcelUtilityForSingleData();
//		excel.writeData("MEE_INCOME_SERVICE", 7, 3, "PASS");
//	}
}