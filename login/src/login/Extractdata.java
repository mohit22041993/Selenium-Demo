package login;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Extractdata {
	
	public class ExcelDataConfig {
		
		XSSFWorkbook wb;
		XSSFSheet sheet;
		 XSSFRow Row; 
	     String cellData;
	     File src;
		
		public ExcelDataConfig(String excelpath) throws Throwable
		{
			src=  new File(excelpath);
			FileInputStream fis = new FileInputStream(src);
			wb= new XSSFWorkbook(fis);
			
			
		}
		
		public String  getdatass(int sheetnumber,int row,int column)
		{
			
		{
				sheet =wb.getSheetAt(sheetnumber);
				Row= sheet.getRow(row);
				cellData=Row.getCell(column).toString();
			
			
			return cellData;
			}

			
		}

		
		
		public int getrowcount( int sheetindex)
		{
			
			int row=wb.getSheetAt(sheetindex).getLastRowNum();
		    row=row+1;
		    return row;
			}   
		
		
		public int  getcoloumn(int sheetindex)
		{  
			sheet =wb.getSheetAt(sheetindex);
		    int cloumn = sheet.getRow(sheetindex).getLastCellNum();
		   // cloumn=cloumn+1;
			return cloumn;
		    
		
			}
		
		public void  writeexcelsheet( ) throws Throwable
		{
			
			
		}
		
		

	}


}
