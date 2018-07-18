package Helper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	
	public static  WebDriver stratbrowser(String browsername,String Url)
	{
		if(browsername.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohit\\Desktop\\New folder\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		
		else if(browsername.equalsIgnoreCase("firfox"))
		{
			
			driver = new FirefoxDriver();
			
		}
		
		else if(browsername.equalsIgnoreCase("IE"))
		{
			
			driver = new InternetExplorerDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.get(Url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
		
		
		
		
	}


	}


