package login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MenLinksTesting {
	
	public WebDriver wb;
	@Test
   public void links()
   {
	   
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohit\\Desktop\\New folder\\chromedriver.exe");
		wb = new ChromeDriver();

		wb.navigate().to("http://www.trendzzmart.com/");
		wb.manage().window().maximize();
		Actions act = new Actions(wb);
		
		
		wb.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		

}
}
