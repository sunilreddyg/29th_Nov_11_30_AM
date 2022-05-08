package framework.Testng.DataProvider.Excel_Integration;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterClass;

public class Excel_To_Data_provider_integration 
{
	XSSFWorkbook book;
	XSSFSheet sht;
	XSSFRow row;
	XSSFCell cell;
	String filepath="TestData\\InputData.xlsx";
	

	@Test(dataProvider="get_excel_data")
	public void get_input_data_from_excel(String UID,String PWD,String EMPID)
	{
		
	}
	
	@DataProvider
	public String[][] get_excel_data()
	{
			int Rnum=sht.getLastRowNum();
			int Cnum=sht.getRow(1).getLastCellNum();
			
			String data[][];
			data=new String[Rnum+1][Cnum];
			
			//Iterate for number of rows
			for (int i = 0; i <= Rnum; i++) 
			{
					//Iterate for number of cells
					for (int j = 0; j < Cnum; j++) 
					{
						
						data[i][j]=sht.getRow(i).getCell(j).getStringCellValue();
						
					}
				
			}
			
			return data;
	}
	
	

  @BeforeClass
  public void beforeClass() throws IOException 
  {
	  FileInputStream fi=new FileInputStream(filepath);
	  book=new XSSFWorkbook(fi);
	  sht=book.getSheet("Sheet7");
  }

  @AfterClass
  public void afterClass() throws IOException
  {
	  book.close();
  }

}
