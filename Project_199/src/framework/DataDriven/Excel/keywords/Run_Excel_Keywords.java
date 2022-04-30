package framework.DataDriven.Excel.keywords;

public class Run_Excel_Keywords {

	public static void main(String[] args) {
		
		Excel_commonReusable_actions.
		GetWorkbookAnd_Sheet("InputData.xlsx", "Sheet3");
		
		int RowCount=Excel_commonReusable_actions.GetRowCount();
		
		for (int i = 1; i < RowCount+1; i++) 
		{
			String UID=Excel_commonReusable_actions
					.getStringCellData(i, 0);
			System.out.println(UID);
			
			Excel_commonReusable_actions
			.WriteCellData_At_newCell(i, 3, "Testpass");
	
		}
		
		Excel_commonReusable_actions.CreateOtuputFile("IO.xlsx");

	}

}
