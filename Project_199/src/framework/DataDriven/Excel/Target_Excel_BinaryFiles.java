package framework.DataDriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Target_Excel_BinaryFiles 
{

	public static void main(String[] args) throws IOException
	{
		
		//Target File location 
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File Located");
		
		//Get Workbook Access
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get sheet using above workbook
		XSSFSheet sht=book.getSheet("Tc001");
		
		//Target row using sheet reference
		XSSFRow row=sht.getRow(1);
		
		//Target cell using row reference
		XSSFCell cell=row.getCell(0);
		
		//Read Text from cell
		String URL=cell.getStringCellValue();
		System.out.println(URL);
		
		//Read First Cell value
		String BrowserName=row.getCell(1).getStringCellValue();
		System.out.println(BrowserName);
		
		//Read Second Cell value
		String Title=row.getCell(2).getStringCellValue();
		System.out.println(Title);
		
		
	}

}
