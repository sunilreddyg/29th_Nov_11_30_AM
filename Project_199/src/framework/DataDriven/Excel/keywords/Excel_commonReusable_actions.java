package framework.DataDriven.Excel.keywords;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_commonReusable_actions 
{
	
	static String file_location="TestData\\";
	static XSSFWorkbook book;
	static XSSFSheet sht;
	
	/*
	 * keyword:--> Target file location and sheet
	 * Description:-->
	 */
	public static void GetWorkbookAnd_Sheet(String WorkbookName,String SheetName)
	{
		try {
			
			FileInputStream fi=new FileInputStream(file_location+WorkbookName);
			book=new XSSFWorkbook(fi);
			sht=book.getSheet(SheetName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * keyword:--> Get Number of Rows Date available
	 * Description:-->
	 */
	public static int GetRowCount()
	{
		return sht.getLastRowNum();
	}
	
	/*
	 * keyword:--> Read Cell Data
	 * Description:-->
	 */
	public static String getStringCellData(int row, int cell)
	{
		return sht.getRow(row).getCell(cell).getStringCellValue();
	}
	
	/* 
	 *  Keyword:--> Write Cell Data
	 * Description:-->
	 */
	public static void WriteCellData_At_newCell(int row, int cell,String text)
	{
		sht.getRow(row).createCell(cell).setCellValue(text);
	}
	
	/* 
	 *  Keyword:--> Crete output file and Dump all to otuput file
	 * Description:-->
	 */
	public static void CreateOtuputFile(String Ofilename)
	{
		try {
			FileOutputStream fo=new FileOutputStream(file_location+Ofilename);
			book.write(fo);
			book.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
