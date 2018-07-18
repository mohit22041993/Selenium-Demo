package login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class listbox {
	
	WebDriver wb;
	int num;
	
	@Test
	public void test()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohit\\Desktop\\New folder\\chromedriver.exe");
	wb = new ChromeDriver();

	wb.navigate().to("http://www.facebook.com/");
	wb.manage().window().maximize();
	List<WebElement> list= wb.findElements(By.name("sex"));
     num=list.size();
     for(int i=0;i<num;i++)
     {
    	 String value= list.get(i).getAttribute("value");
    	 if(value.equalsIgnoreCase("male"))
    	 {
    		 
    		 list.get(i).click();
    		 
    	 }
    	 System.out.println(value);
     }
	
	}
}
