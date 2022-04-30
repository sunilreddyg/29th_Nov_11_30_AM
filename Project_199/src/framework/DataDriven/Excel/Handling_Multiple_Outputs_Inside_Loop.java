package framework.DataDriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Handling_Multiple_Outputs_Inside_Loop {

	public static void main(String[] args) throws IOException {
		
		//Target File location 
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File Located");
		
		//Get Workbook Access
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get sheet using above workbook
		XSSFSheet sht=book.getSheet("Sheet7");
		
		//Iterate for number of rows
		for (int i = 1; i < sht.getLastRowNum()+1; i++) 
		{
			String Exe_status=sht.getRow(i).getCell(1).getStringCellValue();
			if(Exe_status.equalsIgnoreCase("y"))
			{
				String UID=sht.getRow(i).getCell(0).getStringCellValue();
				
				//Get Output Type
				String OutputType=sht.getRow(i).getCell(2).getStringCellValue();
				switch (OutputType) {
				case "text":
					System.out.println("For => "+UID+"   Text output handled");
					break;
					
				case "alert":
					System.out.println("For => "+UID+"   alert output handled");
					break;
					
				case "displayed":
					System.out.println("For => "+UID+"   Displayed output handled");
					break;
					
				case "title":
					System.out.println("For => "+UID+"   title output handled");
					break;

				default:
					break;
				}
			}
			
		}

	}

}
