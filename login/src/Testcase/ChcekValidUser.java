package Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Helper.BrowserFactory;
import factory.com.FindNotaionTest;

public class ChcekValidUser {
	
	@Test
	public void  verifyidlogin()
	{
		
		WebDriver driver=BrowserFactory.stratbrowser("chrome", "https://www.facebook.com/");
		FindNotaionTest login=PageFactory.initElements(driver, FindNotaionTest.class);
		login.login_facebook("mohitkathuria23@gmail.com");
	}

}
