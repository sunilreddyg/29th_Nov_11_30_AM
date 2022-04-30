package framework.DataDriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData_From_Multiple_Cells 
{

	public static void main(String[] args) throws IOException {
		
		//Target Excel binary file
		FileInputStream fi=new FileInputStream("TestData//InputData.xlsx");
		System.out.println("File located");
		
		//Get Workbook access using fileinputstread
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get sheet using above workbook
		XSSFSheet sht=book.getSheet("Sheet4");
		
		//Get FirstCell and LastCell Number where data available
		int FirstCellNumber=sht.getRow(0).getFirstCellNum();
		int LastcellNumber=sht.getRow(0).getLastCellNum();
		
		for (int i = FirstCellNumber+1; i < LastcellNumber; i++) 
		{
			 String MonthName=sht.getRow(0).getCell(i).getStringCellValue();
			 List<String> list=new ArrayList<String>();
			 list.add(MonthName);
		}

	}

}
