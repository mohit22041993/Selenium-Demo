package login;

import org.testng.annotations.Test;

import com.utility.Useexcel;
import com.utility.*;

public class ReadExcl {
	String data;
	@Test
	public void display() throws Throwable
	{
		//Useexcel ex = new Useexcel("C:\\Users\\Mohit\\Desktop\\New Microsoft Office Excel Worksheet.xlsx");
		//int total=ex.getrowcount(0);
		//int lastcoul=ex.getcoloumn(0);
		
		//for(int i=0;i<total;i++)
		//{
		//	for(int j=0;j<lastcoul;j++)
			
		//	data=ex.getdatass(0, i, j);
			
		//}
		
	    
	  // data=  ex.getdatass(0, 0, 0);
		
		Useexcel cs= new Useexcel("C:\\Users\\Mohit\\Desktop\\New Microsoft Office Excel Worksheet.xlsx");
		int total=cs.getrowcount(0);
		for(total=1;total<5;total++){
	
		//String data=cs.dats(0, 2, "mohit");
		String datas=cs.dats(0, total, "Firstname");
		String datasss=cs.dats(0, total, "Lastname");
		String datassss=cs.dats(0, total, "city");
		//System.out.println(data);
		System.out.println(datas);
		
		}
	    
	    
	}
	
	

}
