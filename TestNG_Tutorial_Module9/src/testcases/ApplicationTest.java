package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ApplicationTest {
	
	SoftAssert softAssert;  // create reference of class SoftAssert
	
	@BeforeSuite
	public void beforeSuite(){
		System.out.println(" Before suite ");
	}
	@AfterSuite
	public void afterSuite(){
		System.out.println(" After suite ");
	}
	@BeforeTest
	public void beforeTest(){
		System.out.println("Before executing testcase");
		// code for opening browser
	}
	@AfterTest
	public void afterTest(){
		System.out.println("After executing testcase");
		// code for closing browser
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("-----Before Method-----------");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("------After Method------------");
	}
	
	@Test(priority=1) // Testcase
	public void doLogin(){
		// webdriver code
		softAssert = new SoftAssert();
		softAssert.fail(" Error message "); //forceful fail soft-assert
		System.out.println("Login test execution Test");
		//throw new SkipException("  Some Reason ");
		softAssert.assertAll();
	}
	
	@Test(priority=2, dependsOnMethods={"doLogin"})// Testcase
	public void doPasswordChange(){
		softAssert = new SoftAssert();
		System.out.println("Changing password Test");
		softAssert.assertEquals("A", "B");
		softAssert.assertAll();
	}
	
	@Test(priority=4) // Testcase
	public void forgotPassword(){
		softAssert = new SoftAssert();
		System.out.println("Password forgot reset password Test");
		softAssert.assertEquals("A", "B"); // definitely assert will fail
		softAssert.assertAll();
	}
	@Test(priority=3) // Testcase
	public void logOut(){
		softAssert = new SoftAssert();
		System.out.println("Logging out Test");
		softAssert.assertEquals("A", "A");
		softAssert.assertAll();
	}
}
