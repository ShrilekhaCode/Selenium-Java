package example2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest_example2 {
	
	@Parameters({"URL", "Username", "Password"})
	
  @Test
  public void Test_ParameterPassing1(String URL, String Username, String Password) 
	{
	  System.out.println("My URL is " + URL);
	  System.out.println("My Username is " + Username);
	  System.out.println("My passowrd is " + Password);
  }
}
