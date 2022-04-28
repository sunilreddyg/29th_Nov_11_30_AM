package framework.DataDriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Difference_CellData {

	public static void main(String[] args) throws IOException {
		
		//Target File location 
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File Located");
		
		//Get Workbook Access
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Targeting sheet using index number
		XSSFSheet sht=book.getSheetAt(1);
		
		//Target Row using sheet reference
		XSSFRow row=sht.getRow(1);
		
		//Get Numeric Data from cell
		Double dbl_value=row.getCell(0).getNumericCellValue();
		String ProductID=NumberToTextConverter.toText(dbl_value);
		System.out.println(ProductID);
		
		//Get Price
		double ProductPrice=row.getCell(1).getNumericCellValue();
		System.out.println(ProductPrice);

	}

}
