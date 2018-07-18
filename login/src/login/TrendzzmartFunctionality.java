package login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TrendzzmartFunctionality {
	
	public WebDriver wb;
	@Test
	public void funcatonal()
	{
		try{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohit\\Desktop\\New folder\\chromedriver.exe");
		wb = new ChromeDriver();

		wb.navigate().to("http://www.trendzzmart.com/");
		wb.manage().window().maximize();
		wb.findElement(By.linkText("Checkout")).click();
		wb.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String Value =wb.findElement(By.xpath("//p[@class='cart-empty']")).getText();
		//highLighterMethod(wb,ele);
		
		System.out.println(Value);
		}
		catch(Exception e)
		{
			
		  System.out.println(e.getMessage());
		}
		}
		
		
		
	}


