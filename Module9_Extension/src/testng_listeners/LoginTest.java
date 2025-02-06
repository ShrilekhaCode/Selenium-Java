package testng_listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

	@Test (priority = 1)
	public void login(){
		/* if this testcase is passes /failed/skipped automatically listener will be called
		as listener is in the same package */
		System.out.println("Starting");
		Assert.assertEquals("A", "A");
		System.out.println("Ending");
	}
	
	@Test (priority = 2)
	public void adminLogin(){
	}
	
	
}
