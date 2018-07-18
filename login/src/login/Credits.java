package login;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;





public class Credits 


{
	public WebDriver wb;
	
	
//	@Test
//	public <webelement> void login()
//	{
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohit\\Desktop\\New folder\\chromedriver.exe");
//		WebDriver wb = new ChromeDriver();
//		
//		//WebDriver wb = new FirefoxDriver();
//		
//		wb.manage().window().maximize();
//		wb.navigate().to("https://www.facebook.com/");
//		
//		wb.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		
//		
//		List<WebElement> radioBx= wb.findElements(By.xpath("//input[@name='sex'and @type='radio']"));
//		
////		for(WebElement ws:radioBx)
////		{
////			
////			
////			System.out.println(ws);
////		}
////		
//		for(int i=0;i<radioBx.size();i++)
//		{
//			
//			
//			WebElement local= radioBx.get(i);
//			
//			String mohit =local.getAttribute("id");
//			
//			System.out.println(mohit);
//			
//			if(mohit.equalsIgnoreCase("u_0_b"))
//				
//			{
//				
//				System.out.println("rahul");
//				
//			
//			}
//		}
//		
		
		
		
		
		
	  
				
				
				
				
				
				
				
		
		
//	}
	
	
	//@Test
	
	//public void lstexmoale()
	//{
		
		
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohit\\Desktop\\New folder\\chromedriver.exe");
		//WebDriver wb = new ChromeDriver();
		
		//WebDriver wb = new FirefoxDriver();
		
		//wb.manage().window().maximize();
		//wb.navigate().to("https://www.facebook.com/");
		
		//wb.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//List<WebElement> selectElement = 
	//	WebElement wss= wb.findElement(By.name("birthday_day"));
		//Select select = new Select(wss);
		
	   //List<WebElement>   listing =  select.getOptions();
	   
	//   int total = listing.size();
	   
	 //  for(WebElement wk:listing)
		   
		   
	 //  {
		   
		   
		  //String mohit = wk.getText();
		   
		   
		  // System.out.println(mohit);
		   
		   
	  // }
	   
	
		
		
		
		//List<WebElement>   listing =wb.findElements(By.id("u_0_13"));
//		
//		for(int i=0;i<listing.size();i++)
//			
//		{
//			
//			
//			WebElement mk= listing.get(i);
//			
//			mk.getAttribute("name");
//			
//			
//			
//			
//		}
		
		
		
		
		
		
	//}
	
	
	
//	public void isplays()
//	{
//		
////		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohit\\Desktop\\New folder\\chromedriver.exe");
////      WebDriver wbs = new ChromeDriver();
////      wbs.navigate().to("https://www.facebook.com/");
////      
////      wbs.manage().window().maximize();
////      wbs.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
////      wbs.findElement(By.cssSelector("input[id=pass]")).sendKeys("Mohit");
//      
//      
//     }
	
	
	
	@Test
	
	public void linkverify()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohit\\Desktop\\New folder\\chromedriver.exe");
		wb= new ChromeDriver();
		 
	      wb.navigate().to("http://www.trendzzmart.com/");
	      JavascriptExecutor js = (JavascriptExecutor) wb;
	      
	      wb.manage().window().maximize();
	     wb.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     wb.findElement(By.linkText("sell on trendzzmart")).click();
	     wb.findElement(By.name("firstname")).sendKeys("mohit");
	     wb.findElement(By.name("lastname")).sendKeys("kathuria");
	     wb.findElement(By.name("username")).sendKeys("mohit");
	     wb.findElement(By.name("email")).sendKeys("mkathuria23@gmail.com");
	     wb.findElement(By.name("confirm_email")).sendKeys("mkathuria23@gmail.com");
	     wb.findElement(By.name("vendor_name")).sendKeys("rahul");
	     wb.findElement(By.name("vendor_description")).sendKeys("rahuls");
	     wb.findElement(By.name("mobile")).sendKeys("9871454916");
	     js.executeScript("window.scrollBy(0,1000)");
	     
	     wb.manage().timeouts().implicitlyWait(5,TimeUnit.MINUTES);
	     wb.findElement(By.className("button")).click();
	     wb.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
	     wb.navigate().back();
	      
	      
	    
	    
	  //  for (WebElement myElement : links)
	    	
	  //  {
	  //  	
	    	
	   // List<WebElement> links =wb.findElements(By.tagName("a"));
	   // 	String data= myElement.getAttribute("href");
	    	
	   // 	System.out.println(data);
	    	
	   // }
	    	
	    
	    
	    
	    
	    	
	    	
	    	// System.out.println(elements.get(i).getAttribute("href"));
	    	// if(elements.ge)
	   
	    	 
	    	// if(elements.get(i).getText().equalsIgnoreCase("sell on trendzzmart"));
	    	// System.out.println("done");
	    	 
	    	 //if (driver.getTitle().equalsIgnoreCase(expPageTitle))
	    	 
	    	// Assert.assertEquals("sell on trendzzmart",data);
	    	 
	    	// System.out.println("done");
	     
	   //  WebDriver wbs = new ChromeDriver();
	     
	    	
	    	
	    }





}

	
	






