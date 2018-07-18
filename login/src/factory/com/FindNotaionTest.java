package factory.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FindNotaionTest {
	
	WebDriver driver;
	
	public FindNotaionTest(WebDriver ldriver)
	{
		this.driver=ldriver;
		
		
	}
	
	@FindBy(how=How.ID, using="email")
	WebElement username;
	
	
	public void login_facebook(String uid)
	{
		
		username.sendKeys(uid);
		
	}

}
