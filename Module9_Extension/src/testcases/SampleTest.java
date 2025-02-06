package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {

	@Test(priority = 1, dataProviderClass = Data_Provider.class, dataProvider="logintestDataPRovider")
	public void testLogin(String username, String password){
		Assert.assertEquals("A", "B");
		System.out.println(" Login Test ");
	}
	
	@Test(priority = 2, dependsOnMethods={"testLogin","logout" })
	public void testChangePassword(){
		System.out.println(" Password Change Test ");
	}
	
	@Test(priority = 3, dependsOnMethods={"testLogin"})
	public void logout(){
		System.out.println(" Logout test ");
	}
	
}
