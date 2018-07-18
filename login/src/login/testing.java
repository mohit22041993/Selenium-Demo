package login;

public class testing {
	
	String Name;
	int    pass;
	
	public void  display(String name,int password){
		
		this.set(name);
		this.pass=password;
		
		
		
		
	}
	
	public Object set(String sss)
	{
		System.out.println(sss);
		return sss;
		
	}
	
	
	public Object set(int passs)
	{
		System.out.println(passs);
		return passs;
		
	}

	public static void main(String[] args) {
		

		  testing t = new testing();
		  t.display("mohit",123);
	}

}
