package login;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.xml.dom.ParentSetter;

public class paramterize {
	
	String u;
	String p;
	
	@Test
	
	@Parameters({"Username","Kassword"})
	public void simple(String username, String password)
	{
		this.u=username;
		this.p=password;
		
		
	}

}
