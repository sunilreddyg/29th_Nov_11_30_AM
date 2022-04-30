package framework.DataDriven.Excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_DataTo_Into_Excel {

	public static void main(String[] args) throws Exception {
		
		//Target File location 
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File Located");
		
		//Get Workbook Access
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get sheet using above workbook
		XSSFSheet sht=book.getSheet("Sheet2");
		
		
		//Update Existing row and Existing Cell data
		sht.getRow(1).getCell(3).setCellValue("9652682820");
		
		//Update Existing row and New Cell
		sht.getRow(1).createCell(7).setCellValue("Testpass");
		
		//Create New Row and New cell
		sht.createRow(2).createCell(0).setCellValue("Automation Completed status");
		
		//Create Output file
		FileOutputStream fo=new FileOutputStream("TestData\\Output.xlsx");
		//Write to File and Save data
		book.write(fo);
		book.close();
	}

}
