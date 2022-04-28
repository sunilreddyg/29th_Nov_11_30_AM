package framework.DataDriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Target_Excel_BinaryFiles2 {

	public static void main(String[] args)
	{
		
		FileInputStream fi = null;
		try {
			fi=new FileInputStream("TestData\\InputData.xlsx");
	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		if(fi!=null)
		{
			
			XSSFWorkbook book = null;
			try {
				//Get Workbook Access
				book = new XSSFWorkbook(fi);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			if(book!=null)
			{
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
			}
		}

	}

}
