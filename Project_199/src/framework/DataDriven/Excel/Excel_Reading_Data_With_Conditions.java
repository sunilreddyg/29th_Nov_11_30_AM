package framework.DataDriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Reading_Data_With_Conditions {

	public static void main(String[] args) throws Exception {
		
		//Target File location 
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File Located");
		
		//Get Workbook Access
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get sheet using above workbook
		XSSFSheet sht=book.getSheet("Sheet6");
		
		//Iterate for number of rows
		for (int i = 1; i < sht.getLastRowNum()+1; i++) 
		{
			String Exe_status=sht.getRow(i).getCell(1).getStringCellValue();
			if(Exe_status.equalsIgnoreCase("y"))
			{
				String UID=sht.getRow(i).getCell(0).getStringCellValue();
				System.out.println(UID);
			}
			
		}

	}

}
