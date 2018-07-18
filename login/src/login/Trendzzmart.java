package login;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Trendzzmart {
	
	public WebDriver driver;
	
	@Test
public void verificitonlinks()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohit\\Desktop\\New folder\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.navigate().to("http://www.trendzzmart.com/");
	driver.manage().window().maximize();
	List <WebElement> Links=driver.findElements(By.tagName("a"));
	for(WebElement urls: Links)
	{
		
		String data= urls.getText();
		
		switch(data)
		{
		
		case "My account":
		{
			
			driver.findElement(By.partialLinkText("My account")).click();
			
			System.out.println("account");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
			driver.navigate().back();
			
			
		}
		
		case "Wishlist":
		{
			
			driver.findElement(By.partialLinkText("Wishlist")).click();
			
			System.out.println("Wishlist");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
			driver.navigate().back();
			
			
			
		}
		
		
		case "My Cart":
		{
			
			driver.findElement(By.partialLinkText("My Cart"));
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
			driver.navigate().back();
			
			
		}
		
		case "Checkout":
		{
			
			driver.findElement(By.partialLinkText("Checkout"));
			System.out.println("Checkout");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
			driver.navigate().back();
			
			
			
		}
		
		
		case "Login":
		{
			
			driver.findElement(By.partialLinkText("Login"));
			System.out.println("Login");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
			driver.navigate().back();
			
			
			
		}
		
		
		case "sell on trendzzmart":
		{
			
			driver.findElement(By.partialLinkText("sell on trendzzmart"));
			System.out.println("trendzzmart");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
			driver.navigate().back();
			
			
			
			
		}
		
		
		
		
		
		
		}
		
		
		
	
		
		
		}
	}
	
	
	
	


}



