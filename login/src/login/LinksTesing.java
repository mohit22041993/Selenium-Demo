package login;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class LinksTesing {
	
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
		List<WebElement> list =wb.findElements(By.tagName("a"));
		
		for(WebElement lists:list)
		{
			String values=  lists.getText();
			
			switch(values)
			{
			
			case "Electronics":
				
			{
				act.moveToElement(lists).perform();
				List<WebElement> listed =wb.findElements(By.tagName("a"));
				
				for(WebElement dd:listed)
				{
					String dats=dd.getText();
					if(dats !="")
					{
					dd.click();
					wb.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
					wb.navigate().back();
					}
			
				
				System.out.println(dats);
				}
				
			}
			
			}
		}
			
			
		}
		
		
		
			
	
			
		}
		
		
		
		
		
		

		
		//WebElement ele=wb.findElement(By.linkText("Electronics"));
		//act.moveToElement(ele).perform();
		
		
	//	wb.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		
		//List <WebElement> Links=driver.findElements(By.tagName("a"));
		
		
	//	for(WebElement urls: list)
		//{
			
		//	String data= urls.getText();
		//	System.out.println(data);
			//switch(data)
		//	{
			
			//case "Electronics":
			//{
				
			//	wb.findElement(By.partialLinkText("My account")).click();
				
				//System.out.println("account");
				
				
				
			//}
			//}
			
			 



