package login;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenshot {
	
	public WebDriver wb;
	
	@Test
	public void capturescreenshot() throws Throwable 

{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohit\\Desktop\\New folder\\chromedriver.exe");
		wb = new ChromeDriver();

		wb.navigate().to("http://www.trendzzmart.com/");
		wb.manage().window().maximize();
		wb.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		TakesScreenshot ts=(TakesScreenshot)wb;
		
		File Source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Source,new File("./Screenshot/facebook.png"));

}

}
