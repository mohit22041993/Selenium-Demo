package login;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class testings {
	@Test
	public void excel() throws Throwable
	{
		
		File fs = new File("C:/Users/Mohit/Desktop/New Microsoft Office Excel Worksheet.xlsx");
		
		FileInputStream file = new FileInputStream(fs);
		
		XSSFWorkbook b = new XSSFWorkbook(file);
		
		XSSFSheet Sheet = b.getSheet("Sheet1");

		int count = Sheet.getLastRowNum();
		for(int i =0;i<count+1;i++)
		{
			Row row=Sheet.getRow(i);
			
			for(int j=0;j<row.getLastCellNum();j++)
			{
				
				 Cell cell=row.getCell(j);
				 System.out.println(cell);
				 
				
			}
					
		}
		
	}
	

}
