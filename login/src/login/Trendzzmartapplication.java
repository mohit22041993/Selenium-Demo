package login;

import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Trendzzmartapplication {
	ExcelDataConfig cn;

	public WebDriver wb;

	@Test(dataProvider = "Testing")

	public void Trendzzmartapptestin(String usename, String Pasword,String actual,String Expected,String Status) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohit\\Desktop\\New folder\\chromedriver.exe");
		wb = new ChromeDriver();

		wb.navigate().to("http://www.trendzzmart.com/");
		wb.manage().window().maximize();
		wb.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		wb.findElement(By.linkText("Login")).click();
		wb.findElement(By.name("username")).sendKeys(usename);
		wb.findElement(By.name("password")).sendKeys(Pasword);
		wb.findElement(By.name("login")).click();
		wb.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		cn.writeexcelsheet(1);
		

	}

	@DataProvider(name = "Testing")

	public Object[][] passdata() throws Throwable {
		cn = new ExcelDataConfig("C:\\Users\\Mohit\\Desktop\\work\\Inputdata.xlsx");
		int rows = cn.getrowcount(0);
		int columns = cn.getcoloumn(0);
		        
		             

		// cn.getcoloumn();
		Object[][] data = new Object[rows][columns];
		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < columns; j++) {

				data[i][j] = cn.getdata(0, i, j);
				
				
				

			}

		}
		return data;
	}
}
