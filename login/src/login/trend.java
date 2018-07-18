package login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class trend {

public class Trendzzmartapplication {
	
	public WebDriver wb;
	
	
	@Test(dataProvider="Testing")
	
	public void Trendzzmartapptestin(String usename,String Pasword)
	{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohit\\Desktop\\New folder\\chromedriver.exe");
	wb= new ChromeDriver();
	 
      wb.navigate().to("http://www.trendzzmart.com/");
      wb.manage().window().maximize();
	     wb.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     wb.findElement(By.linkText("My account")).click();
	     wb.findElement(By.name("username")).sendKeys(usename);
	     wb.findElement(By.name("password")).sendKeys(Pasword);
	     wb.findElement(By.name("login")).click();
	     
	}
	
	@DataProvider(name="Testing")
	
	public Object[][] passdata() throws Throwable
	{
		ExcelDataConfig cn = new ExcelDataConfig("C:\\Users\\Mohit\\Desktop\\work\\Inputdata.xlsx");
		int rows =cn.getrowcount(0);
		
		
		 
		Object[][] data= new Object[rows][2];
		for(int i=0; i<rows;i++)
		{
			 data[i][0]=cn.getdata(0, i, 0);
			 data[i][1]=cn.getdata(0, i, 1);
		      
	      
				 
		}
		return data;
}
}


}
