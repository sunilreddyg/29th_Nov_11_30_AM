package framework.DataDriven.Excel;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Read_CellTypes 
{

	public static void main(String[] args) throws Exception {
		
		
		//Target File location 
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File Located");
		
		//Get Workbook Access
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get sheet using above workbook
		XSSFSheet sht=book.getSheet("Sheet5");
		
		
		for (int i = 1; i < sht.getLastRowNum()+1; i++) 
		{
			
			XSSFCell Selectedcell=sht.getRow(i).getCell(0);
			if(Selectedcell.getCellType()!=CellType.BLANK)
			{
				  String Cellvalue=Selectedcell.getCellType().toString();
				  String Username=null;
				  switch (Cellvalue) {
				case "STRING":
					Username=Selectedcell.getStringCellValue();
					break;
					
				case "NUMERIC":
					Username=NumberToTextConverter.toText(Selectedcell.getNumericCellValue());
					break;
					
				case "BOOLEAN":
					Boolean flag=Selectedcell.getBooleanCellValue();
					Username=flag.toString();
					break;

				default:
					break;
				}
				  
				  
				  System.out.println(Username);
				  
			}
			
			
			
			
		}
				

	}

}
