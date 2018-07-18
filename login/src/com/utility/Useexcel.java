package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Useexcel {
	
	public XSSFWorkbook wb;
	public XSSFSheet sheet;
	public  XSSFRow Row; 
	public  XSSFCell cell;
    public String cellData;
    public  File src;
	FileInputStream fis;
	int col_num;
	String value;
     
     

     public Useexcel(String excelpath) throws Throwable {
    	 
    	   src=  new File(excelpath);
			 fis = new FileInputStream(src);
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
	
	 public String dats(int sheetnumber,int row,String column )
	 {
		 
		 sheet =wb.getSheetAt(sheetnumber);
		 Row=sheet.getRow(0);
		 for(int i=0;i<Row.getLastCellNum();i++)
		 {
			 if(Row.getCell(i).getStringCellValue().trim().equals(column.trim()))
			 {
				 
				  col_num = i;
			 Row = sheet.getRow(row);
				 XSSFCell cell = Row.getCell(col_num);
				  value = cell.getStringCellValue();
				 
				 
			 }
		 }
		return value;
	 }
	
	
  
}
