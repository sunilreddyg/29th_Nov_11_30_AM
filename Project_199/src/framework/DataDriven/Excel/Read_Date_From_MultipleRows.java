package framework.DataDriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Date_From_MultipleRows 
{

	public static void main(String[] args) throws IOException 
	{
		
		//Target Excel binary file
		FileInputStream fi=new FileInputStream("TestData//InputData.xlsx");
		System.out.println("File located");
		
		//Get Workbook access using fileinputstread
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get sheet using above workbook
		XSSFSheet sht=book.getSheet("Sheet3");
		
		//Get First and Last Cell Data
		int FirstRowNumber=sht.getFirstRowNum();
		int LastRowNumber=sht.getLastRowNum();
		
		System.out.println("Data started at Rownumber is --> "+FirstRowNumber);
		System.out.println("Data started at LastRownUmber is --> "+LastRowNumber);

		//Apply foreach to iterate number of rows
		for (int i = 1; i < LastRowNumber+1; i++) 
		{
			String UID=sht.getRow(i).getCell(0).getStringCellValue();
			String PWD=sht.getRow(i).getCell(1).getStringCellValue();
			
			System.out.println(UID+"   "+PWD);
		}
		
		
		
		
	}

}
