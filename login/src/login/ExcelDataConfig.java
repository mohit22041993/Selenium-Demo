package login;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {

	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	File src;
	String fistname;

	public ExcelDataConfig(String excelpath) throws Throwable {
		src = new File(excelpath);
		FileInputStream fis = new FileInputStream(src);
		wb = new XSSFWorkbook(fis);

	}

	public String getdata(int sheetnumber, int row, int column) {

		sheet = wb.getSheetAt(sheetnumber);

		{
            	  
            	  XSSFCell cell = sheet.getRow(row).getCell(column);
            	  double  celltexts;
            	  String celltext ="";
            	  
            	  if (cell.getCellType() == cell.CELL_TYPE_STRING)

					{

						celltext = cell.getStringCellValue();
						System.out.println(celltext);

					}
					else if(cell.getCellType()==cell.CELL_TYPE_NUMERIC)
					{
						
					     celltexts= cell.getNumericCellValue();
					      celltext = String.valueOf(celltexts);
					      //celltext= celltexts.parseString(celltexts= cell.getNumericCellValue());
					}

			return celltext;
		}

	}

	public int getrowcount(int sheetindex) {

		int row = wb.getSheetAt(sheetindex).getLastRowNum();
		row = row + 1;
		return row;
	}

	public int getcoloumn(int sheetindex) {
		sheet = wb.getSheetAt(sheetindex);
		int cloumn = sheet.getRow(sheetindex).getLastCellNum();
		// cloumn=cloumn+1;
		return cloumn;

	}
	
	
	public String find(int sheetnumber)
	
		
	{
			sheet =wb.getSheetAt(sheetnumber);
			int count =sheet.getLastRowNum();
			for(int i=0;i<count+1;i++)
			{
				
				Row rows=sheet.getRow(i);
				
				for(int j=0;j<rows.getLastCellNum();j++)
				{
					
					fistname = rows.getCell(j).toString();
					
					
					
				}
			}
			return fistname;
			
		//String data=sheet.getRow(row).getCell(column).toString();
		
		
		
		}

	public int writeexcelsheet(int i) throws Throwable
	{
		try
		{
		for(i=1;i<=5;i++)
		
		 {
		
			{
		 sheet.getRow(i).createCell(4).setCellValue("Pass");
		//sheet.getRow(1).createCell(2).setCellValue("Fail");
		//File src = new File("C:\\Users\\Mohit\\Desktop\\New folder\\chromedriver.exe");
		
		FileOutputStream fis= new FileOutputStream(src);
		wb.write(fis);
			}
		
		 }
		
	
		//return i;
		}
		catch(Exception e)
		{
			
			System.out.println(e);
			
		}
		return i;
	}

	public String getdatas(int sheetnumber) {
		sheet =wb.getSheetAt(sheetnumber);
		int count =sheet.getLastRowNum();
		for(int i=0;i<count+1;i++)
		{
			
			Row rows=sheet.getRow(i);
			
			for(int j=0;j<rows.getLastCellNum();j++)
			{
				
				fistname = rows.getCell(j).toString();
				
				
				
			}
			return fistname;
	}
		return fistname;
	
	}}
